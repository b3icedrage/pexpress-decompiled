package defpackage;

import android.graphics.PointF;

/* JADX INFO: renamed from: Ro1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1936Ro1 implements YL {
    public final String a;
    public final InterfaceC4023gc<PointF, PointF> b;
    public final C2393Xb c;
    public final C1973Sb d;
    public final boolean e;

    public C1936Ro1(String str, InterfaceC4023gc interfaceC4023gc, C2393Xb c2393Xb, C1973Sb c1973Sb, boolean z) {
        this.a = str;
        this.b = interfaceC4023gc;
        this.c = c2393Xb;
        this.d = c1973Sb;
        this.e = z;
    }

    @Override // defpackage.YL
    public final DL a(DU0 du0, C3788fU0 c3788fU0, AbstractC1158Hq abstractC1158Hq) {
        return new C1858Qo1(du0, abstractC1158Hq, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
