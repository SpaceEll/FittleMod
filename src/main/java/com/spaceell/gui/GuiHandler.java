package com.spaceell.gui;


import com.spaceell.blocks.ContainerFTable;
import com.spaceell.lib.RefStrings;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityNote;
import net.minecraft.world.World;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.gui.inventory.GuiFurnace;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
    { 
            TileEntity tileEntity = world.getTileEntity(x, y, z);

            if(tileEntity != null)
            {
                    switch(ID)
                    {
                    case 0: return new ContainerFTable(player.inventory, world, x, y, z);
                    }
            }

            return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
            TileEntity tileEntity = world.getTileEntity(x, y, z);

            if (tileEntity != null)
            {
                    switch(ID)
                    {
                    case 0: return new GuiFTable(player.inventory, tileEntity);
                    }
            }
            if (ID == 3)
            {
            }

            return null;
    }
}