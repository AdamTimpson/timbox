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
	
	@SuppressWarnings("deprecation")
	public void loadClay(Server server) {
		ItemStack clay = new ItemStack(Material.CLAY, 3);
		
		ShapedRecipe r = new ShapedRecipe(clay);
		r.shape("SSS", "GGG", "DDD");
		r.setIngredient('S', Material.SAND);
		r.setIngredient('G', Material.GRAVEL);
		r.setIngredient('D', Material.DIRT);
		
		server.addRecipe(r);
	}
	
	@SuppressWarnings("deprecation")
	public void loadGoldBlock(Server server) {
		ItemStack goldBlock = new ItemStack(Material.GOLD_BLOCK);
		
		ShapedRecipe r = new ShapedRecipe(goldBlock);
		r.shape("   ", "II ", "II ");
		r.setIngredient('I', Material.IRON_BLOCK);
		
		server.addRecipe(r);
	}
	
	@SuppressWarnings("deprecation")
	public void loadDiamondBlock(Server server) {
		ItemStack diamondBlock = new ItemStack(Material.DIAMOND_BLOCK);
		
		ShapedRecipe r = new ShapedRecipe(diamondBlock);
		r.shape("   ", "GG ", "GG ");
		r.setIngredient('G', Material.GOLD_BLOCK);
		
		server.addRecipe(r);
	}
	
}
