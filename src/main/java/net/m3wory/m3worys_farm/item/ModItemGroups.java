package net.m3wory.m3worys_farm.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.m3wory.m3worys_farm.M3worysFarm;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CHEESE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(M3worysFarm.MOD_ID, "cheese"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cheese"))
                    .icon(() -> new ItemStack(ModItems.MAASDAM_CHEESE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MAASDAM_CHEESE);
                        entries.add(ModItems.CHEDDAR_CHEESE);
                        entries.add(ModItems.GOUDA_CHEESE);
                        entries.add(ModItems.CAMEMBERT_CHEESE);
                        entries.add(ModItems.MANCHEGO_CHEESE);
                        entries.add(ModItems.MOZZARELLA_CHEESE);
                    }).build());

    public static void registerItemGroups(){
        M3worysFarm.LOGGER.info("Registering mod item groups for " + M3worysFarm.MOD_ID);
    }
}
