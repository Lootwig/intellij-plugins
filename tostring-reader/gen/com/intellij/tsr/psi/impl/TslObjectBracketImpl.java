// This is a generated file. Not intended for manual editing.
package com.intellij.tsr.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.tsr.psi.TslTokenTypes.*;
import com.intellij.tsr.psi.*;

public class TslObjectBracketImpl extends TslObjectImpl implements TslObjectBracket {

  public TslObjectBracketImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull TslVisitor visitor) {
    visitor.visitObjectBracket(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TslVisitor) accept((TslVisitor)visitor);
    else super.accept(visitor);
  }

}
