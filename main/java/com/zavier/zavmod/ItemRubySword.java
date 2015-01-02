package com.zavier.zavmod;

import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.item.ItemSword;

public class ItemRubySword extends ItemSword {
	public ItemRubySword(ToolMaterial material, String name){
		super(material);
		setUnlocalizedName(ZavierMod.MODID + "_" + name);
		setTextureName(ZavierMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabCombat);
	}
}
