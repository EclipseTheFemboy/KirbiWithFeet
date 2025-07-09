package net.eclipse.kirbywithfeet.items;

import net.eclipse.kirbywithfeet.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier STEEL = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL,
          1067, 4f, 3f, 27, () -> Ingredient.of(ModItems.STEEL_INGOT));

    public static final Tier SOUL = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SOUL_TOOL,
            750, 4f, 4f, 30, () -> Ingredient.of(ModItems.SOUL));

}
