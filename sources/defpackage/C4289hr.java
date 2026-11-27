package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: hr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4289hr {
    public final ArrayList<TK> a = new ArrayList<>();
    public final a b = new a();
    public final UK c;

    /* JADX INFO: renamed from: hr$a */
    public static class a {
        public TK.a a;
        public TK.a b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    /* JADX INFO: renamed from: hr$b */
    public interface b {
    }

    public C4289hr(UK uk) {
        this.c = uk;
    }

    public final boolean a(int i, b bVar, TK tk) {
        TK.a[] aVarArr = tk.U;
        TK.a aVar = aVarArr[0];
        a aVar2 = this.b;
        aVar2.a = aVar;
        aVar2.b = aVarArr[1];
        aVar2.c = tk.u();
        aVar2.d = tk.o();
        aVar2.i = false;
        aVar2.j = i;
        TK.a aVar3 = aVar2.a;
        TK.a aVar4 = TK.a.g;
        boolean z = aVar3 == aVar4;
        boolean z2 = aVar2.b == aVar4;
        boolean z3 = z && tk.Y > 0.0f;
        boolean z4 = z2 && tk.Y > 0.0f;
        TK.a aVar5 = TK.a.d;
        int[] iArr = tk.t;
        if (z3 && iArr[0] == 4) {
            aVar2.a = aVar5;
        }
        if (z4 && iArr[1] == 4) {
            aVar2.b = aVar5;
        }
        ((ConstraintLayout.b) bVar).b(tk, aVar2);
        tk.S(aVar2.e);
        tk.P(aVar2.f);
        tk.E = aVar2.h;
        tk.M(aVar2.g);
        aVar2.j = 0;
        return aVar2.i;
    }

    public final void b(UK uk, int i, int i2, int i3) {
        int i4 = uk.d0;
        int i5 = uk.e0;
        uk.d0 = 0;
        uk.e0 = 0;
        uk.S(i2);
        uk.P(i3);
        if (i4 < 0) {
            uk.d0 = 0;
        } else {
            uk.d0 = i4;
        }
        if (i5 < 0) {
            uk.e0 = 0;
        } else {
            uk.e0 = i5;
        }
        UK uk2 = this.c;
        uk2.x0 = i;
        uk2.V();
    }

    public final void c(UK uk) {
        ArrayList<TK> arrayList = this.a;
        arrayList.clear();
        int size = uk.u0.size();
        for (int i = 0; i < size; i++) {
            TK tk = uk.u0.get(i);
            TK.a[] aVarArr = tk.U;
            TK.a aVar = aVarArr[0];
            TK.a aVar2 = TK.a.g;
            if (aVar == aVar2 || aVarArr[1] == aVar2) {
                arrayList.add(tk);
            }
        }
        uk.w0.b = true;
    }
}
