package com.skniro.agree.item;

import com.skniro.agree.Agree;
import com.skniro.agree.item.init.AgreeArmorMaterials;
import com.skniro.agree.item.init.AgreeToolMaterials;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class AgreeItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Agree.MOD_ID);
    //Tool
    public static final RegistryObject<Item> RUBY_SWORD = registerItem("ruby_sword",
            ()-> new SwordItem(AgreeToolMaterials.RUBY, new Item.Properties().attributes(SwordItem.createAttributes(AgreeToolMaterials.RUBY, 3, -2.4F))));
    public static final RegistryObject<Item> RUBY_SHOVEL = registerItem("ruby_shovel",
            ()-> new ShovelItem(AgreeToolMaterials.RUBY, new Item.Properties().attributes(ShovelItem.createAttributes(AgreeToolMaterials.RUBY, 2, -3.0F))));
    public static final RegistryObject<Item> RUBY_PICKAXE = registerItem("ruby_pickaxe",
            ()-> new PickaxeItem(AgreeToolMaterials.RUBY, new Item.Properties().attributes(PickaxeItem.createAttributes(AgreeToolMaterials.RUBY, 1, -2.8F))));
    public static final RegistryObject<Item> RUBY_AXE = registerItem("ruby_axe",
            ()-> new AxeItem(AgreeToolMaterials.RUBY, new Item.Properties().attributes(AxeItem.createAttributes(AgreeToolMaterials.RUBY, 5, -3.0F))));
    public static final RegistryObject<Item> RUBY_HOE = registerItem("ruby_hoe",
            ()-> new HoeItem(AgreeToolMaterials.RUBY, new Item.Properties().attributes(HoeItem.createAttributes(AgreeToolMaterials.RUBY, -3, 0.0F))));


    //Armor
    public static final RegistryObject<Item> RUBY_HELMET = registerItem("ruby_helmet",
            ()-> new ArmorItem(AgreeArmorMaterials.Ruby, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER))));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            ()-> new ArmorItem(AgreeArmorMaterials.Ruby, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER))));
    public static final RegistryObject<Item> RUBY_LEGGINGS = registerItem("ruby_leggings",
            ()-> new ArmorItem(AgreeArmorMaterials.Ruby, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER))));
    public static final RegistryObject<Item> RUBY_BOOTS = registerItem("ruby_boots",
            ()-> new ArmorItem(AgreeArmorMaterials.Ruby, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(AgreeArmorMaterials.Ruby_DURABILITY_MULTIPLIER))));

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        RegistryObject<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
