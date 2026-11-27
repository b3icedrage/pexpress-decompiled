package defpackage;

import android.graphics.Path;

/* JADX INFO: renamed from: Km0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1381Km0 implements YL {
    public final EnumC1851Qm0 a;
    public final Path.FillType b;
    public final C2051Tb c;
    public final C2129Ub d;
    public final C2393Xb e;
    public final C2393Xb f;
    public final String g;
    public final boolean h;

    public C1381Km0(String str, EnumC1851Qm0 enumC1851Qm0, Path.FillType fillType, C2051Tb c2051Tb, C2129Ub c2129Ub, C2393Xb c2393Xb, C2393Xb c2393Xb2, boolean z) {
        this.a = enumC1851Qm0;
        this.b = fillType;
        this.c = c2051Tb;
        this.d = c2129Ub;
        this.e = c2393Xb;
        this.f = c2393Xb2;
        this.g = str;
        this.h = z;
    }

    @Override // defpackage.YL
    public final DL a(DU0 du0, C3788fU0 c3788fU0, AbstractC1158Hq abstractC1158Hq) {
        return new C1459Lm0(du0, c3788fU0, abstractC1158Hq, this);
    }
}
