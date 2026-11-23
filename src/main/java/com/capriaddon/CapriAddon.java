
package com.capriaddon;

import com.capriaddon.registry.ModItems;
import com.capriaddon.registry.ModCreativeTabs;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;

@Mod("capriaddon")
public class CapriAddon {

    public CapriAddon(IEventBus modEventBus) {
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.TABS.register(modEventBus);

        System.out.println("CapriAddon loaded!");
    }
}
