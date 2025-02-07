package me.schntgaispock.myfirstaddon.slimefun;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.schntgaispock.myfirstaddon.MyFirstAddon;

public class SchnsGroups {
    public static final ItemGroup SCHNS_FIRST_ADDON;

    static {
        SCHNS_FIRST_ADDON = new ItemGroup(
            new NamespacedKey(MyFirstAddon.getInstance(), "schns_first_addon"),
            new CustomItemStack(Material.DIAMOND, "&6蛋糕工艺", "", "&b> 单击打开"));
    }

}
