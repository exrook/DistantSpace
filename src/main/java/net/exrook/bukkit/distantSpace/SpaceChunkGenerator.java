package net.exrook.bukkit.distantSpace;

import java.util.Random;
import java.util.List;

import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.Location;

public class SpaceChunkGenerator extends ChunkGenerator {

	public byte[] generate(World world, Random random, int x, int z) {
		byte[] result = new byte[32768];
		for (int xx = 0; xx < 16; xx++) {
		     for (int zz = 0; zz < 16; zz++) {
		         for (int yy = 0; yy < 128; yy++) {
		             result[(xx * 16 + zz) * 128 + yy] = 0;
		         }
		     }
		 }
		if (x == 0 && z == 0) {
			result[1] = 20;
		}
		return result;
	}
	public boolean canSpawn(World world, int x, int z){
		return true;
	}
	public List<BlockPopulator> getDefaultPopulators(World world){
		return null;
	}
	public Location getFixedSpawnLocation(World world, Random random) {
		return new Location(world, 0, 1, 0);
	}

}
