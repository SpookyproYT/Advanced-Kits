package me.SpookyproYT.akits.commands;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;



public class KitCommand implements CommandExecutor{
	private HashMap<String, List<ItemStack>> kits = new HashMap<String, List<ItemStack>>() {
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
			put("fighter", Arrays.asList(
					new ItemStack(Material.IRON_SWORD),
					new ItemStack(Material.SHIELD),
					new ItemStack(Material.COBBLESTONE, 32),
			     	new ItemStack(Material.IRON_CHESTPLATE)));
			put("chef", Arrays.asList(
					new ItemStack(Material.LEATHER_HELMET),
					new ItemStack(Material.STONE_SWORD),
					new ItemStack(Material.GOLDEN_APPLE, 2)));
			put("snowman", Arrays.asList(
					new ItemStack(Material.SNOW_BLOCK, 2),
					new ItemStack(Material.CARVED_PUMPKIN, 1),
					new ItemStack(Material.IRON_SWORD),
					new ItemStack(Material.SNOWBALL, 32)));
		}};
		
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
 		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "You Can't Run This Command In The Console!");
			return false;
		}
 		if (args.length != 1) {
 			sender.sendMessage(ChatColor.RED + "USAGE: " + ChatColor.WHITE + "/kit " + kits.keySet());
 			return false;
 	}
	Player player = (Player) sender;
				if (!kits.containsKey(args[0].toLowerCase())) {
					sender.sendMessage(ChatColor.RED + "This kit doesn't exist!");
					return false;
				}
				List<ItemStack> kitItems = kits.get(args[0].toLowerCase());
				for  (ItemStack item : kitItems) {
					player.getInventory().addItem(item);
				}

		player.getInventory().addItem(new ItemStack(Material.TORCH, 64));
		player.sendMessage(ChatColor.GREEN + "You got your kit!");
		return true;
	}
}
