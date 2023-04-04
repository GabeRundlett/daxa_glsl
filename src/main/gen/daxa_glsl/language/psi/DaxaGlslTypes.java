// This is a generated file. Not intended for manual editing.
package daxa_glsl.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import daxa_glsl.language.psi.impl.*;

public interface DaxaGlslTypes {

  IElementType PROPERTY = new DaxaGlslElementType("PROPERTY");

  IElementType COMMENT = new DaxaGlslTokenType("COMMENT");
  IElementType CRLF = new DaxaGlslTokenType("CRLF");
  IElementType KEY = new DaxaGlslTokenType("KEY");
  IElementType SEPARATOR = new DaxaGlslTokenType("SEPARATOR");
  IElementType VALUE = new DaxaGlslTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new DaxaGlslPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
