package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.a;

/* JADX INFO: renamed from: k50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4806k50 extends a {
    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f, @NonNull Drawable drawable) {
        float fCos;
        float fCos2;
        RectF rectFA = a.a(tabLayout, view);
        RectF rectFA2 = a.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            double d = (((double) f) * 3.141592653589793d) / 2.0d;
            fCos2 = (float) (1.0d - Math.cos(d));
            fCos = (float) Math.sin(d);
        } else {
            double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
            float fSin = (float) Math.sin(d2);
            fCos = (float) (1.0d - Math.cos(d2));
            fCos2 = fSin;
        }
        drawable.setBounds(C7013uc.c(fCos2, (int) rectFA.left, (int) rectFA2.left), drawable.getBounds().top, C7013uc.c(fCos, (int) rectFA.right, (int) rectFA2.right), drawable.getBounds().bottom);
    }
}
