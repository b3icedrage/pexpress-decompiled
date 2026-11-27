package defpackage;

/* JADX INFO: renamed from: aD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2676aD1 implements Zc2<ZC1> {
    public static final C2676aD1 d = new C2676aD1();

    @Override // defpackage.Zc2
    public final ZC1 d(AbstractC7580xH0 abstractC7580xH0, float f) {
        boolean z = abstractC7580xH0.g() == AbstractC7580xH0.b.d;
        if (z) {
            abstractC7580xH0.l1();
        }
        float fD0 = (float) abstractC7580xH0.d0();
        float fD1 = (float) abstractC7580xH0.d0();
        while (abstractC7580xH0.hasNext()) {
            abstractC7580xH0.I();
        }
        if (z) {
            abstractC7580xH0.h1();
        }
        return new ZC1((fD0 / 100.0f) * f, (fD1 / 100.0f) * f);
    }
}
