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

public class BedCommandExecutor implements CommandExecutor {
	private final TimBox plugin;
	
	public BedCommandExecutor(TimBox plugin) {
		this.plugin = plugin; 
	}

	@SuppressWarnings("unused")
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		
    	if (cmd.getName().equalsIgnoreCase("bed")) {
    		try {    			
    			 Utils.oldLocation = player.getLocation();
    			
        		String input = "&6[TimBox]: &bTeleporting you to your bed...";
        		String output = ChatColor.translateAlternateColorCodes('&', input);
        		
    			player.sendMessage(output);
    			player.teleport(player.getBedSpawnLocation());
    			Utils.explode(player);
    		} catch (Exception e) {
        		String input = "&6[TimBox]: &bSorry, couldn't find your bed...";
        		String output = ChatColor.translateAlternateColorCodes('&', input);
    			
    			player.sendMessage(output);
    			this.plugin.getLogger().info("Something went wrong... " + e.getMessage());
    		}
    		
    		return true;
    	}
    	
    	return false; 
    }
}
