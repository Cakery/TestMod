package com.cake.testmod.creativetab;

import init.TMItems;

import com.cake.testmod.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTM {
	
	public static final CreativeTabs TM_TAB=new CreativeTabs(Reference.Mod_Id) {
	
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return TMItems.itemCrate;
		}
		@Override
		public String getTranslatedTabLabel() {
			return "Test Mod";
		}
	};
	
}
