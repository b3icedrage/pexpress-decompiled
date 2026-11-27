package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: so0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6641so0 extends TK implements InterfaceC6222qo0 {
    public TK[] u0 = new TK[4];
    public int v0 = 0;

    public final void V(int i, Ei2 ei2, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.v0; i2++) {
            TK tk = this.u0[i2];
            ArrayList<TK> arrayList2 = ei2.a;
            if (!arrayList2.contains(tk)) {
                arrayList2.add(tk);
            }
        }
        for (int i3 = 0; i3 < this.v0; i3++) {
            C3229cn0.a(this.u0[i3], i, arrayList, ei2);
        }
    }

    @Override // defpackage.InterfaceC6222qo0
    public final void a(TK tk) {
        if (tk == this || tk == null) {
            return;
        }
        int i = this.v0 + 1;
        TK[] tkArr = this.u0;
        if (i > tkArr.length) {
            this.u0 = (TK[]) Arrays.copyOf(tkArr, tkArr.length * 2);
        }
        TK[] tkArr2 = this.u0;
        int i2 = this.v0;
        tkArr2[i2] = tk;
        this.v0 = i2 + 1;
    }

    @Override // defpackage.InterfaceC6222qo0
    public final void b() {
        this.v0 = 0;
        Arrays.fill(this.u0, (Object) null);
    }

    @Override // defpackage.TK
    public void j(TK tk, HashMap<TK, TK> map) {
        super.j(tk, map);
        C6641so0 c6641so0 = (C6641so0) tk;
        this.v0 = 0;
        int i = c6641so0.v0;
        for (int i2 = 0; i2 < i; i2++) {
            a(map.get(c6641so0.u0[i2]));
        }
    }

    public void c() {
    }
}
