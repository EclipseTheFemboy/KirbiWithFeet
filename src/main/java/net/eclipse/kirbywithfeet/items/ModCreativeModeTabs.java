package net.eclipse.kirbywithfeet.items;

import net.eclipse.kirbywithfeet.KirbyWithFeet;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KirbyWithFeet.MODID);

    public static final Supplier<CreativeModeTab> KIRBY_WITH_FEET_TAB = CREATIVE_MODE_TAB.register("k_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEEL_INGOT.get()))
                    .title(Component.translatable("creativetab.kwf.k_items"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.STEEL_INGOT);
                        output.accept(ModItems.SOUL);

                        output.accept(ModItems.STEEL_SCYTHE);
                        output.accept(ModItems.SOVEREIGN_TRIDENT);
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
