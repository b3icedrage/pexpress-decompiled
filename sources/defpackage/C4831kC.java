package defpackage;

import android.graphics.PointF;

/* JADX INFO: renamed from: kC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4831kC implements YL {
    public final String a;
    public final InterfaceC4023gc<PointF, PointF> b;
    public final C2393Xb c;
    public final boolean d;
    public final boolean e;

    public C4831kC(String str, InterfaceC4023gc<PointF, PointF> interfaceC4023gc, C2393Xb c2393Xb, boolean z, boolean z2) {
        this.a = str;
        this.b = interfaceC4023gc;
        this.c = c2393Xb;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.YL
    public final DL a(DU0 du0, C3788fU0 c3788fU0, AbstractC1158Hq abstractC1158Hq) {
        return new C5859p50(du0, abstractC1158Hq, this);
    }
}
