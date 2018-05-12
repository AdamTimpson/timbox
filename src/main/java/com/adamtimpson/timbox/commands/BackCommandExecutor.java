package com.adamtimpson.timbox.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.adamtimpson.timbox.TimBox;
import com.adamtimpson.timbox.utils.Utils;

public class BackCommandExecutor implements CommandExecutor {
	private final TimBox plugin;
	
	public BackCommandExecutor(TimBox plugin) {
		this.plugin = plugin; 
	}

	@SuppressWarnings("unused")
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("back")) {
    		try {	
				Utils.sendMessage(player, "Sending you back...");
				
				player.teleport(Utils.oldLocation);
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
