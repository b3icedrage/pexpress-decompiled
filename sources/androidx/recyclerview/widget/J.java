package androidx.recyclerview.widget;

import defpackage.C1361Kf1;
import defpackage.C2703aM1;
import defpackage.HT0;

/* JADX INFO: loaded from: classes.dex */
public final class J {
    public final C2703aM1<RecyclerView.C, a> a = new C2703aM1<>();
    public final HT0<RecyclerView.C> b = new HT0<>();

    public static class a {
        public static final C1361Kf1 d = new C1361Kf1(20);
        public int a;
        public RecyclerView.j.b b;
        public RecyclerView.j.b c;

        public static a a() {
            a aVar = (a) d.a();
            return aVar == null ? new a() : aVar;
        }
    }

    public final void a(RecyclerView.C c, RecyclerView.j.b bVar) {
        C2703aM1<RecyclerView.C, a> c2703aM1 = this.a;
        a orDefault = c2703aM1.getOrDefault(c, null);
        if (orDefault == null) {
            orDefault = a.a();
            c2703aM1.put(c, orDefault);
        }
        orDefault.c = bVar;
        orDefault.a |= 8;
    }

    public final RecyclerView.j.b b(RecyclerView.C c, int i) {
        a aVarM;
        RecyclerView.j.b bVar;
        C2703aM1<RecyclerView.C, a> c2703aM1 = this.a;
        int iF = c2703aM1.f(c);
        if (iF >= 0 && (aVarM = c2703aM1.m(iF)) != null) {
            int i2 = aVarM.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                aVarM.a = i3;
                if (i == 4) {
                    bVar = aVarM.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVarM.c;
                }
                if ((i3 & 12) == 0) {
                    c2703aM1.k(iF);
                    aVarM.a = 0;
                    aVarM.b = null;
                    aVarM.c = null;
                    a.d.b(aVarM);
                }
                return bVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.C c) {
        a orDefault = this.a.getOrDefault(c, null);
        if (orDefault == null) {
            return;
        }
        orDefault.a &= -2;
    }

    public final void d(RecyclerView.C c) {
        HT0<RecyclerView.C> ht0 = this.b;
        for (int i = ht0.i() - 1; i >= 0; i--) {
            if (c == ht0.j(i)) {
                Object[] objArr = ht0.g;
                Object obj = objArr[i];
                Object obj2 = HT0.i;
                if (obj == obj2) {
                    break;
                }
                objArr[i] = obj2;
                ht0.d = true;
                break;
            }
        }
        a aVarRemove = this.a.remove(c);
        if (aVarRemove != null) {
            aVarRemove.a = 0;
            aVarRemove.b = null;
            aVarRemove.c = null;
            a.d.b(aVarRemove);
        }
    }
}
