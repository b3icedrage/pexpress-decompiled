package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.a;

/* JADX INFO: renamed from: tb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6800tb0 extends a {
    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f, @NonNull Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectFA = a.a(tabLayout, view);
        float fB = f < 0.5f ? C7013uc.b(1.0f, 0.0f, 0.0f, 0.5f, f) : C7013uc.b(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fB * 255.0f));
    }
}
