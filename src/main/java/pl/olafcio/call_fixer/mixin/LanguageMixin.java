package pl.olafcio.call_fixer.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import net.minecraft.util.Language;
import org.spongepowered.asm.mixin.Mixin;

import java.util.Properties;

@Mixin(Language.class)
public class LanguageMixin {
    @WrapMethod(method = "method_633")
    public void loadLanguage(Properties properties, String id, Operation<Void> original) {
        original.call(properties, id.substring(0, 2).toLowerCase() + "_" + id.substring(3, 5).toUpperCase());
    }
}
