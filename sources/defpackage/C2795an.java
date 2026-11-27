package defpackage;

/* JADX INFO: renamed from: an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2795an implements K71<AbstractC5933pS0> {
    public static final C2795an a = new C2795an();
    public static final C6175qc0 b = C6175qc0.a("requestTimeMs");
    public static final C6175qc0 c = C6175qc0.a("requestUptimeMs");
    public static final C6175qc0 d = C6175qc0.a("clientInfo");
    public static final C6175qc0 e = C6175qc0.a("logSource");
    public static final C6175qc0 f = C6175qc0.a("logSourceName");
    public static final C6175qc0 g = C6175qc0.a("logEvent");
    public static final C6175qc0 h = C6175qc0.a("qosTier");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5933pS0 abstractC5933pS0 = (AbstractC5933pS0) obj;
        L71 l72 = l71;
        l72.f(b, abstractC5933pS0.f());
        l72.f(c, abstractC5933pS0.g());
        l72.a(d, abstractC5933pS0.a());
        l72.a(e, abstractC5933pS0.c());
        l72.a(f, abstractC5933pS0.d());
        l72.a(g, abstractC5933pS0.b());
        l72.a(h, abstractC5933pS0.e());
    }
}
