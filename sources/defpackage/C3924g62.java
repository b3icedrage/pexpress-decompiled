package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: g62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3924g62 {
    static {
        new C3924g62();
    }

    public C3924g62() {
        C1874Qu reportStrategy = C1874Qu.b;
        Intrinsics.checkNotNullParameter(reportStrategy, "reportStrategy");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static C5655o62 b(P92 p92, C5655o62 c5655o62) {
        C2755ad c2755adA;
        if (C3686f.n(p92)) {
            return p92.U0();
        }
        C5655o62 other = p92.U0();
        c5655o62.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        if (c5655o62.isEmpty() && other.isEmpty()) {
            return c5655o62;
        }
        ArrayList arrayList = new ArrayList();
        Collection<Integer> collectionValues = C5655o62.e.a.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<Integer> it = collectionValues.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            AbstractC5022l62 abstractC5022l62 = (AbstractC5022l62) c5655o62.d.get(iIntValue);
            AbstractC5022l62 abstractC5022l63 = (AbstractC5022l62) other.d.get(iIntValue);
            if (abstractC5022l62 == null) {
                c2755adA = abstractC5022l63 != null ? abstractC5022l63.a(abstractC5022l62) : null;
            } else {
                c2755adA = abstractC5022l62.a(abstractC5022l63);
            }
            UE.b(arrayList, c2755adA);
        }
        return C5655o62.a.a(arrayList);
    }

    public final void a(InterfaceC2396Xc interfaceC2396Xc, InterfaceC2396Xc interfaceC2396Xc2) {
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC1583Nc> it = interfaceC2396Xc.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().c());
        }
        for (InterfaceC1583Nc annotation : interfaceC2396Xc2) {
            if (hashSet.contains(annotation.c())) {
                Intrinsics.checkNotNullParameter(annotation, "annotation");
            }
        }
    }

    public final AbstractC5706oM1 c(C4134h62 c4134h62, C5655o62 c5655o62, boolean z, int i, boolean z2) {
        EnumC3610ed2 enumC3610ed2 = EnumC3610ed2.INVARIANT;
        InterfaceC3714f62 interfaceC3714f62 = c4134h62.b;
        N62 n62D = d(new P62(interfaceC3714f62.n0(), enumC3610ed2), c4134h62, null, i);
        AbstractC4649jL0 type = n62D.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        AbstractC5706oM1 abstractC5706oM1A = V62.a(type);
        if (C3686f.n(abstractC5706oM1A)) {
            return abstractC5706oM1A;
        }
        n62D.b();
        a(abstractC5706oM1A.k(), C2979bd.a(c5655o62));
        if (!C3686f.n(abstractC5706oM1A)) {
            abstractC5706oM1A = V62.d(abstractC5706oM1A, null, b(abstractC5706oM1A, c5655o62), 1);
        }
        AbstractC5706oM1 abstractC5706oM1J = C3089c72.j(abstractC5706oM1A, z);
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1J, "let(...)");
        if (!z2) {
            return abstractC5706oM1J;
        }
        InterfaceC6494s62 interfaceC6494s62P = interfaceC3714f62.p();
        Intrinsics.checkNotNullExpressionValue(interfaceC6494s62P, "getTypeConstructor(...)");
        return C6971uO1.c(abstractC5706oM1J, C5492nL0.d(QY0.b.b, c5655o62, interfaceC6494s62P, c4134h62.c, z));
    }

    public final N62 d(N62 n62, C4134h62 c4134h62, H62 h62, int i) {
        EnumC3610ed2 enumC3610ed2S;
        AbstractC4649jL0 y40;
        EnumC3610ed2 enumC3610ed2;
        EnumC3610ed2 enumC3610ed3;
        InterfaceC3714f62 typeAlias = c4134h62.b;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + typeAlias.getName());
        }
        if (n62.c()) {
            Intrinsics.checkNotNull(h62);
            C4662jP1 c4662jP1K = C3089c72.k(h62);
            Intrinsics.checkNotNullExpressionValue(c4662jP1K, "makeStarProjection(...)");
            return c4662jP1K;
        }
        AbstractC4649jL0 type = n62.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        InterfaceC6494s62 constructor = type.V0();
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        InterfaceC5044lD interfaceC5044lDC = constructor.c();
        N62 n63 = interfaceC5044lDC instanceof H62 ? c4134h62.d.get(interfaceC5044lDC) : null;
        if (n63 != null) {
            if (n63.c()) {
                Intrinsics.checkNotNull(h62);
                C4662jP1 c4662jP1K2 = C3089c72.k(h62);
                Intrinsics.checkNotNullExpressionValue(c4662jP1K2, "makeStarProjection(...)");
                return c4662jP1K2;
            }
            P92 substitutedArgument = n63.getType().Y0();
            EnumC3610ed2 enumC3610ed2B = n63.b();
            Intrinsics.checkNotNullExpressionValue(enumC3610ed2B, "getProjectionKind(...)");
            EnumC3610ed2 enumC3610ed2B2 = n62.b();
            Intrinsics.checkNotNullExpressionValue(enumC3610ed2B2, "getProjectionKind(...)");
            if (enumC3610ed2B2 != enumC3610ed2B && enumC3610ed2B2 != (enumC3610ed3 = EnumC3610ed2.INVARIANT)) {
                if (enumC3610ed2B == enumC3610ed3) {
                    enumC3610ed2B = enumC3610ed2B2;
                } else {
                    Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
                    Intrinsics.checkNotNullParameter(substitutedArgument, "substitutedArgument");
                }
            }
            if (h62 == null || (enumC3610ed2S = h62.S()) == null) {
                enumC3610ed2S = EnumC3610ed2.INVARIANT;
            }
            if (enumC3610ed2S != enumC3610ed2B && enumC3610ed2S != (enumC3610ed2 = EnumC3610ed2.INVARIANT)) {
                if (enumC3610ed2B == enumC3610ed2) {
                    enumC3610ed2B = enumC3610ed2;
                } else {
                    Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
                    Intrinsics.checkNotNullParameter(substitutedArgument, "substitutedArgument");
                }
            }
            a(type.k(), substitutedArgument.k());
            if (substitutedArgument instanceof Y40) {
                Y40 y41 = (Y40) substitutedArgument;
                C5655o62 newAttributes = b(y41, type.U0());
                Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
                y40 = new Y40(C0564Aa.l(y41.g), newAttributes);
            } else {
                AbstractC5706oM1 abstractC5706oM1J = C3089c72.j(V62.a(substitutedArgument), type.W0());
                Intrinsics.checkNotNullExpressionValue(abstractC5706oM1J, "makeNullableIfNeeded(...)");
                C5655o62 c5655o62U0 = type.U0();
                if (!C3686f.n(abstractC5706oM1J)) {
                    abstractC5706oM1J = V62.d(abstractC5706oM1J, null, b(abstractC5706oM1J, c5655o62U0), 1);
                }
                y40 = abstractC5706oM1J;
            }
            return new P62(y40, enumC3610ed2B);
        }
        P92 p92Y0 = n62.getType().Y0();
        if (!Z40.a(p92Y0)) {
            AbstractC5706oM1 abstractC5706oM1A = V62.a(p92Y0);
            if (!C3686f.n(abstractC5706oM1A)) {
                Intrinsics.checkNotNullParameter(abstractC5706oM1A, "<this>");
                TY predicate = TY.g;
                Intrinsics.checkNotNullParameter(abstractC5706oM1A, "<this>");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                if (C3089c72.c(abstractC5706oM1A, predicate, null)) {
                    InterfaceC6494s62 interfaceC6494s62V0 = abstractC5706oM1A.V0();
                    InterfaceC5044lD interfaceC5044lDC2 = interfaceC6494s62V0.c();
                    interfaceC6494s62V0.b().size();
                    abstractC5706oM1A.T0().size();
                    if (!(interfaceC5044lDC2 instanceof H62)) {
                        int i2 = 0;
                        if (!(interfaceC5044lDC2 instanceof InterfaceC3714f62)) {
                            AbstractC5706oM1 abstractC5706oM1E = e(abstractC5706oM1A, c4134h62, i);
                            Intrinsics.checkNotNullExpressionValue(X62.d(abstractC5706oM1E), "create(...)");
                            for (Object obj : abstractC5706oM1E.T0()) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    WE.l();
                                    throw null;
                                }
                                N62 n64 = (N62) obj;
                                if (!n64.c()) {
                                    AbstractC4649jL0 type2 = n64.getType();
                                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                    Intrinsics.checkNotNullParameter(type2, "<this>");
                                    SY predicate2 = SY.h;
                                    Intrinsics.checkNotNullParameter(type2, "<this>");
                                    Intrinsics.checkNotNullParameter(predicate2, "predicate");
                                    if (!C3089c72.c(type2, predicate2, null)) {
                                        abstractC5706oM1A.T0().get(i2);
                                        abstractC5706oM1A.V0().b().get(i2);
                                    }
                                }
                                i2 = i3;
                            }
                            return new P62(abstractC5706oM1E, n62.b());
                        }
                        InterfaceC3714f62 typeAliasDescriptor = (InterfaceC3714f62) interfaceC5044lDC2;
                        if (c4134h62.a(typeAliasDescriptor)) {
                            Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAlias");
                            return new P62(R70.c(Q70.RECURSIVE_TYPE_ALIAS, typeAliasDescriptor.getName().d), EnumC3610ed2.INVARIANT);
                        }
                        List<N62> listT0 = abstractC5706oM1A.T0();
                        ArrayList arguments = new ArrayList(XE.m(listT0, 10));
                        for (Object obj2 : listT0) {
                            int i4 = i2 + 1;
                            if (i2 < 0) {
                                WE.l();
                                throw null;
                            }
                            arguments.add(d((N62) obj2, c4134h62, interfaceC6494s62V0.b().get(i2), i + 1));
                            i2 = i4;
                        }
                        Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
                        Intrinsics.checkNotNullParameter(arguments, "arguments");
                        List<H62> listB = typeAliasDescriptor.p().b();
                        Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
                        ArrayList arrayList = new ArrayList(XE.m(listB, 10));
                        Iterator<T> it = listB.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((H62) it.next()).U0());
                        }
                        AbstractC5706oM1 abstractC5706oM1C = c(new C4134h62(c4134h62, typeAliasDescriptor, arguments, PW0.j(CollectionsKt.j0(arrayList, arguments))), abstractC5706oM1A.U0(), abstractC5706oM1A.W0(), i + 1, false);
                        AbstractC5706oM1 abstractC5706oM1E2 = e(abstractC5706oM1A, c4134h62, i);
                        if (!Z40.a(abstractC5706oM1C)) {
                            abstractC5706oM1C = C6971uO1.c(abstractC5706oM1C, abstractC5706oM1E2);
                        }
                        return new P62(abstractC5706oM1C, n62.b());
                    }
                }
            }
        }
        return n62;
    }

    public final AbstractC5706oM1 e(AbstractC5706oM1 abstractC5706oM1, C4134h62 c4134h62, int i) {
        InterfaceC6494s62 interfaceC6494s62V0 = abstractC5706oM1.V0();
        List<N62> listT0 = abstractC5706oM1.T0();
        ArrayList arrayList = new ArrayList(XE.m(listT0, 10));
        int i2 = 0;
        for (Object obj : listT0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                WE.l();
                throw null;
            }
            N62 n62 = (N62) obj;
            N62 n62D = d(n62, c4134h62, interfaceC6494s62V0.b().get(i2), i + 1);
            if (!n62D.c()) {
                n62D = new P62(C3089c72.i(n62D.getType(), n62.getType().W0()), n62D.b());
            }
            arrayList.add(n62D);
            i2 = i3;
        }
        return V62.d(abstractC5706oM1, arrayList, null, 2);
    }
}
