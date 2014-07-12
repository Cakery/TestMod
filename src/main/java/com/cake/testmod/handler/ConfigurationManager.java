package com.cake.testmod.handler;

import java.io.File;

import com.cake.testmod.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationManager {
	public static Configuration configuration;
	public static boolean TestValue;
	
	public static void Init(File configFile) {
		if (configuration==null) {
			configuration=new Configuration(configFile);
		}
	}

	@SubscribeEvent
	public void OnConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {

		if (event.modID.equalsIgnoreCase(Reference.Mod_Id)) {

		}

	}

	public void LoadConfigurations() {
		TestValue=configuration.getBoolean("ConfigValue", configuration.CATEGORY_GENERAL, true, "Test Value");
		if (configuration.hasChanged()) {
			configuration.save();
		}
	}
	
}
