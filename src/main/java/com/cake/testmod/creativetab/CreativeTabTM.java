package com.cake.testmod.creativetab;



import com.cake.testmod.reference.ItemRef;
import com.cake.testmod.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTM {
	
	public static final CreativeTabs TM_TAB=new CreativeTabs(Reference.Mod_Id.toLowerCase()) {
	
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return ItemRef.itemCrate;
		}
	};
	
}
