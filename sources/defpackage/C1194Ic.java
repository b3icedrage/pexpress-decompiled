package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1194Ic implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C1194Ic(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iHashCode;
        Object objK;
        AbstractC2615Zx<Constructor<?>> abstractC2615ZxV;
        AbstractC2615Zx<Constructor<?>> bVar;
        int iHashCode2 = 0;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            case 1:
                return (InterfaceC1076Go1) obj;
            case 2:
                QC qc = DB1.a;
                C6535sJ0 c6535sJ0 = (C6535sJ0) obj;
                AbstractC7373wI0 abstractC7373wI0C = DB1.c(c6535sJ0.o());
                boolean z = abstractC7373wI0C instanceof AbstractC7373wI0.d;
                AbstractC5906pJ0 abstractC5906pJ0 = c6535sJ0.i;
                if (z) {
                    if (c6535sJ0.s()) {
                        Class<?> clsH = abstractC5906pJ0.h();
                        List<GJ0> listB = c6535sJ0.b();
                        ArrayList arrayList = new ArrayList(XE.m(listB, 10));
                        Iterator<T> it = listB.iterator();
                        while (it.hasNext()) {
                            String name = ((GJ0) it.next()).getName();
                            Intrinsics.checkNotNull(name);
                            arrayList.add(name);
                        }
                        C1116Hc.a aVar = C1116Hc.a.e;
                        C1116Hc.b bVar2 = C1116Hc.b.d;
                        return new C1116Hc(clsH, arrayList, aVar);
                    }
                    String desc = ((AbstractC7373wI0.d) abstractC7373wI0C).a.b;
                    abstractC5906pJ0.getClass();
                    Intrinsics.checkNotNullParameter(desc, "desc");
                    objK = AbstractC5906pJ0.w(abstractC5906pJ0.h(), abstractC5906pJ0.u(desc, false).a);
                } else if (abstractC7373wI0C instanceof AbstractC7373wI0.e) {
                    InterfaceC2076Tj0 interfaceC2076Tj0O = c6535sJ0.o();
                    InterfaceC4675jU interfaceC4675jUE = interfaceC2076Tj0O.e();
                    Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
                    if (C7138vA0.d(interfaceC4675jUE) && (interfaceC2076Tj0O instanceof InterfaceC3550eL) && ((InterfaceC3550eL) interfaceC2076Tj0O).G()) {
                        InterfaceC2076Tj0 interfaceC2076Tj0O2 = c6535sJ0.o();
                        String str2 = ((AbstractC7373wI0.e) abstractC7373wI0C).a.b;
                        List<Xc2> listJ = c6535sJ0.o().j();
                        Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                        return new Qc2.b(interfaceC2076Tj0O2, abstractC5906pJ0, str2, listJ);
                    }
                    AbstractC7583xI0.b bVar3 = ((AbstractC7373wI0.e) abstractC7373wI0C).a;
                    objK = abstractC5906pJ0.k(bVar3.a, bVar3.b);
                } else if (abstractC7373wI0C instanceof AbstractC7373wI0.c) {
                    objK = ((AbstractC7373wI0.c) abstractC7373wI0C).a;
                    Intrinsics.c(objK, "null cannot be cast to non-null type java.lang.reflect.Member");
                } else {
                    if (!(abstractC7373wI0C instanceof AbstractC7373wI0.b)) {
                        if (!(abstractC7373wI0C instanceof AbstractC7373wI0.a)) {
                            throw new C6489s51();
                        }
                        Class<?> clsH2 = abstractC5906pJ0.h();
                        List<Method> list = ((AbstractC7373wI0.a) abstractC7373wI0C).a;
                        ArrayList arrayList2 = new ArrayList(XE.m(list, 10));
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new C1116Hc(clsH2, arrayList2, C1116Hc.a.e, C1116Hc.b.d, list);
                    }
                    objK = ((AbstractC7373wI0.b) abstractC7373wI0C).a;
                    Intrinsics.c(objK, "null cannot be cast to non-null type java.lang.reflect.Member");
                }
                if (objK instanceof Constructor) {
                    abstractC2615ZxV = c6535sJ0.u((Constructor) objK, c6535sJ0.o(), false);
                } else {
                    if (!(objK instanceof Method)) {
                        throw new C3761fL0("Could not compute caller for function: " + c6535sJ0.o() + " (member = " + objK + ')');
                    }
                    Method method = (Method) objK;
                    if (!Modifier.isStatic(method.getModifiers())) {
                        bVar = c6535sJ0.t() ? new AbstractC2615Zx.g.a(method, N7.b(c6535sJ0.k, c6535sJ0.o())) : new AbstractC2615Zx.g.e(method);
                    } else if (c6535sJ0.o().k().p(C7437wc2.a) != null) {
                        bVar = c6535sJ0.t() ? new AbstractC2615Zx.g.b(method) : new AbstractC2615Zx.g.f(method);
                    } else {
                        abstractC2615ZxV = c6535sJ0.v(method);
                    }
                    abstractC2615ZxV = bVar;
                }
                return N7.c(abstractC2615ZxV, c6535sJ0.o(), false);
            default:
                C7180vO0 c7180vO0 = (C7180vO0) obj;
                QC classId = C4900kZ.f(c7180vO0);
                if (classId != null) {
                    c7180vO0.k.a.w.getClass();
                    Intrinsics.checkNotNullParameter(classId, "classId");
                }
                return null;
        }
    }
}
