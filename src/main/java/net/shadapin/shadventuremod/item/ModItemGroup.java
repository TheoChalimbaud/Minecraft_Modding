package net.shadapin.shadventuremod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.shadapin.shadventuremod.ShadventureMod;

public class ModItemGroup {

    public static ItemGroup SHADGROUP;
    public static void registerItemGroups(){
        SHADGROUP = FabricItemGroup.builder(new Identifier(ShadventureMod.MOD_ID, "rainbow_sword"))
                .displayName(Text.translatable("itemgroup.rainbow_sword"))
                .icon(() -> new ItemStack(ModItems.RAINBOW_SWORD)).build();
    }
}