package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4321i1 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C4321i1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC4579j1.a aVar;
        InterfaceC5702oL0 receiver;
        N62 n62F;
        switch (this.d) {
            case 0:
                AbstractC4579j1.a it = (AbstractC4579j1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                AbstractC4579j1 abstractC4579j1 = (AbstractC4579j1) this.e;
                if (((RL1) abstractC4579j1).e && (receiver = it.a) != null) {
                    Intrinsics.checkNotNullParameter(receiver, "$receiver");
                    if (!(receiver instanceof AbstractC4649jL0)) {
                        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb.append(receiver);
                        sb.append(", ");
                        throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
                    }
                    if (receiver instanceof C2242Vm1) {
                        return null;
                    }
                }
                InterfaceC5702oL0 interfaceC5702oL0 = it.a;
                if (interfaceC5702oL0 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
                AbstractC5706oM1 abstractC5706oM1H = InterfaceC4366iD.a.h(interfaceC5702oL0);
                if (abstractC5706oM1H == null) {
                    Intrinsics.checkNotNullParameter(interfaceC5702oL0, "<this>");
                    AbstractC2299We0 abstractC2299We0G = InterfaceC4366iD.a.g(interfaceC5702oL0);
                    if (abstractC2299We0G == null || (abstractC5706oM1H = InterfaceC4366iD.a.M(abstractC2299We0G)) == null) {
                        AbstractC5706oM1 abstractC5706oM1H2 = InterfaceC4366iD.a.h(interfaceC5702oL0);
                        Intrinsics.checkNotNull(abstractC5706oM1H2);
                        abstractC5706oM1H = abstractC5706oM1H2;
                    }
                }
                InterfaceC6494s62 receiver2 = InterfaceC4366iD.a.W(abstractC5706oM1H);
                if (receiver2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(receiver2, "$receiver");
                if (!(receiver2 instanceof InterfaceC6494s62)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(receiver2);
                    sb2.append(", ");
                    throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver2.getClass(), sb2).toString());
                }
                List<H62> listB = receiver2.b();
                Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
                if (listB == null) {
                    return null;
                }
                InterfaceC5702oL0 receiver3 = it.a;
                Intrinsics.checkNotNullParameter(receiver3, "$receiver");
                if (!(receiver3 instanceof AbstractC4649jL0)) {
                    StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb3.append(receiver3);
                    sb3.append(", ");
                    throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver3.getClass(), sb3).toString());
                }
                List<N62> listT0 = ((AbstractC4649jL0) receiver3).T0();
                Iterator<T> it2 = listB.iterator();
                Iterator<T> it3 = listT0.iterator();
                ArrayList arrayList = new ArrayList(Math.min(XE.m(listB, 10), XE.m(listT0, 10)));
                while (it2.hasNext() && it3.hasNext()) {
                    Object next = it2.next();
                    InterfaceC4812k62 interfaceC4812k62 = (InterfaceC4812k62) it3.next();
                    J62 j62 = (J62) next;
                    boolean zJ = InterfaceC4366iD.a.J(interfaceC4812k62);
                    C3114cF0 c3114cF0 = it.b;
                    if (zJ) {
                        aVar = new AbstractC4579j1.a(null, c3114cF0, j62);
                    } else {
                        P92 p92O = InterfaceC4366iD.a.o(interfaceC4812k62);
                        abstractC4579j1.getClass();
                        C2054Tc c2054TcE = ((RL1) abstractC4579j1).e();
                        Intrinsics.checkNotNullParameter(p92O, "<this>");
                        aVar = new AbstractC4579j1.a(p92O, c2054TcE.b(c3114cF0, p92O.k()), j62);
                    }
                    arrayList.add(aVar);
                }
                return arrayList;
            case 1:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                C2905bF0 c2905bF0 = C4719jg1.b;
                function.a((String) this.e, c2905bF0, c2905bF0, c2905bF0);
                return Unit.a;
            case 2:
                InterfaceC3453ds0 newBottomSheetDialog = (InterfaceC3453ds0) obj;
                Intrinsics.checkNotNullParameter(newBottomSheetDialog, "$this$newBottomSheetDialog");
                newBottomSheetDialog.b((C3668eu) this.e);
                return Unit.a;
            default:
                M62.a aVar2 = (M62.a) obj;
                H62 typeParameter = aVar2.a;
                M62 m62 = (M62) this.e;
                m62.getClass();
                VE0 ve0 = aVar2.b;
                Set<H62> setB = ve0.b();
                if (setB != null && setB.contains(typeParameter.U0())) {
                    return m62.a(ve0);
                }
                AbstractC5706oM1 abstractC5706oM1Y = typeParameter.y();
                Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Y, "getDefaultType(...)");
                Intrinsics.checkNotNullParameter(abstractC5706oM1Y, "<this>");
                LinkedHashSet<H62> linkedHashSet = new LinkedHashSet();
                C0564Aa.j(abstractC5706oM1Y, abstractC5706oM1Y, linkedHashSet, setB);
                int iA = OW0.a(XE.m(linkedHashSet, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (H62 h62 : linkedHashSet) {
                    if (setB == null || !setB.contains(h62)) {
                        ve0.getClass();
                        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
                        Set<H62> set = ve0.e;
                        n62F = m62.a.f(h62, ve0, m62, m62.b(h62, VE0.a(ve0, null, false, set != null ? C5907pJ1.e(set, typeParameter) : C5487nJ1.b(typeParameter), null, 47)));
                    } else {
                        n62F = C3089c72.l(h62, ve0);
                        Intrinsics.checkNotNullExpressionValue(n62F, "makeStarProjection(...)");
                    }
                    linkedHashMap.put(h62.p(), n62F);
                }
                X62 x62E = X62.e(AbstractC7124v62.a.b(AbstractC7124v62.b, linkedHashMap));
                Intrinsics.checkNotNullExpressionValue(x62E, "create(...)");
                List<AbstractC4649jL0> upperBounds = typeParameter.getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                C3337dJ1 c3337dJ1C = m62.c(x62E, upperBounds, ve0);
                if (c3337dJ1C.d.isEmpty()) {
                    return m62.a(ve0);
                }
                if (c3337dJ1C.d.m == 1) {
                    return (AbstractC4649jL0) CollectionsKt.T(c3337dJ1C);
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
    }
}
