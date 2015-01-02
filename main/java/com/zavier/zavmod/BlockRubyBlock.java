package com.zavier.zavmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRubyBlock extends Block {
	String name = "rubyblock";
	public BlockRubyBlock(){
		super(Material.rock);
		setBlockName(ZavierMod.MODID + "_" + name);
		setBlockTextureName(ZavierMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(1.5F);
		setResistance(10.0F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
	}
}
