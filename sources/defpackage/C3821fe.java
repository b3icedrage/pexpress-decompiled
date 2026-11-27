package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3821fe extends C2432Xo {
    public final /* synthetic */ LayoutInflaterFactory2C3192ce d;

    public C3821fe(LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce) {
        this.d = layoutInflaterFactory2C3192ce;
    }

    @Override // defpackage.InterfaceC5765oe2
    public final void b() {
        LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = this.d;
        layoutInflaterFactory2C3192ce.z.setAlpha(1.0f);
        layoutInflaterFactory2C3192ce.C.d(null);
        layoutInflaterFactory2C3192ce.C = null;
    }

    @Override // defpackage.C2432Xo, defpackage.InterfaceC5765oe2
    public final void e() {
        LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = this.d;
        layoutInflaterFactory2C3192ce.z.setVisibility(0);
        if (layoutInflaterFactory2C3192ce.z.getParent() instanceof View) {
            View view = (View) layoutInflaterFactory2C3192ce.z.getParent();
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            Cd2.c.c(view);
        }
    }
}
