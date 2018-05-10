package com.adamtimpson.timbox;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class TimBox extends JavaPlugin {
	@Override
    public void onEnable() {
        getLogger().info("TimBox has been enabled!");
    }
	
    @Override
    public void onDisable() {
        getLogger().info("TimBox has been disabled!");
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("bed")) {
    		try {
    			Player player = (Player) sender;
        		
        		String input = "&6[TimBox]: &bTeleporting you to your bed...";
        		String output = ChatColor.translateAlternateColorCodes('&', input);
        		
    			player.sendMessage(output);
    			player.teleport(player.getBedSpawnLocation());
    			player.getWorld().createExplosion(player.getLocation(), 0);
    		} catch (Exception e) {
    			Player player = (Player) sender;
    		
        		String input = "&6[TimBox]: &bSorry, couldn't find your bed...";
        		String output = ChatColor.translateAlternateColorCodes('&', input);
    			
    			player.sendMessage(output);
    			getLogger().info("Something went wrong... " + e.getMessage());
    		}
    		
    		return true;
    	}
    	
    	return false; 
    }
}
