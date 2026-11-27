package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3813fc {
    public static final AbstractC7580xH0.a a = AbstractC7580xH0.a.a(R51.PUSH_ADDITIONAL_DATA_KEY, R51.PUSH_MINIFIED_BUTTON_ICON, "s", "rz", "r", R51.PUSH_MINIFIED_BUTTONS_LIST, "so", "eo", "sk", "sa");
    public static final AbstractC7580xH0.a b = AbstractC7580xH0.a.a("k");

    /* JADX WARN: Code duplicated, block: B:72:0x017b  */
    public static C3603ec a(TH0 th0, C3788fU0 c3788fU0) {
        C2471Yb c2471Yb;
        C1973Sb c1973Sb;
        boolean z = th0.g() == AbstractC7580xH0.b.g;
        if (z) {
            th0.X0();
        }
        C1973Sb c1973Sb2 = null;
        C2207Vb c2207VbA = null;
        InterfaceC4023gc interfaceC4023gcB = null;
        C2471Yb c2471Yb2 = null;
        C1973Sb c1973SbN = null;
        C1973Sb c1973SbN2 = null;
        C2129Ub c2129UbP = null;
        C1973Sb c1973SbN3 = null;
        C1973Sb c1973SbN4 = null;
        while (th0.hasNext()) {
            switch (th0.l(a)) {
                case 0:
                    th0.X0();
                    while (th0.hasNext()) {
                        if (th0.l(b) != 0) {
                            th0.p();
                            th0.I();
                        } else {
                            c2207VbA = C2289Wb.a(th0, c3788fU0);
                        }
                    }
                    th0.B0();
                    continue;
                case 1:
                    interfaceC4023gcB = C2289Wb.b(th0, c3788fU0);
                    continue;
                case 2:
                    c2471Yb2 = new C2471Yb(AK0.a(th0, c3788fU0, 1.0f, C2676aD1.d, false), 0);
                    continue;
                case 3:
                    c3788fU0.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    c2129UbP = C3476e.p(th0, c3788fU0);
                    continue;
                case 6:
                    c1973SbN3 = C3476e.n(th0, c3788fU0, false);
                    continue;
                case 7:
                    c1973SbN4 = C3476e.n(th0, c3788fU0, false);
                    continue;
                case 8:
                    c1973SbN = C3476e.n(th0, c3788fU0, false);
                    continue;
                case 9:
                    c1973SbN2 = C3476e.n(th0, c3788fU0, false);
                    continue;
                default:
                    th0.p();
                    th0.I();
                    continue;
            }
            C1973Sb c1973SbN5 = C3476e.n(th0, c3788fU0, false);
            List list = (List) c1973SbN5.b;
            if (list.isEmpty()) {
                c1973Sb = c1973SbN5;
                list.add(new C7589xK0(c3788fU0, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(c3788fU0.l)));
            } else {
                c1973Sb = c1973SbN5;
                if (((C7589xK0) list.get(0)).b == null) {
                    list.set(0, new C7589xK0(c3788fU0, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(c3788fU0.l)));
                }
            }
            c1973Sb2 = c1973Sb;
        }
        if (z) {
            th0.B0();
        }
        if (c2207VbA == null || (c2207VbA.i() && ((PointF) ((C7589xK0) ((ArrayList) c2207VbA.a).get(0)).b).equals(0.0f, 0.0f))) {
            c2207VbA = null;
        }
        InterfaceC4023gc interfaceC4023gc = (interfaceC4023gcB == null || (!(interfaceC4023gcB instanceof C2751ac) && interfaceC4023gcB.i() && ((PointF) ((C7589xK0) interfaceC4023gcB.k().get(0)).b).equals(0.0f, 0.0f))) ? null : interfaceC4023gcB;
        C1973Sb c1973Sb3 = (c1973Sb2 == null || (c1973Sb2.i() && ((Float) ((C7589xK0) ((List) c1973Sb2.b).get(0)).b).floatValue() == 0.0f)) ? null : c1973Sb2;
        if (c2471Yb2 == null) {
            c2471Yb = null;
        } else {
            if (c2471Yb2.i()) {
                ZC1 zc1 = (ZC1) ((C7589xK0) ((List) c2471Yb2.b).get(0)).b;
                if (zc1.a == 1.0f && zc1.b == 1.0f) {
                    c2471Yb = null;
                }
            }
            c2471Yb = c2471Yb2;
        }
        return new C3603ec(c2207VbA, interfaceC4023gc, c2471Yb, c1973Sb3, c2129UbP, c1973SbN3, c1973SbN4, (c1973SbN == null || (c1973SbN.i() && ((Float) ((C7589xK0) ((List) c1973SbN.b).get(0)).b).floatValue() == 0.0f)) ? null : c1973SbN, (c1973SbN2 == null || (c1973SbN2.i() && ((Float) ((C7589xK0) ((List) c1973SbN2.b).get(0)).b).floatValue() == 0.0f)) ? null : c1973SbN2);
    }
}
