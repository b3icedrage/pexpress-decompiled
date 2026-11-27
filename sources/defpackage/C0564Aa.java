package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0564Aa {
    public static final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static int b;
    public static volatile C5642o31 c;
    public static volatile C5009l31 d;

    public static C4002gV1 a() {
        return new C4002gV1(null);
    }

    @NotNull
    public static final P62 b(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        return new P62(abstractC4649jL0);
    }

    @NotNull
    public static final void c(int i, int i2) throws EOFException {
        throw new EOFException("Unable to discard " + i + " bytes: only " + i2 + " available for writing");
    }

    public static final boolean d(AbstractC4649jL0 abstractC4649jL0, InterfaceC6494s62 interfaceC6494s62, Set set) {
        boolean zD;
        if (Intrinsics.a(abstractC4649jL0.V0(), interfaceC6494s62)) {
            return true;
        }
        InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
        InterfaceC5257mD interfaceC5257mD = interfaceC5044lDC instanceof InterfaceC5257mD ? (InterfaceC5257mD) interfaceC5044lDC : null;
        List<H62> listA = interfaceC5257mD != null ? interfaceC5257mD.A() : null;
        Iterable iterableI0 = CollectionsKt.i0(abstractC4649jL0.T0());
        if (!(iterableI0 instanceof Collection) || !((Collection) iterableI0).isEmpty()) {
            Iterator it = iterableI0.iterator();
            do {
                C1414Kx0 c1414Kx0 = (C1414Kx0) it;
                if (c1414Kx0.d.hasNext()) {
                    IndexedValue indexedValue = (IndexedValue) c1414Kx0.next();
                    int i = indexedValue.a;
                    N62 n62 = (N62) indexedValue.b;
                    H62 h62 = listA != null ? (H62) CollectionsKt.H(i, listA) : null;
                    if ((h62 == null || set == null || !set.contains(h62)) && !n62.c()) {
                        AbstractC4649jL0 type = n62.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        zD = d(type, interfaceC6494s62, set);
                    } else {
                        zD = false;
                    }
                }
            } while (!zD);
            return true;
        }
        return false;
    }

    @NonNull
    public static C6561sS e(int i) {
        if (i != 0) {
            return i != 1 ? new C3522eB1() : new TR();
        }
        return new C3522eB1();
    }

    @NotNull
    public static final P62 f(@NotNull AbstractC4649jL0 type, @NotNull EnumC3610ed2 projectionKind, @Nullable H62 h62) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(projectionKind, "projectionKind");
        if ((h62 != null ? h62.S() : null) == projectionKind) {
            projectionKind = EnumC3610ed2.INVARIANT;
        }
        return new P62(type, projectionKind);
    }

    @NotNull
    public static final void g(int i, int i2) throws EOFException {
        throw new EOFException("Unable to discard " + i + " bytes: only " + i2 + " available for reading");
    }

    public static String h(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        if (bArr == 0) {
            return null;
        }
        int length = (((((bArr.length * 8) + 5) / 6) + 3) / 4) * 4;
        StringBuilder sb = new StringBuilder(length);
        int i5 = 0;
        while (true) {
            int i6 = i5 / 8;
            if (bArr.length <= i6) {
                i2 = -1;
            } else {
                int i7 = bArr.length - 1 == i6 ? 0 : bArr[i6 + 1];
                int i8 = (i5 % 24) / 6;
                if (i8 != 0) {
                    if (i8 == 1) {
                        i3 = (bArr[i6] << 4) & 48;
                        i4 = (i7 >> 4) & 15;
                    } else if (i8 == 2) {
                        i3 = (bArr[i6] << 2) & 60;
                        i4 = (i7 >> 6) & 3;
                    } else if (i8 != 3) {
                        i2 = 0;
                    } else {
                        i = bArr[i6];
                    }
                    i2 = i3 | i4;
                } else {
                    i = bArr[i6] >> 2;
                }
                i2 = i & 63;
            }
            if (i2 < 0) {
                break;
            }
            sb.append((char) a[i2]);
            i5 += 6;
        }
        for (int length2 = sb.length(); length2 < length; length2++) {
            sb.append('=');
        }
        return sb.toString();
    }

    public static void i() {
        int i = b;
        if (i > 0) {
            b = i - 1;
        }
    }

    public static final void j(AbstractC4649jL0 abstractC4649jL0, AbstractC5706oM1 abstractC5706oM1, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
        if (interfaceC5044lDC instanceof H62) {
            if (!Intrinsics.a(abstractC4649jL0.V0(), abstractC5706oM1.V0())) {
                linkedHashSet.add(interfaceC5044lDC);
                return;
            }
            for (AbstractC4649jL0 abstractC4649jL1 : ((H62) interfaceC5044lDC).getUpperBounds()) {
                Intrinsics.checkNotNull(abstractC4649jL1);
                j(abstractC4649jL1, abstractC5706oM1, linkedHashSet, set);
            }
            return;
        }
        InterfaceC5044lD interfaceC5044lDC2 = abstractC4649jL0.V0().c();
        InterfaceC5257mD interfaceC5257mD = interfaceC5044lDC2 instanceof InterfaceC5257mD ? (InterfaceC5257mD) interfaceC5044lDC2 : null;
        List<H62> listA = interfaceC5257mD != null ? interfaceC5257mD.A() : null;
        int i = 0;
        for (N62 n62 : abstractC4649jL0.T0()) {
            int i2 = i + 1;
            H62 h62 = listA != null ? (H62) CollectionsKt.H(i, listA) : null;
            if ((h62 == null || set == null || !set.contains(h62)) && !n62.c() && !CollectionsKt.z(linkedHashSet, n62.getType().V0().c()) && !Intrinsics.a(n62.getType().V0(), abstractC5706oM1.V0())) {
                AbstractC4649jL0 type = n62.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                j(type, abstractC5706oM1, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static ArrayList k(ArrayList arrayList, long j) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            XP1 xp1 = (XP1) it.next();
            if (xp1.c().longValue() >= j) {
                arrayList2.add(xp1);
            }
        }
        return arrayList2;
    }

    @NotNull
    public static final RK0 l(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        RK0 rk0T = abstractC4649jL0.V0().t();
        Intrinsics.checkNotNullExpressionValue(rk0T, "getBuiltIns(...)");
        return rk0T;
    }

    public static float m(InterfaceC3876ft0 interfaceC3876ft0, UP0 up0) {
        float yChartMax = up0.getYChartMax();
        float yChartMin = up0.getYChartMin();
        WP0 lineData = up0.getLineData();
        if (interfaceC3876ft0.g() > 0.0f && interfaceC3876ft0.o() < 0.0f) {
            return 0.0f;
        }
        if (lineData.a > 0.0f) {
            yChartMax = 0.0f;
        }
        if (lineData.b < 0.0f) {
            yChartMin = 0.0f;
        }
        return interfaceC3876ft0.o() >= 0.0f ? yChartMin : yChartMax;
    }

    @NotNull
    public static final AbstractC4649jL0 n(@NotNull H62 h62) {
        Object obj;
        Intrinsics.checkNotNullParameter(h62, "<this>");
        List<AbstractC4649jL0> upperBounds = h62.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List<AbstractC4649jL0> upperBounds2 = h62.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC5044lD interfaceC5044lDC = ((AbstractC4649jL0) next).V0().c();
            FC fc = interfaceC5044lDC instanceof FC ? (FC) interfaceC5044lDC : null;
            if (fc != null && fc.h() != SC.e && fc.h() != SC.i) {
                obj = next;
                break;
            }
        }
        AbstractC4649jL0 abstractC4649jL0 = (AbstractC4649jL0) obj;
        if (abstractC4649jL0 != null) {
            return abstractC4649jL0;
        }
        List<AbstractC4649jL0> upperBounds3 = h62.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds3, "getUpperBounds(...)");
        Object objF = CollectionsKt.F(upperBounds3);
        Intrinsics.checkNotNullExpressionValue(objF, "first(...)");
        return (AbstractC4649jL0) objF;
    }

    public static final void o(@NotNull Throwable th, @NotNull CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = FN.a.iterator();
        while (it.hasNext()) {
            try {
                ((EN) it.next()).P(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    J90.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            J90.a(th, new P00(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean p(@NotNull H62 typeParameter, @Nullable InterfaceC6494s62 interfaceC6494s62, @Nullable Set set) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        List<AbstractC4649jL0> upperBounds = typeParameter.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        if (upperBounds != null && upperBounds.isEmpty()) {
            return false;
        }
        for (AbstractC4649jL0 abstractC4649jL0 : upperBounds) {
            Intrinsics.checkNotNull(abstractC4649jL0);
            if (d(abstractC4649jL0, typeParameter.y().V0(), set) && (interfaceC6494s62 == null || Intrinsics.a(abstractC4649jL0.V0(), interfaceC6494s62))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean q(H62 h62, InterfaceC6494s62 interfaceC6494s62, int i) {
        if ((i & 2) != 0) {
            interfaceC6494s62 = null;
        }
        return p(h62, interfaceC6494s62, null);
    }

    public static final boolean r(@NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull AbstractC4649jL0 superType) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return InterfaceC4859kL0.a.d(abstractC4649jL0, superType);
    }

    @NotNull
    public static final P92 s(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        P92 p92G = C3089c72.g(abstractC4649jL0);
        Intrinsics.checkNotNullExpressionValue(p92G, "makeNullable(...)");
        return p92G;
    }

    public static void t(TreeMap treeMap, String str) {
        String[] strArrSplit = str.split(":", 2);
        if (strArrSplit.length < 2) {
            return;
        }
        String strTrim = strArrSplit[0].trim();
        String strTrim2 = strArrSplit[1].trim();
        List arrayList = (List) treeMap.get(strTrim);
        if (arrayList == null) {
            arrayList = new ArrayList();
            treeMap.put(strTrim, arrayList);
        }
        arrayList.add(strTrim2);
    }

    @NotNull
    public static final AbstractC4649jL0 u(@NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull InterfaceC2396Xc newAnnotations) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        return (abstractC4649jL0.k().isEmpty() && newAnnotations.isEmpty()) ? abstractC4649jL0 : abstractC4649jL0.Y0().b1(C1952Ru.n(abstractC4649jL0.U0(), newAnnotations));
    }

    @NotNull
    public static final P92 v(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        P92 p92D;
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        P92 p92Y0 = abstractC4649jL0.Y0();
        if (p92Y0 instanceof AbstractC2299We0) {
            AbstractC2299We0 abstractC2299We0 = (AbstractC2299We0) p92Y0;
            AbstractC5706oM1 abstractC5706oM1D = abstractC2299We0.e;
            if (!abstractC5706oM1D.V0().b().isEmpty() && abstractC5706oM1D.V0().c() != null) {
                List<H62> listB = abstractC5706oM1D.V0().b();
                Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
                ArrayList arrayList = new ArrayList(XE.m(listB, 10));
                Iterator<T> it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C4662jP1((H62) it.next()));
                }
                abstractC5706oM1D = V62.d(abstractC5706oM1D, arrayList, null, 2);
            }
            AbstractC5706oM1 abstractC5706oM1D2 = abstractC2299We0.g;
            if (!abstractC5706oM1D2.V0().b().isEmpty() && abstractC5706oM1D2.V0().c() != null) {
                List<H62> listB2 = abstractC5706oM1D2.V0().b();
                Intrinsics.checkNotNullExpressionValue(listB2, "getParameters(...)");
                ArrayList arrayList2 = new ArrayList(XE.m(listB2, 10));
                Iterator<T> it2 = listB2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C4662jP1((H62) it2.next()));
                }
                abstractC5706oM1D2 = V62.d(abstractC5706oM1D2, arrayList2, null, 2);
            }
            p92D = C5492nL0.a(abstractC5706oM1D, abstractC5706oM1D2);
        } else {
            if (!(p92Y0 instanceof AbstractC5706oM1)) {
                throw new C6489s51();
            }
            AbstractC5706oM1 abstractC5706oM1 = (AbstractC5706oM1) p92Y0;
            boolean zIsEmpty = abstractC5706oM1.V0().b().isEmpty();
            p92D = abstractC5706oM1;
            if (!zIsEmpty) {
                InterfaceC5044lD interfaceC5044lDC = abstractC5706oM1.V0().c();
                p92D = abstractC5706oM1;
                if (interfaceC5044lDC != null) {
                    List<H62> listB3 = abstractC5706oM1.V0().b();
                    Intrinsics.checkNotNullExpressionValue(listB3, "getParameters(...)");
                    ArrayList arrayList3 = new ArrayList(XE.m(listB3, 10));
                    Iterator<T> it3 = listB3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C4662jP1((H62) it3.next()));
                    }
                    p92D = V62.d(abstractC5706oM1, arrayList3, null, 2);
                }
            }
        }
        return C6621sj.h(p92D, p92Y0);
    }

    public static void w(@NonNull ViewGroup viewGroup, float f) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof NX0) {
            ((NX0) background).k(f);
        }
    }

    public static void x(@NonNull View view, @NonNull NX0 nx0) {
        C5649o50 c5649o50 = nx0.d.b;
        if (c5649o50 == null || !c5649o50.a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            fI += Cd2.d.i((View) parent);
        }
        NX0.b bVar = nx0.d;
        if (bVar.l != fI) {
            bVar.l = fI;
            nx0.q();
        }
    }

    public static void y(@NonNull ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof NX0) {
            x(viewGroup, (NX0) background);
        }
    }

    @NotNull
    public static final String z(@Nullable Double d2) {
        String string = d2 != null ? d2.toString() : null;
        return string == null ? "" : string;
    }
}
