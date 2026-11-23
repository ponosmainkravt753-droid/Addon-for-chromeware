package com.capriaddon;

import com.capriaddon.registry.ModItems;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("capriaddon")
public class CapriAddon {

    public CapriAddon(IEventBus modEventBus) {
        ModItems.ITEMS.register(modEventBus);
        System.out.println("CapriAddon loaded!");
    }
}
