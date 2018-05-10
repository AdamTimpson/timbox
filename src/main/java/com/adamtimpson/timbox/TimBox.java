package com.adamtimpson.timbox;

import org.bukkit.plugin.java.JavaPlugin;

import com.adamtimpson.timbox.commands.BackCommandExecutor;
import com.adamtimpson.timbox.commands.BedCommandExecutor;


public class TimBox extends JavaPlugin {
	
	@Override
    public void onEnable() {
        getLogger().info("TimBox has been enabled!");
        getServer().getPluginManager().registerEvents(new com.adamtimpson.timbox.events.Events(), this);
        
        this.getCommand("bed").setExecutor(new BedCommandExecutor(this));
        this.getCommand("back").setExecutor(new BackCommandExecutor(this));
    }
	
    @Override
    public void onDisable() {
        getLogger().info("TimBox has been disabled!");
    }
    
}
