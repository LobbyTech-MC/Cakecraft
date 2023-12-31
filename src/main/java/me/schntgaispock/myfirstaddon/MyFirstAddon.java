package me.schntgaispock.myfirstaddon;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import me.schntgaispock.myfirstaddon.slimefun.ItemManager;
import me.schntgaispock.myfirstaddon.slimefun.listeners.MusicalCakeTunerListener;

public class MyFirstAddon extends AbstractAddon {

    private static MyFirstAddon instance;

    public MyFirstAddon() {
        super("SchnTgaiSpock", "MyFirstAddon", "master", "options.auto-update");
    }

    public static MyFirstAddon getInstance() {
        return instance;
    }

    @Override
    public void enable() {
        instance = this;

        getLogger().info("#======================================#");
        getLogger().info("#   MyFirst Addon - By SchnTgaiSpock   #");
        getLogger().info("#======================================#");

        ItemManager.setup();
        MusicalCakeTunerListener.setup();
    }

    @Override
    protected void disable() {
        instance = null;
    }
}
