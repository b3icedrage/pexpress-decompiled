package defpackage;

/* JADX INFO: renamed from: Gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1071Gn implements K71<VZ0> {
    public static final C1071Gn a = new C1071Gn();
    public static final C6175qc0 b = new C6175qc0("projectNumber", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(1))));
    public static final C6175qc0 c = new C6175qc0("messageId", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(2))));
    public static final C6175qc0 d = new C6175qc0("instanceId", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(3))));
    public static final C6175qc0 e = new C6175qc0("messageType", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(4))));
    public static final C6175qc0 f = new C6175qc0("sdkPlatform", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(5))));
    public static final C6175qc0 g = new C6175qc0("packageName", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(6))));
    public static final C6175qc0 h = new C6175qc0("collapseKey", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(7))));
    public static final C6175qc0 i = new C6175qc0("priority", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(8))));
    public static final C6175qc0 j = new C6175qc0("ttl", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(9))));
    public static final C6175qc0 k = new C6175qc0("topic", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(10))));
    public static final C6175qc0 l = new C6175qc0("bulkId", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(11))));
    public static final C6175qc0 m = new C6175qc0("event", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(12))));
    public static final C6175qc0 n = new C6175qc0("analyticsLabel", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(13))));
    public static final C6175qc0 o = new C6175qc0("campaignId", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(14))));
    public static final C6175qc0 p = new C6175qc0("composerLabel", C0681Bn.d(C0603An.c(InterfaceC8098zk1.class, new C7886yk(15))));

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        VZ0 vz0 = (VZ0) obj;
        L71 l72 = l71;
        l72.f(b, vz0.a);
        l72.a(c, vz0.b);
        l72.a(d, vz0.c);
        l72.a(e, vz0.d);
        l72.a(f, VZ0.c.ANDROID);
        l72.a(g, vz0.e);
        l72.a(h, vz0.f);
        l72.e(i, 0);
        l72.e(j, vz0.g);
        l72.a(k, vz0.h);
        l72.f(l, 0L);
        l72.a(m, VZ0.a.MESSAGE_DELIVERED);
        l72.a(n, vz0.i);
        l72.f(o, 0L);
        l72.a(p, vz0.j);
    }
}
