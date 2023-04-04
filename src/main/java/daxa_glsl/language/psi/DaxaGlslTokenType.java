package daxa_glsl.language.psi;

import com.intellij.psi.tree.IElementType;
import daxa_glsl.language.property.DaxaGlslLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DaxaGlslTokenType extends IElementType {
    public DaxaGlslTokenType(@NotNull @NonNls String debugName) {
        super(debugName, DaxaGlslLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "DaxaGlslTokenType." + super.toString();
    }
}
