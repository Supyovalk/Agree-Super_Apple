package com.skniro.agree.recipe;

import com.skniro.agree.Agree;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class AgreeRecipeSerializer{
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER = DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, Agree.MOD_ID);

    public static final Supplier<RecipeSerializer<SuspiciousAppleRecipe>> SUSPICIOUS_APPLE =
            RECIPE_SERIALIZER.register("crafting_special_suspiciousapple",
                    ()-> new SimpleCraftingRecipeSerializer<>(SuspiciousAppleRecipe::new));

    public static void agreerecipeseroalizer(IEventBus eventBus) {
        RECIPE_SERIALIZER.register(eventBus);
    }
}
