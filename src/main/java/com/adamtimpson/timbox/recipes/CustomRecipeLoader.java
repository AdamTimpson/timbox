package com.adamtimpson.timbox.recipes;

import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CustomRecipeLoader {

	public void loadRecipes(Server server) {
		loadSaddle(server);
		loadClay(server);
	}
	
	@SuppressWarnings("deprecation")
	public void loadSaddle(Server server) {
		ItemStack saddle = new ItemStack(Material.SADDLE);
		
		ShapedRecipe r = new ShapedRecipe(saddle);
		r.shape("ILI", "I I", "   ");
		r.setIngredient('I', Material.IRON_INGOT);
		r.setIngredient('L', Material.LEATHER);
		
		server.addRecipe(r);
	}
	
	public void loadClay(Server server) {
		ItemStack clay = new ItemStack(Material.CLAY, 3);
		
		ShapedRecipe r = new ShapedRecipe(clay);
		r.shape("SSS", "GGG", "DDD");
		r.setIngredient('S', Material.SAND);
		r.setIngredient('G', Material.GRAVEL);
		r.setIngredient('D', Material.DIRT);
		
		server.addRecipe(r);
	}
	
}
