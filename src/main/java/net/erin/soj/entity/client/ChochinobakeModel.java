package net.erin.soj.entity.client;

import net.erin.soj.entity.ModEntities;
import net.erin.soj.entity.animations.ModAnimations;
import net.erin.soj.entity.custom.ChochinobakeEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ChochinobakeModel<T extends ChochinobakeEntity> extends SinglePartEntityModel<T> {
    private final ModelPart chochinobake;

    public ChochinobakeModel(ModelPart root) {
        this.chochinobake = root.getChild("chochinobake");

    }

    public static TexturedModelData getTexturedModelData() {
            ModelData modelData = new ModelData();
            ModelPartData modelPartData = modelData.getRoot();
            ModelPartData chochinobake = modelPartData.addChild("chochinobake", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 4.25F, 2.5F));

            ModelPartData body = chochinobake.addChild("body", ModelPartBuilder.create(), ModelTransform.of(0.0F, 1.8907F, 0.1579F, 0.0F, 1.5708F, 0.0F));

            ModelPartData bottom0 = body.addChild("bottom0", ModelPartBuilder.create().uv(24, 0).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 15.0F, 0.0F));

            ModelPartData bottom1 = body.addChild("bottom1", ModelPartBuilder.create().uv(18, 21).cuboid(-3.0F, -1.0F, -3.0F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 14.0F, 0.0F));

            ModelPartData lantern_body = body.addChild("lantern_body", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -12.0F, -4.0F, 8.0F, 12.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 13.0F, 0.0F));

            ModelPartData top0 = body.addChild("top0", ModelPartBuilder.create().uv(0, 20).cuboid(-3.0F, -1.0F, -3.0F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.0F, 0.0F));

            ModelPartData top1 = body.addChild("top1", ModelPartBuilder.create().uv(0, 27).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

            ModelPartData tongue0 = body.addChild("tongue0", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, 8.5F, 0.0F));

            ModelPartData tongue1 = body.addChild("tongue1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(6.0F, 8.75F, -1.0F));

            ModelPartData tongue2 = body.addChild("tongue2", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, 9.0F, -2.0F));
            return TexturedModelData.of(modelData, 64, 64);
        }

    @Override
    public void setAngles(ChochinobakeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
//        this.setHeadAngles(entity, netHeadYaw, headPitch, ageInTicks);
        this.animateMovement(ModAnimations.CHOCHINOBAKE_IDLE, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, ModAnimations.CHOCHINOBAKE_IDLE, ageInTicks, 1f);
    }

//    private void setHeadAngles(ChochinobakeEntity entity, float headYaw, float headPitch, float animationProgress) {
//        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
//        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);
//
//        this.head.yaw = headYaw * 0.017453292F;
//        this.head.pitch = headPitch * 0.017453292F;
//    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        chochinobake.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return chochinobake;
    }

}
