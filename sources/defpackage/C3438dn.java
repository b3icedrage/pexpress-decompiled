package defpackage;

/* JADX INFO: renamed from: dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3438dn implements K71<AbstractC5713oP.a.AbstractC0456a> {
    public static final C3438dn a = new C3438dn();
    public static final C6175qc0 b = C6175qc0.a("arch");
    public static final C6175qc0 c = C6175qc0.a("libraryName");
    public static final C6175qc0 d = C6175qc0.a("buildId");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP.a.AbstractC0456a abstractC0456a = (AbstractC5713oP.a.AbstractC0456a) obj;
        L71 l72 = l71;
        l72.a(b, abstractC0456a.a());
        l72.a(c, abstractC0456a.c());
        l72.a(d, abstractC0456a.b());
    }
}
