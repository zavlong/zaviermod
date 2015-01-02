package com.zavier.zavmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRubyOre extends Block {
	String name = "rubyore";
	public BlockRubyOre(){
		super(Material.rock);
		setBlockName(ZavierMod.MODID + "_" + name);
		setBlockTextureName(ZavierMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(1.75F);
		setResistance(5.0F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
	}
}
