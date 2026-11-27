package defpackage;

/* JADX INFO: renamed from: jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4745jn implements K71<AbstractC5713oP.e.a> {
    public static final C4745jn a = new C4745jn();
    public static final C6175qc0 b = C6175qc0.a("identifier");
    public static final C6175qc0 c = C6175qc0.a("version");
    public static final C6175qc0 d = C6175qc0.a("displayVersion");
    public static final C6175qc0 e = C6175qc0.a("organization");
    public static final C6175qc0 f = C6175qc0.a("installationUuid");
    public static final C6175qc0 g = C6175qc0.a("developmentPlatform");
    public static final C6175qc0 h = C6175qc0.a("developmentPlatformVersion");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP.e.a aVar = (AbstractC5713oP.e.a) obj;
        L71 l72 = l71;
        l72.a(b, aVar.d());
        l72.a(c, aVar.g());
        l72.a(d, aVar.c());
        l72.a(e, aVar.f());
        l72.a(f, aVar.e());
        l72.a(g, aVar.a());
        l72.a(h, aVar.b());
    }
}
