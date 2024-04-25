package net.erin.soj.entity.client;

import net.erin.soj.SpiritsOfJapan;
import net.erin.soj.entity.custom.ChochinobakeEntity;
import net.erin.soj.entity.layer.ModModelLayers;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class ChochinobakeRenderer extends MobEntityRenderer<ChochinobakeEntity, ChochinobakeModel<ChochinobakeEntity>> {
    public static final Identifier TEXTURE = new Identifier(SpiritsOfJapan.MOD_ID, "textures/entity/chochinobake_idle.png");
    public ChochinobakeRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ChochinobakeModel<>(ctx.getPart(ModModelLayers.CHOCHINOBAKE)), 0.6f);
    }

    @Override
    public Identifier getTexture(ChochinobakeEntity entity) {
        return TEXTURE;


    }
    @Override
    public void render(ChochinobakeEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

}
