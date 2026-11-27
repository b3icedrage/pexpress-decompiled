package defpackage;

import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: renamed from: Wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2289Wb {
    public static final AbstractC7580xH0.a a = AbstractC7580xH0.a.a("k", "x", "y");

    public static C2207Vb a(TH0 th0, C3788fU0 c3788fU0) throws YG0, EOFException {
        ArrayList arrayList = new ArrayList();
        if (th0.g() == AbstractC7580xH0.b.d) {
            th0.l1();
            while (th0.hasNext()) {
                TH0 th1 = th0;
                C3788fU0 c3788fU1 = c3788fU0;
                arrayList.add(new C1118Hc1(c3788fU1, C8009zK0.b(th1, c3788fU1, C7857yc2.c(), Nm2.g, th0.g() == AbstractC7580xH0.b.g, false)));
                th0 = th1;
                c3788fU0 = c3788fU1;
            }
            th0.h1();
            AK0.b(arrayList);
        } else {
            arrayList.add(new C7589xK0(VH0.b(th0, C7857yc2.c())));
        }
        return new C2207Vb(arrayList);
    }

    public static InterfaceC4023gc b(TH0 th0, C3788fU0 c3788fU0) {
        th0.X0();
        C2207Vb c2207VbA = null;
        C1973Sb c1973SbN = null;
        boolean z = false;
        C1973Sb c1973SbN2 = null;
        while (th0.g() != AbstractC7580xH0.b.h) {
            int iL = th0.l(a);
            if (iL != 0) {
                AbstractC7580xH0.b bVar = AbstractC7580xH0.b.j;
                if (iL != 1) {
                    if (iL != 2) {
                        th0.p();
                        th0.I();
                    } else if (th0.g() == bVar) {
                        th0.I();
                        z = true;
                    } else {
                        c1973SbN = C3476e.n(th0, c3788fU0, true);
                    }
                } else if (th0.g() == bVar) {
                    th0.I();
                    z = true;
                } else {
                    c1973SbN2 = C3476e.n(th0, c3788fU0, true);
                }
            } else {
                c2207VbA = a(th0, c3788fU0);
            }
        }
        th0.B0();
        if (z) {
            c3788fU0.a("Lottie doesn't support expressions.");
        }
        return c2207VbA != null ? c2207VbA : new C2751ac(c1973SbN2, c1973SbN);
    }
}
