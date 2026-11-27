package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class C62 {

    @NotNull
    public static final C62 a = new C62();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final c d;
        public static final C0009a e;
        public static final d g;
        public static final b h;
        public static final /* synthetic */ a[] i;

        /* JADX INFO: renamed from: C62$a$a, reason: collision with other inner class name */
        public static final class C0009a extends a {
            public C0009a() {
                super("ACCEPT_NULL", 1);
            }

            @Override // C62.a
            @NotNull
            public final a b(@NotNull P92 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return a.e(nextType);
            }
        }

        public static final class b extends a {
            public b() {
                super("NOT_NULL", 3);
            }

            @Override // C62.a
            public final a b(P92 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return this;
            }
        }

        public static final class c extends a {
            public c() {
                super("START", 0);
            }

            @Override // C62.a
            @NotNull
            public final a b(@NotNull P92 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return a.e(nextType);
            }
        }

        public static final class d extends a {
            public d() {
                super("UNKNOWN", 2);
            }

            @Override // C62.a
            @NotNull
            public final a b(@NotNull P92 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                a aVarE = a.e(nextType);
                return aVarE == a.e ? this : aVarE;
            }
        }

        static {
            c cVar = new c();
            d = cVar;
            C0009a c0009a = new C0009a();
            e = c0009a;
            d dVar = new d();
            g = dVar;
            b bVar = new b();
            h = bVar;
            a[] aVarArr = {cVar, c0009a, dVar, bVar};
            i = aVarArr;
            C1952Ru.i(aVarArr);
        }

        public a() {
            throw null;
        }

        @NotNull
        public static a e(@NotNull P92 type) {
            Intrinsics.checkNotNullParameter(type, "<this>");
            if (type.W0()) {
                return e;
            }
            boolean z = type instanceof BW;
            b bVar = h;
            if (!z || !(((BW) type).e instanceof XT1)) {
                boolean z2 = type instanceof XT1;
                d dVar = g;
                if (z2) {
                    return dVar;
                }
                Intrinsics.checkNotNullParameter(type, "type");
                if (!O0.a(C4156hD.a(false, null, null, 24), C6621sj.m(type), C6075q62.c.b.a)) {
                    return dVar;
                }
            }
            return bVar;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i.clone();
        }

        @NotNull
        public abstract a b(@NotNull P92 p92);
    }

    public static ArrayList a(AbstractCollection abstractCollection, Function2 function2) {
        ArrayList<AbstractC5706oM1> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            AbstractC5706oM1 abstractC5706oM1 = (AbstractC5706oM1) it.next();
            if (!arrayList.isEmpty()) {
                for (AbstractC5706oM1 abstractC5706oM2 : arrayList) {
                    if (abstractC5706oM2 != abstractC5706oM1) {
                        Intrinsics.checkNotNull(abstractC5706oM2);
                        Intrinsics.checkNotNull(abstractC5706oM1);
                        if (((Boolean) function2.invoke(abstractC5706oM2, abstractC5706oM1)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [D, Xk, java.lang.Object, o62] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [o62] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v18, types: [oM1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [jL0, java.lang.Object, oM1] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.LinkedHashSet, java.util.Set] */
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
    @NotNull
    public final AbstractC5706oM1 b(@NotNull ArrayList types) {
        AbstractC5706oM1 abstractC5706oM1;
        AbstractC5706oM1 abstractC5706oM1G;
        Intrinsics.checkNotNullParameter(types, "types");
        types.size();
        ArrayList<AbstractC5706oM1> arrayList = new ArrayList();
        Iterator it = types.iterator();
        while (it.hasNext()) {
            AbstractC5706oM1 abstractC5706oM2 = (AbstractC5706oM1) it.next();
            if (abstractC5706oM2.V0() instanceof C4622jC0) {
                Collection<AbstractC4649jL0> collectionA = abstractC5706oM2.V0().a();
                Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
                Collection<AbstractC4649jL0> collection = collectionA;
                ArrayList arrayList2 = new ArrayList(XE.m(collection, 10));
                for (AbstractC4649jL0 abstractC4649jL0 : collection) {
                    Intrinsics.checkNotNull(abstractC4649jL0);
                    AbstractC5706oM1 abstractC5706oM1Q = C6621sj.q(abstractC4649jL0);
                    if (abstractC5706oM2.W0()) {
                        abstractC5706oM1Q = abstractC5706oM1Q.Z0(true);
                    }
                    arrayList2.add(abstractC5706oM1Q);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(abstractC5706oM2);
            }
        }
        a aVarB = a.d;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVarB = aVarB.b((P92) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC5706oM1 abstractC5706oM1Z0 : arrayList) {
            if (aVarB == a.h) {
                if (abstractC5706oM1Z0 instanceof C5226m41) {
                    C5226m41 c5226m41 = (C5226m41) abstractC5706oM1Z0;
                    Intrinsics.checkNotNullParameter(c5226m41, "<this>");
                    abstractC5706oM1Z0 = new C5226m41(c5226m41.e, c5226m41.g, c5226m41.h, c5226m41.i, c5226m41.j, true);
                }
                Intrinsics.checkNotNullParameter(abstractC5706oM1Z0, "<this>");
                AbstractC5706oM1 abstractC5706oM1A = BW.a.a(abstractC5706oM1Z0, false);
                abstractC5706oM1Z0 = (abstractC5706oM1A == null && (abstractC5706oM1A = C6971uO1.b(abstractC5706oM1Z0)) == null) ? abstractC5706oM1Z0.Z0(false) : abstractC5706oM1A;
            }
            linkedHashSet.add(abstractC5706oM1Z0);
        }
        ArrayList arrayList3 = new ArrayList(XE.m(types, 10));
        Iterator it3 = types.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((AbstractC5706oM1) it3.next()).U0());
        }
        Iterator it4 = arrayList3.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it4.next();
        while (it4.hasNext()) {
            C5655o62 other = (C5655o62) it4.next();
            next = (C5655o62) next;
            next.getClass();
            Intrinsics.checkNotNullParameter(other, "other");
            if (!next.isEmpty() || !other.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                Collection<Integer> collectionValues = C5655o62.e.a.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                Iterator<Integer> it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = it5.next().intValue();
                    AbstractC5022l62 abstractC5022l62 = (AbstractC5022l62) next.d.get(iIntValue);
                    AbstractC5022l62 abstractC5022l63 = (AbstractC5022l62) other.d.get(iIntValue);
                    UE.b(arrayList4, abstractC5022l62 == null ? abstractC5022l63 != null ? abstractC5022l63.c(abstractC5022l62) : null : abstractC5022l62.c(abstractC5022l63));
                }
                next = C5655o62.a.a(arrayList4);
            }
        }
        C5655o62 c5655o62 = (C5655o62) next;
        if (linkedHashSet.size() == 1) {
            abstractC5706oM1G = (AbstractC5706oM1) CollectionsKt.T(linkedHashSet);
        } else {
            ArrayList types2 = a(linkedHashSet, new D62(2, this));
            types2.isEmpty();
            Intrinsics.checkNotNullParameter(types2, "types");
            JB0[] jb0Arr = JB0.d;
            if (types2.isEmpty()) {
                abstractC5706oM1 = null;
            } else {
                Iterator it6 = types2.iterator();
                if (!it6.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                ?? next2 = it6.next();
                while (it6.hasNext()) {
                    AbstractC5706oM1 abstractC5706oM3 = (AbstractC5706oM1) it6.next();
                    next2 = (AbstractC5706oM1) next2;
                    if (next2 != 0 && abstractC5706oM3 != null) {
                        InterfaceC6494s62 interfaceC6494s62V0 = next2.V0();
                        InterfaceC6494s62 interfaceC6494s62V1 = abstractC5706oM3.V0();
                        boolean z = interfaceC6494s62V0 instanceof KB0;
                        if (z && (interfaceC6494s62V1 instanceof KB0)) {
                            LinkedHashSet linkedHashSet2 = ((KB0) interfaceC6494s62V0).a;
                            LinkedHashSet other2 = ((KB0) interfaceC6494s62V1).a;
                            Intrinsics.checkNotNullParameter(linkedHashSet2, "<this>");
                            Intrinsics.checkNotNullParameter(other2, "other");
                            LinkedHashSet linkedHashSetG0 = CollectionsKt.g0(linkedHashSet2);
                            C2904bF.o(linkedHashSetG0, other2);
                            KB0 constructor = new KB0(linkedHashSetG0);
                            C5655o62.e.getClass();
                            C5655o62 attributes = C5655o62.g;
                            Intrinsics.checkNotNullParameter(attributes, "attributes");
                            Intrinsics.checkNotNullParameter(constructor, "constructor");
                            next2 = C5492nL0.d(R70.a(K70.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), attributes, constructor, C5653o60.d, false);
                        } else if (z) {
                            if (!((KB0) interfaceC6494s62V0).a.contains(abstractC5706oM3)) {
                                abstractC5706oM3 = null;
                            }
                            next2 = abstractC5706oM3;
                        } else if (!(interfaceC6494s62V1 instanceof KB0) || !((KB0) interfaceC6494s62V1).a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                abstractC5706oM1 = (AbstractC5706oM1) next2;
            }
            if (abstractC5706oM1 != null) {
                abstractC5706oM1G = abstractC5706oM1;
            } else {
                InterfaceC6905u41.b.getClass();
                ArrayList arrayListA = a(types2, new E62(2, InterfaceC6905u41.a.b));
                arrayListA.isEmpty();
                abstractC5706oM1G = arrayListA.size() < 2 ? (AbstractC5706oM1) CollectionsKt.T(arrayListA) : new C4622jC0(linkedHashSet).g();
            }
        }
        return abstractC5706oM1G.b1(c5655o62);
    }
}
