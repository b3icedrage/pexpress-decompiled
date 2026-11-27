package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: renamed from: vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7267vn implements K71<AbstractC5713oP.e.d> {
    public static final C7267vn a = new C7267vn();
    public static final C6175qc0 b = C6175qc0.a("timestamp");
    public static final C6175qc0 c = C6175qc0.a("type");
    public static final C6175qc0 d = C6175qc0.a(Payload.TYPE_APP);
    public static final C6175qc0 e = C6175qc0.a("device");
    public static final C6175qc0 f = C6175qc0.a("log");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP.e.d dVar = (AbstractC5713oP.e.d) obj;
        L71 l72 = l71;
        l72.f(b, dVar.d());
        l72.a(c, dVar.e());
        l72.a(d, dVar.a());
        l72.a(e, dVar.b());
        l72.a(f, dVar.c());
    }
}
