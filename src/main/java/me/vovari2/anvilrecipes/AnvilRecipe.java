package me.vovari2.anvilrecipes;

import org.bukkit.inventory.ItemStack;

public class AnvilRecipe {
    private ItemConverter converter;
    private ItemMatcher matcher;
    private int experience;

    public AnvilRecipe(ItemConverter converter, ItemMatcher matcher){
        this.converter = converter;
        this.matcher = matcher;
        this.experience = 0;
    }
    public AnvilRecipe(ItemConverter converter, ItemMatcher matcher, int experience){
        this.converter = converter;
        this.matcher = matcher;
        this.experience = experience;
    }

    public ItemStack convert(ItemStack firstItem, ItemStack secondItem){
        return converter.convert(firstItem, secondItem);
    }
    public void setConverter(ItemConverter converter){
        this.converter = converter;
    }

    public boolean match(ItemStack firstItem, ItemStack secondItem){
        return matcher.match(firstItem, secondItem);
    }
    public void setMatcher(ItemMatcher matcher){
        this.matcher = matcher;
    }

    public int experience(){
        return experience;
    }
    public void experience(int experience){
        this.experience = experience;
    }

}
