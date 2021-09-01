package click.frenz.mobgrief.mixin;

import click.frenz.mobgrief.MobGrief;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.world.explosion.Explosion.DestructionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(CreeperEntity.class)
public class CreeperGriefMixin {
    @ModifyVariable(at = @At("STORE"), method = "explode()V", name = "destructionType", ordinal = 0)
    private DestructionType onExplode(DestructionType destructionType) {
        return MobGrief.CONFIG.creeper_block_damage ? DestructionType.NONE : destructionType;
    }
}
