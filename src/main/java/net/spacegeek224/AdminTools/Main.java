package net.spacegeek224.AdminTools;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);  
		getLogger().info(ChatColor.GREEN + "Plugin enabled!");
		getCommand("help").setExecutor(new CommandHelp()); 
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
