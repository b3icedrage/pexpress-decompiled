package defpackage;

/* JADX INFO: renamed from: yU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7829yU0 implements DU0.b {
    public final /* synthetic */ DU0 a;
    public final /* synthetic */ float b;

    public /* synthetic */ C7829yU0(DU0 du0, float f) {
        this.a = du0;
        this.b = f;
    }

    @Override // DU0.b
    public final void run() {
        DU0 du0 = this.a;
        C3788fU0 c3788fU0 = du0.d;
        float f = this.b;
        if (c3788fU0 == null) {
            du0.k.add(new C7829yU0(du0, f));
        } else {
            du0.s((int) C7099v01.d(c3788fU0.k, c3788fU0.l, f));
        }
    }
}
