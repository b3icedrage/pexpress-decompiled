package defpackage;

/* JADX INFO: renamed from: lQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5083lQ implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C5083lQ(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C4873kQ((C4923kf) this.b.get());
            default:
                return new C2353Ww0((LU) this.b.get());
        }
    }
}
