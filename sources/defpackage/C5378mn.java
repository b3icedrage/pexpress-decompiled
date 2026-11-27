package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: renamed from: mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5378mn implements K71<AbstractC5713oP.e> {
    public static final C5378mn a = new C5378mn();
    public static final C6175qc0 b = C6175qc0.a("generator");
    public static final C6175qc0 c = C6175qc0.a("identifier");
    public static final C6175qc0 d = C6175qc0.a("startedAt");
    public static final C6175qc0 e = C6175qc0.a("endedAt");
    public static final C6175qc0 f = C6175qc0.a("crashed");
    public static final C6175qc0 g = C6175qc0.a(Payload.TYPE_APP);
    public static final C6175qc0 h = C6175qc0.a("user");
    public static final C6175qc0 i = C6175qc0.a("os");
    public static final C6175qc0 j = C6175qc0.a("device");
    public static final C6175qc0 k = C6175qc0.a("events");
    public static final C6175qc0 l = C6175qc0.a("generatorType");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP.e eVar = (AbstractC5713oP.e) obj;
        L71 l72 = l71;
        l72.a(b, eVar.e());
        l72.a(c, eVar.g().getBytes(AbstractC5713oP.a));
        l72.f(d, eVar.i());
        l72.a(e, eVar.c());
        l72.d(f, eVar.k());
        l72.a(g, eVar.a());
        l72.a(h, eVar.j());
        l72.a(i, eVar.h());
        l72.a(j, eVar.b());
        l72.a(k, eVar.d());
        l72.e(l, eVar.f());
    }
}
