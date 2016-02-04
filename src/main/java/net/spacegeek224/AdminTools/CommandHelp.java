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
                
                //Player player = (Player) sender;
                sender.sendMessage(ChatColor.GOLD + "SpaceHex Network");
                sender.sendMessage(ChatColor.WHITE + "====================================================");
                sender.sendMessage(ChatColor.BLUE + "/help" + ChatColor.YELLOW + " - Displays help.");
                sender.sendMessage(ChatColor.BLUE + "/hub" + ChatColor.YELLOW + " - Go to the hub.");
	        sender.sendMessage(ChatColor.BLUE + "/report <player> <reason>" + ChatColor.YELLOW + " - File a report.");
                sender.sendMessage(ChatColor.WHITE + "====================================================");
                return false;                                                                                            
        }                                                                                                                
                                                                                                                         
}  