package daxa_glsl.language.property;

import com.intellij.lang.Language;

public class DaxaGlslLanguage extends Language {
    public static final DaxaGlslLanguage INSTANCE = new DaxaGlslLanguage();

    private DaxaGlslLanguage() {
        super("DaxaGlsl");
    }
}
