package net.erin.soj.block.entity;

import net.erin.soj.SpiritsOfJapan;
import net.erin.soj.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<ShojiWorkbenchEntity> SHOJI_WORKBENCH_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(SpiritsOfJapan.MOD_ID, "shoji_workbench_be"),
                    FabricBlockEntityTypeBuilder.create(ShojiWorkbenchEntity::new,
                            ModBlocks.SHOJI_WORKBENCH).build());
    public static final BlockEntityType<GemEmpoweringStationBlockEntity> GEM_EMPOWERING_STATION_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(SpiritsOfJapan.MOD_ID, "gem_empowering_block_entity"),
                    FabricBlockEntityTypeBuilder.create(GemEmpoweringStationBlockEntity::new,
                            ModBlocks.GEM_EMPOWERING_STATION).build(null));

    public static void registerBlockEntities() {
        SpiritsOfJapan.LOGGER.info("Registering Block Entities for " + SpiritsOfJapan.MOD_ID);
    }
}