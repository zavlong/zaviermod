package com.zavier.zavmod;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemRubyOre extends ItemBlock{

	public ItemRubyOre(Block block) {
		super(block);
		setHasSubtypes(true);
		
	}
	@Override
	public String getUnlocalizedName(ItemStack itemstack){
		String name = "";
		switch(itemstack.getItemDamage()){
		case 0:
			name = "ore";
			break;
		case 1:
			name = "block";
			break;
		default:
			System.out.println("Invalid metadata for Block RubyOre");
			name = "broken";
			break;
		}
		return getUnlocalizedName() + "." + name;
		
	}
	@Override
	public int getMetadata(int par1){
		return par1;
	}
	
}
