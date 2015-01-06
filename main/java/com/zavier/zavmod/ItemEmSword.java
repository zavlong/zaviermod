package com.zavier.zavmod;

import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.item.ItemSword;

public class ItemEmSword extends ItemSword {
	public ItemEmSword(ToolMaterial material, String name){
		super(material);
		setUnlocalizedName(ZavierMod.MODID + "_" + name);
		setTextureName(ZavierMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabCombat);
	}
}
