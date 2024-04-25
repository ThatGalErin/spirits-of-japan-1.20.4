package net.erin.soj;

import net.erin.soj.entity.ModEntities;
import net.erin.soj.entity.client.ChochinobakeModel;
import net.erin.soj.entity.client.ChochinobakeRenderer;
import net.erin.soj.entity.layer.ModModelLayers;
import net.erin.soj.screen.GemEmpoweringScreen;
import net.erin.soj.screen.ModScreenHandlers;
import net.erin.soj.screen.ShojiWorkbenchScreen;
import net.erin.soj.util.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.ModelIdentifier;
import net.erin.soj.block.entity.ModBlockEntities;

public class SpiritsOfJapanClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.CHOCHINOBAKE, ChochinobakeModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.CHOCHINOBAKE, ChochinobakeRenderer::new);
        ModModelPredicateProvider.registerModModels();
        HandledScreens.register(ModScreenHandlers.SHOJI_WORKBENCH_SCREEN_HANDLER, ShojiWorkbenchScreen::new);
        HandledScreens.register(ModScreenHandlers.GEM_EMPOWERING_SCREEN_HANDLER, GemEmpoweringScreen::new);
//        BlockEntityRendererFactories.register(ModBlockEntities.SHOJI_WORKBENCH_BLOCK_ENTITY, Shoji::new);
//        ModelLoadingRegistry.INSTANCE.registerModelProvider((manager, out) -> new ModelIdentifier(SpiritsOfJapan.MOD_ID, "longbow_3d", "inventory"));
    }
}
