package daxa_glsl.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import daxa_glsl.language.parser.DaxaGlslParser;
import daxa_glsl.language.property.DaxaGlslLanguage;
import daxa_glsl.language.psi.DaxaGlslFile;
import daxa_glsl.language.psi.DaxaGlslTypes;
import org.jetbrains.annotations.NotNull;

public class DaxaGlslParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(DaxaGlslTypes.COMMENT);
    public static final IFileElementType FILE = new IFileElementType(DaxaGlslLanguage.INSTANCE);

    // Lexer ----------------------------------------------------
    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new DaxaGlslLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    // Parser ----------------------------------------------------
    @Override
    public @NotNull PsiParser createParser(Project project) {
        return new DaxaGlslParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return DaxaGlslTypes.Factory.createElement(node);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new DaxaGlslFile(viewProvider);
    }

    @Override
    public @NotNull SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
