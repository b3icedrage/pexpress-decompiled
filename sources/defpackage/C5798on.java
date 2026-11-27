package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: on, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5798on implements K71<AbstractC5713oP.e.d.a.b.AbstractC0459a> {
    public static final C5798on a = new C5798on();
    public static final C6175qc0 b = C6175qc0.a("baseAddress");
    public static final C6175qc0 c = C6175qc0.a("size");
    public static final C6175qc0 d = C6175qc0.a(AppMeasurementSdk.ConditionalUserProperty.NAME);
    public static final C6175qc0 e = C6175qc0.a("uuid");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP.e.d.a.b.AbstractC0459a abstractC0459a = (AbstractC5713oP.e.d.a.b.AbstractC0459a) obj;
        L71 l72 = l71;
        l72.f(b, abstractC0459a.a());
        l72.f(c, abstractC0459a.c());
        l72.a(d, abstractC0459a.b());
        String strD = abstractC0459a.d();
        l72.a(e, strD != null ? strD.getBytes(AbstractC5713oP.a) : null);
    }
}
