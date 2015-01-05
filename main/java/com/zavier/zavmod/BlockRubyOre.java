package com.zavier.zavmod;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockRubyOre extends Block {
	String name = "rubyore";
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	public BlockRubyOre(){
		super(Material.rock);
		setBlockName(ZavierMod.MODID + "_" + name);
		
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(1.75F);
		setResistance(5.0F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister){
		icons = new IIcon[2];
		
		for (int i = 0; i < icons.length; i++){
			icons[i] = par1IconRegister.registerIcon(ZavierMod.MODID + ":" + "rubyore" + i);
			
		}
	}
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2){
		return icons[par2];
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item par1,CreativeTabs par2Creativetabs, List par3List){
		for (int var4 = 0; var4 < 2; ++var4){
			
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}
	
}
