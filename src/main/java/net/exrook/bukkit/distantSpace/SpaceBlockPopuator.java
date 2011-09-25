package net.exrook.bukkit.distantSpace;

import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.block.Block;

public class SpaceBlockPopuator extends BlockPopulator {

	public void populate(World world, Random random, Chunk source) {
		// TODO Add chunk population code
		// Random test of a stupid block populator.
		if (random.nextInt(200) <= 5) {
            int centerX = (source.getX() << 4) + random.nextInt(16);
            int centerZ = (source.getZ() << 4) + random.nextInt(16);
            int centerY = (random.nextInt(120) + 4);
            Block glow = null;
            glow = world.getBlockAt(centerX, centerY, centerZ);
            glow.setType(Material.GLOWSTONE);
		}

	}

}
