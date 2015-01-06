package com.zavier.zavmod;

import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.item.ItemSpade;

public class ItemEmSpade extends ItemSpade {
	public ItemEmSpade(ToolMaterial material, String name){
		super(material);
		setUnlocalizedName(ZavierMod.MODID + "_" + name);
		setTextureName(ZavierMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
