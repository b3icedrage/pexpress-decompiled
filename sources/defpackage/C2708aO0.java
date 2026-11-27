package defpackage;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;

/* JADX INFO: renamed from: aO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2708aO0 {
    public static final AbstractC7580xH0.a a = AbstractC7580xH0.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");
    public static final AbstractC7580xH0.a b = AbstractC7580xH0.a.a("d", R51.PUSH_ADDITIONAL_DATA_KEY);
    public static final AbstractC7580xH0.a c = AbstractC7580xH0.a.a("ty", "nm");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:205:0x03b7 A[PHI: r42
      0x03b7: PHI (r42v23 boolean) = (r42v18 boolean), (r42v19 boolean), (r42v20 boolean), (r42v21 boolean), (r42v24 boolean) binds: [B:219:0x03ea, B:215:0x03dc, B:211:0x03cf, B:207:0x03c2, B:204:0x03b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [Ub] */
    /* JADX WARN: Type inference failed for: r15v13, types: [Ub] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v6, types: [Zb] */
    /* JADX WARN: Type inference failed for: r7v7, types: [sq] */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static ZN0 a(TH0 th0, C3788fU0 c3788fU0) {
        float f;
        boolean z;
        ?? r4;
        boolean z2;
        ?? r3;
        C5738oX0.a aVar;
        C1973Sb c1973Sb;
        C1973Sb c1973Sb2;
        C1973Sb c1973Sb3;
        C1973Sb c1973Sb4;
        ?? r6;
        boolean z3 = true;
        ZN0.b bVar = ZN0.b.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        th0.X0();
        Float fValueOf = Float.valueOf(0.0f);
        float fD0 = 1.0f;
        Float fValueOf2 = Float.valueOf(1.0f);
        String strB = "UNSET";
        long jE0 = 0;
        boolean z4 = false;
        long jE1 = -1;
        int iC = 0;
        int color = 0;
        boolean zF = false;
        ZN0.b bVar2 = bVar;
        float fD1 = 0.0f;
        float fD2 = 0.0f;
        float fD3 = 0.0f;
        float fD4 = 0.0f;
        float fD5 = 0.0f;
        String strB2 = null;
        C3603ec c3603ecA = null;
        ZN0.a aVar2 = null;
        String strB3 = null;
        C4973kt c4973kt = null;
        C2866b40 c2866b40 = null;
        C2975bc c2975bc = null;
        C3184cc c3184cc = null;
        C1973Sb c1973SbN = null;
        int iC2 = 0;
        while (th0.hasNext()) {
            switch (th0.l(a)) {
                case 0:
                    strB = th0.B();
                    z4 = z4;
                    z3 = z3;
                    break;
                case 1:
                    z3 = z3;
                    f = fD1;
                    z4 = z4;
                    jE0 = th0.E0();
                    fD1 = f;
                    z3 = z3;
                    break;
                case 2:
                    strB3 = th0.B();
                    z4 = z4;
                    z3 = z3;
                    break;
                case 3:
                    z3 = z3;
                    f = fD1;
                    z = z4;
                    int iE0 = th0.E0();
                    aVar2 = iE0 < 6 ? ZN0.a.values()[iE0] : ZN0.a.g;
                    z4 = z;
                    fD1 = f;
                    z3 = z3;
                    break;
                case 4:
                    z3 = z3;
                    f = fD1;
                    z4 = z4;
                    jE1 = th0.E0();
                    fD1 = f;
                    z3 = z3;
                    break;
                case 5:
                    iC = (int) (C7857yc2.c() * th0.E0());
                    z4 = z4;
                    z3 = z3;
                    break;
                case 6:
                    iC2 = (int) (C7857yc2.c() * th0.E0());
                    z4 = z4;
                    z3 = z3;
                    break;
                case 7:
                    color = Color.parseColor(th0.B());
                    z4 = z4;
                    z3 = z3;
                    break;
                case 8:
                    c3603ecA = C3813fc.a(th0, c3788fU0);
                    z4 = z4;
                    z3 = z3;
                    break;
                case 9:
                    z3 = z3;
                    f = fD1;
                    z = z4;
                    int iE1 = th0.E0();
                    if (iE1 >= ZN0.b.values().length) {
                        c3788fU0.a("Unsupported matte type: " + iE1);
                    } else {
                        bVar2 = ZN0.b.values()[iE1];
                        int iOrdinal = bVar2.ordinal();
                        if (iOrdinal == 3) {
                            c3788fU0.a("Unsupported matte type: Luma");
                        } else if (iOrdinal == 4) {
                            c3788fU0.a("Unsupported matte type: Luma Inverted");
                        }
                        c3788fU0.o++;
                    }
                    z4 = z;
                    fD1 = f;
                    z3 = z3;
                    break;
                case 10:
                    f = fD1;
                    C5738oX0.a aVar3 = null;
                    th0.l1();
                    while (th0.hasNext()) {
                        th0.X0();
                        C5738oX0.a aVar4 = aVar3;
                        C5738oX0.a aVar5 = aVar4;
                        ?? P = aVar5;
                        boolean zF2 = false;
                        ?? c2549Zb = aVar5;
                        while (th0.hasNext()) {
                            String strX0 = th0.x0();
                            strX0.getClass();
                            switch (strX0.hashCode()) {
                                case 111:
                                    r4 = !strX0.equals(R51.PUSH_MINIFIED_BUTTONS_LIST) ? -1 : 0;
                                    break;
                                case 3588:
                                    r4 = !strX0.equals("pt") ? -1 : z3;
                                    break;
                                case 104433:
                                    r4 = !strX0.equals("inv") ? -1 : 2;
                                    break;
                                case 3357091:
                                    r4 = !strX0.equals("mode") ? -1 : 3;
                                    break;
                                default:
                                    r4 = -1;
                                    break;
                            }
                            switch (r4) {
                                case 0:
                                    z2 = z3;
                                    P = C3476e.p(th0, c3788fU0);
                                    break;
                                case 1:
                                    z2 = z3;
                                    c2549Zb = new C2549Zb(AK0.a(th0, c3788fU0, C7857yc2.c(), VJ1.d, false), 0);
                                    break;
                                case 2:
                                    z2 = z3;
                                    zF2 = th0.f();
                                    break;
                                case 3:
                                    String strB4 = th0.B();
                                    strB4.getClass();
                                    C5738oX0.a aVar6 = C5738oX0.a.d;
                                    switch (strB4.hashCode()) {
                                        case 97:
                                            z2 = z3;
                                            if (!strB4.equals(R51.PUSH_ADDITIONAL_DATA_KEY)) {
                                                r3 = -1;
                                            } else {
                                                r3 = 0;
                                            }
                                            break;
                                        case 105:
                                            z2 = z3;
                                            if (!strB4.equals("i")) {
                                                r3 = -1;
                                            } else {
                                                r3 = z2;
                                            }
                                            break;
                                        case 110:
                                            z2 = z3;
                                            if (!strB4.equals(R51.PUSH_MINIFIED_BUTTON_TEXT)) {
                                                r3 = -1;
                                            } else {
                                                r3 = 2;
                                            }
                                            break;
                                        case 115:
                                            z2 = z3;
                                            if (!strB4.equals("s")) {
                                                r3 = -1;
                                            } else {
                                                r3 = 3;
                                            }
                                            break;
                                        default:
                                            z2 = z3;
                                            r3 = -1;
                                            break;
                                    }
                                    switch (r3) {
                                        case 0:
                                            aVar4 = aVar6;
                                            break;
                                        case 1:
                                            c3788fU0.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            aVar = C5738oX0.a.g;
                                            aVar4 = aVar;
                                            break;
                                        case 2:
                                            aVar = C5738oX0.a.h;
                                            aVar4 = aVar;
                                            break;
                                        case 3:
                                            aVar = C5738oX0.a.e;
                                            aVar4 = aVar;
                                            break;
                                        default:
                                            CS0.b("Unknown mask mode " + strX0 + ". Defaulting to Add.");
                                            aVar4 = aVar6;
                                            break;
                                    }
                                    break;
                                default:
                                    th0.I();
                                    z2 = z3;
                                    break;
                            }
                            z3 = z2;
                            c2549Zb = c2549Zb;
                            P = P;
                        }
                        th0.B0();
                        arrayList.add(new C5738oX0(aVar4, c2549Zb, P, zF2));
                        z3 = z3;
                        aVar3 = null;
                    }
                    z3 = z3;
                    z = false;
                    c3788fU0.o += arrayList.size();
                    th0.h1();
                    z4 = z;
                    fD1 = f;
                    z3 = z3;
                    break;
                case 11:
                    f = fD1;
                    th0.l1();
                    while (th0.hasNext()) {
                        YL ylA = ZL.a(th0, c3788fU0);
                        if (ylA != null) {
                            arrayList2.add(ylA);
                        }
                    }
                    th0.h1();
                    z3 = z3;
                    z = false;
                    z4 = z;
                    fD1 = f;
                    z3 = z3;
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    th0.X0();
                    while (th0.hasNext()) {
                        int iL = th0.l(b);
                        if (iL == 0) {
                            c2975bc = new C2975bc(AK0.a(th0, c3788fU0, C7857yc2.c(), M20.d, false), 0);
                        } else if (iL != z3) {
                            th0.p();
                            th0.I();
                        } else {
                            th0.l1();
                            if (th0.hasNext()) {
                                AbstractC7580xH0.a aVar7 = C3394dc.a;
                                th0.X0();
                                C3184cc c3184cc2 = null;
                                while (th0.hasNext()) {
                                    if (th0.l(C3394dc.a) != 0) {
                                        th0.p();
                                        th0.I();
                                    } else {
                                        th0.X0();
                                        C1895Rb c1895RbM = null;
                                        C1895Rb c1895RbM2 = null;
                                        C1973Sb c1973SbN2 = null;
                                        C1973Sb c1973SbN3 = null;
                                        while (th0.hasNext()) {
                                            int iL2 = th0.l(C3394dc.b);
                                            if (iL2 == 0) {
                                                c1895RbM = C3476e.m(th0, c3788fU0);
                                            } else if (iL2 == z3) {
                                                c1895RbM2 = C3476e.m(th0, c3788fU0);
                                            } else if (iL2 == 2) {
                                                c1973SbN2 = C3476e.n(th0, c3788fU0, z3);
                                            } else if (iL2 != 3) {
                                                th0.p();
                                                th0.I();
                                            } else {
                                                c1973SbN3 = C3476e.n(th0, c3788fU0, z3);
                                            }
                                        }
                                        th0.B0();
                                        c3184cc2 = new C3184cc(c1895RbM, c1895RbM2, c1973SbN2, c1973SbN3);
                                    }
                                }
                                th0.B0();
                                if (c3184cc2 == null) {
                                    c3184cc2 = new C3184cc(null, null, null, null);
                                }
                                c3184cc = c3184cc2;
                            }
                            while (th0.hasNext()) {
                                th0.I();
                            }
                            th0.h1();
                        }
                    }
                    th0.B0();
                    fD1 = fD1;
                    z4 = false;
                    break;
                case 13:
                    th0.l1();
                    ArrayList arrayList3 = new ArrayList();
                    while (th0.hasNext()) {
                        th0.X0();
                        while (th0.hasNext()) {
                            int iL3 = th0.l(c);
                            if (iL3 == 0) {
                                int iE2 = th0.E0();
                                if (iE2 == 29) {
                                    AbstractC7580xH0.a aVar8 = C5183lt.a;
                                    c4973kt = null;
                                    while (th0.hasNext()) {
                                        if (th0.l(C5183lt.a) != 0) {
                                            th0.p();
                                            th0.I();
                                        } else {
                                            th0.l1();
                                            while (th0.hasNext()) {
                                                th0.X0();
                                                boolean z5 = false;
                                                C4973kt c4973kt2 = null;
                                                while (th0.hasNext()) {
                                                    int iL4 = th0.l(C5183lt.b);
                                                    if (iL4 == 0) {
                                                        z5 = th0.E0() == 0 ? z3 : false;
                                                    } else if (iL4 != z3) {
                                                        th0.p();
                                                        th0.I();
                                                    } else if (z5) {
                                                        c4973kt2 = new C4973kt(C3476e.n(th0, c3788fU0, z3));
                                                    } else {
                                                        th0.I();
                                                    }
                                                }
                                                th0.B0();
                                                if (c4973kt2 != null) {
                                                    c4973kt = c4973kt2;
                                                }
                                            }
                                            th0.h1();
                                        }
                                    }
                                } else if (iE2 == 25) {
                                    C3075c40 c3075c40 = new C3075c40();
                                    while (th0.hasNext()) {
                                        if (th0.l(C3075c40.f) != 0) {
                                            th0.p();
                                            th0.I();
                                        } else {
                                            th0.l1();
                                            while (th0.hasNext()) {
                                                th0.X0();
                                                String strB5 = "";
                                                while (th0.hasNext()) {
                                                    int iL5 = th0.l(C3075c40.g);
                                                    if (iL5 == 0) {
                                                        strB5 = th0.B();
                                                    } else if (iL5 == z3) {
                                                        strB5.getClass();
                                                        switch (strB5.hashCode()) {
                                                            case 353103893:
                                                                r6 = !strB5.equals("Distance") ? -1 : 0;
                                                                break;
                                                            case 397447147:
                                                                r6 = !strB5.equals("Opacity") ? -1 : z3;
                                                                break;
                                                            case 1041377119:
                                                                r6 = !strB5.equals("Direction") ? -1 : 2;
                                                                break;
                                                            case 1379387491:
                                                                r6 = !strB5.equals("Shadow Color") ? -1 : 3;
                                                                break;
                                                            case 1383710113:
                                                                r6 = !strB5.equals("Softness") ? -1 : 4;
                                                                break;
                                                            default:
                                                                r6 = -1;
                                                                break;
                                                        }
                                                        switch (r6) {
                                                            case 0:
                                                                c3075c40.d = C3476e.n(th0, c3788fU0, z3);
                                                                break;
                                                            case 1:
                                                                c3075c40.b = C3476e.n(th0, c3788fU0, false);
                                                                break;
                                                            case 2:
                                                                c3075c40.c = C3476e.n(th0, c3788fU0, false);
                                                                break;
                                                            case 3:
                                                                c3075c40.a = C3476e.m(th0, c3788fU0);
                                                                break;
                                                            case 4:
                                                                c3075c40.e = C3476e.n(th0, c3788fU0, z3);
                                                                break;
                                                            default:
                                                                th0.I();
                                                                break;
                                                        }
                                                    } else {
                                                        th0.p();
                                                        th0.I();
                                                    }
                                                }
                                                th0.B0();
                                            }
                                            th0.h1();
                                        }
                                    }
                                    C1895Rb c1895Rb = c3075c40.a;
                                    c2866b40 = (c1895Rb == null || (c1973Sb = c3075c40.b) == null || (c1973Sb2 = c3075c40.c) == null || (c1973Sb3 = c3075c40.d) == null || (c1973Sb4 = c3075c40.e) == null) ? null : new C2866b40(c1895Rb, c1973Sb, c1973Sb2, c1973Sb3, c1973Sb4);
                                }
                            } else if (iL3 != z3) {
                                th0.p();
                                th0.I();
                            } else {
                                arrayList3.add(th0.B());
                            }
                        }
                        th0.B0();
                    }
                    th0.h1();
                    c3788fU0.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fD1 = fD1;
                    z4 = false;
                    break;
                case 14:
                    fD0 = (float) th0.d0();
                    z4 = false;
                    break;
                case 15:
                    fD5 = (float) th0.d0();
                    z4 = false;
                    break;
                case 16:
                    fD4 = (float) (th0.d0() * ((double) C7857yc2.c()));
                    fD1 = fD1;
                    z4 = false;
                    break;
                case 17:
                    fD2 = (float) (th0.d0() * ((double) C7857yc2.c()));
                    fD1 = fD1;
                    z4 = false;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    fD1 = (float) th0.d0();
                    break;
                case 19:
                    fD3 = (float) th0.d0();
                    fD1 = fD1;
                    break;
                case 20:
                    c1973SbN = C3476e.n(th0, c3788fU0, z4);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    strB2 = th0.B();
                    break;
                case 22:
                    zF = th0.f();
                    break;
                default:
                    th0.p();
                    th0.I();
                    z3 = z3;
                    f = fD1;
                    z = z4;
                    z4 = z;
                    fD1 = f;
                    z3 = z3;
                    break;
            }
        }
        float f2 = fD1;
        th0.B0();
        ArrayList arrayList4 = new ArrayList();
        if (f2 > 0.0f) {
            arrayList4.add(new C7589xK0(c3788fU0, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(f2)));
        }
        if (fD3 <= 0.0f) {
            fD3 = c3788fU0.l;
        }
        arrayList4.add(new C7589xK0(c3788fU0, fValueOf2, fValueOf2, (Interpolator) null, f2, Float.valueOf(fD3)));
        arrayList4.add(new C7589xK0(c3788fU0, fValueOf, fValueOf, (Interpolator) null, fD3, Float.valueOf(Float.MAX_VALUE)));
        if (strB.endsWith(".ai") || "ai".equals(strB2)) {
            c3788fU0.a("Convert your Illustrator layers to shape layers.");
        }
        return new ZN0(arrayList2, c3788fU0, strB, jE0, aVar2, jE1, strB3, arrayList, c3603ecA, iC, iC2, color, fD0, fD5, fD4, fD2, c2975bc, c3184cc, arrayList4, bVar2, c1973SbN, zF, c4973kt, c2866b40);
    }
}
