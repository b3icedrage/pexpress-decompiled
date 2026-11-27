package defpackage;

import android.graphics.Color;

/* JADX INFO: renamed from: fF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3742fF implements Zc2<Integer> {
    public static final C3742fF d = new C3742fF();

    @Override // defpackage.Zc2
    public final Integer d(AbstractC7580xH0 abstractC7580xH0, float f) {
        boolean z = abstractC7580xH0.g() == AbstractC7580xH0.b.d;
        if (z) {
            abstractC7580xH0.l1();
        }
        double dD0 = abstractC7580xH0.d0();
        double dD1 = abstractC7580xH0.d0();
        double dD2 = abstractC7580xH0.d0();
        double dD3 = abstractC7580xH0.g() == AbstractC7580xH0.b.k ? abstractC7580xH0.d0() : 1.0d;
        if (z) {
            abstractC7580xH0.h1();
        }
        if (dD0 <= 1.0d && dD1 <= 1.0d && dD2 <= 1.0d) {
            dD0 *= 255.0d;
            dD1 *= 255.0d;
            dD2 *= 255.0d;
            if (dD3 <= 1.0d) {
                dD3 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dD3, (int) dD0, (int) dD1, (int) dD2));
    }
}
