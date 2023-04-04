package daxa_glsl.language.property;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DaxaGlslFileType extends LanguageFileType {
    public static final DaxaGlslFileType INSTANCE = new DaxaGlslFileType();

    private DaxaGlslFileType() {
        super(DaxaGlslLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "Daxa Glsl Shader";
    }

    @Override
    @NotNull
    public String getDescription() {
        return "Daxa Glsl shader language";
    }

    @Override
    @NotNull
    public String getDefaultExtension() {
        return "glsl";
    }

    @Override
    @Nullable
    public Icon getIcon() {
        return DaxaGlslIcons.FILE;
    }
}
