
package net.mcreator.clutteredmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.clutteredmod.entity.LuphiePastelChairEntityEntity;

public class LuphiePastelChairEntityRenderer extends MobRenderer<LuphiePastelChairEntityEntity, ChickenModel<LuphiePastelChairEntityEntity>> {
	public LuphiePastelChairEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(LuphiePastelChairEntityEntity entity) {
		return new ResourceLocation("luphieclutteredmod:textures/entities/transparenttext.png");
	}
}
