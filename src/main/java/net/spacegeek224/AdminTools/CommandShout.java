package net.spacegeek224.AdminTools;                                                                                     
                                                                                                                         
import org.bukkit.Bukkit;                                                                                                
import org.bukkit.ChatColor;                                                                                             
import org.bukkit.command.Command;                                                                                       
import org.bukkit.command.CommandExecutor;                                                                               
import org.bukkit.command.CommandSender;                                                                                 
import org.bukkit.entity.Player;                                                                                         
                                                                                                                         
public class CommandShout implements CommandExecutor {                                                                    
        @Override                                                                                                        
        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {                       
                
                //Player player = (Player) sender;
                String name = "";
                if (sender instanceof ConsoleCommandSender) {
                        name = ChatColor.RED + "CONSOLE: ";
                } else if (sender instanceof Player) {
                        name = ChatColor.BLUE + ((Player) sender).getDisplayName() + ": ";
                }
                if (args.length == 0) {
	                
                } else if (args.length >= 1) {
                	
                }
                return true;                                                                                            
        }                                                                                                                
                                                                                                                         
}  
