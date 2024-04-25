package net.erin.soj.block;

import net.erin.soj.SpiritsOfJapan;
import net.erin.soj.block.custom.GemEmpoweringStationBlock;
import net.erin.soj.block.custom.ShojiWorkbenchBlock;
import net.erin.soj.block.entity.TestBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StonecutterBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.WHITE_WOOL;

public class ModBlocks {
    public static final Block SHOJI = registerBlock("shoji",
            new ModStainedGlassPane(WHITE_WOOL, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SHOJI_WORKBENCH = registerBlock("shoji_workbench",
            new ShojiWorkbenchBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GEM_EMPOWERING_STATION = registerBlock("gem_empowering_station",
            new GemEmpoweringStationBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block TEST_BLOCK = registerBlock("test_block",
            new TestBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SpiritsOfJapan.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SpiritsOfJapan.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        SpiritsOfJapan.LOGGER.info("Registering ModBlocks for " + SpiritsOfJapan.MOD_ID);
    }
}
