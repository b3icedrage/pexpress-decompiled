package defpackage;

/* JADX INFO: renamed from: uM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6963uM implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C6963uM(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C6753tM((C5698oK) this.b.get(), (InterfaceC1446Li) this.c.get());
            default:
                return new JE1((AbstractC2167Un1) this.b.get(), (O3) this.c.get());
        }
    }
}
