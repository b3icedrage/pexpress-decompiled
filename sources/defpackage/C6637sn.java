package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6637sn implements K71<AbstractC5713oP.e.d.a.b.AbstractC0461d> {
    public static final C6637sn a = new C6637sn();
    public static final C6175qc0 b = C6175qc0.a(AppMeasurementSdk.ConditionalUserProperty.NAME);
    public static final C6175qc0 c = C6175qc0.a("importance");
    public static final C6175qc0 d = C6175qc0.a("frames");

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP.e.d.a.b.AbstractC0461d abstractC0461d = (AbstractC5713oP.e.d.a.b.AbstractC0461d) obj;
        L71 l72 = l71;
        l72.a(b, abstractC0461d.c());
        l72.e(c, abstractC0461d.b());
        l72.a(d, abstractC0461d.a());
    }
}
