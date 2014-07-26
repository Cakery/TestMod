package com.cake.testmod.block;

import net.minecraft.block.material.Material;

public class CompactedIce extends BlockTM {
	

	
public CompactedIce() {
	super(Material.ice);
	this.setBlockName("compactedIce");
	this.setBlockTextureName("compactedIce");
	this.slipperiness=1F;
	this.setStepSound(soundTypeGlass);
	this.blockHardness=5F;
	this.lightOpacity=13;

}
}
