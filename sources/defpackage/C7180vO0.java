package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7180vO0 extends GC implements InterfaceC3530eE0 {

    @NotNull
    public final LO0 k;

    @NotNull
    public final InterfaceC2902bE0 l;

    @Nullable
    public final FC m;

    @NotNull
    public final LO0 n;

    @NotNull
    public final KW1 o;

    @NotNull
    public final SC p;

    @NotNull
    public final C01 q;

    @NotNull
    public final AbstractC2766af2 r;
    public final boolean s;

    @NotNull
    public final a t;

    @NotNull
    public final FO0 u;

    @NotNull
    public final TD1<FO0> v;

    @NotNull
    public final C7559xA0 w;

    @NotNull
    public final TO0 x;

    @NotNull
    public final C6970uO0 y;

    @NotNull
    public final I51<List<H62>> z;

    /* JADX INFO: renamed from: vO0$a */
    public final class a extends W {

        @NotNull
        public final I51<List<H62>> c;

        public a() {
            super(C7180vO0.this.n.a.a);
            C2720aS0 c2720aS0 = C7180vO0.this.n.a.a;
            T t = new T(C7180vO0.this, 3);
            c2720aS0.getClass();
            this.c = new C2720aS0.h(c2720aS0, t);
        }

        @Override // defpackage.InterfaceC6494s62
        @NotNull
        public final List<H62> b() {
            return this.c.invoke();
        }

        @Override // defpackage.W, defpackage.InterfaceC6494s62
        public final InterfaceC5044lD c() {
            return C7180vO0.this;
        }

        @Override // defpackage.InterfaceC6494s62
        public final boolean e() {
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:102:0x025b  */
        /* JADX WARN: Code duplicated, block: B:104:0x0261  */
        /* JADX WARN: Code duplicated, block: B:106:0x0266  */
        /* JADX WARN: Code duplicated, block: B:121:0x002a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:33:0x0080  */
        /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:4:0x002a  */
        /* JADX WARN: Code duplicated, block: B:74:0x0197  */
        /* JADX WARN: Code duplicated, block: B:76:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:79:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:82:0x01f0  */
        /* JADX WARN: Code duplicated, block: B:83:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:92:0x020b  */
        /* JADX WARN: Code duplicated, block: B:93:0x021e  */
        /* JADX WARN: Code duplicated, block: B:96:0x022b  */
        /* JADX WARN: Code duplicated, block: B:99:0x0240 A[LOOP:1: B:97:0x023a->B:99:0x0240, LOOP_END] */
        @Override // defpackage.B1
        @NotNull
        public final Collection<AbstractC4649jL0> h() {
            String str;
            C1758Ph0 c1758Ph0;
            C1758Ph0 topLevelClassFqName;
            ArrayList arrayList;
            AbstractC5706oM1 abstractC5706oM1B;
            FC fc;
            AbstractC4649jL0 abstractC4649jL0J;
            ArrayList arrayList2;
            AbstractC4649jL0 type;
            AbstractC4649jL0 abstractC4649jL0B;
            InterfaceC6494s62 interfaceC6494s62V0;
            InterfaceC6494s62 interfaceC6494s62V1;
            C7180vO0 c7180vO0 = C7180vO0.this;
            Collection<InterfaceC4370iE0> collectionA = c7180vO0.l.a();
            ArrayList arrayList3 = new ArrayList(collectionA.size());
            ArrayList<TE0> arrayList4 = new ArrayList(0);
            C1758Ph0 PURELY_IMPLEMENTS_ANNOTATION = C3333dI0.n;
            Intrinsics.checkNotNullExpressionValue(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            InterfaceC1583Nc interfaceC1583NcP = c7180vO0.y.p(PURELY_IMPLEMENTS_ANNOTATION);
            if (interfaceC1583NcP != null) {
                Object objV = CollectionsKt.V(interfaceC1583NcP.j().values());
                C7193vS1 c7193vS1 = objV instanceof C7193vS1 ? (C7193vS1) objV : null;
                if (c7193vS1 != null && (str = (String) c7193vS1.a) != null) {
                    DP1 dp1 = DP1.d;
                    int i = 0;
                    while (true) {
                        if (i < str.length()) {
                            char cCharAt = str.charAt(i);
                            int iOrdinal = dp1.ordinal();
                            if (iOrdinal == 0) {
                                if (!Character.isJavaIdentifierStart(cCharAt)) {
                                    dp1 = DP1.e;
                                    i++;
                                }
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    throw new C6489s51();
                                }
                                if (!Character.isJavaIdentifierStart(cCharAt)) {
                                    dp1 = DP1.e;
                                    i++;
                                }
                            } else {
                                if (cCharAt == '.') {
                                    dp1 = DP1.g;
                                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                                }
                                i++;
                            }
                        } else if (dp1 != DP1.g) {
                            c1758Ph0 = new C1758Ph0(str);
                            break;
                        }
                        c1758Ph0 = null;
                        break;
                    }
                }
                c1758Ph0 = null;
                break;
            }
            c1758Ph0 = null;
            break;
            if (c1758Ph0 == null || c1758Ph0.d() || !c1758Ph0.h(C4194hP1.k)) {
                c1758Ph0 = null;
            }
            LO0 context = c7180vO0.n;
            if (c1758Ph0 == null) {
                LinkedHashMap linkedHashMap = C0568Ab0.a;
                C1758Ph0 classFqName = C4900kZ.g(c7180vO0);
                Intrinsics.checkNotNullParameter(classFqName, "classFqName");
                topLevelClassFqName = C0568Ab0.b.get(classFqName);
                if (topLevelClassFqName == null) {
                    abstractC5706oM1B = null;
                }
                for (InterfaceC4370iE0 interfaceC4370iE0 : collectionA) {
                    type = context.e.d(interfaceC4370iE0, C3686f.q(EnumC2880b72.d, false, null, 7));
                    PL1 pl1 = context.a.r;
                    pl1.getClass();
                    Intrinsics.checkNotNullParameter(type, "type");
                    Intrinsics.checkNotNullParameter(context, "context");
                    abstractC4649jL0B = pl1.b(new RL1(null, false, context, EnumC1976Sc.TYPE_USE, true), type, C5653o60.d, null, false);
                    if (abstractC4649jL0B == null) {
                        abstractC4649jL0B = type;
                    }
                    if (abstractC4649jL0B.V0().c() instanceof G51.b) {
                        arrayList4.add(interfaceC4370iE0);
                    }
                    interfaceC6494s62V0 = abstractC4649jL0B.V0();
                    if (abstractC5706oM1B != null) {
                        interfaceC6494s62V1 = abstractC5706oM1B.V0();
                    } else {
                        interfaceC6494s62V1 = null;
                    }
                    if (!Intrinsics.a(interfaceC6494s62V0, interfaceC6494s62V1) && !RK0.x(abstractC4649jL0B)) {
                        arrayList3.add(abstractC4649jL0B);
                    }
                }
                fc = c7180vO0.m;
                if (fc != null) {
                    abstractC4649jL0J = MW0.a(fc, c7180vO0).c().j(fc.y(), EnumC3610ed2.INVARIANT);
                } else {
                    abstractC4649jL0J = null;
                }
                UE.b(arrayList3, abstractC4649jL0J);
                UE.b(arrayList3, abstractC5706oM1B);
                if (!arrayList4.isEmpty()) {
                    return !arrayList3.isEmpty() ? CollectionsKt.e0(arrayList3) : VE.c(context.a.o.h.e());
                }
                KE0 ke0 = context.a;
                arrayList2 = new ArrayList(XE.m(arrayList4, 10));
                for (TE0 te0 : arrayList4) {
                    Intrinsics.c(te0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList2.add(((InterfaceC4370iE0) te0).q());
                }
                ke0.f.c(c7180vO0, arrayList2);
                throw null;
            }
            topLevelClassFqName = c1758Ph0;
            KE0 ke1 = context.a;
            S41 location = S41.l;
            int i2 = C4900kZ.a;
            T01 t01 = ke1.o;
            Intrinsics.checkNotNullParameter(t01, "<this>");
            Intrinsics.checkNotNullParameter(topLevelClassFqName, "topLevelClassFqName");
            Intrinsics.checkNotNullParameter(location, "location");
            topLevelClassFqName.d();
            C1758Ph0 c1758Ph0E = topLevelClassFqName.e();
            Intrinsics.checkNotNullExpressionValue(c1758Ph0E, "parent(...)");
            QY0 qy0V = t01.A0(c1758Ph0E).v();
            C5638o21 c5638o21F = topLevelClassFqName.f();
            Intrinsics.checkNotNullExpressionValue(c5638o21F, "shortName(...)");
            InterfaceC5044lD interfaceC5044lDF = ((AbstractC3062c1) qy0V).f(c5638o21F, location);
            FC fc2 = interfaceC5044lDF instanceof FC ? (FC) interfaceC5044lDF : null;
            if (fc2 == null) {
                abstractC5706oM1B = null;
            } else {
                int size = fc2.p().b().size();
                List<H62> listB = c7180vO0.t.b();
                Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
                int size2 = listB.size();
                if (size2 == size) {
                    arrayList = new ArrayList(XE.m(listB, 10));
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new P62(((H62) it.next()).y(), EnumC3610ed2.INVARIANT));
                    }
                } else if (size2 == 1 && size > 1 && c1758Ph0 == null) {
                    P62 p62 = new P62(((H62) CollectionsKt.U(listB)).y(), EnumC3610ed2.INVARIANT);
                    IntRange intRange = new IntRange(1, size, 1);
                    arrayList = new ArrayList(XE.m(intRange, 10));
                    Iterator<Integer> it2 = intRange.iterator();
                    while (((DB0) it2).g) {
                        ((CB0) it2).b();
                        arrayList.add(p62);
                    }
                } else {
                    abstractC5706oM1B = null;
                }
                C5655o62.e.getClass();
                abstractC5706oM1B = C5492nL0.b(C5655o62.g, fc2, arrayList);
            }
            while (r3.hasNext()) {
                type = context.e.d(interfaceC4370iE0, C3686f.q(EnumC2880b72.d, false, null, 7));
                PL1 pl2 = context.a.r;
                pl2.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(context, "context");
                abstractC4649jL0B = pl2.b(new RL1(null, false, context, EnumC1976Sc.TYPE_USE, true), type, C5653o60.d, null, false);
                if (abstractC4649jL0B == null) {
                    abstractC4649jL0B = type;
                }
                if (abstractC4649jL0B.V0().c() instanceof G51.b) {
                    arrayList4.add(interfaceC4370iE0);
                }
                interfaceC6494s62V0 = abstractC4649jL0B.V0();
                if (abstractC5706oM1B != null) {
                    interfaceC6494s62V1 = abstractC5706oM1B.V0();
                } else {
                    interfaceC6494s62V1 = null;
                }
                if (!Intrinsics.a(interfaceC6494s62V0, interfaceC6494s62V1)) {
                    arrayList3.add(abstractC4649jL0B);
                }
            }
            fc = c7180vO0.m;
            if (fc != null) {
                abstractC4649jL0J = MW0.a(fc, c7180vO0).c().j(fc.y(), EnumC3610ed2.INVARIANT);
            } else {
                abstractC4649jL0J = null;
            }
            UE.b(arrayList3, abstractC4649jL0J);
            UE.b(arrayList3, abstractC5706oM1B);
            if (!arrayList4.isEmpty()) {
                if (!arrayList3.isEmpty()) {
                }
            }
            KE0 ke2 = context.a;
            arrayList2 = new ArrayList(XE.m(arrayList4, 10));
            while (r4.hasNext()) {
                Intrinsics.c(te0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                arrayList2.add(((InterfaceC4370iE0) te0).q());
            }
            ke2.f.c(c7180vO0, arrayList2);
            throw null;
        }

        @Override // defpackage.B1
        @NotNull
        public final InterfaceC3792fV1 k() {
            return C7180vO0.this.n.a.m;
        }

        @Override // defpackage.W
        @NotNull
        /* JADX INFO: renamed from: p */
        public final FC c() {
            return C7180vO0.this;
        }

        @NotNull
        public final String toString() {
            String strE = C7180vO0.this.getName().e();
            Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
            return strE;
        }
    }

    /* JADX INFO: renamed from: vO0$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return BG.a(C4900kZ.g((FC) t).b(), C4900kZ.g((FC) t2).b());
        }
    }

    static {
        String[] elements = {"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        C1526Mj.H(elements);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7180vO0(@NotNull LO0 outerContext, @NotNull InterfaceC4675jU containingDeclaration, @NotNull InterfaceC2902bE0 jClass, @Nullable FC fc) {
        C01 c01;
        super(outerContext.a.a, containingDeclaration, jClass.getName(), outerContext.a.j.a(jClass));
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.k = outerContext;
        this.l = jClass;
        this.m = fc;
        LO0 lo0F = C2432Xo.f(outerContext, this, jClass, 4);
        this.n = lo0F;
        KE0 ke0 = lo0F.a;
        ke0.g.getClass();
        this.o = XO0.b(new C1194Ic(this, 3));
        this.p = jClass.s() ? SC.i : jClass.H() ? SC.e : jClass.C() ? SC.g : SC.d;
        if (jClass.s() || jClass.C()) {
            c01 = C01.e;
        } else {
            C01.a aVar = C01.d;
            boolean zE = jClass.E();
            boolean z = jClass.E() || jClass.I() || jClass.H();
            boolean zB = jClass.b();
            aVar.getClass();
            c01 = zE ? C01.g : z ? C01.i : !zB ? C01.h : C01.e;
        }
        this.q = c01;
        this.r = jClass.d();
        this.s = (jClass.t() == null || jClass.i()) ? false : true;
        this.t = new a();
        FO0 fo0 = new FO0(lo0F, this, jClass, fc != null, null);
        this.u = fo0;
        TD1.a aVar2 = TD1.e;
        C2720aS0 storageManager = ke0.a;
        AbstractC6331rL0.a kotlinTypeRefinerForOwnerModule = ke0.u.c;
        Q scopeFactory = new Q(this, 3);
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(this, "classDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
        Intrinsics.checkNotNullParameter(scopeFactory, "scopeFactory");
        this.v = new TD1<>(this, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule);
        this.w = new C7559xA0(fo0);
        this.x = new TO0(lo0F, jClass, this);
        this.y = C3043bv.h(lo0F, jClass);
        S s = new S(this, 3);
        storageManager.getClass();
        this.z = new C2720aS0.h(storageManager, s);
    }

    @Override // defpackage.FC, defpackage.InterfaceC5257mD
    @NotNull
    public final List<H62> A() {
        return this.z.invoke();
    }

    @Override // defpackage.FC
    public final boolean E() {
        return false;
    }

    @Override // defpackage.V, defpackage.FC
    @NotNull
    public final QY0 E0() {
        return this.w;
    }

    @Override // defpackage.FC
    @Nullable
    public final Rc2<AbstractC5706oM1> F0() {
        return null;
    }

    @Override // defpackage.O01
    public final QY0 G0(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (FO0) this.v.a(kotlinTypeRefiner);
    }

    @Override // defpackage.FC
    public final boolean I() {
        return false;
    }

    @Override // defpackage.V, defpackage.FC
    public final QY0 L0() {
        return (FO0) super.L0();
    }

    @Override // defpackage.GY0
    public final boolean M0() {
        return false;
    }

    @Override // defpackage.FC
    @NotNull
    public final Collection<FC> P() {
        if (this.q != C01.g) {
            return C5653o60.d;
        }
        VE0 ve0Q = C3686f.q(EnumC2880b72.e, false, null, 7);
        Sequence<InterfaceC4370iE0> sequenceM = this.l.M();
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC4370iE0> it = sequenceM.iterator();
        while (it.hasNext()) {
            InterfaceC5044lD interfaceC5044lDC = this.n.e.d(it.next(), ve0Q).V0().c();
            FC fc = interfaceC5044lDC instanceof FC ? (FC) interfaceC5044lDC : null;
            if (fc != null) {
                arrayList.add(fc);
            }
        }
        return CollectionsKt.Z(arrayList, new b());
    }

    @Override // defpackage.GY0
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.FC
    public final boolean Q0() {
        return false;
    }

    @Override // defpackage.InterfaceC5257mD
    public final boolean R() {
        return this.s;
    }

    @NotNull
    public final FO0 T0() {
        return (FO0) super.L0();
    }

    @Override // defpackage.FC
    @Nullable
    public final InterfaceC7984zC X() {
        return null;
    }

    @Override // defpackage.FC
    @NotNull
    public final QY0 Y() {
        return this.x;
    }

    @Override // defpackage.FC
    @Nullable
    public final FC a0() {
        return null;
    }

    @Override // defpackage.FC, defpackage.GY0
    @NotNull
    public final AbstractC5533nZ d() {
        C5323mZ.d dVar = C5323mZ.a;
        AbstractC2766af2 abstractC2766af2 = this.r;
        if (!Intrinsics.a(abstractC2766af2, dVar) || this.l.t() != null) {
            return Hc2.a(abstractC2766af2);
        }
        C5891pE0.a aVar = C5891pE0.a;
        Intrinsics.checkNotNull(aVar);
        return aVar;
    }

    @Override // defpackage.FC
    @NotNull
    public final SC h() {
        return this.p;
    }

    @Override // defpackage.InterfaceC0726Cc
    @NotNull
    public final InterfaceC2396Xc k() {
        return this.y;
    }

    @Override // defpackage.FC
    public final boolean m() {
        return false;
    }

    @Override // defpackage.InterfaceC5044lD
    @NotNull
    public final InterfaceC6494s62 p() {
        return this.t;
    }

    @Override // defpackage.FC, defpackage.GY0
    @NotNull
    public final C01 q() {
        return this.q;
    }

    @Override // defpackage.FC
    public final Collection r() {
        return this.u.q.invoke();
    }

    @Override // defpackage.FC
    public final boolean s() {
        return false;
    }

    @NotNull
    public final String toString() {
        return "Lazy Java class " + C4900kZ.h(this);
    }
}
