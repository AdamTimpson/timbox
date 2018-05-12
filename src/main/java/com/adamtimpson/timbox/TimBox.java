package com.adamtimpson.timbox;

import org.bukkit.plugin.java.JavaPlugin;

import com.adamtimpson.timbox.commands.BackCommandExecutor;
import com.adamtimpson.timbox.commands.BedCommandExecutor;
import com.adamtimpson.timbox.commands.FlyCommandExecutor;


public class TimBox extends JavaPlugin {
	
	@Override
    public void onEnable() {
        getLogger().info("TimBox has been enabled!");
        getServer().getPluginManager().registerEvents(new com.adamtimpson.timbox.events.Events(), this);
        
        this.getCommand("bed").setExecutor(new BedCommandExecutor(this));
        this.getCommand("back").setExecutor(new BackCommandExecutor(this));
        this.getCommand("fly").setExecutor(new FlyCommandExecutor(this));
    }
	
    @Override
    public void onDisable() {
        getLogger().info("TimBox has been disabled!");
    }
    
}
