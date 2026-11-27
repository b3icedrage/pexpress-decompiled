package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3857fn implements K71<AbstractC5713oP.c> {
    public static final C3857fn a = new C3857fn();
    public static final C6175qc0 b = C6175qc0.a("key");
    public static final C6175qc0 c = C6175qc0.a(AppMeasurementSdk.ConditionalUserProperty.VALUE);

    @Override // defpackage.C60
    public final void a(Object obj, L71 l71) {
        AbstractC5713oP.c cVar = (AbstractC5713oP.c) obj;
        L71 l72 = l71;
        l72.a(b, cVar.a());
        l72.a(c, cVar.b());
    }
}
