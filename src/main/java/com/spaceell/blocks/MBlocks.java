package com.spaceell.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MBlocks {
	public static void mainRegistry() {
		initalizeBlock();
		registerBlock();
	}
	
	
	public static Block FTable;
	public static Block blockWorkSurface;
	public static int guiIDWorkSurface = 1;
	
	
	public static void initalizeBlock() {
		blockWorkSurface = new WorkSurface().setBlockName("WorkSurface");
	}
	
	public static void registerBlock() {
		GameRegistry.registerBlock(blockWorkSurface, blockWorkSurface.getUnlocalizedName());
		
	}
	

}
