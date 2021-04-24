package com.angelt.money.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> FIVE_LEVA = Registration.ITEMS.register("five_leva", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> TEN_LEVA = Registration.ITEMS.register("ten_leva", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> TWENTY_LEVA = Registration.ITEMS.register("twenty_leva", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> FIFTY_LEVA = Registration.ITEMS.register("fifty_leva", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> HUNDRED_LEVA = Registration.ITEMS.register("hundred_leva", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    static void register() {}
}
