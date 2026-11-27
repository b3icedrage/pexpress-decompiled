package defpackage;

/* JADX INFO: renamed from: sU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6568sU0 implements DU0.b {
    public final /* synthetic */ DU0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ C6568sU0(DU0 du0, int i, int i2) {
        this.a = du0;
        this.b = i;
        this.c = i2;
    }

    @Override // DU0.b
    public final void run() {
        DU0 du0 = this.a;
        C3788fU0 c3788fU0 = du0.d;
        int i = this.b;
        int i2 = this.c;
        if (c3788fU0 == null) {
            du0.k.add(new C6568sU0(du0, i, i2));
        } else {
            du0.e.k(i, i2 + 0.99f);
        }
    }
}
