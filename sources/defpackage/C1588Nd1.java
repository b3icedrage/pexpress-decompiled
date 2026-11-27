package defpackage;

/* JADX INFO: renamed from: Nd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1588Nd1 extends We2 {
    @Override // defpackage.We2
    public final void W(int i, int i2, int i3, int i4) {
        int iU = this.A0 + this.B0;
        int iO = this.w0 + this.x0;
        if (this.v0 > 0) {
            iU += this.u0[0].u();
            iO += this.u0[0].o();
        }
        int iMax = Math.max(this.d0, iU);
        int iMax2 = Math.max(this.e0, iO);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(iMax, i2);
            } else {
                i2 = i == 0 ? iMax : 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(iMax2, i4);
            } else {
                i4 = i3 == 0 ? iMax2 : 0;
            }
        }
        this.D0 = i2;
        this.E0 = i4;
        S(i2);
        P(i4);
        this.C0 = this.v0 > 0;
    }

    @Override // defpackage.TK
    public final void e(C4874kQ0 c4874kQ0, boolean z) {
        super.e(c4874kQ0, z);
        if (this.v0 > 0) {
            TK tk = this.u0[0];
            tk.H();
            tk.g0 = 0.5f;
            tk.f0 = 0.5f;
            IK.a aVar = IK.a.d;
            tk.h(aVar, this, aVar, 0);
            IK.a aVar2 = IK.a.g;
            tk.h(aVar2, this, aVar2, 0);
            IK.a aVar3 = IK.a.e;
            tk.h(aVar3, this, aVar3, 0);
            IK.a aVar4 = IK.a.h;
            tk.h(aVar4, this, aVar4, 0);
        }
    }
}
