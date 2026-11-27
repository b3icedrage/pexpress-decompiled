package defpackage;

/* JADX INFO: renamed from: bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3019bn implements K71<AbstractC5432n31> {
    public static final C3019bn a = new C3019bn();
    public static final C6175qc0 b = C6175qc0.a("networkType");
    public static final C6175qc0 c = C6175qc0.a("mobileSubtype");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5432n31 abstractC5432n31 = (AbstractC5432n31) obj;
        L71 l72 = l71;
        l72.a(b, abstractC5432n31.b());
        l72.a(c, abstractC5432n31.a());
    }
}
