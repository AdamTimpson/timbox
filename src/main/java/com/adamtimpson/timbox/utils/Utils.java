package com.adamtimpson.timbox.utils;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Utils {

	public static Location oldLocation;
	
	public static void explode(Player player) {
		player.getWorld().createExplosion(player.getLocation(), 0);
		player.getWorld().playEffect(player.getLocation(), Effect.SMOKE, 1);
		player.getWorld().playEffect(player.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
	}
	
	public static void sendMessage(Player player, String message) {
		String input = "&6[TimBox]: &b" + message;
		String output = ChatColor.translateAlternateColorCodes('&', input);
		
		player.sendMessage(output);
	}
	
}
