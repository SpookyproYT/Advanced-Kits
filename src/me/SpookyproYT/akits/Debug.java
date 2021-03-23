package me.SpookyproYT.akits;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Debug {
	private static HashMap<String, List<ItemStack>> kits = new HashMap<String, List<ItemStack>>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put("stone", Arrays.asList(
					new ItemStack(Material.STONE_AXE), 
					new ItemStack(Material.STONE_PICKAXE),
					new ItemStack(Material.STONE_SHOVEL), 
					new ItemStack(Material.STONE_HOE)));
			put("iron", Arrays.asList(
					new ItemStack(Material.IRON_AXE), 
					new ItemStack(Material.IRON_PICKAXE),
					new ItemStack(Material.IRON_SHOVEL), 
					new ItemStack(Material.IRON_HOE)));
			put("gold", Arrays.asList(
					new ItemStack(Material.GOLDEN_AXE), 
					new ItemStack(Material.GOLDEN_PICKAXE),
					new ItemStack(Material.GOLDEN_SHOVEL), 
					new ItemStack(Material.GOLDEN_HOE)));
			put("diamond", Arrays.asList(
					new ItemStack(Material.DIAMOND_AXE), 
					new ItemStack(Material.DIAMOND_PICKAXE),
					new ItemStack(Material.DIAMOND_SHOVEL), 
					new ItemStack(Material.DIAMOND_HOE)));
			put("troller", Arrays.asList(
					new ItemStack(Material.COBWEB, 16),
					new ItemStack(Material.LAVA_BUCKET),
					new ItemStack(Material.COBBLESTONE, 32)));
			put("bomber", Arrays.asList(
					new ItemStack(Material.TNT, 6), 
					new ItemStack(Material.FIRE_CHARGE, 6),
					new ItemStack(Material.REDSTONE_BLOCK, 12), 
					new ItemStack(Material.COBBLESTONE, 32)));
			put("noob", Arrays.asList(
					new ItemStack(Material.WOODEN_AXE), 
					new ItemStack(Material.WOODEN_PICKAXE),
					new ItemStack(Material.WOODEN_SHOVEL), 
					new ItemStack(Material.WOODEN_HOE)));
			put("netherman", Arrays.asList(
					new ItemStack(Material.NETHERITE_AXE), 
					new ItemStack(Material.NETHERITE_PICKAXE),
					new ItemStack(Material.NETHERITE_SHOVEL), 
					new ItemStack(Material.NETHERITE_HOE)));
			put("enderman", Arrays.asList(
					new ItemStack(Material.ENDER_PEARL, 3), 
					new ItemStack(Material.END_CRYSTAL)));
			put("archer", Arrays.asList(
					new ItemStack(Material.BOW), 
					new ItemStack(Material.ARROW, 32)));
			put("fisherman", Arrays.asList(
					new ItemStack(Material.FISHING_ROD), 
					new ItemStack(Material.LEATHER_CHESTPLATE)));
			put("gladiator", Arrays.asList(
					new ItemStack(Material.DIAMOND_SWORD),
					new ItemStack(Material.SHIELD),
					new ItemStack(Material.COBBLESTONE, 32),
			     	new ItemStack(Material.DIAMOND_CHESTPLATE)));
		}};
	public static void main(String[] args) {
		System.out.println(kits.keySet());
	}
}
