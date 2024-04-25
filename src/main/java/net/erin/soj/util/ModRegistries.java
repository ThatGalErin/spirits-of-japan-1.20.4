package net.erin.soj.util;

import net.erin.soj.entity.ModEntities;
import net.erin.soj.entity.custom.ChochinobakeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModRegistries {

    public static void registerModStuffs() {
        registerAttributes();


    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.CHOCHINOBAKE, ChochinobakeEntity.createChochinobakeAttributes());
    }
}
