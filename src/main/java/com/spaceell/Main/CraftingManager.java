package com.spaceell.Main;

import com.spaceell.item.MItems;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}
	
	public static void addCraftingRec(){
		//Shaped
	GameRegistry.addRecipe(new ItemStack(MItems.Butter, 2) , new Object[]{"   ", "XXX", "   ", 'X', Items.milk_bucket});
	GameRegistry.addRecipe(new ItemStack(MItems.Pastry, 4), new Object[]{"   ","XYX","   ", 'X', MItems.Flour, 'Y', MItems.Butter});
	GameRegistry.addRecipe(new ItemStack(MItems.APie, 1), new Object[]{"ESE", "PAP", "PPP", 'E', Items.egg, 'S', Items.sugar, 'P', MItems.Pastry, 'A', Items.apple});
	GameRegistry.addRecipe(new ItemStack(MItems.BPick, 1), new Object[]{"BBB"," S "," S ", 'B', MItems.Butter, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(MItems.BSword, 1), new Object[]{" B "," B "," S ", 'B', MItems.Butter, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(MItems.BAxe, 1), new Object[]{"BB ","BS "," S ", 'B', MItems.Butter, 'S', Items.stick });
	GameRegistry.addRecipe(new ItemStack(MItems.BSpade, 1), new Object[]{" B "," S "," S ", 'B', MItems.Butter, 'S', Items.stick });
		//Shapeless
	GameRegistry.addShapelessRecipe(new ItemStack(Items.wheat, 1), new ItemStack(MItems.Flour));
	}
	
	public static void addSmeltingRec(){
		//Smelting

		
	}
}
