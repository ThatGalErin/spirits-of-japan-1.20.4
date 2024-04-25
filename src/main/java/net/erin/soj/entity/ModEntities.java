package net.erin.soj.entity;

import net.erin.soj.SpiritsOfJapan;
import net.erin.soj.entity.custom.ChochinobakeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<ChochinobakeEntity> CHOCHINOBAKE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(SpiritsOfJapan.MOD_ID, "chochinobake"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ChochinobakeEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 1.5f)).build());

    public static void registerModEntities() {

        SpiritsOfJapan.LOGGER.info("Registering Mod Entities for " + SpiritsOfJapan.MOD_ID);

    }
}
