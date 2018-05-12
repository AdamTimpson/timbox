package com.adamtimpson.timbox.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.adamtimpson.timbox.TimBox;
import com.adamtimpson.timbox.utils.Utils;

public class FlyCommandExecutor implements CommandExecutor {
	private final TimBox plugin;
	
	public FlyCommandExecutor(TimBox plugin) {
		this.plugin = plugin; 
	}

	@SuppressWarnings("unused")
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("fly")) {
    		try {
    			Utils.sendMessage(player, "Switching...");
    		
    			if (player.getName().equals("TimmyAdams")) {
    				player.setFlying(!player.isFlying());    				
    			} else { 
    				Utils.sendMessage(player, "Sorry, you don't have permission to do that...");
    			}
    		
				Utils.explode(player);
    		} catch (Exception e) {
    			Utils.sendMessage(player, "Sorry, couldn't do that...");
    			
    			this.plugin.getLogger().info("Something went wrong... " + e.getMessage());
    		}
    		
    		return true;
    	}
    	
    	return false; 
    }
}
