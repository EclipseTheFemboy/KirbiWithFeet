package net.eclipse.kirbywithfeet.datagen;

import net.eclipse.kirbywithfeet.KirbyWithFeet;
import net.eclipse.kirbywithfeet.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, KirbyWithFeet.MODID, existingFileHelper);
        registerModels();
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.STEEL_INGOT.get());
        basicItem(ModItems.SOUL.get());

    }

    @Override
    public ItemModelBuilder handheldItem(Item item) {
        return super.handheldItem(item);
    }

}