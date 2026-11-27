package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: oI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5693oI0 implements InterfaceC5240m8, InterfaceC4033ge1 {
    public static final /* synthetic */ IJ0<Object>[] h;

    @NotNull
    public final T01 a;

    @NotNull
    public final I51 b;

    @NotNull
    public final AbstractC5706oM1 c;

    @NotNull
    public final I51 d;

    @NotNull
    public final InterfaceC5618nx<C1758Ph0, FC> e;

    @NotNull
    public final I51 f;

    @NotNull
    public final UY0<Pair<String, String>, InterfaceC2396Xc> g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oI0$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final /* synthetic */ a[] j;

        static {
            a aVar = new a("HIDDEN", 0);
            d = aVar;
            a aVar2 = new a("VISIBLE", 1);
            e = aVar2;
            a aVar3 = new a("DEPRECATED_LIST_METHODS", 2);
            g = aVar3;
            a aVar4 = new a("NOT_CONSIDERED", 3);
            h = aVar4;
            a aVar5 = new a("DROP", 4);
            i = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            j = aVarArr;
            C1952Ru.i(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) j.clone();
        }
    }

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        h = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(C5693oI0.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(C5693oI0.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(C5693oI0.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public C5693oI0(@NotNull T01 moduleDescriptor, @NotNull C2720aS0 storageManager, @NotNull C4850kI0 settingsComputation) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(settingsComputation, "settingsComputation");
        this.a = moduleDescriptor;
        this.b = new C2720aS0.h(storageManager, settingsComputation);
        IC ic = new IC(new C5903pI0(moduleDescriptor, new C1758Ph0("java.io")), C5638o21.k("Serializable"), C01.i, SC.e, VE.c(new C4661jP0(storageManager, new C7843yZ(this, 1))), storageManager);
        ic.T0(QY0.b.b, C6702t60.d, null);
        AbstractC5706oM1 abstractC5706oM1Y = ic.y();
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Y, "getDefaultType(...)");
        this.c = abstractC5706oM1Y;
        this.d = new C2720aS0.h(storageManager, new C5273mI0(this, storageManager));
        this.e = storageManager.d();
        this.f = new C2720aS0.h(storageManager, new C7633xZ(this, 1));
        this.g = storageManager.e(new BH(this, 1));
    }

    @Override // defpackage.InterfaceC4033ge1
    public final boolean a(@NotNull FC classDescriptor, @NotNull C3059c00 functionDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        C7180vO0 c7180vO0F = f(classDescriptor);
        if (c7180vO0F == null || !functionDescriptor.k().P(C4243he1.a)) {
            return true;
        }
        g().getClass();
        String strA = C3689f01.a(functionDescriptor, 3);
        FO0 fo0T0 = c7180vO0F.T0();
        C5638o21 name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Collection<InterfaceC3765fM1> collectionD = fo0T0.d(name, S41.d);
        if ((collectionD instanceof Collection) && collectionD.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionD.iterator();
        while (it.hasNext()) {
            if (Intrinsics.a(C3689f01.a((InterfaceC3765fM1) it.next(), 3), strA)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC5240m8
    @NotNull
    public final Collection<AbstractC4649jL0> b(@NotNull FC classDescriptor) {
        boolean zIsAssignableFrom = false;
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        C1836Qh0 fqName = C4900kZ.h(classDescriptor);
        LinkedHashSet linkedHashSet = C6742tI0.a;
        boolean zA = C6742tI0.a(fqName);
        AbstractC5706oM1 abstractC5706oM1 = this.c;
        if (zA) {
            return WE.f((AbstractC5706oM1) Nm2.f(this.d, h[1]), abstractC5706oM1);
        }
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (C6742tI0.a(fqName)) {
            zIsAssignableFrom = true;
        } else {
            String str = RE0.a;
            QC qcF = RE0.f(fqName);
            if (qcF != null) {
                try {
                    zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(qcF.a().b()));
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return zIsAssignableFrom ? VE.c(abstractC5706oM1) : C5653o60.d;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x030e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0345  */
    /* JADX WARN: Code duplicated, block: B:106:0x0348  */
    /* JADX WARN: Code duplicated, block: B:111:0x035f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0364  */
    /* JADX WARN: Code duplicated, block: B:125:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0221  */
    /* JADX WARN: Code duplicated, block: B:75:0x0223  */
    /* JADX WARN: Code duplicated, block: B:77:0x023d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0240  */
    /* JADX WARN: Code duplicated, block: B:85:0x025a  */
    /* JADX WARN: Code duplicated, block: B:87:0x02be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x02c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x02c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:92:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:98:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:99:0x0306  */
    @Override // defpackage.InterfaceC5240m8
    @NotNull
    public final Collection<InterfaceC3765fM1> c(@NotNull C5638o21 name, @NotNull FC mutable) throws Throwable {
        Iterable iterableB;
        InterfaceC3765fM1 interfaceC3765fM1;
        Iterable<InterfaceC3765fM1> iterable;
        InterfaceC3765fM1 interfaceC3765fM2;
        InterfaceC4675jU interfaceC4675jUE;
        boolean zBooleanValue;
        boolean z;
        ArrayList arrayList;
        InterfaceC2076Tj0.a<? extends InterfaceC2076Tj0> aVarK0;
        int iOrdinal;
        boolean z2;
        InterfaceC3765fM1 interfaceC3765fM3;
        C5638o21 name2;
        boolean zA;
        UY0<Pair<String, String>, InterfaceC2396Xc> uy0;
        InterfaceC2396Xc interfaceC2396Xc;
        int i = 0;
        int i2 = 1;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mutable, "classDescriptor");
        boolean zA2 = Intrinsics.a(name, C3739fE.e);
        IJ0<Object>[] ij0Arr = h;
        InterfaceC3765fM1 interfaceC3765fM4 = null;
        if (zA2 && (mutable instanceof FZ)) {
            if (mutable == null) {
                RK0.a(90);
                throw null;
            }
            C5638o21 c5638o21 = RK0.e;
            if (RK0.b(mutable, C4194hP1.a.g) || RK0.r(mutable) != null) {
                FZ fz = (FZ) mutable;
                List<C2575Zj1> list = fz.i.u;
                Intrinsics.checkNotNullExpressionValue(list, "getFunctionList(...)");
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (C6267r21.b(fz.p.b, ((C2575Zj1) it.next()).j).equals(C3739fE.e)) {
                            return C5653o60.d;
                        }
                    }
                }
                InterfaceC2076Tj0.a<? extends InterfaceC2076Tj0> aVarK1 = ((InterfaceC3765fM1) CollectionsKt.T(((AbstractC5706oM1) Nm2.f(this.d, ij0Arr[1])).v().d(name, S41.d))).K0();
                aVarK1.d(fz);
                aVarK1.c(C5323mZ.e);
                aVarK1.n(fz.y());
                aVarK1.f(fz.S0());
                InterfaceC2076Tj0 interfaceC2076Tj0Build = aVarK1.build();
                Intrinsics.checkNotNull(interfaceC2076Tj0Build);
                return VE.c((InterfaceC3765fM1) interfaceC2076Tj0Build);
            }
        }
        g().getClass();
        C7180vO0 c7180vO0F = f(mutable);
        if (c7180vO0F != null) {
            C1758Ph0 fqName = C4900kZ.g(c7180vO0F);
            C0646Bb0 builtIns = C0646Bb0.f;
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(builtIns, "builtIns");
            FC fcD = C6772tS0.d(fqName, builtIns);
            if (fcD == null) {
                iterableB = C6702t60.d;
            } else {
                String str = RE0.a;
                C1758Ph0 c1758Ph0 = RE0.k.get(C4900kZ.h(fcD));
                iterableB = c1758Ph0 == null ? C5487nJ1.b(fcD) : WE.f(fcD, builtIns.i(c1758Ph0));
            }
            Iterable iterable2 = iterableB;
            FC fc = (FC) CollectionsKt.M(iterable2);
            if (fc == null) {
                iterable = C5653o60.d;
            } else {
                int i3 = C3768fN1.g;
                ArrayList set = new ArrayList(XE.m(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    set.add(C4900kZ.g((FC) it2.next()));
                }
                Intrinsics.checkNotNullParameter(set, "set");
                C3768fN1 c3768fN1 = new C3768fN1();
                c3768fN1.addAll(set);
                Intrinsics.checkNotNullParameter(mutable, "mutable");
                String str2 = RE0.a;
                boolean zContainsKey = RE0.j.containsKey(C4432iZ.g(mutable));
                C1758Ph0 c1758Ph0G = C4900kZ.g(c7180vO0F);
                C5483nI0 c5483nI0 = new C5483nI0(i, c7180vO0F, fc);
                C2720aS0.b bVar = (C2720aS0.b) this.e;
                bVar.getClass();
                Object objInvoke = bVar.invoke(new C2720aS0.e(c1758Ph0G, c5483nI0));
                if (objInvoke == null) {
                    C2720aS0.b.a(3);
                    throw null;
                }
                QY0 it3 = ((FC) objInvoke).L0();
                Intrinsics.checkNotNullExpressionValue(it3, "getUnsubstitutedMemberScope(...)");
                Intrinsics.checkNotNullParameter(it3, "it");
                Collection<? extends InterfaceC3765fM1> collectionD = it3.d(name, S41.d);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionD) {
                    InterfaceC3765fM1 interfaceC3765fM5 = (InterfaceC3765fM1) obj;
                    if (interfaceC3765fM5.h() == InterfaceC1490Lx.a.d && interfaceC3765fM5.d().a().b && !RK0.C(interfaceC3765fM5)) {
                        Collection<? extends InterfaceC1490Lx> collectionU = interfaceC3765fM5.u();
                        Intrinsics.checkNotNullExpressionValue(collectionU, "getOverriddenDescriptors(...)");
                        Collection<? extends InterfaceC1490Lx> collection = collectionU;
                        if ((collection instanceof Collection) && collection.isEmpty()) {
                            interfaceC3765fM2 = interfaceC3765fM4;
                            interfaceC4675jUE = interfaceC3765fM5.e();
                            Intrinsics.c(interfaceC4675jUE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            if (C6742tI0.e.contains(Nm2.h((FC) interfaceC4675jUE, C3689f01.a(interfaceC3765fM5, 3))) ^ zContainsKey) {
                                zBooleanValue = true;
                            } else {
                                Boolean boolD = C2943bS.d(VE.c(interfaceC3765fM5), MP0.e, new DC(this, i2));
                                Intrinsics.checkNotNullExpressionValue(boolD, "ifAny(...)");
                                zBooleanValue = boolD.booleanValue();
                            }
                            if (zBooleanValue) {
                            }
                        } else {
                            Iterator<T> it4 = collection.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    InterfaceC4675jU interfaceC4675jUE2 = ((InterfaceC2076Tj0) it4.next()).e();
                                    interfaceC3765fM2 = interfaceC3765fM4;
                                    Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE2, "getContainingDeclaration(...)");
                                    if (!c3768fN1.contains(C4900kZ.g(interfaceC4675jUE2))) {
                                        interfaceC3765fM4 = interfaceC3765fM2;
                                    }
                                } else {
                                    interfaceC3765fM2 = interfaceC3765fM4;
                                    interfaceC4675jUE = interfaceC3765fM5.e();
                                    Intrinsics.c(interfaceC4675jUE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                    if (C6742tI0.e.contains(Nm2.h((FC) interfaceC4675jUE, C3689f01.a(interfaceC3765fM5, 3))) ^ zContainsKey) {
                                        zBooleanValue = true;
                                    } else {
                                        Boolean boolD2 = C2943bS.d(VE.c(interfaceC3765fM5), MP0.e, new DC(this, i2));
                                        Intrinsics.checkNotNullExpressionValue(boolD2, "ifAny(...)");
                                        zBooleanValue = boolD2.booleanValue();
                                    }
                                    z = zBooleanValue ? false : true;
                                }
                            }
                        }
                        if (z) {
                            arrayList2.add(obj);
                        }
                        interfaceC3765fM4 = interfaceC3765fM2;
                    } else {
                        interfaceC3765fM2 = interfaceC3765fM4;
                    }
                    if (z) {
                        arrayList2.add(obj);
                    }
                    interfaceC3765fM4 = interfaceC3765fM2;
                }
                interfaceC3765fM1 = interfaceC3765fM4;
                iterable = arrayList2;
            }
            arrayList = new ArrayList();
            for (InterfaceC3765fM1 interfaceC3765fM6 : iterable) {
                InterfaceC4675jU interfaceC4675jUE3 = interfaceC3765fM6.e();
                Intrinsics.c(interfaceC4675jUE3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                InterfaceC2076Tj0 interfaceC2076Tj0B = interfaceC3765fM6.b(MW0.a((FC) interfaceC4675jUE3, mutable).c());
                Intrinsics.c(interfaceC2076Tj0B, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
                aVarK0 = ((InterfaceC3765fM1) interfaceC2076Tj0B).K0();
                aVarK0.d(mutable);
                aVarK0.f(mutable.S0());
                aVarK0.e();
                InterfaceC4675jU interfaceC4675jUE4 = interfaceC3765fM6.e();
                Intrinsics.c(interfaceC4675jUE4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Object objB = C2943bS.b(VE.c((FC) interfaceC4675jUE4), new YK(this), new C6113qI0(C3689f01.a(interfaceC3765fM6, 3), new C3027bp1()));
                Intrinsics.checkNotNullExpressionValue(objB, "dfs(...)");
                iOrdinal = ((a) objB).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        Unit unit = Unit.a;
                    } else if (iOrdinal != 2) {
                        name2 = interfaceC3765fM6.getName();
                        zA = Intrinsics.a(name2, C6322rI0.a);
                        uy0 = this.g;
                        if (zA) {
                            interfaceC2396Xc = (InterfaceC2396Xc) ((C2720aS0.k) uy0).invoke(new Pair(interfaceC3765fM6.getName().e(), "first"));
                        } else {
                            if (Intrinsics.a(name2, C6322rI0.b)) {
                                throw new IllegalStateException(("Unexpected name: " + interfaceC3765fM6.getName()).toString());
                            }
                            interfaceC2396Xc = (InterfaceC2396Xc) ((C2720aS0.k) uy0).invoke(new Pair(interfaceC3765fM6.getName().e(), "last"));
                        }
                        aVarK0.j(interfaceC2396Xc);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new C6489s51();
                        }
                        interfaceC3765fM3 = interfaceC3765fM1;
                    } else {
                        aVarK0.j((InterfaceC2396Xc) Nm2.f(this.f, ij0Arr[2]));
                    }
                    InterfaceC2076Tj0 interfaceC2076Tj0Build2 = aVarK0.build();
                    Intrinsics.checkNotNull(interfaceC2076Tj0Build2);
                    interfaceC3765fM3 = (InterfaceC3765fM1) interfaceC2076Tj0Build2;
                } else {
                    Intrinsics.checkNotNullParameter(mutable, "<this>");
                    if (mutable.q() == C01.e || mutable.h() == SC.g) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        interfaceC3765fM3 = interfaceC3765fM1;
                    } else {
                        aVarK0.i();
                        InterfaceC2076Tj0 interfaceC2076Tj0Build3 = aVarK0.build();
                        Intrinsics.checkNotNull(interfaceC2076Tj0Build3);
                        interfaceC3765fM3 = (InterfaceC3765fM1) interfaceC2076Tj0Build3;
                    }
                }
                if (interfaceC3765fM3 != null) {
                    arrayList.add(interfaceC3765fM3);
                }
            }
            return arrayList;
        }
        iterable = C5653o60.d;
        interfaceC3765fM1 = null;
        arrayList = new ArrayList();
        while (r1.hasNext()) {
            InterfaceC4675jU interfaceC4675jUE5 = interfaceC3765fM6.e();
            Intrinsics.c(interfaceC4675jUE5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC2076Tj0 interfaceC2076Tj0B2 = interfaceC3765fM6.b(MW0.a((FC) interfaceC4675jUE5, mutable).c());
            Intrinsics.c(interfaceC2076Tj0B2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            aVarK0 = ((InterfaceC3765fM1) interfaceC2076Tj0B2).K0();
            aVarK0.d(mutable);
            aVarK0.f(mutable.S0());
            aVarK0.e();
            InterfaceC4675jU interfaceC4675jUE6 = interfaceC3765fM6.e();
            Intrinsics.c(interfaceC4675jUE6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Object objB2 = C2943bS.b(VE.c((FC) interfaceC4675jUE6), new YK(this), new C6113qI0(C3689f01.a(interfaceC3765fM6, 3), new C3027bp1()));
            Intrinsics.checkNotNullExpressionValue(objB2, "dfs(...)");
            iOrdinal = ((a) objB2).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    Unit unit2 = Unit.a;
                } else if (iOrdinal != 2) {
                    name2 = interfaceC3765fM6.getName();
                    zA = Intrinsics.a(name2, C6322rI0.a);
                    uy0 = this.g;
                    if (zA) {
                        interfaceC2396Xc = (InterfaceC2396Xc) ((C2720aS0.k) uy0).invoke(new Pair(interfaceC3765fM6.getName().e(), "first"));
                    } else {
                        if (Intrinsics.a(name2, C6322rI0.b)) {
                            throw new IllegalStateException(("Unexpected name: " + interfaceC3765fM6.getName()).toString());
                        }
                        interfaceC2396Xc = (InterfaceC2396Xc) ((C2720aS0.k) uy0).invoke(new Pair(interfaceC3765fM6.getName().e(), "last"));
                    }
                    aVarK0.j(interfaceC2396Xc);
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new C6489s51();
                    }
                    interfaceC3765fM3 = interfaceC3765fM1;
                } else {
                    aVarK0.j((InterfaceC2396Xc) Nm2.f(this.f, ij0Arr[2]));
                }
                InterfaceC2076Tj0 interfaceC2076Tj0Build4 = aVarK0.build();
                Intrinsics.checkNotNull(interfaceC2076Tj0Build4);
                interfaceC3765fM3 = (InterfaceC3765fM1) interfaceC2076Tj0Build4;
            } else {
                Intrinsics.checkNotNullParameter(mutable, "<this>");
                if (mutable.q() == C01.e) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    interfaceC3765fM3 = interfaceC3765fM1;
                } else {
                    aVarK0.i();
                    InterfaceC2076Tj0 interfaceC2076Tj0Build5 = aVarK0.build();
                    Intrinsics.checkNotNull(interfaceC2076Tj0Build5);
                    interfaceC3765fM3 = (InterfaceC3765fM1) interfaceC2076Tj0Build5;
                }
            }
            if (interfaceC3765fM3 != null) {
                arrayList.add(interfaceC3765fM3);
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC5240m8
    public final Collection d(FC classDescriptor) {
        Set<C5638o21> setA;
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        g().getClass();
        C7180vO0 c7180vO0F = f(classDescriptor);
        return (c7180vO0F == null || (setA = c7180vO0F.T0().a()) == null) ? C6702t60.d : setA;
    }

    @Override // defpackage.InterfaceC5240m8
    @NotNull
    public final Collection<InterfaceC7984zC> e(@NotNull FC classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (classDescriptor.h() != SC.d) {
            return C5653o60.d;
        }
        g().getClass();
        C7180vO0 c7180vO0F = f(classDescriptor);
        if (c7180vO0F == null) {
            return C5653o60.d;
        }
        FC fcD = C6772tS0.d(C4900kZ.g(c7180vO0F), C0646Bb0.f);
        if (fcD == null) {
            return C5653o60.d;
        }
        X62 x62C = MW0.a(fcD, c7180vO0F).c();
        List<InterfaceC7984zC> listInvoke = c7180vO0F.u.q.invoke();
        ArrayList<InterfaceC7984zC> arrayList = new ArrayList();
        for (Object obj : listInvoke) {
            InterfaceC7984zC interfaceC7984zC = (InterfaceC7984zC) obj;
            if (interfaceC7984zC.d().a().b) {
                Collection<InterfaceC7984zC> collectionR = fcD.r();
                Intrinsics.checkNotNullExpressionValue(collectionR, "getConstructors(...)");
                Collection<InterfaceC7984zC> collection = collectionR;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceC7984zC interfaceC7984zC2 = (InterfaceC7984zC) it.next();
                            Intrinsics.checkNotNull(interfaceC7984zC2);
                            if (C1346Ka1.j(interfaceC7984zC2, interfaceC7984zC.b(x62C)) == C1346Ka1.b.a.d) {
                            }
                        }
                    }
                }
                if (interfaceC7984zC.j().size() == 1) {
                    List<Xc2> listJ = interfaceC7984zC.j();
                    Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                    InterfaceC5044lD interfaceC5044lDC = ((Xc2) CollectionsKt.U(listJ)).getType().V0().c();
                    if (Intrinsics.a(interfaceC5044lDC != null ? C4900kZ.h(interfaceC5044lDC) : null, C4900kZ.h(classDescriptor))) {
                    }
                }
                if (!RK0.C(interfaceC7984zC) && !C6742tI0.f.contains(Nm2.h(c7180vO0F, C3689f01.a(interfaceC7984zC, 3)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        for (InterfaceC7984zC interfaceC7984zC3 : arrayList) {
            InterfaceC2076Tj0.a<? extends InterfaceC2076Tj0> aVarK0 = interfaceC7984zC3.K0();
            aVarK0.d(classDescriptor);
            aVarK0.n(classDescriptor.y());
            aVarK0.e();
            aVarK0.g(x62C.g());
            if (!C6742tI0.g.contains(Nm2.h(c7180vO0F, C3689f01.a(interfaceC7984zC3, 3)))) {
                aVarK0.j((InterfaceC2396Xc) Nm2.f(this.f, h[2]));
            }
            InterfaceC2076Tj0 interfaceC2076Tj0Build = aVarK0.build();
            Intrinsics.c(interfaceC2076Tj0Build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((InterfaceC7984zC) interfaceC2076Tj0Build);
        }
        return arrayList2;
    }

    public final C7180vO0 f(FC fc) {
        C1758Ph0 c1758Ph0A;
        if (fc == null) {
            RK0.a(109);
            throw null;
        }
        C5638o21 c5638o21 = RK0.e;
        if (!RK0.b(fc, C4194hP1.a.a) && RK0.J(fc)) {
            C1836Qh0 c1836Qh0H = C4900kZ.h(fc);
            if (c1836Qh0H.d()) {
                String str = RE0.a;
                QC qcF = RE0.f(c1836Qh0H);
                if (qcF != null && (c1758Ph0A = qcF.a()) != null) {
                    T01 t01 = g().a;
                    S41 s41 = S41.d;
                    FC fcV = C0957Fb.v(t01, c1758Ph0A);
                    if (fcV instanceof C7180vO0) {
                        return (C7180vO0) fcV;
                    }
                }
            }
        }
        return null;
    }

    public final C5060lI0.b g() {
        return (C5060lI0.b) Nm2.f(this.b, h[0]);
    }
}
