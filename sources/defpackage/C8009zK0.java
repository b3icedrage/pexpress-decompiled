package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: zK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8009zK0 {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final AbstractC7580xH0.a b = AbstractC7580xH0.a.a("t", "s", "e", R51.PUSH_MINIFIED_BUTTONS_LIST, "i", "h", "to", "ti");
    public static final AbstractC7580xH0.a c = AbstractC7580xH0.a.a("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        pointF.x = C7099v01.b(pointF.x, -1.0f, 1.0f);
        pointF.y = C7099v01.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = C7099v01.b(pointF2.x, -1.0f, 1.0f);
        float fB = C7099v01.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        C7857yc2.a aVar = C7857yc2.a;
        try {
            return C1040Gc1.b(pointF.x, pointF.y, pointF2.x, fB);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? C1040Gc1.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020a  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0033. Please report as an issue. */
    public static <T> C7589xK0<T> b(AbstractC7580xH0 abstractC7580xH0, C3788fU0 c3788fU0, float f, Zc2<T> zc2, boolean z, boolean z2) {
        T t;
        Interpolator interpolatorA;
        T t2;
        Interpolator interpolatorA2;
        Interpolator interpolatorA3;
        Interpolator interpolatorA4;
        C7589xK0<T> c7589xK0;
        PointF pointF;
        PointF pointF2;
        AbstractC7580xH0.a aVar;
        PointF pointF3;
        PointF pointF4;
        LinearInterpolator linearInterpolator = a;
        AbstractC7580xH0.a aVar2 = b;
        if (!z || !z2) {
            AbstractC7580xH0.a aVar3 = aVar2;
            if (!z) {
                return new C7589xK0<>(zc2.d(abstractC7580xH0, f));
            }
            abstractC7580xH0.X0();
            PointF pointFB = null;
            PointF pointFB2 = null;
            PointF pointFB3 = null;
            boolean z3 = false;
            PointF pointFB4 = null;
            T tD = null;
            float fD0 = 0.0f;
            T tD2 = null;
            while (abstractC7580xH0.hasNext()) {
                aVar3 = aVar3;
                switch (abstractC7580xH0.l(aVar3)) {
                    case 0:
                        fD0 = (float) abstractC7580xH0.d0();
                        continue;
                    case 1:
                        tD = zc2.d(abstractC7580xH0, f);
                        break;
                    case 2:
                        tD2 = zc2.d(abstractC7580xH0, f);
                        break;
                    case 3:
                        pointFB4 = VH0.b(abstractC7580xH0, 1.0f);
                        break;
                    case 4:
                        pointFB = VH0.b(abstractC7580xH0, 1.0f);
                        break;
                    case 5:
                        z3 = abstractC7580xH0.E0() == 1;
                        break;
                    case 6:
                        pointFB2 = VH0.b(abstractC7580xH0, f);
                        break;
                    case 7:
                        pointFB3 = VH0.b(abstractC7580xH0, f);
                        break;
                    default:
                        abstractC7580xH0.I();
                        break;
                }
            }
            abstractC7580xH0.B0();
            if (!z3) {
                if (pointFB4 == null || pointFB == null) {
                    t = tD2;
                } else {
                    interpolatorA = a(pointFB4, pointFB);
                    t = tD2;
                }
                C7589xK0<T> c7589xK1 = new C7589xK0<>(c3788fU0, tD, t, interpolatorA, fD0, (Float) null);
                c7589xK1.o = pointFB2;
                c7589xK1.p = pointFB3;
                return c7589xK1;
            }
            t = tD;
            interpolatorA = linearInterpolator;
            C7589xK0<T> c7589xK2 = new C7589xK0<>(c3788fU0, tD, t, interpolatorA, fD0, (Float) null);
            c7589xK2.o = pointFB2;
            c7589xK2.p = pointFB3;
            return c7589xK2;
        }
        abstractC7580xH0.X0();
        PointF pointF5 = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z4 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF6 = null;
        T tD3 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        float fD1 = 0.0f;
        T tD4 = null;
        while (abstractC7580xH0.hasNext()) {
            int iL = abstractC7580xH0.l(aVar2);
            AbstractC7580xH0.b bVar = AbstractC7580xH0.b.g;
            linearInterpolator = linearInterpolator;
            AbstractC7580xH0.b bVar2 = AbstractC7580xH0.b.k;
            z4 = z4;
            AbstractC7580xH0.a aVar4 = c;
            switch (iL) {
                case 0:
                    aVar = aVar2;
                    pointF3 = pointFB5;
                    pointF4 = pointFB6;
                    fD1 = (float) abstractC7580xH0.d0();
                    pointFB5 = pointF3;
                    aVar2 = aVar;
                    pointFB6 = pointF4;
                    break;
                case 1:
                    tD3 = zc2.d(abstractC7580xH0, f);
                    aVar2 = aVar2;
                    break;
                case 2:
                    tD4 = zc2.d(abstractC7580xH0, f);
                    aVar2 = aVar2;
                    break;
                case 3:
                    aVar = aVar2;
                    pointF3 = pointFB5;
                    pointF4 = pointFB6;
                    T t3 = tD3;
                    if (abstractC7580xH0.g() == bVar) {
                        abstractC7580xH0.X0();
                        float fD2 = 0.0f;
                        float fD3 = 0.0f;
                        float fD4 = 0.0f;
                        float fD5 = 0.0f;
                        while (abstractC7580xH0.hasNext()) {
                            int iL2 = abstractC7580xH0.l(aVar4);
                            if (iL2 != 0) {
                                if (iL2 != 1) {
                                    abstractC7580xH0.I();
                                } else if (abstractC7580xH0.g() == bVar2) {
                                    fD5 = (float) abstractC7580xH0.d0();
                                    fD3 = fD5;
                                } else {
                                    abstractC7580xH0.l1();
                                    fD3 = (float) abstractC7580xH0.d0();
                                    fD5 = abstractC7580xH0.g() == bVar2 ? (float) abstractC7580xH0.d0() : fD3;
                                    abstractC7580xH0.h1();
                                }
                            } else if (abstractC7580xH0.g() == bVar2) {
                                fD4 = (float) abstractC7580xH0.d0();
                                fD2 = fD4;
                            } else {
                                abstractC7580xH0.l1();
                                fD2 = (float) abstractC7580xH0.d0();
                                fD4 = abstractC7580xH0.g() == bVar2 ? (float) abstractC7580xH0.d0() : fD2;
                                abstractC7580xH0.h1();
                            }
                        }
                        PointF pointF9 = new PointF(fD2, fD3);
                        pointF7 = new PointF(fD4, fD5);
                        abstractC7580xH0.B0();
                        tD3 = t3;
                        pointF6 = pointF9;
                    } else {
                        pointFB7 = VH0.b(abstractC7580xH0, f);
                        tD3 = t3;
                    }
                    pointFB5 = pointF3;
                    aVar2 = aVar;
                    pointFB6 = pointF4;
                    break;
                case 4:
                    T t4 = tD3;
                    if (abstractC7580xH0.g() == bVar) {
                        abstractC7580xH0.X0();
                        float fD6 = 0.0f;
                        float fD7 = 0.0f;
                        float fD8 = 0.0f;
                        float fD9 = 0.0f;
                        while (abstractC7580xH0.hasNext()) {
                            AbstractC7580xH0.a aVar5 = aVar2;
                            int iL3 = abstractC7580xH0.l(aVar4);
                            if (iL3 != 0) {
                                pointF2 = pointFB6;
                                if (iL3 != 1) {
                                    abstractC7580xH0.I();
                                } else if (abstractC7580xH0.g() == bVar2) {
                                    fD9 = (float) abstractC7580xH0.d0();
                                    pointFB5 = pointFB5;
                                    fD7 = fD9;
                                } else {
                                    pointF = pointFB5;
                                    abstractC7580xH0.l1();
                                    fD7 = (float) abstractC7580xH0.d0();
                                    fD9 = abstractC7580xH0.g() == bVar2 ? (float) abstractC7580xH0.d0() : fD7;
                                    abstractC7580xH0.h1();
                                    pointFB5 = pointF;
                                }
                            } else {
                                pointF = pointFB5;
                                pointF2 = pointFB6;
                                if (abstractC7580xH0.g() == bVar2) {
                                    fD8 = (float) abstractC7580xH0.d0();
                                    pointFB5 = pointF;
                                    fD6 = fD8;
                                } else {
                                    abstractC7580xH0.l1();
                                    fD6 = (float) abstractC7580xH0.d0();
                                    fD8 = abstractC7580xH0.g() == bVar2 ? (float) abstractC7580xH0.d0() : fD6;
                                    abstractC7580xH0.h1();
                                    pointFB5 = pointF;
                                }
                            }
                            aVar2 = aVar5;
                            pointFB6 = pointF2;
                        }
                        aVar2 = aVar2;
                        PointF pointF10 = new PointF(fD6, fD7);
                        pointF5 = new PointF(fD8, fD9);
                        abstractC7580xH0.B0();
                        tD3 = t4;
                        pointF8 = pointF10;
                    } else {
                        aVar2 = aVar2;
                        pointFB8 = VH0.b(abstractC7580xH0, f);
                        tD3 = t4;
                    }
                    aVar2 = aVar2;
                    break;
                case 5:
                    z4 = abstractC7580xH0.E0() == 1;
                    break;
                case 6:
                    pointFB5 = VH0.b(abstractC7580xH0, f);
                    z4 = z4;
                    break;
                case 7:
                    pointFB6 = VH0.b(abstractC7580xH0, f);
                    z4 = z4;
                    break;
                default:
                    abstractC7580xH0.I();
                    z4 = z4;
                    break;
            }
        }
        LinearInterpolator linearInterpolator2 = linearInterpolator;
        PointF pointF11 = pointFB5;
        PointF pointF12 = pointFB6;
        boolean z5 = z4;
        T t5 = tD3;
        abstractC7580xH0.B0();
        if (!z5) {
            if (pointFB7 != null && pointFB8 != null) {
                interpolatorA4 = a(pointFB7, pointFB8);
                t2 = tD4;
                interpolatorA2 = null;
                interpolatorA3 = null;
            } else if (pointF6 == null || pointF7 == null || pointF8 == null || pointF5 == null) {
                t2 = tD4;
            } else {
                interpolatorA2 = a(pointF6, pointF8);
                interpolatorA3 = a(pointF7, pointF5);
                t2 = tD4;
                interpolatorA4 = null;
            }
            if (interpolatorA2 != null || interpolatorA3 == null) {
                c7589xK0 = new C7589xK0<>(c3788fU0, t5, t2, interpolatorA4, fD1, (Float) null);
            } else {
                c7589xK0 = new C7589xK0<>(c3788fU0, t5, t2, interpolatorA2, interpolatorA3, fD1);
            }
            c7589xK0.o = pointF11;
            c7589xK0.p = pointF12;
            return c7589xK0;
        }
        t2 = t5;
        interpolatorA4 = linearInterpolator2;
        interpolatorA2 = null;
        interpolatorA3 = null;
        if (interpolatorA2 != null) {
            c7589xK0 = new C7589xK0<>(c3788fU0, t5, t2, interpolatorA4, fD1, (Float) null);
        } else {
            c7589xK0 = new C7589xK0<>(c3788fU0, t5, t2, interpolatorA4, fD1, (Float) null);
        }
        c7589xK0.o = pointF11;
        c7589xK0.p = pointF12;
        return c7589xK0;
    }
}
