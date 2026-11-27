package defpackage;

/* JADX INFO: renamed from: Gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1062Gk implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;

    public /* synthetic */ C1062Gk(InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C0984Fk((InterfaceC1153Ho0) this.b.get());
            default:
                return new C6848tn0((L41) this.b.get());
        }
    }
}
