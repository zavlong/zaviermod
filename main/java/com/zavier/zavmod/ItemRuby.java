package com.zavier.zavmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRuby extends Item {

	public ItemRuby(){
		setUnlocalizedName(ZavierMod.MODID + "_" + "ruby");
		setTextureName(ZavierMod.MODID + ":" + "ruby");
		setCreativeTab(CreativeTabs.tabMisc);
	}
}
