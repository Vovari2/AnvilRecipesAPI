package me.vovari2.anvilrecipes;

import org.bukkit.inventory.ItemStack;

public interface AnvilRecipesAPI {
    static AnvilRecipesAPI imp = new AnvilRecipesAPIImp();
    static AnvilRecipesAPI inst() {
        return imp;
    }
    void addRecipe(AnvilRecipe recipe);
    void removeRecipe(AnvilRecipe recipe);
    AnvilRecipe getRecipe(ItemStack firstItem, ItemStack secondItem);
    void clearRecipes();
}
