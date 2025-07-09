package net.eclipse.kirbywithfeet.items;

import net.eclipse.kirbywithfeet.KirbyWithFeet;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TridentItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(KirbyWithFeet.MODID);

        //Steel ingot item, no extra properties.
        public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
                () -> new Item(new Item.Properties()));
        public static final DeferredItem<Item> SOUL = ITEMS.register("soul",
                () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final DeferredItem<SwordItem> STEEL_SCYTHE = ITEMS.register("steel_scythe",
            () -> new SwordItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.STEEL, 8, -2.9f))));

    public static final DeferredItem<Item> SOVEREIGN_TRIDENT = ITEMS.register("sovereigns_trident",
            () -> new TridentItem((new Item.Properties())
                    .rarity(Rarity.EPIC)
                    .durability(750)
                    .attributes(TridentItem.createAttributes())));

}