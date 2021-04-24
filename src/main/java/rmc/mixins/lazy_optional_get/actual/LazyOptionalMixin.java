package rmc.mixins.lazy_optional_get.actual;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import net.minecraftforge.common.util.LazyOptional;

/**
 * Developed by RMC Team, 2021
 */
@Mixin(value = LazyOptional.class)
public abstract class LazyOptionalMixin {

    @Shadow private Object getValue() { return null; }

    @Overwrite(remap = false)
    private Object getValueUnsafe() {
        return this.getValue();
    }

}