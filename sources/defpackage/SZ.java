package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SZ extends RY0 {
    public static final /* synthetic */ IJ0<Object>[] f;

    @NotNull
    public final C6582sZ b;

    @NotNull
    public final a c;

    @NotNull
    public final I51 d;

    @NotNull
    public final InterfaceC5868p71 e;

    public interface a {
        @NotNull
        Set<C5638o21> a();

        @NotNull
        Collection b(@NotNull C5638o21 c5638o21, @NotNull S41 s41);

        @NotNull
        Set<C5638o21> c();

        @NotNull
        Collection d(@NotNull C5638o21 c5638o21, @NotNull S41 s41);

        @Nullable
        InterfaceC3714f62 e(@NotNull C5638o21 c5638o21);

        @NotNull
        Set<C5638o21> f();

        void g(@NotNull ArrayList arrayList, @NotNull LY ly, @NotNull Function1 function1);
    }

    public final class b implements a {
        public static final /* synthetic */ IJ0<Object>[] j;

        @NotNull
        public final LinkedHashMap a;

        @NotNull
        public final LinkedHashMap b;

        @NotNull
        public final Object c;

        @NotNull
        public final UY0<C5638o21, Collection<InterfaceC3765fM1>> d;

        @NotNull
        public final UY0<C5638o21, Collection<InterfaceC0671Bj1>> e;

        @NotNull
        public final VY0<C5638o21, InterfaceC3714f62> f;

        @NotNull
        public final I51 g;

        @NotNull
        public final I51 h;
        public final /* synthetic */ SZ i;

        public static final class a implements Function0 {
            public final /* synthetic */ Q0 d;
            public final /* synthetic */ ByteArrayInputStream e;
            public final /* synthetic */ SZ g;

            public a(Q0 q0, ByteArrayInputStream byteArrayInputStream, SZ sz) {
                this.d = q0;
                this.e = byteArrayInputStream;
                this.g = sz;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C1578Na0 c1578Na0 = this.g.b.a.p;
                return this.d.c(this.e, c1578Na0);
            }
        }

        static {
            C2251Vp1 c2251Vp1 = C2017Sp1.a;
            j = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        public b(@NotNull SZ sz, @NotNull List<C2575Zj1> functionList, @NotNull List<C3637ek1> propertyList, List<C4476ik1> typeAliasList) {
            Intrinsics.checkNotNullParameter(functionList, "functionList");
            Intrinsics.checkNotNullParameter(propertyList, "propertyList");
            Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
            this.i = sz;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                C5638o21 c5638o21B = C6267r21.b(sz.b.b, ((C2575Zj1) ((HZ0) obj)).j);
                Object arrayList = linkedHashMap.get(c5638o21B);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(c5638o21B, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.a = h(linkedHashMap);
            SZ sz2 = this.i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                C5638o21 c5638o21B2 = C6267r21.b(sz2.b.b, ((C3637ek1) ((HZ0) obj2)).j);
                Object arrayList2 = linkedHashMap2.get(c5638o21B2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(c5638o21B2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.b = h(linkedHashMap2);
            this.i.b.a.c.getClass();
            SZ sz3 = this.i;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : typeAliasList) {
                C5638o21 c5638o21B3 = C6267r21.b(sz3.b.b, ((C4476ik1) ((HZ0) obj3)).i);
                Object arrayList3 = linkedHashMap3.get(c5638o21B3);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap3.put(c5638o21B3, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            this.c = h(linkedHashMap3);
            this.d = this.i.b.a.a.e(new C2740aZ(this, 1));
            this.e = this.i.b.a.a.e(new TZ(this, 0));
            this.f = this.i.b.a.a.f(new Q(this, 2));
            SZ sz4 = this.i;
            C2720aS0 c2720aS0 = sz4.b.a.a;
            UZ uz = new UZ(0, this, sz4);
            c2720aS0.getClass();
            this.g = new C2720aS0.h(c2720aS0, uz);
            SZ sz5 = this.i;
            C2720aS0 c2720aS1 = sz5.b.a.a;
            VZ vz = new VZ(this, sz5);
            c2720aS1.getClass();
            this.h = new C2720aS0.h(c2720aS1, vz);
        }

        public static LinkedHashMap h(LinkedHashMap linkedHashMap) throws IOException {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(OW0.a(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<H0> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(XE.m(iterable, 10));
                for (H0 h0 : iterable) {
                    int iA = h0.a();
                    int iF = IE.f(iA) + iA;
                    if (iF > 4096) {
                        iF = 4096;
                    }
                    IE ieJ = IE.j(byteArrayOutputStream, iF);
                    ieJ.v(iA);
                    h0.h(ieJ);
                    ieJ.i();
                    arrayList.add(Unit.a);
                }
                linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap2;
        }

        @Override // SZ.a
        @NotNull
        public final Set<C5638o21> a() {
            return (Set) Nm2.f(this.g, j[0]);
        }

        @Override // SZ.a
        @NotNull
        public final Collection b(@NotNull C5638o21 name, @NotNull S41 location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            return !c().contains(name) ? C5653o60.d : (Collection) ((C2720aS0.k) this.e).invoke(name);
        }

        @Override // SZ.a
        @NotNull
        public final Set<C5638o21> c() {
            return (Set) Nm2.f(this.h, j[1]);
        }

        @Override // SZ.a
        @NotNull
        public final Collection d(@NotNull C5638o21 name, @NotNull S41 location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            return !a().contains(name) ? C5653o60.d : (Collection) ((C2720aS0.k) this.d).invoke(name);
        }

        @Override // SZ.a
        @Nullable
        public final InterfaceC3714f62 e(@NotNull C5638o21 name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f.invoke(name);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // SZ.a
        @NotNull
        public final Set<C5638o21> f() {
            return this.c.keySet();
        }

        @Override // SZ.a
        public final void g(@NotNull ArrayList result, @NotNull LY kindFilter, @NotNull Function1 nameFilter) {
            S41 location = S41.h;
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            Intrinsics.checkNotNullParameter(location, "location");
            boolean zA = kindFilter.a(LY.j);
            FY0 INSTANCE = FY0.a;
            if (zA) {
                Set<C5638o21> setC = c();
                ArrayList arrayList = new ArrayList();
                for (C5638o21 c5638o21 : setC) {
                    if (((Boolean) nameFilter.invoke(c5638o21)).booleanValue()) {
                        arrayList.addAll(b(c5638o21, location));
                    }
                }
                Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
                C2680aF.n(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.a(LY.i)) {
                Set<C5638o21> setA = a();
                ArrayList arrayList2 = new ArrayList();
                for (C5638o21 c5638o22 : setA) {
                    if (((Boolean) nameFilter.invoke(c5638o22)).booleanValue()) {
                        arrayList2.addAll(d(c5638o22, location));
                    }
                }
                Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
                C2680aF.n(arrayList2, INSTANCE);
                result.addAll(arrayList2);
            }
        }
    }

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        f = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(SZ.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(SZ.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public SZ(@NotNull C6582sZ c, @NotNull List<C2575Zj1> functionList, @NotNull List<C3637ek1> propertyList, @NotNull List<C4476ik1> typeAliasList, @NotNull Function0<? extends Collection<C5638o21>> classNames) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(functionList, "functionList");
        Intrinsics.checkNotNullParameter(propertyList, "propertyList");
        Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        this.b = c;
        c.a.c.getClass();
        this.c = new b(this, functionList, propertyList, typeAliasList);
        C6163qZ c6163qZ = c.a;
        C2720aS0 c2720aS0 = c6163qZ.a;
        YY yy = new YY(classNames, 1);
        c2720aS0.getClass();
        this.d = new C2720aS0.h(c2720aS0, yy);
        C2720aS0 c2720aS1 = c6163qZ.a;
        RZ rz = new RZ(this, 0);
        c2720aS1.getClass();
        this.e = new C2720aS0.f(c2720aS1, rz);
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public final Set<C5638o21> a() {
        return this.c.a();
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public Collection b(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.c.b(name, location);
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public final Set<C5638o21> c() {
        return this.c.c();
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public Collection<InterfaceC3765fM1> d(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.c.d(name, (S41) location);
    }

    @Override // defpackage.RY0, defpackage.InterfaceC2602Zs1
    @Nullable
    public InterfaceC5044lD f(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        if (q(name)) {
            return this.b.a.b(l(name));
        }
        a aVar = this.c;
        if (aVar.f().contains(name)) {
            return aVar.e(name);
        }
        return null;
    }

    @Override // defpackage.RY0, defpackage.QY0
    @Nullable
    public final Set<C5638o21> g() {
        IJ0<Object> p = f[1];
        InterfaceC5868p71 interfaceC5868p71 = this.e;
        Intrinsics.checkNotNullParameter(interfaceC5868p71, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        return (Set) interfaceC5868p71.invoke();
    }

    public abstract void h(@NotNull ArrayList arrayList, @NotNull Function1 function1);

    @NotNull
    public final List i(@NotNull LY kindFilter, @NotNull Function1 nameFilter) {
        S41 location = S41.h;
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Intrinsics.checkNotNullParameter(location, "location");
        ArrayList arrayList = new ArrayList(0);
        if (kindFilter.a(LY.f)) {
            h(arrayList, nameFilter);
        }
        a aVar = this.c;
        aVar.g(arrayList, kindFilter, nameFilter);
        if (kindFilter.a(LY.l)) {
            for (C5638o21 c5638o21 : m()) {
                if (((Boolean) nameFilter.invoke(c5638o21)).booleanValue()) {
                    UE.b(arrayList, this.b.a.b(l(c5638o21)));
                }
            }
        }
        if (kindFilter.a(LY.g)) {
            for (C5638o21 c5638o22 : aVar.f()) {
                if (((Boolean) nameFilter.invoke(c5638o22)).booleanValue()) {
                    UE.b(arrayList, aVar.e(c5638o22));
                }
            }
        }
        return UE.f(arrayList);
    }

    public void j(@NotNull C5638o21 name, @NotNull ArrayList functions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(functions, "functions");
    }

    public void k(@NotNull C5638o21 name, @NotNull ArrayList descriptors) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
    }

    @NotNull
    public abstract QC l(@NotNull C5638o21 c5638o21);

    @NotNull
    public final Set<C5638o21> m() {
        return (Set) Nm2.f(this.d, f[0]);
    }

    @Nullable
    public abstract Set<C5638o21> n();

    @NotNull
    public abstract Set<C5638o21> o();

    @NotNull
    public abstract Set<C5638o21> p();

    public boolean q(@NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return m().contains(name);
    }

    public boolean r(@NotNull C3059c00 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return true;
    }
}
