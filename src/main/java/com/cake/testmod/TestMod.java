package com.cake.testmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid="TestMod",name="TestMod",version="1.7.2-1.0")

public class TestMod {
	@Mod.Instance("TestMod")
	public static TestMod instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//System.out.println("CAKE WAS HERE");
	}
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
		
	}
	@Mod.EventHandler
	public void Init(FMLPostInitializationEvent event) {
		
	}
	
}
