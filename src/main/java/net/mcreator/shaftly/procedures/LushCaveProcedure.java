package net.mcreator.shaftly.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.shaftly.block.NiteTaterPlantBlock;
import net.mcreator.shaftly.block.MossBlock;
import net.mcreator.shaftly.ShaftlyModElements;

import java.util.Map;

@ShaftlyModElements.ModElement.Tag
public class LushCaveProcedure extends ShaftlyModElements.ModElement {
	public LushCaveProcedure(ShaftlyModElements instance) {
		super(instance, 5);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure LushCave!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure LushCave!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure LushCave!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure LushCave!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Blocks.CAVE_AIR.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())) {
			if ((((Blocks.STONE.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock())
					|| (Blocks.DIORITE.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
							.getBlock()))
					|| ((Blocks.GRANITE.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
							.getBlock())
							|| (Blocks.ANDESITE.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
									.getBlock())))) {
				world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.GRASS_BLOCK.getDefaultState(), 3);
				if ((0.9 <= Math.random())) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.FERN.getDefaultState(), 3);
				} else if ((0.97 <= Math.random())) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.OAK_SAPLING.getDefaultState(), 3);
				} else if ((0.98 <= Math.random())) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), NiteTaterPlantBlock.block.getDefaultState(), 3);
				} else if ((0.6 <= Math.random())) {
					world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), MossBlock.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
				}
			} else if (((0.6 <= Math.random()) && (Blocks.STONE.getDefaultState()
					.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DARK_OAK_LEAVES.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.OAK_LOG.getDefaultState(), 3);
			} else {
				if (((0.6 <= Math.random()) && (Blocks.STONE.getDefaultState()
						.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.BIRCH_LEAVES.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.OAK_LOG.getDefaultState(), 3);
				} else {
					if (((0.6 <= Math.random()) && (Blocks.STONE.getDefaultState()
							.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.OAK_LEAVES.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.OAK_LOG.getDefaultState(), 3);
					} else {
						if (((0.6 <= Math.random()) && (Blocks.STONE.getDefaultState()
								.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.SPRUCE_LEAVES.getDefaultState(), 3);
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.OAK_LOG.getDefaultState(), 3);
						} else {
							if (((0.6 <= Math.random()) && (Blocks.STONE.getDefaultState()
									.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))) {
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MossBlock.block.getDefaultState(), 3);
							} else {
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
							}
						}
					}
				}
			}
		}
	}
}
