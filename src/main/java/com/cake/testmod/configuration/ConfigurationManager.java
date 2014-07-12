package com.cake.testmod.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationManager {
public static void Init(File configFile) {
	Configuration configuration=new Configuration(configFile);
	boolean configValue = false;
	try {
		configuration.load();
		configValue= configuration.get(configuration.CATEGORY_GENERAL, "ConfigValue", true,"Test Value").getBoolean(true);
	}
	catch(Exception e) {
		
	}
	finally {
		configuration.save();
		System.out.println(configValue);
	}
}
}
