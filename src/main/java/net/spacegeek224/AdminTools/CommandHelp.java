package net.spacegeek224.AdminTools;                                                                                     
                                                                                                                         
import org.bukkit.Bukkit;                                                                                                
import org.bukkit.ChatColor;                                                                                             
import org.bukkit.command.Command;                                                                                       
import org.bukkit.command.CommandExecutor;                                                                               
import org.bukkit.command.CommandSender;                                                                                 
import org.bukkit.entity.Player;                                                                                         
                                                                                                                         
public class CommandHelp implements CommandExecutor {                                                                    
        @Override                                                                                                        
        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {                       
                Player player = (Player) sender;
                sender.sendMessage(ChatColor.GOLD + "SpaceHex Network");
                sender.sendMessage(ChatColor.WHITE + "====================================================");
                sender.sendMessage(ChatColor.AQUA + "/help" + ChatColor.WHITE + " - Displays help.");
                sender.sendMessage(ChatColor.AQUA + "/hub" + ChatColor.WHITE + " - Go to the hub.");
	        sender.sendMessage(ChatColor.AQUA + "/report <player> <reason>" + ChatColor.WHITE + " - File a report.");
                sender.sendMessage(ChatColor.GRAY + "====================================================");
                return false;                                                                                            
        }                                                                                                                
                                                                                                                         
}  
