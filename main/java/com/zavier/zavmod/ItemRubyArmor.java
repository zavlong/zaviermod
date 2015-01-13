package com.zavier.zavmod;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemRubyArmor extends ItemArmor {
	public ItemRubyArmor(ArmorMaterial material, int armorType, String name){
		super(material, 0, armorType);
		setUnlocalizedName(ZavierMod.MODID + "_" + name);
		setTextureName(ZavierMod.MODID + ":" + name);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if (stack.getItem() == ZavierMod.rubyhelmet || stack.getItem() == ZavierMod.rubychest || stack.getItem() == ZavierMod.rubyboots){
			return ZavierMod.MODID + ":models/armor/rubyarmor1.png";
		}
		else if(stack.getItem() == ZavierMod.rubyleggings){
			return ZavierMod.MODID + ":models/armor/rubyarmor2.png";
		}
		else{ return null;}
	}
}
