// This is a generated file. Not intended for manual editing.
package daxa_glsl.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static daxa_glsl.language.psi.DaxaGlslTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import daxa_glsl.language.psi.*;

public class DaxaGlslPropertyImpl extends ASTWrapperPsiElement implements DaxaGlslProperty {

  public DaxaGlslPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DaxaGlslVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DaxaGlslVisitor) accept((DaxaGlslVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  public String getKey() {
    return DaxaGlslPsiImplUtil.getKey(this);
  }

  @Override
  public String getValue() {
    return DaxaGlslPsiImplUtil.getValue(this);
  }

}
