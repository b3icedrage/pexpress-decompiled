package defpackage;

/* JADX INFO: renamed from: xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7688xn implements K71<AbstractC5713oP.e.AbstractC0465e> {
    public static final C7688xn a = new C7688xn();
    public static final C6175qc0 b = C6175qc0.a("platform");
    public static final C6175qc0 c = C6175qc0.a("version");
    public static final C6175qc0 d = C6175qc0.a("buildVersion");
    public static final C6175qc0 e = C6175qc0.a("jailbroken");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP.e.AbstractC0465e abstractC0465e = (AbstractC5713oP.e.AbstractC0465e) obj;
        L71 l72 = l71;
        l72.e(b, abstractC0465e.b());
        l72.a(c, abstractC0465e.c());
        l72.a(d, abstractC0465e.a());
        l72.d(e, abstractC0465e.d());
    }
}
