package me.SpookyproYT.akits;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import me.SpookyproYT.akits.commands.KitCommand;
import me.SpookyproYT.akits.commands.KitCreatorCommand;
import me.SpookyproYT.akits.commands.KitHelpCommand;
import me.SpookyproYT.akits.commands.KitListCommand;
import me.SpookyproYT.akits.commands.KitVersionCommand;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		System.out.println(ChatColor.GREEN + "[AdvancedKits] AdvancedKits Plugin Is Now Enabled!");
		registerCommands();
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		System.out.println(ChatColor.RED + "[AdvancedKits] AdvancedKits Plugin Is Now Disabled!");
		super.onDisable();
	}
	
	private void registerCommands() {
		getCommand("kit").setExecutor(new KitCommand());
		getCommand("kithelp").setExecutor(new KitHelpCommand());
		getCommand("kitc").setExecutor(new KitCreatorCommand());
		getCommand("kitv").setExecutor(new KitVersionCommand());
		getCommand("kitlist").setExecutor(new KitListCommand());
	}
}
