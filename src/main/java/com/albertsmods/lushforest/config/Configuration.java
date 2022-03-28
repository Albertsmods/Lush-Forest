package com.albertsmods.lushforest.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "lushforest")
public class Configuration implements ConfigData {

    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public int biomeWeight = 2;
    public boolean lushValleyEnabled = true;
    public boolean lushForestEnabled = true;
    public boolean lushJungleEnabled = true;
    public boolean lushBirchForestEnabled = true;
}
