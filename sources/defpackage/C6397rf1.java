package defpackage;

import android.graphics.PointF;

/* JADX INFO: renamed from: rf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6397rf1 implements Zc2<PointF> {
    public static final C6397rf1 d = new C6397rf1();

    @Override // defpackage.Zc2
    public final PointF d(AbstractC7580xH0 abstractC7580xH0, float f) {
        AbstractC7580xH0.b bVarG = abstractC7580xH0.g();
        if (bVarG == AbstractC7580xH0.b.d) {
            return VH0.b(abstractC7580xH0, f);
        }
        if (bVarG == AbstractC7580xH0.b.g) {
            return VH0.b(abstractC7580xH0, f);
        }
        if (bVarG != AbstractC7580xH0.b.k) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarG);
        }
        PointF pointF = new PointF(((float) abstractC7580xH0.d0()) * f, ((float) abstractC7580xH0.d0()) * f);
        while (abstractC7580xH0.hasNext()) {
            abstractC7580xH0.I();
        }
        return pointF;
    }
}
