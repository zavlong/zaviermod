package com.zavier.zavmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockObsChisel extends Block {
	String name = "obschisel";
	public BlockObsChisel(){
		super(Material.rock);
		setBlockName(ZavierMod.MODID + "_" + name);
		setBlockTextureName(ZavierMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(15F);
		setResistance(5000.0F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 3);
	}
}
