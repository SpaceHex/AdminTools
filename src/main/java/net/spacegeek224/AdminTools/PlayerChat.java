package net.spacegeek224.AdminTools;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerChat implements Listener {
  @EventHandler
  public void onPlayerChat(AsyncPlayerChatEvent event) {
    String msg = event.getMessage();
    Player player = event.getPlayer();
    String[] swearWords = {"fuck","ass","bitch"};
    String message = event.getMessage().toLowerCase().replaceAll("@", "a").replaceAll("\\p{Punct}", " ");
    for(String word : swearWords){
      if(message.matches("(.* )?"+word+"( .*)?")) {
        // There has been a swear word in the message
        msg = msg.replaceAll(word, toBleep(word));
      } else {
        // The current swear word was not found in the message.
      }
    }
   event.setCancelled(true);
   if (player.hasPermission("rank.admin")) {
    Bukkit.broadcastMessage(ChatColor.RED + player.getDisplayName() + ": " + ChatColor.WHITE + msg);
   } else if (player.hasPermission("rank.mod")) {
    Bukkit.broadcastMessage(ChatColor.GREEN + player.getDisplayName() + ": " + ChatColor.WHITE + msg);
   } else if (player.hasPermission("rank.helper")) {
    Bukkit.broadcastMessage(ChatColor.BLUE + player.getDisplayName() + ": " + ChatColor.WHITE + msg);
   } else if (player.hasPermission("rank.vip")) {
    Bukkit.broadcastMessage(ChatColor.GREEN + player.getDisplayName() + ": " + ChatColor.WHITE + msg);
   } else {
     Bukkit.broadcastMessage(ChatColor.GREY + player.getDisplayName() + ": " + ChatColor.WHITE + msg);
   }
   
  }
  public String toBleep(String s) {
    int len = s.length();
    StringBuilder sb = new StringBuilder(len);
    for(int i = 0; i < len; i++){
      sb.append('*');
    }
    return sb.toString();
  }
}
