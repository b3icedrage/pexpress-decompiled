package defpackage;

/* JADX INFO: renamed from: en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3647en implements K71<AbstractC5713oP.a> {
    public static final C3647en a = new C3647en();
    public static final C6175qc0 b = C6175qc0.a("pid");
    public static final C6175qc0 c = C6175qc0.a("processName");
    public static final C6175qc0 d = C6175qc0.a("reasonCode");
    public static final C6175qc0 e = C6175qc0.a("importance");
    public static final C6175qc0 f = C6175qc0.a("pss");
    public static final C6175qc0 g = C6175qc0.a("rss");
    public static final C6175qc0 h = C6175qc0.a("timestamp");
    public static final C6175qc0 i = C6175qc0.a("traceFile");
    public static final C6175qc0 j = C6175qc0.a("buildIdMappingForArch");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP.a aVar = (AbstractC5713oP.a) obj;
        L71 l72 = l71;
        l72.e(b, aVar.c());
        l72.a(c, aVar.d());
        l72.e(d, aVar.f());
        l72.e(e, aVar.b());
        l72.f(f, aVar.e());
        l72.f(g, aVar.g());
        l72.f(h, aVar.h());
        l72.a(i, aVar.i());
        l72.a(j, aVar.a());
    }
}
