package com.cake.testmod;

import com.cake.testmod.proxy.IProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid=com.cake.testmod.reference.Reference.Mod_Id,name=com.cake.testmod.reference.Reference.Mod_name,version=com.cake.testmod.reference.Reference.Version)

public class TestMod {
	@Mod.Instance("TestMod")
	public static TestMod instance;
	
	@SidedProxy(clientSide="com.cake.testmod.proxy.ClientProxy",serverSide="com.cake.testmod.proxy.ServerProxy")
	public static IProxy proxy;
	
	
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
