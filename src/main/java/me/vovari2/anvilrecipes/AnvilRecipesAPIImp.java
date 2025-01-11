package me.vovari2.anvilrecipes;

import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.LinkedList;
import java.util.List;

class AnvilRecipesAPIImp implements AnvilRecipesAPI{
    private static List<AnvilRecipe> recipes;
    AnvilRecipesAPIImp(){
        recipes = new LinkedList<>();
    }
    public void addRecipe(AnvilRecipe recipe){
        recipes.add(recipe);
    }
    public void removeRecipe(AnvilRecipe recipe){
        recipes.remove(recipe);
    }
    @Nullable
    public AnvilRecipe getRecipe(ItemStack firstItem, ItemStack secondItem){
        for (AnvilRecipe recipe : recipes)
            if (recipe.match(firstItem, secondItem))
                return recipe;
        return null;
    }
    public void clearRecipes() {
        recipes.clear();
    }
}
