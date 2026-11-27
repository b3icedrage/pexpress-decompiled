package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class FZ extends V implements InterfaceC4675jU {

    @NotNull
    public final AbstractC6208qk1.a A;

    @NotNull
    public final InterfaceC2396Xc B;

    @NotNull
    public final C2077Tj1 i;

    @NotNull
    public final AbstractC5393ms j;

    @NotNull
    public final VN1 k;

    @NotNull
    public final QC l;

    @NotNull
    public final C01 m;

    @NotNull
    public final QW n;

    @NotNull
    public final SC o;

    @NotNull
    public final C6582sZ p;

    @NotNull
    public final RY0 q;

    @NotNull
    public final b r;

    @NotNull
    public final TD1<a> s;

    @Nullable
    public final c t;

    @NotNull
    public final InterfaceC4675jU u;

    @NotNull
    public final InterfaceC5868p71<InterfaceC7984zC> v;

    @NotNull
    public final I51<Collection<InterfaceC7984zC>> w;

    @NotNull
    public final InterfaceC5868p71<FC> x;

    @NotNull
    public final I51<Collection<FC>> y;

    @NotNull
    public final InterfaceC5868p71<Rc2<AbstractC5706oM1>> z;

    public final class a extends SZ {

        @NotNull
        public final AbstractC6331rL0 g;

        @NotNull
        public final I51<Collection<InterfaceC4675jU>> h;

        @NotNull
        public final I51<Collection<AbstractC4649jL0>> i;
        public final /* synthetic */ FZ j;

        public a(@NotNull FZ fz, AbstractC6331rL0 kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.j = fz;
            C6582sZ c6582sZ = fz.p;
            C2077Tj1 c2077Tj1 = fz.i;
            List<C2575Zj1> list = c2077Tj1.u;
            Intrinsics.checkNotNullExpressionValue(list, "getFunctionList(...)");
            List<C3637ek1> list2 = c2077Tj1.v;
            Intrinsics.checkNotNullExpressionValue(list2, "getPropertyList(...)");
            List<C4476ik1> list3 = c2077Tj1.w;
            Intrinsics.checkNotNullExpressionValue(list3, "getTypeAliasList(...)");
            List<Integer> list4 = c2077Tj1.o;
            Intrinsics.checkNotNullExpressionValue(list4, "getNestedClassNameList(...)");
            InterfaceC5848p21 interfaceC5848p21 = fz.p.b;
            ArrayList arrayList = new ArrayList(XE.m(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(C6267r21.b(interfaceC5848p21, ((Number) it.next()).intValue()));
            }
            super(c6582sZ, list, list2, list3, new CZ(0, arrayList));
            this.g = kotlinTypeRefiner;
            C2720aS0 c2720aS0 = this.b.a.a;
            C7522x1 c7522x1 = new C7522x1(this, 1);
            c2720aS0.getClass();
            this.h = new C2720aS0.h(c2720aS0, c7522x1);
            C2720aS0 c2720aS1 = this.b.a.a;
            DZ dz = new DZ(this, 0);
            c2720aS1.getClass();
            this.i = new C2720aS0.h(c2720aS1, dz);
        }

        @Override // defpackage.SZ, defpackage.RY0, defpackage.QY0
        @NotNull
        public final Collection b(@NotNull C5638o21 name, @NotNull S41 location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            s(name, location);
            return super.b(name, location);
        }

        @Override // defpackage.SZ, defpackage.RY0, defpackage.QY0
        @NotNull
        public final Collection<InterfaceC3765fM1> d(@NotNull C5638o21 name, @NotNull JT0 location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            s(name, location);
            return super.d(name, location);
        }

        @Override // defpackage.RY0, defpackage.InterfaceC2602Zs1
        @NotNull
        public final Collection<InterfaceC4675jU> e(@NotNull LY kindFilter, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            return this.h.invoke();
        }

        @Override // defpackage.SZ, defpackage.RY0, defpackage.InterfaceC2602Zs1
        @Nullable
        public final InterfaceC5044lD f(@NotNull C5638o21 name, @NotNull JT0 location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            s(name, location);
            c cVar = this.j.t;
            if (cVar != null) {
                Intrinsics.checkNotNullParameter(name, "name");
                FC fcInvoke = cVar.b.invoke(name);
                if (fcInvoke != null) {
                    return fcInvoke;
                }
            }
            return super.f(name, location);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r1v3, types: [o60] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
        @Override // defpackage.SZ
        public final void h(@NotNull ArrayList result, @NotNull Function1 nameFilter) {
            ?? arrayList;
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            c cVar = this.j.t;
            if (cVar != null) {
                Set<C5638o21> setKeySet = cVar.a.keySet();
                arrayList = new ArrayList();
                for (C5638o21 name : setKeySet) {
                    Intrinsics.checkNotNullParameter(name, "name");
                    FC fcInvoke = cVar.b.invoke(name);
                    if (fcInvoke != null) {
                        arrayList.add(fcInvoke);
                    }
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = C5653o60.d;
            }
            result.addAll(arrayList);
        }

        @Override // defpackage.SZ
        public final void j(@NotNull C5638o21 name, @NotNull ArrayList functions) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(functions, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC4649jL0> it = this.i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().v().d(name, S41.g));
            }
            C6582sZ c6582sZ = this.b;
            functions.addAll(c6582sZ.a.n.c(name, this.j));
            ArrayList arrayList2 = new ArrayList(functions);
            c6582sZ.a.q.a().h(name, arrayList, arrayList2, this.j, new EZ(functions));
        }

        @Override // defpackage.SZ
        public final void k(@NotNull C5638o21 name, @NotNull ArrayList descriptors) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC4649jL0> it = this.i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().v().b(name, S41.g));
            }
            ArrayList arrayList2 = new ArrayList(descriptors);
            this.b.a.q.a().h(name, arrayList, arrayList2, this.j, new EZ(descriptors));
        }

        @Override // defpackage.SZ
        @NotNull
        public final QC l(@NotNull C5638o21 name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.j.l.d(name);
        }

        @Override // defpackage.SZ
        @Nullable
        public final Set<C5638o21> n() {
            List<AbstractC4649jL0> listA = this.j.r.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                Set<C5638o21> setG = ((AbstractC4649jL0) it.next()).v().g();
                if (setG == null) {
                    return null;
                }
                C2904bF.o(linkedHashSet, setG);
            }
            return linkedHashSet;
        }

        @Override // defpackage.SZ
        @NotNull
        public final Set<C5638o21> o() {
            FZ fz = this.j;
            List<AbstractC4649jL0> listA = fz.r.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                C2904bF.o(linkedHashSet, ((AbstractC4649jL0) it.next()).v().a());
            }
            linkedHashSet.addAll(this.b.a.n.d(fz));
            return linkedHashSet;
        }

        @Override // defpackage.SZ
        @NotNull
        public final Set<C5638o21> p() {
            List<AbstractC4649jL0> listA = this.j.r.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                C2904bF.o(linkedHashSet, ((AbstractC4649jL0) it.next()).v().c());
            }
            return linkedHashSet;
        }

        @Override // defpackage.SZ
        public final boolean r(@NotNull C3059c00 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            return this.b.a.o.a(this.j, function);
        }

        public final void s(@NotNull C5638o21 name, @NotNull JT0 location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            C5208m0.m(this.b.a.i, location, this.j, name);
        }
    }

    public final class b extends W {

        @NotNull
        public final I51<List<H62>> c;

        public b() {
            super(FZ.this.p.a.a);
            C2720aS0 c2720aS0 = FZ.this.p.a.a;
            GZ gz = new GZ(FZ.this, 0);
            c2720aS0.getClass();
            this.c = new C2720aS0.h(c2720aS0, gz);
        }

        @Override // defpackage.InterfaceC6494s62
        @NotNull
        public final List<H62> b() {
            return this.c.invoke();
        }

        @Override // defpackage.W, defpackage.InterfaceC6494s62
        public final InterfaceC5044lD c() {
            return FZ.this;
        }

        @Override // defpackage.InterfaceC6494s62
        public final boolean e() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v14 */
        /* JADX WARN: Type inference failed for: r4v15 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable] */
        @Override // defpackage.B1
        @NotNull
        public final Collection<AbstractC4649jL0> h() {
            String strE;
            C1758Ph0 c1758Ph0A;
            FZ fz = FZ.this;
            C2077Tj1 c2077Tj1 = fz.i;
            C6582sZ c6582sZ = fz.p;
            C2656a72 typeTable = c6582sZ.d;
            Intrinsics.checkNotNullParameter(c2077Tj1, "<this>");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            List<C4267hk1> list = c2077Tj1.l;
            boolean zIsEmpty = list.isEmpty();
            ?? arrayList = list;
            if (zIsEmpty) {
                arrayList = 0;
            }
            if (arrayList == 0) {
                List<Integer> list2 = c2077Tj1.m;
                Intrinsics.checkNotNullExpressionValue(list2, "getSupertypeIdList(...)");
                arrayList = new ArrayList(XE.m(list2, 10));
                for (Integer num : list2) {
                    Intrinsics.checkNotNull(num);
                    arrayList.add(typeTable.a(num.intValue()));
                }
            }
            ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(c6582sZ.h.g((C4267hk1) it.next()));
            }
            ArrayList arrayListQ = CollectionsKt.Q(arrayList2, c6582sZ.a.n.b(fz));
            ArrayList<G51.b> arrayList3 = new ArrayList();
            Iterator it2 = arrayListQ.iterator();
            while (it2.hasNext()) {
                InterfaceC5044lD interfaceC5044lDC = ((AbstractC4649jL0) it2.next()).V0().c();
                G51.b bVar = interfaceC5044lDC instanceof G51.b ? (G51.b) interfaceC5044lDC : null;
                if (bVar != null) {
                    arrayList3.add(bVar);
                }
            }
            if (!arrayList3.isEmpty()) {
                G70 g70 = c6582sZ.a.h;
                ArrayList arrayList4 = new ArrayList(XE.m(arrayList3, 10));
                for (G51.b bVar2 : arrayList3) {
                    QC qcF = C4900kZ.f(bVar2);
                    if (qcF == null || (c1758Ph0A = qcF.a()) == null) {
                        strE = bVar2.getName().e();
                        Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
                    } else {
                        strE = c1758Ph0A.b();
                    }
                    arrayList4.add(strE);
                }
                g70.c(fz, arrayList4);
            }
            return CollectionsKt.e0(arrayListQ);
        }

        @Override // defpackage.B1
        @NotNull
        public final InterfaceC3792fV1 k() {
            return InterfaceC3792fV1.a.a;
        }

        @Override // defpackage.W
        /* JADX INFO: renamed from: p */
        public final FC c() {
            return FZ.this;
        }

        @NotNull
        public final String toString() {
            String str = FZ.this.getName().d;
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            return str;
        }
    }

    public final class c {

        @NotNull
        public final LinkedHashMap a;

        @NotNull
        public final VY0<C5638o21, FC> b;

        @NotNull
        public final I51<Set<C5638o21>> c;

        public c() {
            List<C2419Xj1> list = FZ.this.i.x;
            Intrinsics.checkNotNullExpressionValue(list, "getEnumEntryList(...)");
            int iA = OW0.a(XE.m(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
            for (Object obj : list) {
                linkedHashMap.put(C6267r21.b(FZ.this.p.b, ((C2419Xj1) obj).h), obj);
            }
            this.a = linkedHashMap;
            FZ fz = FZ.this;
            this.b = fz.p.a.a.f(new HZ(0, this, fz));
            C2720aS0 c2720aS0 = FZ.this.p.a.a;
            D1 d1 = new D1(this, 1);
            c2720aS0.getClass();
            this.c = new C2720aS0.h(c2720aS0, d1);
        }
    }

    public /* synthetic */ class d extends C2574Zj0 implements Function1<AbstractC6331rL0, a> {
        @Override // defpackage.AbstractC1568Mx, defpackage.JI0
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.functions.Function1
        public final a invoke(AbstractC6331rL0 abstractC6331rL0) {
            AbstractC6331rL0 p0 = abstractC6331rL0;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return new a((FZ) this.e, p0);
        }

        @Override // defpackage.AbstractC1568Mx
        public final InterfaceC5486nJ0 j() {
            return C2017Sp1.a.b(a.class);
        }

        @Override // defpackage.AbstractC1568Mx
        public final String o() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FZ(@NotNull C6582sZ outerContext, @NotNull C2077Tj1 classProto, @NotNull InterfaceC5848p21 nameResolver, @NotNull AbstractC5393ms metadataVersion, @NotNull VN1 sourceElement) {
        SC sc;
        RY0 vp1;
        super(outerContext.a.a, C6267r21.a(nameResolver, classProto.i).f());
        int i = 1;
        int i2 = 0;
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.i = classProto;
        this.j = metadataVersion;
        this.k = sourceElement;
        this.l = C6267r21.a(nameResolver, classProto.i);
        this.m = C7047uk1.a((EnumC3009bk1) C2061Te0.e.c(classProto.h));
        this.n = C7257vk1.a((EnumC5788ok1) C2061Te0.d.c(classProto.h));
        C2077Tj1.c cVar = (C2077Tj1.c) C2061Te0.f.c(classProto.h);
        switch (cVar == null ? -1 : C7047uk1.a.b[cVar.ordinal()]) {
            case 1:
                sc = SC.d;
                break;
            case 2:
                sc = SC.e;
                break;
            case 3:
                sc = SC.g;
                break;
            case 4:
                sc = SC.h;
                break;
            case 5:
                sc = SC.i;
                break;
            case 6:
            case 7:
                sc = SC.j;
                break;
            default:
                sc = SC.d;
                break;
        }
        SC sc2 = sc;
        this.o = sc2;
        List<C4735jk1> list = classProto.k;
        Intrinsics.checkNotNullExpressionValue(list, "getTypeParameterList(...)");
        C4945kk1 c4945kk1 = classProto.I;
        Intrinsics.checkNotNullExpressionValue(c4945kk1, "getTypeTable(...)");
        C2656a72 c2656a72 = new C2656a72(c4945kk1);
        C5761od2 c5761od2 = C5761od2.b;
        C5578nk1 c5578nk1 = classProto.K;
        Intrinsics.checkNotNullExpressionValue(c5578nk1, "getVersionRequirementTable(...)");
        C6582sZ c6582sZA = outerContext.a(this, list, nameResolver, c2656a72, C5761od2.a.a(c5578nk1), metadataVersion);
        this.p = c6582sZA;
        boolean zF = C1742Pc.f(C2061Te0.m, classProto.h, "get(...)");
        SC sc3 = SC.g;
        C6163qZ c6163qZ = c6582sZA.a;
        if (sc2 == sc3) {
            vp1 = new VP1(c6163qZ.a, this, zF || Intrinsics.a(c6163qZ.s.a(), Boolean.TRUE));
        } else {
            vp1 = QY0.b.b;
        }
        this.q = vp1;
        this.r = new b();
        TD1.a aVar = TD1.e;
        C2720aS0 storageManager = c6163qZ.a;
        AbstractC6331rL0 kotlinTypeRefinerForOwnerModule = c6163qZ.q.b();
        d scopeFactory = new d(1, this);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(this, "classDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
        Intrinsics.checkNotNullParameter(scopeFactory, "scopeFactory");
        this.s = new TD1<>(this, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule);
        this.t = sc2 == sc3 ? new c() : null;
        InterfaceC4675jU interfaceC4675jU = outerContext.c;
        this.u = interfaceC4675jU;
        C2720aS0 c2720aS0 = c6163qZ.a;
        C7633xZ c7633xZ = new C7633xZ(this, i2);
        c2720aS0.getClass();
        this.v = new C2720aS0.f(c2720aS0, c7633xZ);
        C5842p1 c5842p1 = new C5842p1(this, i);
        c2720aS0.getClass();
        this.w = new C2720aS0.h(c2720aS0, c5842p1);
        C7843yZ c7843yZ = new C7843yZ(this, i2);
        c2720aS0.getClass();
        this.x = new C2720aS0.f(c2720aS0, c7843yZ);
        C8053zZ c8053zZ = new C8053zZ(this, i2);
        c2720aS0.getClass();
        this.y = new C2720aS0.h(c2720aS0, c8053zZ);
        AZ az = new AZ(this, i2);
        c2720aS0.getClass();
        this.z = new C2720aS0.f(c2720aS0, az);
        FZ fz = interfaceC4675jU instanceof FZ ? (FZ) interfaceC4675jU : null;
        this.A = new AbstractC6208qk1.a(classProto, c6582sZA.b, c6582sZA.d, sourceElement, fz != null ? fz.A : null);
        this.B = !C2061Te0.c.c(classProto.h).booleanValue() ? InterfaceC2396Xc.a.a : new A51(c2720aS0, new BZ(this, i2));
    }

    @Override // defpackage.FC, defpackage.InterfaceC5257mD
    @NotNull
    public final List<H62> A() {
        return this.p.h.b();
    }

    @Override // defpackage.GY0
    public final boolean D() {
        return C1742Pc.f(C2061Te0.i, this.i.h, "get(...)");
    }

    @Override // defpackage.FC
    public final boolean E() {
        return C2061Te0.f.c(this.i.h) == C2077Tj1.c.COMPANION_OBJECT;
    }

    @Override // defpackage.FC
    @Nullable
    public final Rc2<AbstractC5706oM1> F0() {
        return this.z.invoke();
    }

    @Override // defpackage.O01
    @NotNull
    public final QY0 G0(@NotNull AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.s.a(kotlinTypeRefiner);
    }

    @Override // defpackage.FC
    public final boolean I() {
        return C1742Pc.f(C2061Te0.l, this.i.h, "get(...)");
    }

    @Override // defpackage.GY0
    public final boolean M0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable] */
    @Override // defpackage.V, defpackage.FC
    @NotNull
    public final List<InterfaceC1076Go1> O0() {
        C6582sZ c6582sZ = this.p;
        C2656a72 typeTable = c6582sZ.d;
        C2077Tj1 c2077Tj1 = this.i;
        Intrinsics.checkNotNullParameter(c2077Tj1, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<C4267hk1> list = c2077Tj1.q;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> list2 = c2077Tj1.r;
            Intrinsics.checkNotNullExpressionValue(list2, "getContextReceiverTypeIdList(...)");
            arrayList = new ArrayList(XE.m(list2, 10));
            for (Integer num : list2) {
                Intrinsics.checkNotNull(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
        }
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C1154Ho1(S0(), new C6124qM(this, c6582sZ.h.g((C4267hk1) it.next()), null), InterfaceC2396Xc.a.a));
        }
        return arrayList2;
    }

    @Override // defpackage.FC
    @NotNull
    public final Collection<FC> P() {
        return this.y.invoke();
    }

    @Override // defpackage.GY0
    public final boolean Q() {
        return C1742Pc.f(C2061Te0.j, this.i.h, "get(...)");
    }

    @Override // defpackage.FC
    public final boolean Q0() {
        return C1742Pc.f(C2061Te0.h, this.i.h, "get(...)");
    }

    @Override // defpackage.InterfaceC5257mD
    public final boolean R() {
        return C1742Pc.f(C2061Te0.g, this.i.h, "get(...)");
    }

    public final a T0() {
        return (a) this.s.a(this.p.a.q.b());
    }

    public final AbstractC5706oM1 U0(C5638o21 c5638o21) {
        Iterator it = T0().b(c5638o21, S41.k).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((InterfaceC0671Bj1) next).r0() == null) {
                if (!z) {
                    z = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        InterfaceC0671Bj1 interfaceC0671Bj1 = (InterfaceC0671Bj1) obj;
        return (AbstractC5706oM1) (interfaceC0671Bj1 != null ? interfaceC0671Bj1.getType() : null);
    }

    @Override // defpackage.FC
    @Nullable
    public final InterfaceC7984zC X() {
        return this.v.invoke();
    }

    @Override // defpackage.FC
    public final QY0 Y() {
        return this.q;
    }

    @Override // defpackage.FC
    @Nullable
    public final FC a0() {
        return this.x.invoke();
    }

    @Override // defpackage.FC, defpackage.GY0
    @NotNull
    public final AbstractC5533nZ d() {
        return this.n;
    }

    @Override // defpackage.InterfaceC4675jU
    @NotNull
    public final InterfaceC4675jU e() {
        return this.u;
    }

    @Override // defpackage.FC
    @NotNull
    public final SC h() {
        return this.o;
    }

    @Override // defpackage.InterfaceC5728oU
    @NotNull
    public final VN1 i() {
        return this.k;
    }

    @Override // defpackage.InterfaceC0726Cc
    @NotNull
    public final InterfaceC2396Xc k() {
        return this.B;
    }

    @Override // defpackage.FC
    public final boolean m() {
        if (!C2061Te0.k.c(this.i.h).booleanValue()) {
            return false;
        }
        AbstractC5393ms abstractC5393ms = this.j;
        int i = abstractC5393ms.b;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = abstractC5393ms.c;
            if (i2 >= 4 && (i2 > 4 || abstractC5393ms.d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC5044lD
    @NotNull
    public final InterfaceC6494s62 p() {
        return this.r;
    }

    @Override // defpackage.FC, defpackage.GY0
    @NotNull
    public final C01 q() {
        return this.m;
    }

    @Override // defpackage.FC
    @NotNull
    public final Collection<InterfaceC7984zC> r() {
        return this.w.invoke();
    }

    @Override // defpackage.FC
    public final boolean s() {
        return C2061Te0.k.c(this.i.h).booleanValue() && this.j.a(1, 4, 2);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(Q() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }
}
