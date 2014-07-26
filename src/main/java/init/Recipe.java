package init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.cake.testmod.reference.BlocksRef;
import com.cake.testmod.reference.ItemRef;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipe {

public static void init() {
	//Items
	GameRegistry.addRecipe(new ItemStack(ItemRef.crateKey),
			"xxx",
			" xx",
	        'x', Items.gold_nugget);
	
	//Blocks
	GameRegistry.addShapelessRecipe(new ItemStack(BlocksRef.blackBrick,1), new ItemStack(Blocks.brick_block),Items.dye);
	GameRegistry.addRecipe(new ItemStack(BlocksRef.compactedIce),
			"xxx",
			"xxx",
	        "xxx",'x', Blocks.ice);
}
}
