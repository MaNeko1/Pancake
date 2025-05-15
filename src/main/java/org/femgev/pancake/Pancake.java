package org.femgev.pancake;

import org.bukkit.plugin.java.JavaPlugin;

public final class Pancake extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Enable");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
