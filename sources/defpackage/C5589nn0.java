package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: nn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5589nn0 extends TK {
    public float u0 = -1.0f;
    public int v0 = -1;
    public int w0 = -1;
    public IK x0 = this.K;
    public int y0 = 0;
    public boolean z0;

    public C5589nn0() {
        this.S.clear();
        this.S.add(this.x0);
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            this.R[i] = this.x0;
        }
    }

    @Override // defpackage.TK
    public final boolean E() {
        return this.z0;
    }

    @Override // defpackage.TK
    public final boolean F() {
        return this.z0;
    }

    @Override // defpackage.TK
    public final void U(C4874kQ0 c4874kQ0, boolean z) {
        if (this.V == null) {
            return;
        }
        IK ik = this.x0;
        c4874kQ0.getClass();
        int iN = C4874kQ0.n(ik);
        if (this.y0 == 1) {
            this.a0 = iN;
            this.b0 = 0;
            P(this.V.o());
            S(0);
            return;
        }
        this.a0 = 0;
        this.b0 = iN;
        S(this.V.u());
        P(0);
    }

    public final void V(int i) {
        this.x0.l(i);
        this.z0 = true;
    }

    public final void W(int i) {
        if (this.y0 == i) {
            return;
        }
        this.y0 = i;
        ArrayList<IK> arrayList = this.S;
        arrayList.clear();
        if (this.y0 == 1) {
            this.x0 = this.J;
        } else {
            this.x0 = this.K;
        }
        arrayList.add(this.x0);
        IK[] ikArr = this.R;
        int length = ikArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            ikArr[i2] = this.x0;
        }
    }

    @Override // defpackage.TK
    public final void e(C4874kQ0 c4874kQ0, boolean z) {
        UK uk = (UK) this.V;
        if (uk == null) {
            return;
        }
        Object objM = uk.m(IK.a.d);
        Object objM2 = uk.m(IK.a.g);
        TK tk = this.V;
        TK.a aVar = TK.a.e;
        boolean z2 = tk != null && tk.U[0] == aVar;
        if (this.y0 == 0) {
            objM = uk.m(IK.a.e);
            objM2 = uk.m(IK.a.h);
            TK tk2 = this.V;
            z2 = tk2 != null && tk2.U[1] == aVar;
        }
        if (this.z0) {
            IK ik = this.x0;
            if (ik.c) {
                TN1 tn1K = c4874kQ0.k(ik);
                c4874kQ0.d(tn1K, this.x0.d());
                if (this.v0 != -1) {
                    if (z2) {
                        c4874kQ0.f(c4874kQ0.k(objM2), tn1K, 0, 5);
                    }
                } else if (this.w0 != -1 && z2) {
                    TN1 tn1K2 = c4874kQ0.k(objM2);
                    c4874kQ0.f(tn1K, c4874kQ0.k(objM), 0, 5);
                    c4874kQ0.f(tn1K2, tn1K, 0, 5);
                }
                this.z0 = false;
                return;
            }
        }
        if (this.v0 != -1) {
            TN1 tn1K3 = c4874kQ0.k(this.x0);
            c4874kQ0.e(tn1K3, c4874kQ0.k(objM), this.v0, 8);
            if (z2) {
                c4874kQ0.f(c4874kQ0.k(objM2), tn1K3, 0, 5);
                return;
            }
            return;
        }
        if (this.w0 != -1) {
            TN1 tn1K4 = c4874kQ0.k(this.x0);
            TN1 tn1K5 = c4874kQ0.k(objM2);
            c4874kQ0.e(tn1K4, tn1K5, -this.w0, 8);
            if (z2) {
                c4874kQ0.f(tn1K4, c4874kQ0.k(objM), 0, 5);
                c4874kQ0.f(tn1K5, tn1K4, 0, 5);
                return;
            }
            return;
        }
        if (this.u0 != -1.0f) {
            TN1 tn1K6 = c4874kQ0.k(this.x0);
            TN1 tn1K7 = c4874kQ0.k(objM2);
            float f = this.u0;
            C0747Cj c0747CjL = c4874kQ0.l();
            c0747CjL.d.k(tn1K6, -1.0f);
            c0747CjL.d.k(tn1K7, f);
            c4874kQ0.c(c0747CjL);
        }
    }

    @Override // defpackage.TK
    public final boolean f() {
        return true;
    }

    @Override // defpackage.TK
    public final void j(TK tk, HashMap<TK, TK> map) {
        super.j(tk, map);
        C5589nn0 c5589nn0 = (C5589nn0) tk;
        this.u0 = c5589nn0.u0;
        this.v0 = c5589nn0.v0;
        this.w0 = c5589nn0.w0;
        W(c5589nn0.y0);
    }

    @Override // defpackage.TK
    public final IK m(IK.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                }
            }
            if (this.y0 == 0) {
                return this.x0;
            }
            return null;
        }
        if (this.y0 == 1) {
            return this.x0;
        }
        return null;
    }
}
