package defpackage;

/* JADX INFO: renamed from: Ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2072Ti implements InterfaceC5331mb0<C1994Si> {
    public final InterfaceC1531Mk1<C6201qi2> a;
    public final InterfaceC1531Mk1<Pa2> b;
    public final InterfaceC1531Mk1<InterfaceC3170cY> c;
    public final InterfaceC1531Mk1<C4923kf> d;
    public final C5083lQ e;

    public C2072Ti(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, C5083lQ c5083lQ) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
        this.d = interfaceC1531Mk4;
        this.e = c5083lQ;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new C1994Si(this.a.get(), this.b.get(), this.c.get(), this.d.get(), (InterfaceC3985gQ) this.e.get());
    }
}
