package daxa_glsl.language;

import com.intellij.lexer.FlexAdapter;

public class DaxaGlslLexerAdapter extends FlexAdapter {
    public DaxaGlslLexerAdapter() {
        super(new DaxaGlslLexer(null));
    }
}
