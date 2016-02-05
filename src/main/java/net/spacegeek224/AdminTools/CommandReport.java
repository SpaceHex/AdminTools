package net.spacegeek224.AdminTools;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class CommandReport implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {

		if (args.length == 0) {
			helpMessage(sender);
		} else if (args.length == 1) {
			helpMessage(sender);
		} else if (args.length >= 2) {

			StringBuilder buffer = new StringBuilder();
			for (int i = 1; i < args.length; i++) {
				buffer.append(' ').append(args[i]);
			}

			if (sender instanceof Player) {
				Player player = (Player) sender;
				Bukkit.getLogger().info(ChatColor.YELLOW + "Player "
						+ ChatColor.GREEN + player.getDisplayName()
						+ ChatColor.YELLOW + " reported " + ChatColor.RED
						+ args[0] + ChatColor.YELLOW + ", for" + ChatColor.RED
						+ buffer.toString() + ChatColor.YELLOW + ".");
			} if (sender instanceof ConsoleCommandSender) {
				Bukkit.getLogger().info(ChatColor.GREEN + "Console"
						+ ChatColor.YELLOW + " reported " + ChatColor.RED
						+ args[0] + ChatColor.YELLOW + ", for" + ChatColor.RED
						+ buffer.toString() + ChatColor.YELLOW + ".");
			}
		}
		return true;
	}

	public void helpMessage(CommandSender s) {
		s.sendMessage(ChatColor.RED + "Usage: /report <player> <message>");
	}
}
