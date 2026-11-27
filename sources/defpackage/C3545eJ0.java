package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3545eJ0<T> extends AbstractC5906pJ0 implements RI0<T>, InterfaceC5063lJ0, ZJ0 {
    public static final /* synthetic */ int h = 0;

    @NotNull
    public final Class<T> e;

    @NotNull
    public final Object g;

    /* JADX INFO: renamed from: eJ0$a */
    public final class a extends AbstractC5906pJ0.a {
        public static final /* synthetic */ IJ0<Object>[] p;

        @NotNull
        public final C1939Rp1.a c;

        @NotNull
        public final C1939Rp1.a d;

        @NotNull
        public final C1939Rp1.a e;

        @NotNull
        public final C1939Rp1.a f;

        @NotNull
        public final C1939Rp1.a g;

        @NotNull
        public final Object h;

        @NotNull
        public final C1939Rp1.a i;

        @NotNull
        public final C1939Rp1.a j;

        @NotNull
        public final C1939Rp1.a k;

        @NotNull
        public final C1939Rp1.a l;

        @NotNull
        public final C1939Rp1.a m;

        @NotNull
        public final C1939Rp1.a n;

        @NotNull
        public final C1939Rp1.a o;

        static {
            C2251Vp1 c2251Vp1 = C2017Sp1.a;
            p = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "annotations", "getAnnotations()Ljava/util/List;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        }

        public a(C3545eJ0 c3545eJ0) {
            super(c3545eJ0);
            this.c = C1939Rp1.a(null, new C3478e00(c3545eJ0, 1));
            C1939Rp1.a(null, new C5842p1(this, 3));
            this.d = C1939Rp1.a(null, new C2693aJ0(this, c3545eJ0));
            this.e = C1939Rp1.a(null, new C8053zZ(c3545eJ0, 3));
            this.f = C1939Rp1.a(null, new AZ(c3545eJ0, 1));
            this.g = C1939Rp1.a(null, new BZ(this, 1));
            this.h = XO0.a(EnumC4403iP0.d, new C2917bJ0(this, c3545eJ0));
            C1939Rp1.a(null, new C3126cJ0(0, this, c3545eJ0));
            this.i = C1939Rp1.a(null, new C3336dJ0(this, c3545eJ0));
            C1939Rp1.a(null, new GZ(this, 1));
            this.j = C1939Rp1.a(null, new TI0(c3545eJ0, 0));
            this.k = C1939Rp1.a(null, new UI0(c3545eJ0, 0));
            this.l = C1939Rp1.a(null, new C2690aI0(c3545eJ0, 1));
            this.m = C1939Rp1.a(null, new VI0(c3545eJ0));
            this.n = C1939Rp1.a(null, new WI0(this, 0));
            this.o = C1939Rp1.a(null, new XI0(this, 0));
            C1939Rp1.a(null, new C4640jI0(this, 1));
            C1939Rp1.a(null, new C4850kI0(this, 1));
        }

        @NotNull
        public final Collection<PI0<?>> a() {
            IJ0<Object> ij0 = p[9];
            Object objInvoke = this.j.invoke();
            Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
            return (Collection) objInvoke;
        }

        @NotNull
        public final FC b() {
            IJ0<Object> ij0 = p[0];
            Object objInvoke = this.c.invoke();
            Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
            return (FC) objInvoke;
        }
    }

    /* JADX INFO: renamed from: eJ0$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UK0.a.values().length];
            try {
                UK0.a.C0154a c0154a = UK0.a.e;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UK0.a.C0154a c0154a2 = UK0.a.e;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UK0.a.C0154a c0154a3 = UK0.a.e;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UK0.a.C0154a c0154a4 = UK0.a.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                UK0.a.C0154a c0154a5 = UK0.a.e;
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                UK0.a.C0154a c0154a6 = UK0.a.e;
                iArr[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: eJ0$c */
    public /* synthetic */ class c extends C2574Zj0 implements Function2<OY0, C3637ek1, InterfaceC0671Bj1> {
        public static final c m = new c(2);

        @Override // defpackage.AbstractC1568Mx, defpackage.JI0
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.functions.Function2
        public final InterfaceC0671Bj1 invoke(OY0 oy0, C3637ek1 c3637ek1) {
            OY0 p0 = oy0;
            C3637ek1 p1 = c3637ek1;
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return p0.f(p1);
        }

        @Override // defpackage.AbstractC1568Mx
        public final InterfaceC5486nJ0 j() {
            return C2017Sp1.a.b(OY0.class);
        }

        @Override // defpackage.AbstractC1568Mx
        public final String o() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }
    }

    public C3545eJ0(@NotNull Class<T> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.e = jClass;
        this.g = XO0.a(EnumC4403iP0.d, new YZ(this, 1));
    }

    public static IC y(QC qc, C7983zB1 c7983zB1) {
        C6163qZ c6163qZ = c7983zB1.a;
        C6073q60 c6073q60 = new C6073q60(c6163qZ.b, qc.a);
        C5638o21 c5638o21F = qc.f();
        C01 c01 = C01.e;
        SC sc = SC.d;
        List listC = VE.c(c6163qZ.b.t().j("Any").y());
        C2720aS0 c2720aS0 = c6163qZ.a;
        IC ic = new IC(c6073q60, c5638o21F, c01, sc, listC, c2720aS0);
        ic.T0(new C3755fJ0(c2720aS0, ic), C6702t60.d, null);
        return ic;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.InterfaceC5063lJ0
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final FC c() {
        return ((a) this.g.getValue()).b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.RI0
    @NotNull
    public final List<SJ0> a() {
        a aVar = (a) this.g.getValue();
        aVar.getClass();
        IJ0<Object> ij0 = a.p[7];
        Object objInvoke = aVar.i.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override // defpackage.RI0
    public final boolean b() {
        return c().q() == C01.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.RI0
    @Nullable
    public final String d() {
        a aVar = (a) this.g.getValue();
        aVar.getClass();
        IJ0<Object> ij0 = a.p[3];
        return (String) aVar.e.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.RI0
    @NotNull
    public final Collection<RI0<?>> e() {
        a aVar = (a) this.g.getValue();
        aVar.getClass();
        IJ0<Object> ij0 = a.p[5];
        Object objInvoke = aVar.g.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (Collection) objInvoke;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C3545eJ0) && C7279vr.h(this).equals(C7279vr.h((RI0) obj));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.RI0
    @Nullable
    public final String f() {
        a aVar = (a) this.g.getValue();
        aVar.getClass();
        IJ0<Object> ij0 = a.p[2];
        return (String) aVar.d.invoke();
    }

    @Override // defpackage.RI0
    public final boolean g(@Nullable Object obj) {
        List<RI0<? extends Object>> list = C4753jp1.a;
        Class<T> cls = this.e;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Integer num = C4753jp1.d.get(cls);
        if (num != null) {
            return F62.f(num.intValue(), obj);
        }
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Class<T> cls2 = (Class) C4753jp1.c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // defpackage.InterfaceC7774yC
    @NotNull
    public final Class<T> h() {
        return this.e;
    }

    public final int hashCode() {
        return C7279vr.h(this).hashCode();
    }

    @Override // defpackage.AbstractC5906pJ0
    @NotNull
    public final Collection<InterfaceC3550eL> l() {
        FC fcC = c();
        if (fcC.h() == SC.e || fcC.h() == SC.j) {
            return C5653o60.d;
        }
        Collection<InterfaceC7984zC> collectionR = fcC.r();
        Intrinsics.checkNotNullExpressionValue(collectionR, "getConstructors(...)");
        return collectionR;
    }

    @Override // defpackage.AbstractC5906pJ0
    @NotNull
    public final Collection<InterfaceC2076Tj0> m(@NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(name, "name");
        QY0 qy0V = c().y().v();
        S41 s41 = S41.e;
        Collection<? extends InterfaceC3765fM1> collectionD = qy0V.d(name, s41);
        QY0 qy0Y = c().Y();
        Intrinsics.checkNotNullExpressionValue(qy0Y, "getStaticScope(...)");
        return CollectionsKt.Q(collectionD, qy0Y.d(name, s41));
    }

    @Override // defpackage.AbstractC5906pJ0
    @Nullable
    public final InterfaceC0671Bj1 n(int i) {
        Class<?> declaringClass;
        Class<T> cls = this.e;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((C3545eJ0) C7279vr.j(declaringClass)).n(i);
        }
        FC fcC = c();
        FZ fz = fcC instanceof FZ ? (FZ) fcC : null;
        if (fz != null) {
            AbstractC0673Bk0.e<C2077Tj1, List<C3637ek1>> classLocalVariable = FI0.j;
            Intrinsics.checkNotNullExpressionValue(classLocalVariable, "classLocalVariable");
            C3637ek1 c3637ek1 = (C3637ek1) C5998pk1.b(fz.i, classLocalVariable, i);
            if (c3637ek1 != null) {
                C6582sZ c6582sZ = fz.p;
                return (InterfaceC0671Bj1) C7437wc2.f(this.e, c3637ek1, c6582sZ.b, c6582sZ.d, fz.j, c.m);
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC5906pJ0
    @NotNull
    public final Collection<InterfaceC0671Bj1> q(@NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(name, "name");
        QY0 qy0V = c().y().v();
        S41 s41 = S41.e;
        Collection collectionB = qy0V.b(name, s41);
        QY0 qy0Y = c().Y();
        Intrinsics.checkNotNullExpressionValue(qy0Y, "getStaticScope(...)");
        return CollectionsKt.Q(collectionB, qy0Y.b(name, s41));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.RI0
    @NotNull
    public final Collection<InterfaceC6325rJ0<T>> r() {
        a aVar = (a) this.g.getValue();
        aVar.getClass();
        IJ0<Object> ij0 = a.p[4];
        Object objInvoke = aVar.f.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (Collection) objInvoke;
    }

    @Override // defpackage.RI0
    public final boolean s() {
        return c().s();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("class ");
        QC qcZ = z();
        C1758Ph0 c1758Ph0 = qcZ.a;
        String strConcat = c1758Ph0.d() ? "" : c1758Ph0.b().concat(".");
        String strB = qcZ.b.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        sb.append(strConcat + d.l(strB, JwtParser.SEPARATOR_CHAR, '$'));
        return sb.toString();
    }

    public final QC z() {
        EnumC6405rh1 enumC6405rh1I;
        QC qc = DB1.a;
        Class<T> klass = this.e;
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            enumC6405rh1I = componentType.isPrimitive() ? DI0.e(componentType.getSimpleName()).i() : null;
            if (enumC6405rh1I != null) {
                return new QC(C4194hP1.l, enumC6405rh1I.e);
            }
            C1758Ph0 topLevelFqName = C4194hP1.a.g.g();
            Intrinsics.checkNotNullExpressionValue(topLevelFqName, "toSafe(...)");
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            C1758Ph0 c1758Ph0E = topLevelFqName.e();
            return new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)"));
        }
        if (klass.equals(Void.TYPE)) {
            return DB1.a;
        }
        enumC6405rh1I = klass.isPrimitive() ? DI0.e(klass.getSimpleName()).i() : null;
        if (enumC6405rh1I != null) {
            return new QC(C4194hP1.l, enumC6405rh1I.d);
        }
        QC qcA = C4753jp1.a(klass);
        if (!qcA.c) {
            String str = RE0.a;
            C1758Ph0 fqName = qcA.a();
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            QC qc2 = RE0.h.get(fqName.i());
            if (qc2 != null) {
                return qc2;
            }
        }
        return qcA;
    }
}
