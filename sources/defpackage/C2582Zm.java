package defpackage;

/* JADX INFO: renamed from: Zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2582Zm implements K71<AbstractC4880kS0> {
    public static final C2582Zm a = new C2582Zm();
    public static final C6175qc0 b = C6175qc0.a("eventTimeMs");
    public static final C6175qc0 c = C6175qc0.a("eventCode");
    public static final C6175qc0 d = C6175qc0.a("eventUptimeMs");
    public static final C6175qc0 e = C6175qc0.a("sourceExtension");
    public static final C6175qc0 f = C6175qc0.a("sourceExtensionJsonProto3");
    public static final C6175qc0 g = C6175qc0.a("timezoneOffsetSeconds");
    public static final C6175qc0 h = C6175qc0.a("networkConnectionInfo");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC4880kS0 abstractC4880kS0 = (AbstractC4880kS0) obj;
        L71 l72 = l71;
        l72.f(b, abstractC4880kS0.b());
        l72.a(c, abstractC4880kS0.a());
        l72.f(d, abstractC4880kS0.c());
        l72.a(e, abstractC4880kS0.e());
        l72.a(f, abstractC4880kS0.f());
        l72.f(g, abstractC4880kS0.g());
        l72.a(h, abstractC4880kS0.d());
    }
}
