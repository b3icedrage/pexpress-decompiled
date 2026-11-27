package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import defpackage.C7013uc;
import defpackage.Fe2;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.H || !(view instanceof TabLayout.h)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        TabLayout.h hVar = (TabLayout.h) view;
        int contentWidth = hVar.getContentWidth();
        int contentHeight = hVar.getContentHeight();
        int iB = (int) Fe2.b(hVar.getContext(), 24);
        if (contentWidth < iB) {
            contentWidth = iB;
        }
        int right = (hVar.getRight() + hVar.getLeft()) / 2;
        int bottom = (hVar.getBottom() + hVar.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public void b(TabLayout tabLayout, View view, View view2, float f, @NonNull Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(C7013uc.c(f, (int) rectFA.left, (int) rectFA2.left), drawable.getBounds().top, C7013uc.c(f, (int) rectFA.right, (int) rectFA2.right), drawable.getBounds().bottom);
    }
}
