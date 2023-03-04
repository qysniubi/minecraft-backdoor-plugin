package me.dw1e.anticheatw;

import me.dw1e.anticheatw.events.MessageEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiCheatW extends JavaPlugin {
    @Override
    public void onEnable() {
    getServer().getPluginManager().registerEvents(new MessageEvent(), this);
    getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[AntiCheatW]This Plugin is now enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[AntiCheatW]This Plugin is now disabled");

    }
}