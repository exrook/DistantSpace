/**
 * 
 */
package net.exrook.bukkit.distantSpace;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;

/**
 * @author Exrook
 *
 */
public class DistantSpace extends JavaPlugin {
	enum GeneratorID {
		space, test
	}
	private final SpacePlayerListener playerListener = new SpacePlayerListener(this);
	Logger log = Logger.getLogger("Minecraft");
	PluginManager pm;
	public void onEnable () {
		pm = this.getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_MOVE, playerListener, Event.Priority.Monitor, this)
        PluginDescriptionFile desc = this.getDescription();
        log.info(desc.getName() + " version " + desc.getVersion() + " is enabled!" );
	}
	public void onDisable () {
		
	}
	
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
		switch (GeneratorID.valueOf(id.toLowerCase())) {
		case space :
			return new SpaceChunkGenerator();
		case test :
			return new TestChunkGenerator();
		default:
			return null;
		}
	}
}
