package com.skniro.agree.datagen;

import com.skniro.agree.item.AgreeItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.registry.tag.ItemTags.*;


public class AgreeItemTagGeneration extends FabricTagProvider<Item> {
    public AgreeItemTagGeneration(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataGenerator, RegistryKeys.ITEM, completableFuture);
    }

    public static class ModItemTags {
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(AgreeItems.RUBY_HELMET, AgreeItems.RUBY_CHESTPLATE, AgreeItems.RUBY_LEGGINGS, AgreeItems.RUBY_BOOTS);
        getOrCreateTagBuilder(FOOT_ARMOR)
                .add(AgreeItems.RUBY_BOOTS);
        getOrCreateTagBuilder(LEG_ARMOR)
                .add(AgreeItems.RUBY_LEGGINGS);
        getOrCreateTagBuilder(CHEST_ARMOR)
                .add(AgreeItems.RUBY_CHESTPLATE);
        getOrCreateTagBuilder(HEAD_ARMOR)
                .add(AgreeItems.RUBY_HELMET);
        getOrCreateTagBuilder(SWORDS)
                .add(AgreeItems.RUBY_SWORD);
        getOrCreateTagBuilder(AXES)
                .add(AgreeItems.RUBY_AXE);
        getOrCreateTagBuilder(HOES)
                .add(AgreeItems.RUBY_HOE);
        getOrCreateTagBuilder(PICKAXES)
                .add(AgreeItems.RUBY_PICKAXE);
        getOrCreateTagBuilder(SHOVELS)
                .add(AgreeItems.RUBY_SHOVEL);
    }


}
