package com.zavier.zavmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

import net.minecraft.item.ItemSpade;


public class ItemObsSpade extends ItemSpade {
	public ItemObsSpade(ToolMaterial material, String name){
		super(material);
		setUnlocalizedName(ZavierMod.MODID + "_" + name);
		setTextureName(ZavierMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
