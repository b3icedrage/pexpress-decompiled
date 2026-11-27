package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3611ee implements Runnable {
    public final /* synthetic */ LayoutInflaterFactory2C3192ce d;

    /* JADX INFO: renamed from: ee$a */
    public class a extends C2432Xo {
        public a() {
        }

        @Override // defpackage.InterfaceC5765oe2
        public final void b() {
            LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = RunnableC3611ee.this.d;
            layoutInflaterFactory2C3192ce.z.setAlpha(1.0f);
            layoutInflaterFactory2C3192ce.C.d(null);
            layoutInflaterFactory2C3192ce.C = null;
        }

        @Override // defpackage.C2432Xo, defpackage.InterfaceC5765oe2
        public final void e() {
            RunnableC3611ee.this.d.z.setVisibility(0);
        }
    }

    public RunnableC3611ee(LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce) {
        this.d = layoutInflaterFactory2C3192ce;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ViewGroup viewGroup;
        LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce = this.d;
        layoutInflaterFactory2C3192ce.A.showAtLocation(layoutInflaterFactory2C3192ce.z, 55, 0, 0);
        C5345me2 c5345me2 = layoutInflaterFactory2C3192ce.C;
        if (c5345me2 != null) {
            c5345me2.b();
        }
        if (!layoutInflaterFactory2C3192ce.E || (viewGroup = layoutInflaterFactory2C3192ce.F) == null) {
            z = false;
        } else {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if (viewGroup.isLaidOut()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            layoutInflaterFactory2C3192ce.z.setAlpha(1.0f);
            layoutInflaterFactory2C3192ce.z.setVisibility(0);
            return;
        }
        layoutInflaterFactory2C3192ce.z.setAlpha(0.0f);
        C5345me2 c5345me2A = Cd2.a(layoutInflaterFactory2C3192ce.z);
        c5345me2A.a(1.0f);
        layoutInflaterFactory2C3192ce.C = c5345me2A;
        c5345me2A.d(new a());
    }
}
