package init;

import com.cake.testmod.item.ItemTM;
import com.cake.testmod.item.ItemCrate;

import cpw.mods.fml.common.registry.GameRegistry;


public class ModInit {

	public static final ItemTM itemCrate=new ItemCrate();
	
	public static void init() {
		GameRegistry.registerItem(itemCrate, "ItemCrate");
	}
	
}
