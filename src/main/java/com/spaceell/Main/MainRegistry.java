package com.spaceell.Main;

import com.spaceell.blocks.FTable;
import com.spaceell.blocks.MBlocks;
import com.spaceell.creativetabs.MCreativeTabs;
import com.spaceell.gui.GuiHandler;
import com.spaceell.item.MItems;
import com.spaceell.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class MainRegistry {

	@SidedProxy(clientSide = RefStrings.CLIENTSIDE , serverSide  = RefStrings.SERVERSIDE )
	public static ServerProxy proxy;
	@EventHandler
	public static void Preload(FMLPreInitializationEvent PreEvent){
		MCreativeTabs.initializeTabs();
		MItems.mainRegistry();
		proxy.registerRenderInfo();
		CraftingManager.mainRegistry();
		MBlocks.mainRegistry();
	}
	
	@EventHandler
	public static void load(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public static void Postload(FMLPostInitializationEvent PostEvent){
		
	}
	
}
