package com.cake.testmod;

import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;


public class Events {
	  @SubscribeEvent
	    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {

	    	event.player.addChatMessage(new ChatComponentText("[Test Mod] Welcome to Test mod!"));
	        
	    }

}
