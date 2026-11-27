package defpackage;

/* JADX INFO: renamed from: fK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3759fK1 implements YL {
    public final String a;
    public final int b;
    public final C2549Zb c;
    public final boolean d;

    public C3759fK1(String str, int i, C2549Zb c2549Zb, boolean z) {
        this.a = str;
        this.b = i;
        this.c = c2549Zb;
        this.d = z;
    }

    @Override // defpackage.YL
    public final DL a(DU0 du0, C3788fU0 c3788fU0, AbstractC1158Hq abstractC1158Hq) {
        return new TJ1(du0, abstractC1158Hq, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.b + '}';
    }
}
