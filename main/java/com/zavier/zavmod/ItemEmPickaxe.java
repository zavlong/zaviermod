package com.zavier.zavmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemEmPickaxe extends ItemPickaxe {
	public ItemEmPickaxe(ToolMaterial material, String name){
		super(material);
		setUnlocalizedName(ZavierMod.MODID + "_" + name);
		setTextureName(ZavierMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
}
