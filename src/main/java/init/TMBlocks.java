package init;



import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.cake.testmod.block.BlackBrickBlock;
import com.cake.testmod.block.BlockTM;
import com.cake.testmod.item.ItemTM;
import com.cake.testmod.item.ItemCrate;
import com.cake.testmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.Mod_Id)
public class TMBlocks {

	
	public static final BlackBrickBlock blackBrick=new BlackBrickBlock();
	
	public static void init() {
		
		GameRegistry.registerBlock(blackBrick, "BlackBrick");
		
		GameRegistry.addShapelessRecipe(new ItemStack(blackBrick,1), new ItemStack(Blocks.brick_block),Items.dye);
	}
	
}
