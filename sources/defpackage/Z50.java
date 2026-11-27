package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Z50 implements InterfaceC5737oX {
    public final char a;

    public Z50(char c) {
        this.a = c;
    }

    @Override // defpackage.InterfaceC5737oX
    public final void a(RX1 rx1, RX1 rx2, int i) {
        String.valueOf(this.a);
        AbstractC6909u51 y50 = i == 1 ? new Y50() : new MS1();
        AbstractC6909u51 abstractC6909u51 = rx1.e;
        while (abstractC6909u51 != null && abstractC6909u51 != rx2) {
            AbstractC6909u51 abstractC6909u52 = abstractC6909u51.e;
            y50.b(abstractC6909u51);
            abstractC6909u51 = abstractC6909u52;
        }
        y50.f();
        AbstractC6909u51 abstractC6909u53 = rx1.e;
        y50.e = abstractC6909u53;
        if (abstractC6909u53 != null) {
            abstractC6909u53.d = y50;
        }
        y50.d = rx1;
        rx1.e = y50;
        AbstractC6909u51 abstractC6909u54 = rx1.a;
        y50.a = abstractC6909u54;
        if (y50.e == null) {
            abstractC6909u54.c = y50;
        }
    }

    @Override // defpackage.InterfaceC5737oX
    public final char b() {
        return this.a;
    }

    @Override // defpackage.InterfaceC5737oX
    public final int c() {
        return 1;
    }

    @Override // defpackage.InterfaceC5737oX
    public final int d(C5527nX c5527nX, C5527nX c5527nX2) {
        if (c5527nX.d || c5527nX2.c) {
            int i = c5527nX2.h;
            if (i % 3 != 0 && (c5527nX.h + i) % 3 == 0) {
                return 0;
            }
        }
        return (c5527nX.g < 2 || c5527nX2.g < 2) ? 1 : 2;
    }

    @Override // defpackage.InterfaceC5737oX
    public final char e() {
        return this.a;
    }
}
