package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3427dk0 {
    public static final int a(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        InterfaceC1583Nc interfaceC1583NcP = abstractC4649jL0.k().p(C4194hP1.a.q);
        if (interfaceC1583NcP == null) {
            return 0;
        }
        CK ck = (CK) PW0.d(interfaceC1583NcP.j(), C4194hP1.e);
        Intrinsics.c(ck, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((FB0) ck).a).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    @NotNull
    public static final AbstractC5706oM1 b(@NotNull RK0 builtIns, @NotNull InterfaceC2396Xc annotations, @Nullable AbstractC4649jL0 abstractC4649jL0, @NotNull List contextReceiverTypes, @NotNull ArrayList parameterTypes, @NotNull AbstractC4649jL0 returnType, boolean z) {
        FC fcJ;
        InterfaceC2396Xc c2552Zc;
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        ArrayList arrayList = new ArrayList(contextReceiverTypes.size() + parameterTypes.size() + (abstractC4649jL0 != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(XE.m(contextReceiverTypes, 10));
        Iterator it = contextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList2.add(C0564Aa.b((AbstractC4649jL0) it.next()));
        }
        arrayList.addAll(arrayList2);
        UE.b(arrayList, abstractC4649jL0 != null ? C0564Aa.b(abstractC4649jL0) : null);
        Iterator it2 = parameterTypes.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            InterfaceC2396Xc c2552Zc2 = InterfaceC2396Xc.a.a;
            if (!zHasNext) {
                arrayList.add(C0564Aa.b(returnType));
                int size = contextReceiverTypes.size() + parameterTypes.size() + (abstractC4649jL0 == null ? 0 : 1);
                Intrinsics.checkNotNullParameter(builtIns, "builtIns");
                if (z) {
                    fcJ = builtIns.v(size);
                } else {
                    builtIns.getClass();
                    C5638o21 c5638o21 = C4194hP1.a;
                    fcJ = builtIns.j("Function" + size);
                }
                Intrinsics.checkNotNull(fcJ);
                if (abstractC4649jL0 != null) {
                    Intrinsics.checkNotNullParameter(annotations, "<this>");
                    Intrinsics.checkNotNullParameter(builtIns, "builtIns");
                    C1758Ph0 c1758Ph0 = C4194hP1.a.p;
                    if (annotations.P(c1758Ph0)) {
                        c2552Zc = annotations;
                    } else {
                        ArrayList annotations2 = CollectionsKt.P(annotations, new C5822ov(builtIns, c1758Ph0, PW0.c()));
                        Intrinsics.checkNotNullParameter(annotations2, "annotations");
                        c2552Zc = annotations2.isEmpty() ? c2552Zc2 : new C2552Zc(annotations2);
                    }
                } else {
                    c2552Zc = annotations;
                }
                if (!contextReceiverTypes.isEmpty()) {
                    int size2 = contextReceiverTypes.size();
                    Intrinsics.checkNotNullParameter(c2552Zc, "<this>");
                    Intrinsics.checkNotNullParameter(builtIns, "builtIns");
                    C1758Ph0 c1758Ph1 = C4194hP1.a.q;
                    if (!c2552Zc.P(c1758Ph1)) {
                        ArrayList annotations3 = CollectionsKt.P(c2552Zc, new C5822ov(builtIns, c1758Ph1, OW0.b(new Pair(C4194hP1.e, new FB0(size2)))));
                        Intrinsics.checkNotNullParameter(annotations3, "annotations");
                        if (!annotations3.isEmpty()) {
                            c2552Zc2 = new C2552Zc(annotations3);
                        }
                        c2552Zc = c2552Zc2;
                    }
                }
                return C5492nL0.b(C1952Ru.p(c2552Zc), fcJ, arrayList);
            }
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                WE.l();
                throw null;
            }
            arrayList.add(C0564Aa.b((AbstractC4649jL0) next));
            i = i2;
        }
    }

    @Nullable
    public static final C5638o21 c(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        String str;
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        InterfaceC1583Nc interfaceC1583NcP = abstractC4649jL0.k().p(C4194hP1.a.r);
        if (interfaceC1583NcP != null) {
            Object objV = CollectionsKt.V(interfaceC1583NcP.j().values());
            C7193vS1 c7193vS1 = objV instanceof C7193vS1 ? (C7193vS1) objV : null;
            if (c7193vS1 != null && (str = (String) c7193vS1.a) != null) {
                if (!C5638o21.l(str)) {
                    str = null;
                }
                if (str != null) {
                    return C5638o21.k(str);
                }
            }
        }
        return null;
    }

    @NotNull
    public static final List<AbstractC4649jL0> d(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        h(abstractC4649jL0);
        int iA = a(abstractC4649jL0);
        if (iA == 0) {
            return C5653o60.d;
        }
        List<N62> listSubList = abstractC4649jL0.T0().subList(0, iA);
        ArrayList arrayList = new ArrayList(XE.m(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((N62) it.next()).getType());
        }
        return arrayList;
    }

    @Nullable
    public static final AbstractC3008bk0 e(@NotNull InterfaceC5044lD interfaceC5044lD) {
        Intrinsics.checkNotNullParameter(interfaceC5044lD, "<this>");
        if (!(interfaceC5044lD instanceof FC) || !RK0.J(interfaceC5044lD)) {
            return null;
        }
        C1836Qh0 c1836Qh0H = C4900kZ.h(interfaceC5044lD);
        if (!c1836Qh0H.d() || c1836Qh0H.a.isEmpty()) {
            return null;
        }
        C3217ck0 c3217ck0 = C3217ck0.c;
        C1758Ph0 packageFqName = c1836Qh0H.g().e();
        Intrinsics.checkNotNullExpressionValue(packageFqName, "parent(...)");
        String className = c1836Qh0H.f().e();
        Intrinsics.checkNotNullExpressionValue(className, "asString(...)");
        c3217ck0.getClass();
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        C3217ck0.a aVarA = c3217ck0.a(packageFqName, className);
        if (aVarA != null) {
            return aVarA.a;
        }
        return null;
    }

    @Nullable
    public static final AbstractC4649jL0 f(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        h(abstractC4649jL0);
        if (abstractC4649jL0.k().p(C4194hP1.a.p) == null) {
            return null;
        }
        return abstractC4649jL0.T0().get(a(abstractC4649jL0)).getType();
    }

    @NotNull
    public static final List<N62> g(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        h(abstractC4649jL0);
        List<N62> listT0 = abstractC4649jL0.T0();
        int iA = a(abstractC4649jL0);
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        return listT0.subList(((!h(abstractC4649jL0) || abstractC4649jL0.k().p(C4194hP1.a.p) == null) ? 0 : 1) + iA, listT0.size() - 1);
    }

    public static final boolean h(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
        if (interfaceC5044lDC == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(interfaceC5044lDC, "<this>");
        AbstractC3008bk0 abstractC3008bk0E = e(interfaceC5044lDC);
        return Intrinsics.a(abstractC3008bk0E, AbstractC3008bk0.a.c) || Intrinsics.a(abstractC3008bk0E, AbstractC3008bk0.d.c);
    }

    public static final boolean i(@NotNull AbstractC4649jL0 abstractC4649jL0) {
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        Intrinsics.checkNotNullParameter(abstractC4649jL0, "<this>");
        InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
        return Intrinsics.a(interfaceC5044lDC != null ? e(interfaceC5044lDC) : null, AbstractC3008bk0.d.c);
    }
}
