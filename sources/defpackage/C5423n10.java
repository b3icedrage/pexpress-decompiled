package defpackage;

/* JADX INFO: renamed from: n10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5423n10 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC5331mb0 b;

    public /* synthetic */ C5423n10(InterfaceC5331mb0 interfaceC5331mb0, int i) {
        this.a = i;
        this.b = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C5000l10(((IW0) this.b).a);
            default:
                return new N21((MU) ((M3) this.b).get());
        }
    }
}
