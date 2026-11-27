package defpackage;

import android.graphics.Rect;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: pU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5939pU0 {
    public static final AbstractC7580xH0.a a = AbstractC7580xH0.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final AbstractC7580xH0.a b = AbstractC7580xH0.a.a("id", "layers", "w", "h", R51.PUSH_MINIFIED_BUTTON_ICON, "u");
    public static final AbstractC7580xH0.a c = AbstractC7580xH0.a.a("list");
    public static final AbstractC7580xH0.a d = AbstractC7580xH0.a.a("cm", "tm", "dr");

    public static C3788fU0 a(TH0 th0) throws YG0, EOFException {
        float f;
        ArrayList arrayList;
        float f2;
        int i;
        float f3;
        int i2;
        float fC = C7857yc2.c();
        HT0<ZN0> ht0 = new HT0<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        C5502nO1<C2067Tg0> c5502nO1 = new C5502nO1<>();
        C3788fU0 c3788fU0 = new C3788fU0();
        th0.X0();
        float fD0 = 0.0f;
        int iE0 = 0;
        int iE1 = 0;
        float fD1 = 0.0f;
        float fD2 = 0.0f;
        while (th0.hasNext()) {
            switch (th0.l(a)) {
                case 0:
                    iE0 = th0.E0();
                    break;
                case 1:
                    iE1 = th0.E0();
                    break;
                case 2:
                    fD1 = (float) th0.d0();
                    fC = fC;
                    break;
                case 3:
                    fD0 = ((float) th0.d0()) - 0.01f;
                    fC = fC;
                    break;
                case 4:
                    fD2 = (float) th0.d0();
                    fC = fC;
                    break;
                case 5:
                    f = fC;
                    map3 = map3;
                    arrayList = arrayList3;
                    c5502nO1 = c5502nO1;
                    f2 = fD0;
                    i = iE1;
                    f3 = fD1;
                    String[] strArrSplit = th0.B().split("\\.");
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    int i4 = Integer.parseInt(strArrSplit[1]);
                    int i5 = Integer.parseInt(strArrSplit[2]);
                    if (i3 < 4 || (i3 <= 4 && (i4 < 4 || (i4 <= 4 && i5 < 0)))) {
                        c3788fU0.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    iE1 = i;
                    fD0 = f2;
                    arrayList3 = arrayList;
                    fC = f;
                    map3 = map3;
                    c5502nO1 = c5502nO1;
                    fD1 = f3;
                    break;
                case 6:
                    f = fC;
                    map3 = map3;
                    arrayList = arrayList3;
                    c5502nO1 = c5502nO1;
                    f2 = fD0;
                    i = iE1;
                    f3 = fD1;
                    th0.l1();
                    int i6 = 0;
                    while (th0.hasNext()) {
                        ZN0 zn0A = C2708aO0.a(th0, c3788fU0);
                        if (zn0A.e == ZN0.a.e) {
                            i6++;
                        }
                        arrayList2.add(zn0A);
                        ht0.g(zn0A.d, zn0A);
                        if (i6 > 4) {
                            CS0.b("You have " + i6 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    th0.h1();
                    iE1 = i;
                    fD0 = f2;
                    arrayList3 = arrayList;
                    fC = f;
                    map3 = map3;
                    c5502nO1 = c5502nO1;
                    fD1 = f3;
                    break;
                case 7:
                    f = fC;
                    arrayList = arrayList3;
                    f2 = fD0;
                    th0.l1();
                    while (th0.hasNext()) {
                        ArrayList arrayList4 = new ArrayList();
                        HT0 ht1 = new HT0();
                        th0.X0();
                        HashMap map4 = map3;
                        String strB = null;
                        String strB2 = null;
                        int iE2 = 0;
                        int iE3 = 0;
                        while (th0.hasNext()) {
                            c5502nO1 = c5502nO1;
                            int iL = th0.l(b);
                            if (iL != 0) {
                                float f4 = fD1;
                                if (iL != 1) {
                                    if (iL == 2) {
                                        iE2 = th0.E0();
                                    } else if (iL == 3) {
                                        iE3 = th0.E0();
                                    } else if (iL == 4) {
                                        strB2 = th0.B();
                                    } else if (iL != 5) {
                                        th0.p();
                                        th0.I();
                                        i2 = iE1;
                                    } else {
                                        th0.B();
                                    }
                                    fD1 = f4;
                                } else {
                                    th0.l1();
                                    while (th0.hasNext()) {
                                        ZN0 zn0A2 = C2708aO0.a(th0, c3788fU0);
                                        ht1.g(zn0A2.d, zn0A2);
                                        arrayList4.add(zn0A2);
                                        iE1 = iE1;
                                    }
                                    i2 = iE1;
                                    th0.h1();
                                }
                                iE1 = i2;
                                fD1 = f4;
                            } else {
                                strB = th0.B();
                            }
                        }
                        C5502nO1<C2067Tg0> c5502nO2 = c5502nO1;
                        int i7 = iE1;
                        float f5 = fD1;
                        th0.B0();
                        if (strB2 != null) {
                            map2.put(strB, new FU0(iE2, iE3, strB, strB2));
                        } else {
                            map.put(strB, arrayList4);
                        }
                        iE1 = i7;
                        map3 = map4;
                        c5502nO1 = c5502nO2;
                        fD1 = f5;
                    }
                    map3 = map3;
                    c5502nO1 = c5502nO1;
                    i = iE1;
                    f3 = fD1;
                    th0.h1();
                    iE1 = i;
                    fD0 = f2;
                    arrayList3 = arrayList;
                    fC = f;
                    map3 = map3;
                    c5502nO1 = c5502nO1;
                    fD1 = f3;
                    break;
                case 8:
                    f = fC;
                    f2 = fD0;
                    th0.X0();
                    while (th0.hasNext()) {
                        if (th0.l(c) != 0) {
                            th0.p();
                            th0.I();
                        } else {
                            th0.l1();
                            while (th0.hasNext()) {
                                AbstractC7580xH0.a aVar = C2223Vg0.a;
                                th0.X0();
                                String strB3 = null;
                                String strB4 = null;
                                String strB5 = null;
                                while (th0.hasNext()) {
                                    int iL2 = th0.l(C2223Vg0.a);
                                    if (iL2 != 0) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (iL2 == 1) {
                                            strB4 = th0.B();
                                        } else if (iL2 == 2) {
                                            strB5 = th0.B();
                                        } else if (iL2 != 3) {
                                            th0.p();
                                            th0.I();
                                        } else {
                                            th0.d0();
                                        }
                                        arrayList3 = arrayList5;
                                    } else {
                                        strB3 = th0.B();
                                    }
                                }
                                th0.B0();
                                map3.put(strB4, new C1833Qg0(strB3, strB4, strB5));
                                arrayList3 = arrayList3;
                            }
                            th0.h1();
                        }
                    }
                    arrayList = arrayList3;
                    th0.B0();
                    i = iE1;
                    f3 = fD1;
                    iE1 = i;
                    fD0 = f2;
                    arrayList3 = arrayList;
                    fC = f;
                    map3 = map3;
                    c5502nO1 = c5502nO1;
                    fD1 = f3;
                    break;
                case 9:
                    f = fC;
                    f2 = fD0;
                    th0.l1();
                    while (th0.hasNext()) {
                        AbstractC7580xH0.a aVar2 = C2145Ug0.a;
                        ArrayList arrayList6 = new ArrayList();
                        th0.X0();
                        double dD0 = 0.0d;
                        String strB6 = null;
                        String strB7 = null;
                        char cCharAt = 0;
                        while (th0.hasNext()) {
                            int iL3 = th0.l(C2145Ug0.a);
                            if (iL3 == 0) {
                                cCharAt = th0.B().charAt(0);
                            } else if (iL3 == 1) {
                                th0.d0();
                            } else if (iL3 == 2) {
                                dD0 = th0.d0();
                            } else if (iL3 == 3) {
                                strB6 = th0.B();
                            } else if (iL3 == 4) {
                                strB7 = th0.B();
                            } else if (iL3 != 5) {
                                th0.p();
                                th0.I();
                            } else {
                                th0.X0();
                                while (th0.hasNext()) {
                                    if (th0.l(C2145Ug0.b) != 0) {
                                        th0.p();
                                        th0.I();
                                    } else {
                                        th0.l1();
                                        while (th0.hasNext()) {
                                            arrayList6.add((YJ1) ZL.a(th0, c3788fU0));
                                        }
                                        th0.h1();
                                    }
                                }
                                th0.B0();
                            }
                        }
                        th0.B0();
                        C2067Tg0 c2067Tg0 = new C2067Tg0(arrayList6, cCharAt, dD0, strB6, strB7);
                        c5502nO1.e(c2067Tg0.hashCode(), c2067Tg0);
                    }
                    th0.h1();
                    arrayList = arrayList3;
                    i = iE1;
                    f3 = fD1;
                    iE1 = i;
                    fD0 = f2;
                    arrayList3 = arrayList;
                    fC = f;
                    map3 = map3;
                    c5502nO1 = c5502nO1;
                    fD1 = f3;
                    break;
                case 10:
                    th0.l1();
                    while (th0.hasNext()) {
                        th0.X0();
                        String strB8 = null;
                        float fD3 = 0.0f;
                        float fD4 = 0.0f;
                        while (th0.hasNext()) {
                            int iL4 = th0.l(d);
                            if (iL4 != 0) {
                                float f6 = fC;
                                if (iL4 == 1) {
                                    fD3 = (float) th0.d0();
                                } else if (iL4 != 2) {
                                    th0.p();
                                    th0.I();
                                } else {
                                    fD4 = (float) th0.d0();
                                }
                                fC = f6;
                            } else {
                                strB8 = th0.B();
                            }
                        }
                        float f7 = fC;
                        th0.B0();
                        arrayList3.add(new VW0(strB8, fD3, fD4));
                        fD0 = fD0;
                        fC = f7;
                    }
                    f = fC;
                    f2 = fD0;
                    th0.h1();
                    arrayList = arrayList3;
                    i = iE1;
                    f3 = fD1;
                    iE1 = i;
                    fD0 = f2;
                    arrayList3 = arrayList;
                    fC = f;
                    map3 = map3;
                    c5502nO1 = c5502nO1;
                    fD1 = f3;
                    break;
                default:
                    th0.p();
                    th0.I();
                    f = fC;
                    map3 = map3;
                    arrayList = arrayList3;
                    f2 = fD0;
                    i = iE1;
                    f3 = fD1;
                    iE1 = i;
                    fD0 = f2;
                    arrayList3 = arrayList;
                    fC = f;
                    map3 = map3;
                    c5502nO1 = c5502nO1;
                    fD1 = f3;
                    break;
            }
        }
        float f8 = fC;
        c3788fU0.j = new Rect(0, 0, (int) (iE0 * f8), (int) (iE1 * f8));
        c3788fU0.k = fD1;
        c3788fU0.l = fD0;
        c3788fU0.m = fD2;
        c3788fU0.i = arrayList2;
        c3788fU0.h = ht0;
        c3788fU0.c = map;
        c3788fU0.d = map2;
        c3788fU0.g = c5502nO1;
        c3788fU0.e = map3;
        c3788fU0.f = arrayList3;
        return c3788fU0;
    }
}
