package net.spacegeek224.AdminTools;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CouloredConsoleSender;
import org.bukkit.entity.Player;

public class CommandReport implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {

		if (args.length == 0) {
			helpMessage();
		} else if (args.length == 1) {
			helpMessage();
		} else if (args.length >= 2) {

			StringBuilder buffer = new StringBuilder();
			for (int i = 1; i < args.length; i++) {
				buffer.append(' ').append(args[i]);
			}

			Bukkit.getLogger().info(buffer.toString());
			if (sender instanceof Player) {
				Player player = (Player) sender;
				Bukkit.broadcastMessage(ChatColor.YELLOW + "Player "
						+ ChatColor.GREEN + player.getDisplayName()
						+ ChatColor.YELLOW + " reported " + ChatColor.RED
						+ args[0] + ChatColor.YELLOW + ", for" + ChatColor.RED
						+ buffer.toString() + ChatColor.YELLOW + "!");
			} if (sender instanceof ColouredConsoleSender) {
				Bukkit.broadcastMessage(ChatColor.GREEN + "Console "
						+ ChatColor.YELLOW + " reported " + ChatColor.RED
						+ args[0] + ChatColor.YELLOW + ", for" + ChatColor.RED
						+ buffer.toString() + ChatColor.YELLOW + "!");
			}
		}
		return false;
	}

	public void helpMessage() {

	}
}
