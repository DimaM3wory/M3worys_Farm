package net.m3wory.m3worys_farm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.m3wory.m3worys_farm.M3worysFarm;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MAASDAM_CHEESE = registerItem("maasdam_cheese", new Item(new FabricItemSettings().food(ModFoodComponents.MAASDAM_CHEESE)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(M3worysFarm.MOD_ID, name), item);
    }

    public static void registerModItems(){
        M3worysFarm.LOGGER.info("Registering mod items for " + M3worysFarm.MOD_ID);
    }
}
