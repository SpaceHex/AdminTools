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
		getLogger().info(ChatColor.GREEN + "Plugin enabled!");
	}
	
	@Override
	public void onDisable() {
		getLogger().info(ChatColor.RED + "Plugin disabled!");
	}
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(commandLabel.equalsIgnoreCase("help")){

            //Defines Variables
//             Player p = (Player) sender;

            //Send message
            sender.sendMessage(ChatColor.GOLD + "SpaceHex Network");
            sender.sendMessage(ChatColor.WHITE + "====================================================");
            sender.sendMessage(ChatColor.AQUA + "/help" + ChatColor.WHITE + " - Displays help");
            sender.sendMessage(ChatColor.GRAY + "====================================================");
        }
        return false;
    }
	
}
