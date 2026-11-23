
package com.capriaddon.registry;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "capriaddon");

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CAPRI_TAB =
            TABS.register("capriaddon", () -> CreativeModeTab.builder()
                    .title(Component.literal("CapriAddon"))
                    .icon(() -> new ItemStack(ModItems.CAPRI_CORE.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.BIO_PROCESSOR.get());
                        output.accept(ModItems.CAPRI_CORE.get());
                        output.accept(ModItems.CAPRI_FLASH_DRIVE.get());
                        output.accept(ModItems.CYBERDECK_COMPONENT.get());
                    })
                    .build());
}
