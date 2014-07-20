package com.cake.testmod.item;

import java.util.Random;

import com.cake.testmod.utility.LogHelper;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCrate extends ItemTM {

	public ItemCrate() {
		super();
		
		this.setUnlocalizedName("itemCrate");
		this.setMaxStackSize(16);
		//this.setCreativeTab(CreativeTabs.tabMisc);
		
		
	}
	
	
	
	Item[] AItems={Items.diamond,Items.bed,Items.redstone,Items.apple,Items.arrow,Items.beef,Items.blaze_rod,Items.slime_ball};

	
	
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
		 if (!par3EntityPlayer.capabilities.isCreativeMode)
	      {
	          --par1ItemStack.stackSize;
	          LogHelper.info(par3EntityPlayer.getDisplayName()+" has used a Item Crate!");
	      }
	      par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	      if (!par2World.isRemote)
	      {
	    	  Item RandI=AItems[new Random().nextInt(AItems.length)];
	    	  par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(RandI,1));
	    	  
	      }
	
	     
	      return par1ItemStack;
	  }
		
	}
	
	

