package net.m3wory.m3worys_farm.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.m3wory.m3worys_farm.M3worysFarm;
import net.m3wory.m3worys_farm.block.custom.CheeseWheelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MAASDAM_CHEESE_WHEEL = registerBlock("maasdam_cheese_wheel",
            new CheeseWheelBlock(FabricBlockSettings.copyOf(Blocks.CAKE).nonOpaque()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(M3worysFarm.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(M3worysFarm.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        M3worysFarm.LOGGER.info("Registering mod blocks for " + M3worysFarm.MOD_ID);
    }
}
