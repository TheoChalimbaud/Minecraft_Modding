package net.shadapin.shadventuremod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.shadapin.shadventuremod.ShadventureMod;

public class ModItemGroup {

    public static ItemGroup RAINBOW_SWORD;
    public static void registerItemGroups(){
        RAINBOW_SWORD = FabricItemGroup.builder(new Identifier(ShadventureMod.MOD_ID, "rainbow_sword"))
                .displayName(Text.literal("Shadventure Mod"))
                .icon(() -> new ItemStack(ModItems.RAINBOW_SWORD)).build();
    }
}
