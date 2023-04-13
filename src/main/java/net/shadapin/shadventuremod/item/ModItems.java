package net.shadapin.shadventuremod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shadapin.shadventuremod.ShadventureMod;

public class ModItems {
    public static final Item RAINBOW_INGOT = registerItem("rainbow_ingot",
            new Item(new FabricItemSettings()));
    public static final Item RAINBOW_SWORD = registerItem("rainbow_sword",
            new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ShadventureMod.MOD_ID, name), item);
    }
    public static void addItemsToItemGroup(){

        addToItemGroup(ModItemGroup.RAINBOW_SWORD, RAINBOW_SWORD);
        addToItemGroup(ItemGroups.INGREDIENTS, RAINBOW_INGOT);
    }




    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems(){
        ShadventureMod.LOGGER.info("Registering Mod Items for "+ ShadventureMod.MOD_ID);

        addItemsToItemGroup();
    }
}
