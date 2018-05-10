package com.adamtimpson.timbox.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import com.adamtimpson.timbox.utils.Utils;

public class Events implements Listener {

	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event) {
		Utils.oldLocation = event.getEntity().getLocation();
	}
	
}
