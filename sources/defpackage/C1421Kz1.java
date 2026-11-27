package defpackage;

/* JADX INFO: renamed from: Kz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1421Kz1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C1421Kz1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                ((C5207m) this.b).getClass();
                return new C0875Dz1();
            default:
                return new C4926kf2((InterfaceC5136lf2) ((Z2) this.b).get());
        }
    }
}
