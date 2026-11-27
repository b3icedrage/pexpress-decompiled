package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Ei2 {
    public static int f;
    public ArrayList<TK> a;
    public int b;
    public int c;
    public ArrayList<a> d;
    public int e;

    public class a {
    }

    public final void a(ArrayList<Ei2> arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                Ei2 ei2 = arrayList.get(i);
                if (this.e == ei2.b) {
                    c(this.c, ei2);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C4874kQ0 c4874kQ0, int i) {
        int iN;
        int iN2;
        ArrayList<TK> arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        UK uk = (UK) arrayList.get(0).V;
        c4874kQ0.t();
        uk.e(c4874kQ0, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).e(c4874kQ0, false);
        }
        if (i == 0 && uk.D0 > 0) {
            C6463rz.a(uk, c4874kQ0, arrayList, 0);
        }
        if (i == 1 && uk.E0 > 0) {
            C6463rz.a(uk, c4874kQ0, arrayList, 1);
        }
        try {
            c4874kQ0.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TK tk = arrayList.get(i3);
            a aVar = new a();
            new WeakReference(tk);
            C4874kQ0.n(tk.J);
            C4874kQ0.n(tk.K);
            C4874kQ0.n(tk.L);
            C4874kQ0.n(tk.M);
            C4874kQ0.n(tk.N);
            this.d.add(aVar);
        }
        if (i == 0) {
            iN = C4874kQ0.n(uk.J);
            iN2 = C4874kQ0.n(uk.L);
            c4874kQ0.t();
        } else {
            iN = C4874kQ0.n(uk.K);
            iN2 = C4874kQ0.n(uk.M);
            c4874kQ0.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, Ei2 ei2) {
        for (TK tk : this.a) {
            ArrayList<TK> arrayList = ei2.a;
            if (!arrayList.contains(tk)) {
                arrayList.add(tk);
            }
            int i2 = ei2.b;
            if (i == 0) {
                tk.s0 = i2;
            } else {
                tk.t0 = i2;
            }
        }
        this.e = ei2.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strB = SK.b(sb, this.b, "] <");
        for (TK tk : this.a) {
            StringBuilder sbB = K1.b(strB, " ");
            sbB.append(tk.k0);
            strB = sbB.toString();
        }
        return Z0.c(strB, " >");
    }
}
