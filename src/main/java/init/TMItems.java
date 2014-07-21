package init;



import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;


import com.cake.testmod.reference.ItemRef;
import com.cake.testmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.Mod_Id)
public class TMItems {
	
	
	public static void init() {
		GameRegistry.registerItem(ItemRef.itemCrate, "ItemCrate");
		GameRegistry.registerItem(ItemRef.crateKey, "CrateKey");
		
		
		GameRegistry.addRecipe(new ItemStack(ItemRef.crateKey),
				"xxx",
				" xx",
		        'x', Items.gold_nugget);
		
		
	}
	
}
