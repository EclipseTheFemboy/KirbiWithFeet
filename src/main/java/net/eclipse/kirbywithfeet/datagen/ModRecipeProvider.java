package net.eclipse.kirbywithfeet.datagen;

import io.netty.handler.ssl.IdentityCipherSuiteFilter;
import net.eclipse.kirbywithfeet.block.ModBlocks;
import net.eclipse.kirbywithfeet.items.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.awt.*;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        java.util.List<ItemLike> STEEL_SMELTABLES = List.of(ModItems.STEEL_INGOT);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 1)
                .pattern("III")
                .pattern("ICI")
                .pattern("III")
                .define('I', Items.IRON_INGOT)
                .define('C', Items.COAL)
                .unlockedBy("has_steel", has(ModItems.STEEL_INGOT)).save(recipeOutput, "kwf:ironcoal_to_steel");

        oreSmelting(recipeOutput, STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 1f, 200, "steel");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOVEREIGN_TRIDENT.get(), 1)
                .pattern("SSS")
                .pattern("STS")
                .pattern("SFS")
                .define('T', Items.TRIDENT)
                .define('S', ModItems.SOUL)
                .define('F', Items.DANDELION)
                .unlockedBy("has_strident", has(ModItems.SOVEREIGN_TRIDENT)).save(recipeOutput, "kwf:sovtrident_craft");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_SCYTHE.get(), 1)
                .pattern("SSI")
                .pattern(" T ")
                .pattern("T  ")
                .define('T', Items.STICK)
                .define('S', ModItems.STEEL_INGOT)
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_strident", has(ModItems.STEEL_INGOT)).save(recipeOutput, "kwf:steelscythe_craft");

    }


}
