package com.skniro.agree.item.init;



import java.util.function.Supplier;

import com.google.common.base.Suppliers;
import com.skniro.agree.item.Gemstone;
import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public enum AgreeToolMaterials implements ToolMaterial {
    RUBY(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3231, 12.0F, 3.0F, 22, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Gemstone.RUBY});
    });

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;


    private AgreeToolMaterials(final TagKey inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient) this.repairIngredient.get();
    }


}