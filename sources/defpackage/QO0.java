package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QO0 extends RY0 {
    public static final /* synthetic */ IJ0<Object>[] m;

    @NotNull
    public final LO0 b;

    @Nullable
    public final FO0 c;

    @NotNull
    public final I51<Collection<InterfaceC4675jU>> d;

    @NotNull
    public final I51<InterfaceC6148qU> e;

    @NotNull
    public final UY0<C5638o21, Collection<InterfaceC3765fM1>> f;

    @NotNull
    public final VY0<C5638o21, InterfaceC0671Bj1> g;

    @NotNull
    public final UY0<C5638o21, Collection<InterfaceC3765fM1>> h;

    @NotNull
    public final I51 i;

    @NotNull
    public final I51 j;

    @NotNull
    public final I51 k;

    @NotNull
    public final UY0<C5638o21, List<InterfaceC0671Bj1>> l;

    public static final class a {

        @NotNull
        public final AbstractC4649jL0 a;

        @NotNull
        public final List<Xc2> b;

        @NotNull
        public final ArrayList c;

        @NotNull
        public final List<String> d;

        public a(@NotNull AbstractC4649jL0 returnType, @NotNull List valueParameters, @NotNull ArrayList typeParameters, @NotNull List errors) {
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
            Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.a = returnType;
            this.b = valueParameters;
            this.c = typeParameters;
            this.d = errors;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && Intrinsics.a(this.b, aVar.b) && this.c.equals(aVar.c) && Intrinsics.a(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + C2983be.a((this.c.hashCode() + C5491nL.b(this.a.hashCode() * 961, 31, this.b)) * 31, false, 31);
        }

        @NotNull
        public final String toString() {
            return "MethodSignatureData(returnType=" + this.a + ", receiverType=null, valueParameters=" + this.b + ", typeParameters=" + this.c + ", hasStableParameterNames=false, errors=" + this.d + ')';
        }
    }

    public static final class b {

        @NotNull
        public final List<Xc2> a;
        public final boolean b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull List<? extends Xc2> descriptors, boolean z) {
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            this.a = descriptors;
            this.b = z;
        }
    }

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        m = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(QO0.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(QO0.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(QO0.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public QO0(@Nullable FO0 fo0, @NotNull LO0 c) {
        Intrinsics.checkNotNullParameter(c, "c");
        this.b = c;
        this.c = fo0;
        this.d = c.a.a.g(new PJ0(this, 1), C5653o60.d);
        KE0 ke0 = c.a;
        C2720aS0 c2720aS0 = ke0.a;
        GZ gz = new GZ(this, 3);
        c2720aS0.getClass();
        this.e = new C2720aS0.h(c2720aS0, gz);
        this.f = ke0.a.e(new A1(this, 1));
        this.g = ke0.a.f(new OO0(this));
        this.h = ke0.a.e(new C4175hJ0(this, 1));
        C2720aS0 c2720aS1 = ke0.a;
        LI0 li0 = new LI0(this, 3);
        c2720aS1.getClass();
        this.i = new C2720aS0.h(c2720aS1, li0);
        C2720aS0 c2720aS2 = ke0.a;
        MI0 mi0 = new MI0(this, 2);
        c2720aS2.getClass();
        this.j = new C2720aS0.h(c2720aS2, mi0);
        C2720aS0 c2720aS3 = ke0.a;
        YY yy = new YY(this, 4);
        c2720aS3.getClass();
        this.k = new C2720aS0.h(c2720aS3, yy);
        this.l = ke0.a.e(new C6760tO0(this, 1));
    }

    @NotNull
    public static AbstractC4649jL0 l(@NotNull InterfaceC7991zE0 method, @NotNull LO0 c) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(c, "c");
        VE0 ve0Q = C3686f.q(EnumC2880b72.e, method.o().a.isAnnotation(), null, 6);
        return c.e.d(method.m(), ve0Q);
    }

    @NotNull
    public static b u(@NotNull LO0 c, @NotNull AbstractC2314Wj0 abstractC2314Wj0, @NotNull List jValueParameters) {
        Pair pair;
        C5638o21 name;
        Intrinsics.checkNotNullParameter(c, "c");
        AbstractC2314Wj0 function = abstractC2314Wj0;
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(jValueParameters, "jValueParameters");
        C1336Jx0 c1336Jx0I0 = CollectionsKt.i0(jValueParameters);
        ArrayList arrayList = new ArrayList(XE.m(c1336Jx0I0, 10));
        Iterator it = c1336Jx0I0.iterator();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            C1414Kx0 c1414Kx0 = (C1414Kx0) it;
            if (!c1414Kx0.d.hasNext()) {
                return new b(CollectionsKt.e0(arrayList), z2);
            }
            IndexedValue indexedValue = (IndexedValue) c1414Kx0.next();
            int i = indexedValue.a;
            InterfaceC3953gF0 interfaceC3953gF0 = (InterfaceC3953gF0) indexedValue.b;
            C6970uO0 c6970uO0H = C3043bv.h(c, interfaceC3953gF0);
            VE0 ve0Q = C3686f.q(EnumC2880b72.e, z, null, 7);
            boolean zE = interfaceC3953gF0.e();
            KE0 ke0 = c.a;
            C3533eF0 c3533eF0 = c.e;
            T01 t01 = ke0.o;
            if (zE) {
                TE0 type = interfaceC3953gF0.getType();
                ZD0 zd0 = type instanceof ZD0 ? (ZD0) type : null;
                if (zd0 == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + interfaceC3953gF0);
                }
                P92 p92C = c3533eF0.c(zd0, ve0Q, true);
                pair = new Pair(p92C, t01.h.f(p92C));
            } else {
                pair = new Pair(c3533eF0.d(interfaceC3953gF0.getType(), ve0Q), null);
            }
            AbstractC4649jL0 abstractC4649jL0 = (AbstractC4649jL0) pair.d;
            AbstractC4649jL0 abstractC4649jL1 = (AbstractC4649jL0) pair.e;
            if (Intrinsics.a(function.getName().e(), "equals") && jValueParameters.size() == 1 && t01.h.o().equals(abstractC4649jL0)) {
                name = C5638o21.k("other");
            } else {
                name = interfaceC3953gF0.getName();
                if (name == null) {
                    z2 = true;
                }
                if (name == null) {
                    name = C5638o21.k(R51.PUSH_MINIFIED_BUTTON_ICON + i);
                    Intrinsics.checkNotNullExpressionValue(name, "identifier(...)");
                }
            }
            boolean z3 = z2;
            Intrinsics.checkNotNull(name);
            arrayList.add(new Yc2(function, null, i, c6970uO0H, name, abstractC4649jL0, false, false, false, abstractC4649jL1, ke0.j.a(interfaceC3953gF0)));
            function = abstractC2314Wj0;
            z = false;
            z2 = z3;
        }
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public final Set<C5638o21> a() {
        return (Set) Nm2.f(this.i, m[0]);
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public Collection b(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !c().contains(name) ? C5653o60.d : (Collection) ((C2720aS0.k) this.l).invoke(name);
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public final Set<C5638o21> c() {
        return (Set) Nm2.f(this.j, m[1]);
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public Collection<InterfaceC3765fM1> d(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !a().contains(name) ? C5653o60.d : (Collection) ((C2720aS0.k) this.h).invoke(name);
    }

    @Override // defpackage.RY0, defpackage.InterfaceC2602Zs1
    @NotNull
    public Collection<InterfaceC4675jU> e(@NotNull LY kindFilter, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return this.d.invoke();
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public final Set<C5638o21> g() {
        return (Set) Nm2.f(this.k, m[2]);
    }

    @NotNull
    public abstract Set h(@NotNull LY ly, @Nullable QY qy);

    @NotNull
    public abstract Set i(@NotNull LY ly, @Nullable QY qy);

    public void j(@NotNull C5638o21 name, @NotNull ArrayList result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @NotNull
    public abstract InterfaceC6148qU k();

    public abstract void m(@NotNull LinkedHashSet linkedHashSet, @NotNull C5638o21 c5638o21);

    public abstract void n(@NotNull C5638o21 c5638o21, @NotNull ArrayList arrayList);

    @NotNull
    public abstract Set o(@NotNull LY ly);

    @Nullable
    public abstract InterfaceC1076Go1 p();

    @NotNull
    public abstract InterfaceC4675jU q();

    public boolean r(@NotNull AE0 ae0) {
        Intrinsics.checkNotNullParameter(ae0, "<this>");
        return true;
    }

    @NotNull
    public abstract a s(@NotNull InterfaceC7991zE0 interfaceC7991zE0, @NotNull ArrayList arrayList, @NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull List list);

    /* JADX WARN: Type inference failed for: r3v5, types: [fO0, java.lang.Object] */
    @NotNull
    public final AE0 t(@NotNull InterfaceC7991zE0 typeParameterOwner) {
        C01 c01;
        Intrinsics.checkNotNullParameter(typeParameterOwner, "method");
        LO0 lo0 = this.b;
        AE0 containingDeclaration = AE0.j1(q(), C3043bv.h(lo0, typeParameterOwner), typeParameterOwner.getName(), lo0.a.j.a(typeParameterOwner), this.e.invoke().b(typeParameterOwner.getName()) != null && ((ArrayList) typeParameterOwner.j()).isEmpty());
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "createJavaMethod(...)");
        Intrinsics.checkNotNullParameter(lo0, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        LO0 lo1 = new LO0(lo0.a, new WO0(lo0, containingDeclaration, typeParameterOwner, 0), lo0.c);
        ArrayList arrayListW = typeParameterOwner.w();
        ArrayList arrayList = new ArrayList(XE.m(arrayListW, 10));
        Iterator it = arrayListW.iterator();
        while (it.hasNext()) {
            H62 h62A = lo1.b.a((ZE0) it.next());
            Intrinsics.checkNotNull(h62A);
            arrayList.add(h62A);
        }
        b bVarU = u(lo1, containingDeclaration, typeParameterOwner.j());
        a aVarS = s(typeParameterOwner, arrayList, l(typeParameterOwner, lo1), bVarU.a);
        InterfaceC1076Go1 interfaceC1076Go1P = p();
        C5653o60 c5653o60 = C5653o60.d;
        C01.a aVar = C01.d;
        boolean zI = typeParameterOwner.I();
        boolean zB = typeParameterOwner.b();
        aVar.getClass();
        if (zI) {
            c01 = C01.i;
        } else {
            c01 = !zB ? C01.h : C01.e;
        }
        containingDeclaration.i1(null, interfaceC1076Go1P, c5653o60, aVarS.c, aVarS.b, aVarS.a, c01, Hc2.a(typeParameterOwner.d()), PW0.c());
        containingDeclaration.k1(false, bVarU.b);
        if (aVarS.d.isEmpty()) {
            return containingDeclaration;
        }
        lo1.a.e.getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    @NotNull
    public String toString() {
        return "Lazy scope for " + q();
    }
}
