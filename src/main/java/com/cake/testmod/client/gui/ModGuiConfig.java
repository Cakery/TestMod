package com.cake.testmod.client.gui;

import com.cake.testmod.handler.ConfigurationManager;
import com.cake.testmod.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationManager.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.Mod_Id,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationManager.configuration.toString()));
    }
}