package defpackage;

/* JADX INFO: renamed from: pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6008pn implements K71<AbstractC5713oP.e.d.a.b> {
    public static final C6008pn a = new C6008pn();
    public static final C6175qc0 b = C6175qc0.a("threads");
    public static final C6175qc0 c = C6175qc0.a("exception");
    public static final C6175qc0 d = C6175qc0.a("appExitInfo");
    public static final C6175qc0 e = C6175qc0.a("signal");
    public static final C6175qc0 f = C6175qc0.a("binaries");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP.e.d.a.b bVar = (AbstractC5713oP.e.d.a.b) obj;
        L71 l72 = l71;
        l72.a(b, bVar.e());
        l72.a(c, bVar.c());
        l72.a(d, bVar.a());
        l72.a(e, bVar.d());
        l72.a(f, bVar.b());
    }
}
