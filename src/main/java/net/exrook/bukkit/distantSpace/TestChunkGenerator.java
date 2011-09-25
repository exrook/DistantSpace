/**
 * 
 */
package net.exrook.bukkit.distantSpace;

import java.util.Random;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.util.noise.*;

/**
 * @author exrook
 *
 */
public class TestChunkGenerator extends ChunkGenerator {

	/* (non-Javadoc)
	 * @see org.bukkit.generator.ChunkGenerator#generate(org.bukkit.World, java.util.Random, int, int)
	 */
	SimplexNoiseGenerator simplexNoise;
	TestChunkGenerator() {

	}
	@Override
	public byte[] generate(World world, Random random, int x, int z) {
		simplexNoise = new SimplexNoiseGenerator(random);
		byte[] result = new byte[32768];
		for (int xx = 0; xx < 16; xx++) {
		     for (int zz = 0; zz < 16; zz++) {
		         for (int yy = 0; yy < 128; yy++) {
		             result[(xx * 16 + zz) * 128 + yy] = ((Double) simplexNoise.noise(xx, yy, zz)).byteValue();
		         }
		     }
		 }
		return null;
	}

}
