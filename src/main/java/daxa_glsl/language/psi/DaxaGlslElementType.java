package daxa_glsl.language.psi;

import com.intellij.psi.tree.IElementType;
import daxa_glsl.language.property.DaxaGlslLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

// This is the internal node
public class DaxaGlslElementType extends IElementType {

    public DaxaGlslElementType(@NonNls @NotNull String debugName) {
        super(debugName, DaxaGlslLanguage.INSTANCE);
    }
}
