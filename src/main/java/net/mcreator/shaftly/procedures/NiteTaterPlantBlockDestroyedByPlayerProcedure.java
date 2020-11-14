package net.mcreator.shaftly.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.shaftly.item.NiteTaterNuggetItem;
import net.mcreator.shaftly.item.NiteTaterItem;
import net.mcreator.shaftly.block.NiteTaterPlantBlock;
import net.mcreator.shaftly.ShaftlyModElements;

import java.util.Map;

@ShaftlyModElements.ModElement.Tag
public class NiteTaterPlantBlockDestroyedByPlayerProcedure extends ShaftlyModElements.ModElement {
	public NiteTaterPlantBlockDestroyedByPlayerProcedure(ShaftlyModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure NiteTaterPlantBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure NiteTaterPlantBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure NiteTaterPlantBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure NiteTaterPlantBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure NiteTaterPlantBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH,
				/* @ItemStack */((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)) != 0))) {
			if (!world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(NiteTaterPlantBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else {
			if ((0.5 < Math.random())) {
				for (int index0 = 0; index0 < (int) (1); index0++) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(NiteTaterItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			} else {
				if ((0.5 < Math.random())) {
					for (int index1 = 0; index1 < (int) (2); index1++) {
						if (!world.getWorld().isRemote) {
							ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(NiteTaterItem.block, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if ((0.5 < Math.random())) {
						for (int index2 = 0; index2 < (int) (3); index2++) {
							if (!world.getWorld().isRemote) {
								ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(NiteTaterItem.block, (int) (1)));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					} else {
						if ((0.5 < Math.random())) {
							for (int index3 = 0; index3 < (int) (4); index3++) {
								if (!world.getWorld().isRemote) {
									ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z,
											new ItemStack(NiteTaterItem.block, (int) (1)));
									entityToSpawn.setPickupDelay((int) 10);
									world.addEntity(entityToSpawn);
								}
							}
						} else {
							for (int index4 = 0; index4 < (int) (5); index4++) {
								if (!world.getWorld().isRemote) {
									ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z,
											new ItemStack(NiteTaterItem.block, (int) (1)));
									entityToSpawn.setPickupDelay((int) 10);
									world.addEntity(entityToSpawn);
								}
							}
						}
					}
				}
			}
			if ((0.5 < Math.random())) {
				for (int index5 = 0; index5 < (int) (1); index5++) {
					if (!world.getWorld().isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(NiteTaterNuggetItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			} else {
				if ((0.5 < Math.random())) {
					for (int index6 = 0; index6 < (int) (2); index6++) {
						if (!world.getWorld().isRemote) {
							ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(NiteTaterNuggetItem.block, (int) (1)));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if ((0.5 < Math.random())) {
						for (int index7 = 0; index7 < (int) (3); index7++) {
							if (!world.getWorld().isRemote) {
								ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z,
										new ItemStack(NiteTaterNuggetItem.block, (int) (1)));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						}
					} else {
						if ((0.5 < Math.random())) {
							for (int index8 = 0; index8 < (int) (4); index8++) {
								if (!world.getWorld().isRemote) {
									ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z,
											new ItemStack(NiteTaterNuggetItem.block, (int) (1)));
									entityToSpawn.setPickupDelay((int) 10);
									world.addEntity(entityToSpawn);
								}
							}
						} else {
							for (int index9 = 0; index9 < (int) (5); index9++) {
								if (!world.getWorld().isRemote) {
									ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z,
											new ItemStack(NiteTaterNuggetItem.block, (int) (1)));
									entityToSpawn.setPickupDelay((int) 10);
									world.addEntity(entityToSpawn);
								}
							}
						}
					}
				}
			}
		}
	}
}
