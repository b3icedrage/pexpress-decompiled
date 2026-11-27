package defpackage;

/* JADX INFO: renamed from: un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7057un implements K71<AbstractC5713oP.e.d.c> {
    public static final C7057un a = new C7057un();
    public static final C6175qc0 b = C6175qc0.a("batteryLevel");
    public static final C6175qc0 c = C6175qc0.a("batteryVelocity");
    public static final C6175qc0 d = C6175qc0.a("proximityOn");
    public static final C6175qc0 e = C6175qc0.a("orientation");
    public static final C6175qc0 f = C6175qc0.a("ramUsed");
    public static final C6175qc0 g = C6175qc0.a("diskUsed");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP.e.d.c cVar = (AbstractC5713oP.e.d.c) obj;
        L71 l72 = l71;
        l72.a(b, cVar.a());
        l72.e(c, cVar.b());
        l72.d(d, cVar.f());
        l72.e(e, cVar.d());
        l72.f(f, cVar.e());
        l72.f(g, cVar.c());
    }
}
