package me.vovari2.anvilrecipes;

import org.bukkit.inventory.ItemStack;

public interface ItemMatcher {
    boolean match(ItemStack firstItem, ItemStack secondItem);
}
