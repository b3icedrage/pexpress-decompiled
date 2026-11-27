package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class AK0 {
    public static final AbstractC7580xH0.a a = AbstractC7580xH0.a.a("k");

    public static ArrayList a(AbstractC7580xH0 abstractC7580xH0, C3788fU0 c3788fU0, float f, Zc2 zc2, boolean z) {
        AbstractC7580xH0 abstractC7580xH1;
        C3788fU0 c3788fU1;
        float f2;
        Zc2 zc3;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (abstractC7580xH0.g() == AbstractC7580xH0.b.j) {
            c3788fU0.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC7580xH0.X0();
        while (abstractC7580xH0.hasNext()) {
            if (abstractC7580xH0.l(a) != 0) {
                abstractC7580xH0.I();
            } else if (abstractC7580xH0.g() == AbstractC7580xH0.b.d) {
                abstractC7580xH0.l1();
                if (abstractC7580xH0.g() == AbstractC7580xH0.b.k) {
                    AbstractC7580xH0 abstractC7580xH2 = abstractC7580xH0;
                    C3788fU0 c3788fU2 = c3788fU0;
                    float f3 = f;
                    Zc2 zc4 = zc2;
                    boolean z3 = z;
                    C7589xK0 c7589xK0B = C8009zK0.b(abstractC7580xH2, c3788fU2, f3, zc4, false, z3);
                    abstractC7580xH1 = abstractC7580xH2;
                    c3788fU1 = c3788fU2;
                    f2 = f3;
                    zc3 = zc4;
                    z2 = z3;
                    arrayList.add(c7589xK0B);
                } else {
                    abstractC7580xH1 = abstractC7580xH0;
                    c3788fU1 = c3788fU0;
                    f2 = f;
                    zc3 = zc2;
                    z2 = z;
                    while (abstractC7580xH1.hasNext()) {
                        arrayList.add(C8009zK0.b(abstractC7580xH1, c3788fU1, f2, zc3, true, z2));
                    }
                }
                abstractC7580xH1.h1();
                abstractC7580xH0 = abstractC7580xH1;
                c3788fU0 = c3788fU1;
                f = f2;
                zc2 = zc3;
                z = z2;
            } else {
                AbstractC7580xH0 abstractC7580xH3 = abstractC7580xH0;
                arrayList.add(C8009zK0.b(abstractC7580xH3, c3788fU0, f, zc2, false, z));
                abstractC7580xH0 = abstractC7580xH3;
            }
        }
        abstractC7580xH0.B0();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        T t;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C7589xK0 c7589xK0 = (C7589xK0) arrayList.get(i2);
            i2++;
            C7589xK0 c7589xK1 = (C7589xK0) arrayList.get(i2);
            c7589xK0.h = Float.valueOf(c7589xK1.g);
            if (c7589xK0.c == null && (t = c7589xK1.b) != 0) {
                c7589xK0.c = t;
                if (c7589xK0 instanceof C1118Hc1) {
                    ((C1118Hc1) c7589xK0).d();
                }
            }
        }
        C7589xK0 c7589xK2 = (C7589xK0) arrayList.get(i);
        if ((c7589xK2.b == null || c7589xK2.c == null) && arrayList.size() > 1) {
            arrayList.remove(c7589xK2);
        }
    }
}
