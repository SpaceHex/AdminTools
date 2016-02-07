package net.spacegeek224.AdminTools;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.configuration.file.FileConfiguration;
import net.spacegeek224.hexlib.ColoredString;

public class Main extends JavaPlugin implements Listener {
	public FileConfiguration config = getConfig();

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this); 
		registerEvents(this,new PlayerChat());
		config.addDefault("server-name","My Server");
		config.options().copyDefaults(true);
		saveConfig();
		ColoredString cs = new ColoredString("&9Hello");
		getLogger().info(ChatColor.GREEN + "Plugin enabled!");
		getLogger().info(cs.res);
		getCommand("help").setExecutor(new CommandHelp()); 
		getCommand("report").setExecutor(new CommandReport()); 
		getCommand("bug").setExecutor(new CommandBug());
	}
	
	@Override
	public void onDisable() {
		getLogger().info(ChatColor.RED + "Plugin disabled!");
	}
	
	public static void registerEvents(org.bukkit.plugin.Plugin plugin,                                               
                        Listener... listeners) {                                                                         
                for (Listener listener : listeners) {                                                                    
                        Bukkit.getServer().getPluginManager()                                                            
                                        .registerEvents(listener, plugin);                                               
                }                                                                                                        
        } 
//     @Override
//     public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
//         if(commandLabel.equalsIgnoreCase("help")) {
		
//             //Defines Variables
// //             Player p = (Player) sender;

//             //Send message
            
//         } else if(commandLabel.equalsIgnoreCase("report")) {
// 		//report command logic
//         }
//         return false;
//     }
	
}
