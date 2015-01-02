package com.zavier.zavmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;


public class ItemRubyAxe extends ItemAxe {
	public ItemRubyAxe(ToolMaterial material, String name){
		super(material);
		
		setUnlocalizedName(ZavierMod.MODID + "_" + name);
		setTextureName(ZavierMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
