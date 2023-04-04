package daxa_glsl.language.psi.impl;

import com.intellij.lang.ASTNode;
import daxa_glsl.language.psi.DaxaGlslProperty;
import daxa_glsl.language.psi.DaxaGlslTypes;
public class DaxaGlslPsiImplUtil {
    public static String getKey(DaxaGlslProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(DaxaGlslTypes.KEY);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(DaxaGlslProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(DaxaGlslTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }
}
