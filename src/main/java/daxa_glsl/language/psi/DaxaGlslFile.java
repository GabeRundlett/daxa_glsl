package daxa_glsl.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import daxa_glsl.language.property.DaxaGlslFileType;
import daxa_glsl.language.property.DaxaGlslLanguage;
import org.jetbrains.annotations.NotNull;

public class DaxaGlslFile extends PsiFileBase {
    public DaxaGlslFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, DaxaGlslLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return DaxaGlslFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Daxa Glsl File";
    }
}
