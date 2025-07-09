package net.eclipse.kirbywithfeet.datagen;

import net.eclipse.kirbywithfeet.KirbyWithFeet;
import net.eclipse.kirbywithfeet.items.ModItems;
import net.eclipse.kirbywithfeet.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, KirbyWithFeet.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS)
                .add(ModItems.STEEL_SCYTHE.get());
        tag(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(ModItems.STEEL_SCYTHE.get());
    }
}
