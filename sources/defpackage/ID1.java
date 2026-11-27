package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class ID1 {
    public static final Class<?> a;
    public static final N82<?, ?> b;
    public static final R82 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        C0674Bk1 c0674Bk1 = C0674Bk1.c;
        N82<?, ?> n82 = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            C0674Bk1 c0674Bk2 = C0674Bk1.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                n82 = (N82) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Throwable unused3) {
        }
        b = n82;
        c = new R82();
    }

    public static void A(int i, List<Long> list, InterfaceC5373ml2 interfaceC5373ml2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KE ke = (KE) interfaceC5373ml2;
        ke.getClass();
        boolean z2 = list instanceof AT0;
        GE ge = ke.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ge.a0(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            ge.X(i, 2);
            int iE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iE += GE.E(list.get(i3).longValue());
            }
            ge.Z(iE);
            while (i2 < list.size()) {
                ge.b0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        AT0 at0 = (AT0) list;
        if (!z) {
            while (i2 < at0.g) {
                ge.a0(i, at0.d(i2));
                i2++;
            }
            return;
        }
        ge.X(i, 2);
        int iE2 = 0;
        for (int i4 = 0; i4 < at0.g; i4++) {
            iE2 += GE.E(at0.d(i4));
        }
        ge.Z(iE2);
        while (i2 < at0.g) {
            ge.b0(at0.d(i2));
            i2++;
        }
    }

    public static int a(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C7982zB0)) {
            int iE = 0;
            while (i < size) {
                iE += GE.E(list.get(i).intValue());
                i++;
            }
            return iE;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        int iE2 = 0;
        while (i < size) {
            iE2 += GE.E(c7982zB0.d(i));
            i++;
        }
        return iE2;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (GE.C(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (GE.C(i) + 8) * size;
    }

    public static int d(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C7982zB0)) {
            int iE = 0;
            while (i < size) {
                iE += GE.E(list.get(i).intValue());
                i++;
            }
            return iE;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        int iE2 = 0;
        while (i < size) {
            iE2 += GE.E(c7982zB0.d(i));
            i++;
        }
        return iE2;
    }

    public static int e(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AT0)) {
            int iE = 0;
            while (i < size) {
                iE += GE.E(list.get(i).longValue());
                i++;
            }
            return iE;
        }
        AT0 at0 = (AT0) list;
        int iE2 = 0;
        while (i < size) {
            iE2 += GE.E(at0.d(i));
            i++;
        }
        return iE2;
    }

    public static int f(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C7982zB0)) {
            int iZ = 0;
            while (i < size) {
                iZ += GE.z(list.get(i).intValue());
                i++;
            }
            return iZ;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        int iZ2 = 0;
        while (i < size) {
            iZ2 += GE.z(c7982zB0.d(i));
            i++;
        }
        return iZ2;
    }

    public static int g(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AT0)) {
            int iA = 0;
            while (i < size) {
                iA += GE.A(list.get(i).longValue());
                i++;
            }
            return iA;
        }
        AT0 at0 = (AT0) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += GE.A(at0.d(i));
            i++;
        }
        return iA2;
    }

    public static int h(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C7982zB0)) {
            int iD = 0;
            while (i < size) {
                iD += GE.D(list.get(i).intValue());
                i++;
            }
            return iD;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        int iD2 = 0;
        while (i < size) {
            iD2 += GE.D(c7982zB0.d(i));
            i++;
        }
        return iD2;
    }

    public static int i(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AT0)) {
            int iE = 0;
            while (i < size) {
                iE += GE.E(list.get(i).longValue());
                i++;
            }
            return iE;
        }
        AT0 at0 = (AT0) list;
        int iE2 = 0;
        while (i < size) {
            iE2 += GE.E(at0.d(i));
            i++;
        }
        return iE2;
    }

    public static <UT, UB> UB j(Object obj, int i, List<Integer> list, VB0.b bVar, UB ub, N82<UT, UB> n82) {
        if (bVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!bVar.a()) {
                    ub = (UB) m(obj, i, iIntValue, ub, n82);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (bVar.a()) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) m(obj, i, iIntValue2, ub, n82);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static <T, FT extends C0571Ac0.a<FT>> void k(AbstractC1737Pa0<FT> abstractC1737Pa0, T t, T t2) {
        C0571Ac0<T> c0571Ac0C = abstractC1737Pa0.c(t2);
        if (c0571Ac0C.a.isEmpty()) {
            return;
        }
        C0571Ac0<T> c0571Ac0D = abstractC1737Pa0.d(t);
        c0571Ac0D.getClass();
        C2706aN1 c2706aN1 = c0571Ac0C.a;
        if (c2706aN1.d.size() > 0) {
            c0571Ac0D.i(c2706aN1.d(0));
            throw null;
        }
        Iterator<T> it = c2706aN1.e().iterator();
        if (it.hasNext()) {
            c0571Ac0D.i((Map.Entry) it.next());
            throw null;
        }
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <UT, UB> UB m(Object obj, int i, int i2, UB ub, N82<UT, UB> n82) {
        if (ub == null) {
            ub = (UB) n82.f(obj);
        }
        n82.e(ub, i, i2);
        return ub;
    }

    public static void n(int i, List<Boolean> list, InterfaceC5373ml2 interfaceC5373ml2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KE ke = (KE) interfaceC5373ml2;
        ke.getClass();
        boolean z2 = list instanceof C0621At;
        GE ge = ke.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ge.H(i, list.get(i2).booleanValue());
                    i2++;
                }
                return;
            }
            ge.X(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = GE.f;
                i3++;
            }
            ge.Z(i3);
            while (i2 < list.size()) {
                ge.G(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        C0621At c0621At = (C0621At) list;
        if (!z) {
            while (i2 < c0621At.g) {
                c0621At.c(i2);
                ge.H(i, c0621At.e[i2]);
                i2++;
            }
            return;
        }
        ge.X(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c0621At.g; i6++) {
            c0621At.c(i6);
            boolean z3 = c0621At.e[i6];
            Logger logger2 = GE.f;
            i5++;
        }
        ge.Z(i5);
        while (i2 < c0621At.g) {
            c0621At.c(i2);
            ge.G(c0621At.e[i2] ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void o(int i, List<Double> list, InterfaceC5373ml2 interfaceC5373ml2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KE ke = (KE) interfaceC5373ml2;
        ke.getClass();
        boolean z2 = list instanceof V20;
        GE ge = ke.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    double dDoubleValue = list.get(i2).doubleValue();
                    ge.getClass();
                    ge.N(i, Double.doubleToRawLongBits(dDoubleValue));
                    i2++;
                }
                return;
            }
            ge.X(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = GE.f;
                i3 += 8;
            }
            ge.Z(i3);
            while (i2 < list.size()) {
                ge.O(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        V20 v20 = (V20) list;
        if (!z) {
            while (i2 < v20.g) {
                v20.c(i2);
                double d = v20.e[i2];
                ge.getClass();
                ge.N(i, Double.doubleToRawLongBits(d));
                i2++;
            }
            return;
        }
        ge.X(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < v20.g; i6++) {
            v20.c(i6);
            double d2 = v20.e[i6];
            Logger logger2 = GE.f;
            i5 += 8;
        }
        ge.Z(i5);
        while (i2 < v20.g) {
            v20.c(i2);
            ge.O(Double.doubleToRawLongBits(v20.e[i2]));
            i2++;
        }
    }

    public static void p(int i, List<Integer> list, InterfaceC5373ml2 interfaceC5373ml2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KE ke = (KE) interfaceC5373ml2;
        ke.getClass();
        boolean z2 = list instanceof C7982zB0;
        GE ge = ke.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ge.P(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            ge.X(i, 2);
            int iE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iE += GE.E(list.get(i3).intValue());
            }
            ge.Z(iE);
            while (i2 < list.size()) {
                ge.Q(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        if (!z) {
            while (i2 < c7982zB0.g) {
                ge.P(i, c7982zB0.d(i2));
                i2++;
            }
            return;
        }
        ge.X(i, 2);
        int iE2 = 0;
        for (int i4 = 0; i4 < c7982zB0.g; i4++) {
            iE2 += GE.E(c7982zB0.d(i4));
        }
        ge.Z(iE2);
        while (i2 < c7982zB0.g) {
            ge.Q(c7982zB0.d(i2));
            i2++;
        }
    }

    public static void q(int i, List<Integer> list, InterfaceC5373ml2 interfaceC5373ml2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KE ke = (KE) interfaceC5373ml2;
        ke.getClass();
        boolean z2 = list instanceof C7982zB0;
        GE ge = ke.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ge.L(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            ge.X(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = GE.f;
                i3 += 4;
            }
            ge.Z(i3);
            while (i2 < list.size()) {
                ge.M(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        if (!z) {
            while (i2 < c7982zB0.g) {
                ge.L(i, c7982zB0.d(i2));
                i2++;
            }
            return;
        }
        ge.X(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c7982zB0.g; i6++) {
            c7982zB0.d(i6);
            Logger logger2 = GE.f;
            i5 += 4;
        }
        ge.Z(i5);
        while (i2 < c7982zB0.g) {
            ge.M(c7982zB0.d(i2));
            i2++;
        }
    }

    public static void r(int i, List<Long> list, InterfaceC5373ml2 interfaceC5373ml2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KE ke = (KE) interfaceC5373ml2;
        ke.getClass();
        boolean z2 = list instanceof AT0;
        GE ge = ke.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ge.N(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            ge.X(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = GE.f;
                i3 += 8;
            }
            ge.Z(i3);
            while (i2 < list.size()) {
                ge.O(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        AT0 at0 = (AT0) list;
        if (!z) {
            while (i2 < at0.g) {
                ge.N(i, at0.d(i2));
                i2++;
            }
            return;
        }
        ge.X(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < at0.g; i6++) {
            at0.d(i6);
            Logger logger2 = GE.f;
            i5 += 8;
        }
        ge.Z(i5);
        while (i2 < at0.g) {
            ge.O(at0.d(i2));
            i2++;
        }
    }

    public static void s(int i, List<Float> list, InterfaceC5373ml2 interfaceC5373ml2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KE ke = (KE) interfaceC5373ml2;
        ke.getClass();
        boolean z2 = list instanceof C3407df0;
        GE ge = ke.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    float fFloatValue = list.get(i2).floatValue();
                    ge.getClass();
                    ge.L(i, Float.floatToRawIntBits(fFloatValue));
                    i2++;
                }
                return;
            }
            ge.X(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = GE.f;
                i3 += 4;
            }
            ge.Z(i3);
            while (i2 < list.size()) {
                ge.M(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        C3407df0 c3407df0 = (C3407df0) list;
        if (!z) {
            while (i2 < c3407df0.g) {
                c3407df0.c(i2);
                float f = c3407df0.e[i2];
                ge.getClass();
                ge.L(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        ge.X(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c3407df0.g; i6++) {
            c3407df0.c(i6);
            float f2 = c3407df0.e[i6];
            Logger logger2 = GE.f;
            i5 += 4;
        }
        ge.Z(i5);
        while (i2 < c3407df0.g) {
            c3407df0.c(i2);
            ge.M(Float.floatToRawIntBits(c3407df0.e[i2]));
            i2++;
        }
    }

    public static void t(int i, List<Integer> list, InterfaceC5373ml2 interfaceC5373ml2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KE ke = (KE) interfaceC5373ml2;
        ke.getClass();
        boolean z2 = list instanceof C7982zB0;
        GE ge = ke.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ge.P(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            ge.X(i, 2);
            int iE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iE += GE.E(list.get(i3).intValue());
            }
            ge.Z(iE);
            while (i2 < list.size()) {
                ge.Q(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        if (!z) {
            while (i2 < c7982zB0.g) {
                ge.P(i, c7982zB0.d(i2));
                i2++;
            }
            return;
        }
        ge.X(i, 2);
        int iE2 = 0;
        for (int i4 = 0; i4 < c7982zB0.g; i4++) {
            iE2 += GE.E(c7982zB0.d(i4));
        }
        ge.Z(iE2);
        while (i2 < c7982zB0.g) {
            ge.Q(c7982zB0.d(i2));
            i2++;
        }
    }

    public static void u(int i, List<Long> list, InterfaceC5373ml2 interfaceC5373ml2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KE ke = (KE) interfaceC5373ml2;
        ke.getClass();
        boolean z2 = list instanceof AT0;
        GE ge = ke.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ge.a0(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            ge.X(i, 2);
            int iE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iE += GE.E(list.get(i3).longValue());
            }
            ge.Z(iE);
            while (i2 < list.size()) {
                ge.b0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        AT0 at0 = (AT0) list;
        if (!z) {
            while (i2 < at0.g) {
                ge.a0(i, at0.d(i2));
                i2++;
            }
            return;
        }
        ge.X(i, 2);
        int iE2 = 0;
        for (int i4 = 0; i4 < at0.g; i4++) {
            iE2 += GE.E(at0.d(i4));
        }
        ge.Z(iE2);
        while (i2 < at0.g) {
            ge.b0(at0.d(i2));
            i2++;
        }
    }

    public static void v(int i, List<Integer> list, InterfaceC5373ml2 interfaceC5373ml2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KE ke = (KE) interfaceC5373ml2;
        ke.getClass();
        boolean z2 = list instanceof C7982zB0;
        GE ge = ke.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ge.L(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            ge.X(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = GE.f;
                i3 += 4;
            }
            ge.Z(i3);
            while (i2 < list.size()) {
                ge.M(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        if (!z) {
            while (i2 < c7982zB0.g) {
                ge.L(i, c7982zB0.d(i2));
                i2++;
            }
            return;
        }
        ge.X(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c7982zB0.g; i6++) {
            c7982zB0.d(i6);
            Logger logger2 = GE.f;
            i5 += 4;
        }
        ge.Z(i5);
        while (i2 < c7982zB0.g) {
            ge.M(c7982zB0.d(i2));
            i2++;
        }
    }

    public static void w(int i, List<Long> list, InterfaceC5373ml2 interfaceC5373ml2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KE ke = (KE) interfaceC5373ml2;
        ke.getClass();
        boolean z2 = list instanceof AT0;
        GE ge = ke.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ge.N(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            ge.X(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).getClass();
                Logger logger = GE.f;
                i3 += 8;
            }
            ge.Z(i3);
            while (i2 < list.size()) {
                ge.O(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        AT0 at0 = (AT0) list;
        if (!z) {
            while (i2 < at0.g) {
                ge.N(i, at0.d(i2));
                i2++;
            }
            return;
        }
        ge.X(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < at0.g; i6++) {
            at0.d(i6);
            Logger logger2 = GE.f;
            i5 += 8;
        }
        ge.Z(i5);
        while (i2 < at0.g) {
            ge.O(at0.d(i2));
            i2++;
        }
    }

    public static void x(int i, List<Integer> list, InterfaceC5373ml2 interfaceC5373ml2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KE ke = (KE) interfaceC5373ml2;
        ke.getClass();
        boolean z2 = list instanceof C7982zB0;
        GE ge = ke.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = list.get(i2).intValue();
                    ge.Y(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            ge.X(i, 2);
            int iZ = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZ += GE.z(list.get(i3).intValue());
            }
            ge.Z(iZ);
            while (i2 < list.size()) {
                int iIntValue2 = list.get(i2).intValue();
                ge.Z((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        if (!z) {
            while (i2 < c7982zB0.g) {
                int iD = c7982zB0.d(i2);
                ge.Y(i, (iD >> 31) ^ (iD << 1));
                i2++;
            }
            return;
        }
        ge.X(i, 2);
        int iZ2 = 0;
        for (int i4 = 0; i4 < c7982zB0.g; i4++) {
            iZ2 += GE.z(c7982zB0.d(i4));
        }
        ge.Z(iZ2);
        while (i2 < c7982zB0.g) {
            int iD2 = c7982zB0.d(i2);
            ge.Z((iD2 >> 31) ^ (iD2 << 1));
            i2++;
        }
    }

    public static void y(int i, List<Long> list, InterfaceC5373ml2 interfaceC5373ml2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KE ke = (KE) interfaceC5373ml2;
        ke.getClass();
        boolean z2 = list instanceof AT0;
        GE ge = ke.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = list.get(i2).longValue();
                    ge.a0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            ge.X(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += GE.A(list.get(i3).longValue());
            }
            ge.Z(iA);
            while (i2 < list.size()) {
                long jLongValue2 = list.get(i2).longValue();
                ge.b0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        AT0 at0 = (AT0) list;
        if (!z) {
            while (i2 < at0.g) {
                long jD = at0.d(i2);
                ge.a0(i, (jD >> 63) ^ (jD << 1));
                i2++;
            }
            return;
        }
        ge.X(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < at0.g; i4++) {
            iA2 += GE.A(at0.d(i4));
        }
        ge.Z(iA2);
        while (i2 < at0.g) {
            long jD2 = at0.d(i2);
            ge.b0((jD2 >> 63) ^ (jD2 << 1));
            i2++;
        }
    }

    public static void z(int i, List<Integer> list, InterfaceC5373ml2 interfaceC5373ml2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        KE ke = (KE) interfaceC5373ml2;
        ke.getClass();
        boolean z2 = list instanceof C7982zB0;
        GE ge = ke.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    ge.Y(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            ge.X(i, 2);
            int iD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iD += GE.D(list.get(i3).intValue());
            }
            ge.Z(iD);
            while (i2 < list.size()) {
                ge.Z(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        C7982zB0 c7982zB0 = (C7982zB0) list;
        if (!z) {
            while (i2 < c7982zB0.g) {
                ge.Y(i, c7982zB0.d(i2));
                i2++;
            }
            return;
        }
        ge.X(i, 2);
        int iD2 = 0;
        for (int i4 = 0; i4 < c7982zB0.g; i4++) {
            iD2 += GE.D(c7982zB0.d(i4));
        }
        ge.Z(iD2);
        while (i2 < c7982zB0.g) {
            ge.Z(c7982zB0.d(i2));
            i2++;
        }
    }
}
