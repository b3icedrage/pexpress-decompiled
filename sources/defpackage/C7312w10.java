package defpackage;

/* JADX INFO: renamed from: w10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7312w10 extends DX {
    public int m;

    public C7312w10(Fi2 fi2) {
        super(fi2);
        if (fi2 instanceof C3654ep0) {
            this.e = DX.a.e;
        } else {
            this.e = DX.a.g;
        }
    }

    @Override // defpackage.DX
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (InterfaceC7206vX interfaceC7206vX : this.k) {
            interfaceC7206vX.a(interfaceC7206vX);
        }
    }
}
