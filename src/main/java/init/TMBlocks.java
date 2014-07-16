package init;



import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


import com.cake.testmod.item.ItemTM;
import com.cake.testmod.item.ItemCrate;
import com.cake.testmod.reference.BlocksRef;
import com.cake.testmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.Mod_Id)
public class TMBlocks {

	
	
	
	public static void init() {
		
		GameRegistry.registerBlock(BlocksRef.blackBrick, "BlackBrick");
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksRef.blackBrick,1), new ItemStack(Blocks.brick_block),Items.dye);
	}
	
}
