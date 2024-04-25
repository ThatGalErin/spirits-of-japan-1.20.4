package net.erin.soj.item;

import net.erin.soj.SpiritsOfJapan;
import net.erin.soj.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SOJ_GROUP = Registry.register(Registries.ITEM_GROUP,
                new Identifier(SpiritsOfJapan.MOD_ID, "chochinobake"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.SOJ" ))
                    .icon(() -> new ItemStack(ModItems.CHOCHINOBAKE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CHOCHINOBAKE);
                        entries.add(ModBlocks.SHOJI);
                        entries.add(ModItems.LONGBOW);
                        entries.add(ModBlocks.SHOJI_WORKBENCH);
                    }).build());

    public static void registerModGroups() {
        SpiritsOfJapan.LOGGER.info("Registering item Groups for " + SpiritsOfJapan.MOD_ID);
    }
}
