package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class We2 extends C6641so0 {
    public int w0 = 0;
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public boolean C0 = false;
    public int D0 = 0;
    public int E0 = 0;
    public final C4289hr.a F0 = new C4289hr.a();
    public C4289hr.b G0 = null;

    public final void X(TK tk, TK.a aVar, int i, TK.a aVar2, int i2) {
        C4289hr.b bVar;
        TK tk2;
        while (true) {
            bVar = this.G0;
            if (bVar != null || (tk2 = this.V) == null) {
                break;
            } else {
                this.G0 = ((UK) tk2).y0;
            }
        }
        C4289hr.a aVar3 = this.F0;
        aVar3.a = aVar;
        aVar3.b = aVar2;
        aVar3.c = i;
        aVar3.d = i2;
        ((ConstraintLayout.b) bVar).b(tk, aVar3);
        tk.S(aVar3.e);
        tk.P(aVar3.f);
        tk.E = aVar3.h;
        tk.M(aVar3.g);
    }

    @Override // defpackage.C6641so0, defpackage.InterfaceC6222qo0
    public final void c() {
        for (int i = 0; i < this.v0; i++) {
            TK tk = this.u0[i];
            if (tk != null) {
                tk.G = true;
            }
        }
    }

    public void W(int i, int i2, int i3, int i4) {
    }
}
