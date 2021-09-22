package me.Tyloon1e.MyPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("MyPlugin is powered up!");
	}

	@Override
	public void onDisable() {
		System.out.println("MyPlugin is off, damn...");
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] arguments) {
		if (label.equalsIgnoreCase("myplugin")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;

				if (player.isOp()) {
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aHey!"));
					return true;
				}

				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou're not OP."));
				return true;

			} else {
				sender.sendMessage("Console?");
				return true;
			}
		}

		return false;
	}

}
