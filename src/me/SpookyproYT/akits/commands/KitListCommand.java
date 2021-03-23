package me.SpookyproYT.akits.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class KitListCommand implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		sender.sendMessage(ChatColor.AQUA + "List Of The Kits:");
		sender.sendMessage(ChatColor.GOLD + "stone kit");
		sender.sendMessage(ChatColor.GOLD + "iron kit");
		sender.sendMessage(ChatColor.GOLD + "gold kit");
		sender.sendMessage(ChatColor.GOLD + "diamond kit");
		sender.sendMessage(ChatColor.GOLD + "troller");
		sender.sendMessage(ChatColor.GOLD + "bomber");
		sender.sendMessage(ChatColor.GOLD + "noob");
		sender.sendMessage(ChatColor.GOLD + "netherman");
		sender.sendMessage(ChatColor.GOLD + "enderman");
		sender.sendMessage(ChatColor.GOLD + "archer");
		sender.sendMessage(ChatColor.GOLD + "fisherman");
		sender.sendMessage(ChatColor.GOLD + "gladiator");
		sender.sendMessage(ChatColor.GOLD + "fighter");
		sender.sendMessage(ChatColor.GOLD + "chef");
		sender.sendMessage(ChatColor.GOLD + "snowman");
		sender.sendMessage(ChatColor.GREEN + "Do You Want MORE Kits?");
		sender.sendMessage(ChatColor.GREEN + "You Can Ask The Creator Of The Plugin!");
		return true;
	}
}
