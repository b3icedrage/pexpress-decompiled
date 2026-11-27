package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class HD1 {
    public static final Class<?> a;
    public static final M82<?, ?> b;
    public static final M82<?, ?> c;
    public static final Q82 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = w(false);
        c = w(true);
        d = new Q82();
    }

    public static void A(int i, List<AbstractC1646Nw> list, InterfaceC5160ll2 interfaceC5160ll2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        JE je = (JE) interfaceC5160ll2;
        je.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            je.a.M(i, list.get(i2));
        }
    }

    public static void B(int i, List<Double> list, InterfaceC5160ll2 interfaceC5160ll2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HE.a aVar = ((JE) interfaceC5160ll2).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = list.get(i2).doubleValue();
                aVar.getClass();
                aVar.Q(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        aVar.X(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = HE.f;
            i3 += 8;
        }
        aVar.Z(i3);
        while (i2 < list.size()) {
            aVar.R(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    public static void C(int i, List<Integer> list, InterfaceC5160ll2 interfaceC5160ll2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HE.a aVar = ((JE) interfaceC5160ll2).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.S(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        aVar.X(i, 2);
        int iB = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iB += HE.B(list.get(i3).intValue());
        }
        aVar.Z(iB);
        while (i2 < list.size()) {
            aVar.T(list.get(i2).intValue());
            i2++;
        }
    }

    public static void D(int i, List<Integer> list, InterfaceC5160ll2 interfaceC5160ll2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HE.a aVar = ((JE) interfaceC5160ll2).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.O(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        aVar.X(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = HE.f;
            i3 += 4;
        }
        aVar.Z(i3);
        while (i2 < list.size()) {
            aVar.P(list.get(i2).intValue());
            i2++;
        }
    }

    public static void E(int i, List<Long> list, InterfaceC5160ll2 interfaceC5160ll2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HE.a aVar = ((JE) interfaceC5160ll2).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.Q(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        aVar.X(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = HE.f;
            i3 += 8;
        }
        aVar.Z(i3);
        while (i2 < list.size()) {
            aVar.R(list.get(i2).longValue());
            i2++;
        }
    }

    public static void F(int i, List<Float> list, InterfaceC5160ll2 interfaceC5160ll2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HE.a aVar = ((JE) interfaceC5160ll2).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = list.get(i2).floatValue();
                aVar.getClass();
                aVar.O(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        aVar.X(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = HE.f;
            i3 += 4;
        }
        aVar.Z(i3);
        while (i2 < list.size()) {
            aVar.P(Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    public static void G(int i, List<?> list, InterfaceC5160ll2 interfaceC5160ll2, InterfaceC7779yD1 interfaceC7779yD1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        JE je = (JE) interfaceC5160ll2;
        je.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            je.b(i, list.get(i2), interfaceC7779yD1);
        }
    }

    public static void H(int i, List<Integer> list, InterfaceC5160ll2 interfaceC5160ll2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HE.a aVar = ((JE) interfaceC5160ll2).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.S(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        aVar.X(i, 2);
        int iB = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iB += HE.B(list.get(i3).intValue());
        }
        aVar.Z(iB);
        while (i2 < list.size()) {
            aVar.T(list.get(i2).intValue());
            i2++;
        }
    }

    public static void I(int i, List<Long> list, InterfaceC5160ll2 interfaceC5160ll2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HE.a aVar = ((JE) interfaceC5160ll2).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.a0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        aVar.X(i, 2);
        int iH = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iH += HE.H(list.get(i3).longValue());
        }
        aVar.Z(iH);
        while (i2 < list.size()) {
            aVar.b0(list.get(i2).longValue());
            i2++;
        }
    }

    public static void J(int i, List<?> list, InterfaceC5160ll2 interfaceC5160ll2, InterfaceC7779yD1 interfaceC7779yD1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        JE je = (JE) interfaceC5160ll2;
        je.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            GZ0 gz0 = (GZ0) list.get(i2);
            HE.a aVar = je.a;
            aVar.X(i, 2);
            G0 g0 = (G0) gz0;
            int iF = g0.f();
            if (iF == -1) {
                iF = interfaceC7779yD1.g(g0);
                g0.o(iF);
            }
            aVar.Z(iF);
            interfaceC7779yD1.e(gz0, aVar.e);
        }
    }

    public static void K(int i, List<Integer> list, InterfaceC5160ll2 interfaceC5160ll2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HE.a aVar = ((JE) interfaceC5160ll2).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.O(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        aVar.X(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = HE.f;
            i3 += 4;
        }
        aVar.Z(i3);
        while (i2 < list.size()) {
            aVar.P(list.get(i2).intValue());
            i2++;
        }
    }

    public static void L(int i, List<Long> list, InterfaceC5160ll2 interfaceC5160ll2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HE.a aVar = ((JE) interfaceC5160ll2).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.Q(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        aVar.X(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = HE.f;
            i3 += 8;
        }
        aVar.Z(i3);
        while (i2 < list.size()) {
            aVar.R(list.get(i2).longValue());
            i2++;
        }
    }

    public static void M(int i, List<Integer> list, InterfaceC5160ll2 interfaceC5160ll2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HE.a aVar = ((JE) interfaceC5160ll2).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = list.get(i2).intValue();
                aVar.Y(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        aVar.X(i, 2);
        int iG = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = list.get(i3).intValue();
            iG += HE.G((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        aVar.Z(iG);
        while (i2 < list.size()) {
            int iIntValue3 = list.get(i2).intValue();
            aVar.Z((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void N(int i, List<Long> list, InterfaceC5160ll2 interfaceC5160ll2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HE.a aVar = ((JE) interfaceC5160ll2).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = list.get(i2).longValue();
                aVar.a0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        aVar.X(i, 2);
        int iH = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = list.get(i3).longValue();
            iH += HE.H((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        aVar.Z(iH);
        while (i2 < list.size()) {
            long jLongValue3 = list.get(i2).longValue();
            aVar.b0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void O(int i, List<String> list, InterfaceC5160ll2 interfaceC5160ll2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        JE je = (JE) interfaceC5160ll2;
        je.getClass();
        boolean z = list instanceof InterfaceC3563eP0;
        HE.a aVar = je.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.V(i, list.get(i2));
                i2++;
            }
            return;
        }
        InterfaceC3563eP0 interfaceC3563eP0 = (InterfaceC3563eP0) list;
        while (i2 < list.size()) {
            Object objK1 = interfaceC3563eP0.k1(i2);
            if (objK1 instanceof String) {
                aVar.V(i, (String) objK1);
            } else {
                aVar.M(i, (AbstractC1646Nw) objK1);
            }
            i2++;
        }
    }

    public static void P(int i, List<Integer> list, InterfaceC5160ll2 interfaceC5160ll2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HE.a aVar = ((JE) interfaceC5160ll2).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.Y(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        aVar.X(i, 2);
        int iG = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iG += HE.G(list.get(i3).intValue());
        }
        aVar.Z(iG);
        while (i2 < list.size()) {
            aVar.Z(list.get(i2).intValue());
            i2++;
        }
    }

    public static void Q(int i, List<Long> list, InterfaceC5160ll2 interfaceC5160ll2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HE.a aVar = ((JE) interfaceC5160ll2).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.a0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        aVar.X(i, 2);
        int iH = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iH += HE.H(list.get(i3).longValue());
        }
        aVar.Z(iH);
        while (i2 < list.size()) {
            aVar.b0(list.get(i2).longValue());
            i2++;
        }
    }

    public static int a(int i, List<AbstractC1646Nw> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = HE.E(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iE += HE.x(list.get(i2));
        }
        return iE;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (HE.E(i) * size) + c(list);
    }

    public static int c(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C7772yB0)) {
            int iB = 0;
            while (i < size) {
                iB += HE.B(list.get(i).intValue());
                i++;
            }
            return iB;
        }
        C7772yB0 c7772yB0 = (C7772yB0) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += HE.B(c7772yB0.d(i));
            i++;
        }
        return iB2;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return HE.y(i) * size;
    }

    public static int e(List<?> list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return HE.z(i) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (HE.E(i) * size) + i(list);
    }

    public static int i(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C7772yB0)) {
            int iB = 0;
            while (i < size) {
                iB += HE.B(list.get(i).intValue());
                i++;
            }
            return iB;
        }
        C7772yB0 c7772yB0 = (C7772yB0) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += HE.B(c7772yB0.d(i));
            i++;
        }
        return iB2;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (HE.E(i) * list.size()) + k(list);
    }

    public static int k(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C8036zT0)) {
            int iH = 0;
            while (i < size) {
                iH += HE.H(list.get(i).longValue());
                i++;
            }
            return iH;
        }
        C8036zT0 c8036zT0 = (C8036zT0) list;
        int iH2 = 0;
        while (i < size) {
            c8036zT0.b(i);
            iH2 += HE.H(c8036zT0.e[i]);
            i++;
        }
        return iH2;
    }

    public static int l(int i, Object obj, InterfaceC7779yD1 interfaceC7779yD1) {
        if (obj instanceof C5501nO0) {
            return HE.C((C5501nO0) obj) + HE.E(i);
        }
        int iE = HE.E(i);
        G0 g0 = (G0) ((GZ0) obj);
        int iF = g0.f();
        if (iF == -1) {
            iF = interfaceC7779yD1.g(g0);
            g0.o(iF);
        }
        return HE.G(iF) + iF + iE;
    }

    public static int m(int i, List<?> list, InterfaceC7779yD1 interfaceC7779yD1) {
        int iG;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = HE.E(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C5501nO0) {
                iG = HE.C((C5501nO0) obj);
            } else {
                G0 g0 = (G0) ((GZ0) obj);
                int iF = g0.f();
                if (iF == -1) {
                    iF = interfaceC7779yD1.g(g0);
                    g0.o(iF);
                }
                iG = HE.G(iF) + iF;
            }
            iE = iG + iE;
        }
        return iE;
    }

    public static int n(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (HE.E(i) * size) + o(list);
    }

    public static int o(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C7772yB0)) {
            int iG = 0;
            while (i < size) {
                int iIntValue = list.get(i).intValue();
                iG += HE.G((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iG;
        }
        C7772yB0 c7772yB0 = (C7772yB0) list;
        int iG2 = 0;
        while (i < size) {
            int iD = c7772yB0.d(i);
            iG2 += HE.G((iD >> 31) ^ (iD << 1));
            i++;
        }
        return iG2;
    }

    public static int p(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (HE.E(i) * size) + q(list);
    }

    public static int q(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C8036zT0)) {
            int iH = 0;
            while (i < size) {
                long jLongValue = list.get(i).longValue();
                iH += HE.H((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
            return iH;
        }
        C8036zT0 c8036zT0 = (C8036zT0) list;
        int iH2 = 0;
        while (i < size) {
            c8036zT0.b(i);
            long j = c8036zT0.e[i];
            iH2 += HE.H((j >> 63) ^ (j << 1));
            i++;
        }
        return iH2;
    }

    public static int r(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iE = HE.E(i) * size;
        if (!(list instanceof InterfaceC3563eP0)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iE = (obj instanceof AbstractC1646Nw ? HE.x((AbstractC1646Nw) obj) : HE.D((String) obj)) + iE;
                i2++;
            }
            return iE;
        }
        InterfaceC3563eP0 interfaceC3563eP0 = (InterfaceC3563eP0) list;
        while (i2 < size) {
            Object objK1 = interfaceC3563eP0.k1(i2);
            iE = (objK1 instanceof AbstractC1646Nw ? HE.x((AbstractC1646Nw) objK1) : HE.D((String) objK1)) + iE;
            i2++;
        }
        return iE;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (HE.E(i) * size) + t(list);
    }

    public static int t(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C7772yB0)) {
            int iG = 0;
            while (i < size) {
                iG += HE.G(list.get(i).intValue());
                i++;
            }
            return iG;
        }
        C7772yB0 c7772yB0 = (C7772yB0) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += HE.G(c7772yB0.d(i));
            i++;
        }
        return iG2;
    }

    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (HE.E(i) * size) + v(list);
    }

    public static int v(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C8036zT0)) {
            int iH = 0;
            while (i < size) {
                iH += HE.H(list.get(i).longValue());
                i++;
            }
            return iH;
        }
        C8036zT0 c8036zT0 = (C8036zT0) list;
        int iH2 = 0;
        while (i < size) {
            c8036zT0.b(i);
            iH2 += HE.H(c8036zT0.e[i]);
            i++;
        }
        return iH2;
    }

    public static M82<?, ?> w(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (M82) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void x(AbstractC1659Oa0 abstractC1659Oa0, AbstractC0595Ak0 abstractC0595Ak0, AbstractC0595Ak0 abstractC0595Ak1) {
        C0649Bc0 c0649Bc0B = abstractC1659Oa0.b(abstractC0595Ak1);
        if (c0649Bc0B.a.isEmpty()) {
            return;
        }
        C0649Bc0 c0649Bc0C = abstractC1659Oa0.c(abstractC0595Ak0);
        c0649Bc0C.getClass();
        YM1 ym1 = c0649Bc0B.a;
        if (ym1.e.size() > 0) {
            c0649Bc0C.h(ym1.d(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = ym1.e().iterator();
        if (it.hasNext()) {
            c0649Bc0C.h(it.next());
            throw null;
        }
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void z(int i, List<Boolean> list, InterfaceC5160ll2 interfaceC5160ll2, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        HE.a aVar = ((JE) interfaceC5160ll2).a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aVar.L(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        aVar.X(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).getClass();
            Logger logger = HE.f;
            i3++;
        }
        aVar.Z(i3);
        while (i2 < list.size()) {
            aVar.J(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }
}
