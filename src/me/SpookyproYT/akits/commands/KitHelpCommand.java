package me.SpookyproYT.akits.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class KitHelpCommand implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		sender.sendMessage(ChatColor.YELLOW + "AdvancedKits Help:");
		sender.sendMessage(ChatColor.GOLD + "/kit {stone, iron, gold, diamond} - gives you a kit.");
		sender.sendMessage(ChatColor.GOLD + "/kithelp - writes you all the commands on the plugin in the chat.");
		sender.sendMessage(ChatColor.GOLD + "/kitc - Writes you the creator of the plugin in the chat.");
		sender.sendMessage(ChatColor.GOLD + "/kitv - Writes you the version of the plugin in the chat.");
		sender.sendMessage(ChatColor.GOLD + "/kitlist - Writes you the list of the kits.");
		return true;
		}
	}