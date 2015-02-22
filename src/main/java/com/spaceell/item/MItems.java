package com.spaceell.item;

import com.spaceell.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;


public class MItems {

	
	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	
	public static ToolMaterial Buttery = EnumHelper.addToolMaterial("Buttery", 2, 1000, 6.0F, 2.5F, 5);
	
	
	
	public static Item Flour;
	public static Item Butter;
	public static Item Pastry;
	public static Item APie;
	public static Item BPick;
	public static Item BSword;
	public static Item BSpade;
	public static Item BAxe;
	
	public static void initializeItem(){
		Flour = new Item().setUnlocalizedName("Flour").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":Flour");
		Butter = new Item().setUnlocalizedName("Butter").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":Butter");
		Pastry = new Item().setUnlocalizedName("Pastry").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":Pastry");
		APie = new ItemFood(10, true).setUnlocalizedName("APie").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":APie");
		BPick = new BPick(Buttery).setUnlocalizedName("BPick").setCreativeTab(CreativeTabs.tabTools).setTextureName(RefStrings.MODID + ":BPick");
		BSword = new BSword(Buttery).setUnlocalizedName("BSword").setCreativeTab(CreativeTabs.tabCombat).setTextureName(RefStrings.MODID + ":BSword");
		BSpade = new BSpade(Buttery).setUnlocalizedName("BSpade").setCreativeTab(CreativeTabs.tabTools).setTextureName(RefStrings.MODID + ":BSpade");
		BAxe = new BAxe(Buttery).setUnlocalizedName("BAxe").setCreativeTab(CreativeTabs.tabTools).setTextureName(RefStrings.MODID + ":BAxe");
	}
	public static void registerItem(){
		GameRegistry.registerItem(Flour, Flour.getUnlocalizedName());
		GameRegistry.registerItem(Butter, Butter.getUnlocalizedName());
		GameRegistry.registerItem(Pastry, Pastry.getUnlocalizedName());
		GameRegistry.registerItem(APie, APie.getUnlocalizedName());
		GameRegistry.registerItem(BPick, BPick.getUnlocalizedName());
		GameRegistry.registerItem(BSword, BSword.getUnlocalizedName());
		GameRegistry.registerItem(BSpade, BSpade.getUnlocalizedName());
		GameRegistry.registerItem(BAxe, BAxe.getUnlocalizedName());
		
	}
}
