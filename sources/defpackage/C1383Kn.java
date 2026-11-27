package defpackage;

/* JADX INFO: renamed from: Kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1383Kn implements K71<PQ1> {
    public static final C1383Kn a = new C1383Kn();
    public static final C6175qc0 b = new C6175qc0("currentCacheSizeBytes", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(1))));
    public static final C6175qc0 c = new C6175qc0("maxCacheSizeBytes", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(2))));

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        PQ1 pq1 = (PQ1) obj;
        L71 l72 = l71;
        l72.f(b, pq1.a);
        l72.f(c, pq1.b);
    }
}
