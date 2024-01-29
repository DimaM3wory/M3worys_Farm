package net.m3wory.m3worys_farm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;


public class ModFoodComponents {
    public static final FoodComponent MAASDAM_CHEESE = new FoodComponent.Builder().hunger(6).saturationModifier(0.3f)
            .snack().build();
}
