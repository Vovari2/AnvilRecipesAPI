package me.vovari2.anvilrecipes;

import org.bukkit.inventory.ItemStack;

public interface ItemConverter {
    ItemStack convert(ItemStack firstItem, ItemStack secondItem);
}
