package defpackage;

/* JADX INFO: renamed from: ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5165ln implements K71<AbstractC5713oP.e.c> {
    public static final C5165ln a = new C5165ln();
    public static final C6175qc0 b = C6175qc0.a("arch");
    public static final C6175qc0 c = C6175qc0.a("model");
    public static final C6175qc0 d = C6175qc0.a("cores");
    public static final C6175qc0 e = C6175qc0.a("ram");
    public static final C6175qc0 f = C6175qc0.a("diskSpace");
    public static final C6175qc0 g = C6175qc0.a("simulator");
    public static final C6175qc0 h = C6175qc0.a("state");
    public static final C6175qc0 i = C6175qc0.a("manufacturer");
    public static final C6175qc0 j = C6175qc0.a("modelClass");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP.e.c cVar = (AbstractC5713oP.e.c) obj;
        L71 l72 = l71;
        l72.e(b, cVar.a());
        l72.a(c, cVar.e());
        l72.e(d, cVar.b());
        l72.f(e, cVar.g());
        l72.f(f, cVar.c());
        l72.d(g, cVar.i());
        l72.e(h, cVar.h());
        l72.a(i, cVar.d());
        l72.a(j, cVar.f());
    }
}
