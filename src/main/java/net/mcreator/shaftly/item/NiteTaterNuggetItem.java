
package net.mcreator.shaftly.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.shaftly.procedures.NiteTaterFoodEatenProcedure;
import net.mcreator.shaftly.ShaftlyModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@ShaftlyModElements.ModElement.Tag
public class NiteTaterNuggetItem extends ShaftlyModElements.ModElement {
	@ObjectHolder("shaftly:nite_tater_nugget")
	public static final Item block = null;
	public NiteTaterNuggetItem(ShaftlyModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(0.2f).build()));
			setRegistryName("nite_tater_nugget");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.BLOCK;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("It's poo"));
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				NiteTaterFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
