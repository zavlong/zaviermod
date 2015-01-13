package com.zavier.zavmod;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemEmArmor extends ItemArmor {
	public ItemEmArmor(ArmorMaterial material, int armorType, String name){
		super(material, 0, armorType);
		setUnlocalizedName(ZavierMod.MODID + "_" + name);
		setTextureName(ZavierMod.MODID + ":" + name);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if (stack.getItem() == ZavierMod.emhelmet || stack.getItem() == ZavierMod.emchest || stack.getItem() == ZavierMod.emboots){
			return ZavierMod.MODID + ":models/armor/emarmor1.png";
		}
		else if(stack.getItem() == ZavierMod.emleggings){
			return ZavierMod.MODID + ":models/armor/emarmor2.png";
		}
		else{ return null;}
	}
}
