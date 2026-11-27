package defpackage;

/* JADX INFO: renamed from: gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4067gn implements K71<AbstractC5713oP> {
    public static final C4067gn a = new C4067gn();
    public static final C6175qc0 b = C6175qc0.a("sdkVersion");
    public static final C6175qc0 c = C6175qc0.a("gmpAppId");
    public static final C6175qc0 d = C6175qc0.a("platform");
    public static final C6175qc0 e = C6175qc0.a("installationUuid");
    public static final C6175qc0 f = C6175qc0.a("buildVersion");
    public static final C6175qc0 g = C6175qc0.a("displayVersion");
    public static final C6175qc0 h = C6175qc0.a("session");
    public static final C6175qc0 i = C6175qc0.a("ndkPayload");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP abstractC5713oP = (AbstractC5713oP) obj;
        L71 l72 = l71;
        l72.a(b, abstractC5713oP.g());
        l72.a(c, abstractC5713oP.c());
        l72.e(d, abstractC5713oP.f());
        l72.a(e, abstractC5713oP.d());
        l72.a(f, abstractC5713oP.a());
        l72.a(g, abstractC5713oP.b());
        l72.a(h, abstractC5713oP.h());
        l72.a(i, abstractC5713oP.e());
    }
}
