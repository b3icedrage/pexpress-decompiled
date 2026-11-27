package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2496Yj0 extends C3975gM1 {

    /* JADX INFO: renamed from: Yj0$a */
    public static final class a {
        @NotNull
        public static C2496Yj0 a(@NotNull C1842Qj0 functionClass, boolean z) {
            String lowerCase;
            Intrinsics.checkNotNullParameter(functionClass, "functionClass");
            List<H62> list = functionClass.o;
            C2496Yj0 c2496Yj0 = new C2496Yj0(functionClass, null, InterfaceC1490Lx.a.d, z);
            InterfaceC1076Go1 interfaceC1076Go1S0 = functionClass.S0();
            C5653o60 c5653o60 = C5653o60.d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((H62) obj).S() != EnumC3610ed2.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            C1336Jx0 c1336Jx0I0 = CollectionsKt.i0(arrayList);
            ArrayList arrayList2 = new ArrayList(XE.m(c1336Jx0I0, 10));
            Iterator it = c1336Jx0I0.iterator();
            while (true) {
                C1414Kx0 c1414Kx0 = (C1414Kx0) it;
                if (!c1414Kx0.d.hasNext()) {
                    c2496Yj0.Y0(null, interfaceC1076Go1S0, c5653o60, c5653o60, arrayList2, ((H62) CollectionsKt.L(list)).y(), C01.i, C5323mZ.e);
                    C2496Yj0 c2496Yj1 = c2496Yj0;
                    c2496Yj1.B = true;
                    return c2496Yj1;
                }
                IndexedValue indexedValue = (IndexedValue) c1414Kx0.next();
                int i = indexedValue.a;
                H62 h62 = (H62) indexedValue.b;
                String strE = h62.getName().e();
                Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
                if (Intrinsics.a(strE, "T")) {
                    lowerCase = "instance";
                } else if (Intrinsics.a(strE, "E")) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = strE.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                }
                C2496Yj0 c2496Yj2 = c2496Yj0;
                InterfaceC2396Xc.a.C0193a c0193a = InterfaceC2396Xc.a.a;
                C5638o21 c5638o21K = C5638o21.k(lowerCase);
                Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
                AbstractC5706oM1 abstractC5706oM1Y = h62.y();
                Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Y, "getDefaultType(...)");
                VN1.a NO_SOURCE = VN1.a;
                Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
                arrayList2.add(new Yc2(c2496Yj2, null, i, c0193a, c5638o21K, abstractC5706oM1Y, false, false, false, null, NO_SOURCE));
                c2496Yj0 = c2496Yj2;
            }
        }
    }

    public C2496Yj0(InterfaceC4675jU interfaceC4675jU, C2496Yj0 c2496Yj0, InterfaceC1490Lx.a aVar, boolean z) {
        super(interfaceC4675jU, c2496Yj0, InterfaceC2396Xc.a.a, V91.g, aVar, VN1.a);
        this.q = true;
        this.z = z;
        this.A = false;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.GY0
    public final boolean D() {
        return false;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.InterfaceC2076Tj0
    public final boolean V() {
        return false;
    }

    @Override // defpackage.C3975gM1, defpackage.AbstractC2314Wj0
    @NotNull
    public final AbstractC2314Wj0 V0(@NotNull InterfaceC2396Xc annotations, @NotNull InterfaceC1490Lx.a kind, @NotNull InterfaceC4675jU newOwner, @Nullable InterfaceC2076Tj0 interfaceC2076Tj0, @Nullable C5638o21 c5638o21, @NotNull VN1 source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        return new C2496Yj0(newOwner, (C2496Yj0) interfaceC2076Tj0, kind, this.z);
    }

    @Override // defpackage.AbstractC2314Wj0
    @Nullable
    public final AbstractC2314Wj0 W0(@NotNull AbstractC2314Wj0.a configuration) {
        C5638o21 c5638o21;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        C2496Yj0 c2496Yj0 = (C2496Yj0) super.W0(configuration);
        if (c2496Yj0 == null) {
            return null;
        }
        List<Xc2> listJ = c2496Yj0.j();
        Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
        if (listJ != null && listJ.isEmpty()) {
            return c2496Yj0;
        }
        Iterator<T> it = listJ.iterator();
        while (it.hasNext()) {
            AbstractC4649jL0 type = ((Xc2) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (C3427dk0.c(type) != null) {
                List<Xc2> listJ2 = c2496Yj0.j();
                Intrinsics.checkNotNullExpressionValue(listJ2, "getValueParameters(...)");
                ArrayList arrayList = new ArrayList(XE.m(listJ2, 10));
                Iterator<T> it2 = listJ2.iterator();
                while (it2.hasNext()) {
                    AbstractC4649jL0 type2 = ((Xc2) it2.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    arrayList.add(C3427dk0.c(type2));
                }
                int size = c2496Yj0.j().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List<Xc2> listJ3 = c2496Yj0.j();
                    Intrinsics.checkNotNullExpressionValue(listJ3, "getValueParameters(...)");
                    ArrayList<Pair> arrayListJ0 = CollectionsKt.j0(arrayList, listJ3);
                    if (arrayListJ0.isEmpty()) {
                        return c2496Yj0;
                    }
                    for (Pair pair : arrayListJ0) {
                        if (!Intrinsics.a((C5638o21) pair.d, ((Xc2) pair.e).getName())) {
                        }
                    }
                    return c2496Yj0;
                }
                List<Xc2> listJ4 = c2496Yj0.j();
                Intrinsics.checkNotNullExpressionValue(listJ4, "getValueParameters(...)");
                ArrayList arrayList2 = new ArrayList(XE.m(listJ4, 10));
                for (Xc2 xc2 : listJ4) {
                    C5638o21 name = xc2.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    int iL = xc2.l();
                    int i = iL - size;
                    if (i >= 0 && (c5638o21 = (C5638o21) arrayList.get(i)) != null) {
                        name = c5638o21;
                    }
                    arrayList2.add(xc2.c0(c2496Yj0, name, iL));
                }
                AbstractC2314Wj0.a aVarZ0 = c2496Yj0.Z0(X62.b);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((C5638o21) it3.next()) == null) {
                        }
                    }
                    z = false;
                }
                aVarZ0.v = Boolean.valueOf(z);
                aVarZ0.g = arrayList2;
                aVarZ0.e = c2496Yj0.U0();
                Intrinsics.checkNotNullExpressionValue(aVarZ0, "setOriginal(...)");
                AbstractC2314Wj0 abstractC2314Wj0W0 = super.W0(aVarZ0);
                Intrinsics.checkNotNull(abstractC2314Wj0W0);
                return abstractC2314Wj0W0;
            }
        }
        return c2496Yj0;
    }

    @Override // defpackage.AbstractC2314Wj0, defpackage.InterfaceC2076Tj0
    public final boolean m() {
        return false;
    }
}
