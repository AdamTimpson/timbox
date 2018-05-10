package com.adamtimpson.timbox.commands;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
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
				String input = "&6[TimBox]: &bSending you back...";
        		String output = ChatColor.translateAlternateColorCodes('&', input);
				
        		player.sendMessage(output);
				player.teleport(Utils.oldLocation);
				Utils.explode(player);
    		} catch (Exception e) {
        		String input = "&6[TimBox]: &bSorry, couldn't go back...";
        		String output = ChatColor.translateAlternateColorCodes('&', input);
    			
    			player.sendMessage(output);
    			this.plugin.getLogger().info("Something went wrong... " + e.getMessage());
    		}
    		
    		return true;
    	}
    	
    	return false; 
    }
}
