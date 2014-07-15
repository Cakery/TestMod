package init;

import com.cake.testmod.item.ItemCrate;
import com.cake.testmod.item.ItemTM;
import com.cake.testmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.Mod_Id)
public class TMItems {
	
	public static final ItemTM itemCrate=new ItemCrate();
	
	public static void init() {
		GameRegistry.registerItem(itemCrate, "ItemCrate");
	}
	
}
