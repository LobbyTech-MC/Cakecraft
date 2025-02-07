package me.schntgaispock.myfirstaddon.slimefun.items;

import java.io.ObjectInputFilter.Config;

import org.bukkit.ChatColor;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactive;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import lombok.NonNull;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;

public class RadioactiveCake extends SlimefunItem implements Radioactive {
    public static final Radioactivity RADIOACTIVITY = Radioactivity.HIGH;

    public RadioactiveCake(@NonNull ItemGroup itemGroup, @NonNull SlimefunItemStack itemStack,
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
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.YELLOW + "你可能不应该食用具有放射性的蛋糕...");
        player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, SoundCategory.PLAYERS, 1.0f, 1.0f);
    }

    /**
     * Generates angry (radiation) particles
     * @return Returns the ticker that keeps track of it
     */
    private BlockTicker onTick() {
        return new BlockTicker() {

            @Override
            public boolean isSynchronized() {
                return false;
            }

            public void tick(Block b, SlimefunItem arg1, Config data) {
                b.getWorld().spawnParticle(Particle.ANGRY_VILLAGER, b.getX() + 0.5d, b.getY() - 0.5d, b.getZ() + 0.5d, 5, .2d, .2d, .2d, 2.0d);
            }

        };
    }

    @Override
    public Radioactivity getRadioactivity() {
        return RADIOACTIVITY;
    }
}
