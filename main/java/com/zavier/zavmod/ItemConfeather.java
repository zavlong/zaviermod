package com.zavier.zavmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemConfeather extends Item {
	
	public ItemConfeather(){
		setUnlocalizedName(ZavierMod.MODID + "_" + "confeather");
		setTextureName(ZavierMod.MODID + ":" + "confeather");
		setCreativeTab(CreativeTabs.tabMisc);
	}
}
