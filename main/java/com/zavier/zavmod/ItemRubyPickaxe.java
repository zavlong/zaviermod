package com.zavier.zavmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemRubyPickaxe extends ItemPickaxe {
	public ItemRubyPickaxe(ToolMaterial material, String name){
		super(material);
		setUnlocalizedName(ZavierMod.MODID + "_" + name);
		setTextureName(ZavierMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
