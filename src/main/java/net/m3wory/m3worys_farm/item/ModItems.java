package net.m3wory.m3worys_farm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.m3wory.m3worys_farm.M3worysFarm;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CAMEMBERT_CHEESE = registerItem("camembert_cheese", new Item(new FabricItemSettings().food(ModFoodComponents.CAMEMBERT_CHEESE)));
    public static final Item CHEDDAR_CHEESE = registerItem("cheddar_cheese", new Item(new FabricItemSettings().food(ModFoodComponents.CHEDDAR_CHEESE)));
    public static final Item GOUDA_CHEESE = registerItem("gouda_cheese", new Item(new FabricItemSettings().food(ModFoodComponents.GOUDA_CHEESE)));
    public static final Item MAASDAM_CHEESE = registerItem("maasdam_cheese", new Item(new FabricItemSettings().food(ModFoodComponents.MAASDAM_CHEESE)));
    public static final Item MANCHEGO_CHEESE = registerItem("manchego_cheese", new Item(new FabricItemSettings().food(ModFoodComponents.MANCHEGO_CHEESE)));
    public static final Item MOZZARELLA_CHEESE = registerItem("mozzarella_cheese", new Item(new FabricItemSettings().food(ModFoodComponents.MOZZARELLA_CHEESE)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(M3worysFarm.MOD_ID, name), item);
    }

    public static void registerModItems(){
        M3worysFarm.LOGGER.info("Registering mod items for " + M3worysFarm.MOD_ID);
    }
}
