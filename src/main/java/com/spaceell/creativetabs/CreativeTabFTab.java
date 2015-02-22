package com.spaceell.creativetabs;

import com.spaceell.item.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabFTab extends CreativeTabs {

	public CreativeTabFTab(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return MItems.Pastry;
	}

}
