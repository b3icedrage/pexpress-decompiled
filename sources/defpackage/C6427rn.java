package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6427rn implements K71<AbstractC5713oP.e.d.a.b.c> {
    public static final C6427rn a = new C6427rn();
    public static final C6175qc0 b = C6175qc0.a(AppMeasurementSdk.ConditionalUserProperty.NAME);
    public static final C6175qc0 c = C6175qc0.a("code");
    public static final C6175qc0 d = C6175qc0.a("address");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP.e.d.a.b.c cVar = (AbstractC5713oP.e.d.a.b.c) obj;
        L71 l72 = l71;
        l72.a(b, cVar.c());
        l72.a(c, cVar.b());
        l72.f(d, cVar.a());
    }
}
