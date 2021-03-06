package com.zavier.zavmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockObsBricks extends Block {
	String name = "obsbricks";
	public BlockObsBricks(){
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
