package me.schntgaispock.myfirstaddon.slimefun.items;

import java.util.Collection;


import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.BoundingBox;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactive;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import lombok.NonNull;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;

public class AirCake extends SlimefunItem implements Radioactive {
    public static final Radioactivity RADIOACTIVITY = Radioactivity.HIGH;

    public AirCake(@NonNull ItemGroup itemGroup, @NonNull SlimefunItemStack itemStack,
        @NonNull RecipeType recipeType,
        @NonNull ItemStack[] recipe) {
        super(itemGroup, itemStack, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        addItemHandler((BlockUseHandler) this::onBlockRightClick, onTick());
    }

    private void onBlockRightClick(@NonNull PlayerRightClickEvent event) {
        event.cancel();
    }

    /**
     * Launches players into the air
     * 
     * @return Returns the ticker that keeps track of it
     */
    private BlockTicker onTick() {
        return new BlockTicker() {

            @Override
            public boolean isSynchronized() {
                return false;
            }

            @Override
            public void tick(Block b, SlimefunItem arg1, Config data) {
                Collection<Entity> players = b.getWorld().getNearbyEntities(new BoundingBox(b.getX(), b.getY(), b.getZ(), b.getX()+1, b.getY()+1, b.getZ()+1));
                for (Entity player : players) {
                    player.setVelocity(player.getVelocity().clone().setY(2));
                }
            }
        };
    }

    @Override
    public Radioactivity getRadioactivity() {
        return RADIOACTIVITY;
    }
}
