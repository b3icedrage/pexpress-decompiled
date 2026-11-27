package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class WJ1 implements YL {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final C1895Rb d;
    public final C2129Ub e;
    public final boolean f;

    public WJ1(String str, boolean z, Path.FillType fillType, C1895Rb c1895Rb, C2129Ub c2129Ub, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = c1895Rb;
        this.e = c2129Ub;
        this.f = z2;
    }

    @Override // defpackage.YL
    public final DL a(DU0 du0, C3788fU0 c3788fU0, AbstractC1158Hq abstractC1158Hq) {
        return new C6388rd0(du0, abstractC1158Hq, this);
    }

    public final String toString() {
        return C4564j.f(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
