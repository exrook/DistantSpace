package net.exrook.bukkit.distantSpace;

import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

public class SpacePlayerListener extends PlayerListener {
	public static DistantSpace plugin;
	
	SpacePlayerListener(DistantSpace instance) {
		plugin = instance;
	}
	
	public void onPlayerMove(PlayerMoveEvent event) {
		if (event.getFrom().getBlockY() == 0) {
			
		}
	}
}
