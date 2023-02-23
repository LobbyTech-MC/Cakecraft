package me.schntgaispock.myfirstaddon.slimefun;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.Getter;
import lombok.NonNull;

public class SchnsRecipes {
    /**
     * Recipe
     */
    public static class Recipe {
        @Getter
        public final RecipeType recipeType;
        @Getter
        public final ItemStack[] recipe;

        public Recipe(@NonNull RecipeType recipeType, @NonNull ItemStack[] recipe) {
            this.recipeType = recipeType;
            this.recipe = recipe;
        }

		public @NonNull RecipeType getRecipeType() {
			// TODO Auto-generated method stub
			return recipeType;
		}

		public @NonNull ItemStack[] getRecipe() {
			// TODO Auto-generated method stub
			return recipe;
		}
    }

    public static final Recipe FIRE_CAKE = new Recipe(
        RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {
            null, null, null,
            null, new ItemStack(Material.CANDLE), null,
            null, new ItemStack(Material.CAKE), null
        });

    public static final Recipe WATER_CAKE = new Recipe(
        RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {
            null, null, null,
            null, new ItemStack(Material.WATER_BUCKET), null,
            null, new ItemStack(Material.CAKE), null
        });

    public static final Recipe XP_PRINTER = new Recipe(
        RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {
            new ItemStack(Material.EXPERIENCE_BOTTLE), new ItemStack(Material.EXPERIENCE_BOTTLE),
            new ItemStack(Material.EXPERIENCE_BOTTLE),
            new ItemStack(Material.EXPERIENCE_BOTTLE), new ItemStack(Material.PAPER),
            new ItemStack(Material.EXPERIENCE_BOTTLE),
            new ItemStack(Material.EXPERIENCE_BOTTLE), new ItemStack(Material.EXPERIENCE_BOTTLE),
            new ItemStack(Material.EXPERIENCE_BOTTLE)
        });

    public static final Recipe RADIOACTIVE_CAKE = new Recipe(
        RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {
            new ItemStack(Material.MILK_BUCKET), new ItemStack(Material.MILK_BUCKET),
            new ItemStack(Material.MILK_BUCKET),
            new ItemStack(Material.SUGAR), new ItemStack(Material.EGG), new ItemStack(Material.SUGAR),
            new ItemStack(Material.WHEAT), SlimefunItems.URANIUM, new ItemStack(Material.WHEAT)
        });

    public static final Recipe MUSICAL_CAKE = new Recipe(
        RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {
            new ItemStack(Material.MILK_BUCKET), new ItemStack(Material.MILK_BUCKET),
            new ItemStack(Material.MILK_BUCKET),
            new ItemStack(Material.SUGAR), new ItemStack(Material.EGG), new ItemStack(Material.SUGAR),
            new ItemStack(Material.WHEAT), new ItemStack(Material.NOTE_BLOCK), new ItemStack(Material.WHEAT)
        });

    public static final Recipe MUSICAL_CAKE_TUNER = new Recipe(
        RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.JUKEBOX), new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS), SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.PISTON), new ItemStack(Material.OAK_PLANKS)
        });

    public static final Recipe AIR_CAKE = new Recipe(
        RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {
            new ItemStack(Material.MILK_BUCKET), new ItemStack(Material.MILK_BUCKET), new ItemStack(Material.MILK_BUCKET),
            new ItemStack(Material.SUGAR), new ItemStack(Material.EGG), new ItemStack(Material.SUGAR),
            new ItemStack(Material.DIRT), SlimefunItems.AIR_RUNE, new ItemStack(Material.DIRT)
        });

    public static final Recipe EARTH_CAKE = new Recipe(
        RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {
            new ItemStack(Material.SNOWBALL), new ItemStack(Material.POPPY), new ItemStack(Material.SNOWBALL),
            new ItemStack(Material.DIRT), new ItemStack(Material.DIRT), new ItemStack(Material.DIRT),
            new ItemStack(Material.DIRT), new ItemStack(Material.DIRT), new ItemStack(Material.DIRT)
        });
}
