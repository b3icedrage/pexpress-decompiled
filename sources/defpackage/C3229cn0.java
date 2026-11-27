package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: cn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3229cn0 {
    public static Ei2 a(TK tk, int i, ArrayList<Ei2> arrayList, Ei2 ei2) {
        int i2;
        int i3 = i == 0 ? tk.s0 : tk.t0;
        if (i3 != -1 && (ei2 == null || i3 != ei2.b)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                Ei2 ei3 = arrayList.get(i4);
                if (ei3.b == i3) {
                    if (ei2 != null) {
                        ei2.c(i, ei3);
                        arrayList.remove(ei2);
                    }
                    ei2 = ei3;
                    break;
                }
            }
        } else if (i3 != -1) {
            return ei2;
        }
        if (ei2 == null) {
            if (tk instanceof C6641so0) {
                C6641so0 c6641so0 = (C6641so0) tk;
                int i5 = 0;
                while (true) {
                    if (i5 >= c6641so0.v0) {
                        i2 = -1;
                        break;
                    }
                    TK tk2 = c6641so0.u0[i5];
                    if ((i == 0 && (i2 = tk2.s0) != -1) || (i == 1 && (i2 = tk2.t0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        Ei2 ei4 = arrayList.get(i6);
                        if (ei4.b == i2) {
                            ei2 = ei4;
                            break;
                        }
                    }
                }
            }
            if (ei2 == null) {
                ei2 = new Ei2();
                ei2.a = new ArrayList<>();
                ei2.d = null;
                ei2.e = -1;
                int i7 = Ei2.f;
                Ei2.f = i7 + 1;
                ei2.b = i7;
                ei2.c = i;
            }
            arrayList.add(ei2);
        }
        ArrayList<TK> arrayList2 = ei2.a;
        if (arrayList2.contains(tk)) {
            return ei2;
        }
        arrayList2.add(tk);
        if (tk instanceof C5589nn0) {
            C5589nn0 c5589nn0 = (C5589nn0) tk;
            c5589nn0.x0.c(c5589nn0.y0 == 0 ? 1 : 0, ei2, arrayList);
        }
        int i8 = ei2.b;
        if (i == 0) {
            tk.s0 = i8;
            tk.J.c(i, ei2, arrayList);
            tk.L.c(i, ei2, arrayList);
        } else {
            tk.t0 = i8;
            tk.K.c(i, ei2, arrayList);
            tk.N.c(i, ei2, arrayList);
            tk.M.c(i, ei2, arrayList);
        }
        tk.Q.c(i, ei2, arrayList);
        return ei2;
    }

    public static boolean b(TK.a aVar, TK.a aVar2, TK.a aVar3, TK.a aVar4) {
        TK.a aVar5 = TK.a.d;
        TK.a aVar6 = TK.a.h;
        TK.a aVar7 = TK.a.e;
        return (aVar3 == aVar5 || aVar3 == aVar7 || (aVar3 == aVar6 && aVar != aVar7)) || (aVar4 == aVar5 || aVar4 == aVar7 || (aVar4 == aVar6 && aVar2 != aVar7));
    }
}
