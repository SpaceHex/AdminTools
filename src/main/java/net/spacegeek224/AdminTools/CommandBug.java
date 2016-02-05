package net.spacegeek224.AdminTools;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class CommandBug implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {

		if (args.length == 0) {
			helpMessage(sender);
		} else if (args.length == 1) {
			StringBuilder buffer = new StringBuilder();
			for (int i = 0; i < args.length; i++) {
				buffer.append(' ').append(args[i]);
			}

			Bukkit.getLogger().info(buffer.toString());
			if (sender instanceof Player) {
				Player player = (Player) sender;
			} if (sender instanceof ConsoleCommandSender) {
			  
			}
		}
		return false;
	}

	public void helpMessage(CommandSender s) {
		s.sendMessage(ChatColor.RED + "Usage: /bug <description>");
	}
}