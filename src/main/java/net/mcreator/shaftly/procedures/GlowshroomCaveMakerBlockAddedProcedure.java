package net.mcreator.shaftly.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.shaftly.block.GlowshroomBlock;
import net.mcreator.shaftly.block.GlowhroomVineBlock;
import net.mcreator.shaftly.block.GlowceliumBlock;
import net.mcreator.shaftly.ShaftlyModElements;

import java.util.Map;

@ShaftlyModElements.ModElement.Tag
public class GlowshroomCaveMakerBlockAddedProcedure extends ShaftlyModElements.ModElement {
	public GlowshroomCaveMakerBlockAddedProcedure(ShaftlyModElements instance) {
		super(instance, 43);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure GlowshroomCaveMakerBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure GlowshroomCaveMakerBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure GlowshroomCaveMakerBlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure GlowshroomCaveMakerBlockAdded!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Blocks.CAVE_AIR.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())) {
			if ((Blocks.STONE.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), GlowceliumBlock.block.getDefaultState(), 3);
				if ((0.05 >= Math.random())) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), GlowshroomBlock.block.getDefaultState(), 3);
				}
			} else if (((0.2 >= Math.random()) && (Blocks.STONE.getDefaultState()
					.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), GlowhroomVineBlock.block.getDefaultState(), 3);
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
			}
		}
	}
}
