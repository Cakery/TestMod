package init;


import com.cake.testmod.reference.ItemRef;
import com.cake.testmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.Mod_Id)
public class TMItems {
	
	
	public static void init() {
		GameRegistry.registerItem(ItemRef.itemCrate, "ItemCrate");
	}
	
}
