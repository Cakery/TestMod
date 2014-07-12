package com.cake.testmod;

import com.cake.testmod.handler.ConfigurationManager;
import com.cake.testmod.proxy.IProxy;
import com.cake.testmod.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid=Reference.Mod_Id,name=Reference.Mod_name,version=com.cake.testmod.reference.Reference.Version)

public class TestMod {
	@Mod.Instance("TestMod")
	public static TestMod instance;

	@SidedProxy(clientSide=Reference.Client_Proxy_Class,serverSide=Reference.Server_Proxy_Class)
	public static IProxy proxy;


	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationManager.Init(event.getSuggestedConfigurationFile());
	}
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {

	}
	@Mod.EventHandler
	public void Init(FMLPostInitializationEvent event) {

	}

}
