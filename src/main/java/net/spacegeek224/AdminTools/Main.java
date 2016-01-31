package net.spacegeek224.blankplugin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getLogger().info(ChatColor.GREEN + "Plugin enabled!");
	}
	
	@Override
	public void onDisable() {
		getLogger().info(ChatColor.RED + "Plugin disabled!");
	}
	
}
