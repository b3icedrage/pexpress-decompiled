package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class FJ0 extends AbstractC5906pJ0 {

    @NotNull
    public final Class<?> e;

    @NotNull
    public final Object g;

    public final class a extends AbstractC5906pJ0.a {
        public static final /* synthetic */ IJ0<Object>[] g;

        @NotNull
        public final C1939Rp1.a c;

        @NotNull
        public final C1939Rp1.a d;

        @NotNull
        public final Object e;

        @NotNull
        public final Object f;

        static {
            C2251Vp1 c2251Vp1 = C2017Sp1.a;
            g = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(a.class), "members", "getMembers()Ljava/util/Collection;"))};
        }

        public a(FJ0 fj0) {
            super(fj0);
            this.c = C1939Rp1.a(null, new C3478e00(fj0, 2));
            this.d = C1939Rp1.a(null, new TI0(this, 1));
            EnumC4403iP0 enumC4403iP0 = EnumC4403iP0.d;
            this.e = XO0.a(enumC4403iP0, new EJ0(this, fj0));
            this.f = XO0.a(enumC4403iP0, new C2690aI0(this, 2));
            C1939Rp1.a(null, new C3752fI0(1, fj0, this));
        }
    }

    public /* synthetic */ class b extends C2574Zj0 implements Function2<OY0, C3637ek1, InterfaceC0671Bj1> {
        public static final b m = new b(2);

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

    public FJ0(@NotNull Class<?> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.e = jClass;
        this.g = XO0.a(EnumC4403iP0.d, new YZ(this, 2));
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof FJ0) {
            return Intrinsics.a(this.e, ((FJ0) obj).e);
        }
        return false;
    }

    @Override // defpackage.InterfaceC7774yC
    @NotNull
    public final Class<?> h() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // defpackage.AbstractC5906pJ0
    @NotNull
    public final Collection<InterfaceC3550eL> l() {
        return C5653o60.d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fO0, java.lang.Object] */
    @Override // defpackage.AbstractC5906pJ0
    @NotNull
    public final Collection<InterfaceC2076Tj0> m(@NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(name, "name");
        a aVar = (a) this.g.getValue();
        aVar.getClass();
        IJ0<Object> ij0 = a.g[1];
        Object objInvoke = aVar.d.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return ((QY0) objInvoke).d(name, S41.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [fO0, java.lang.Object] */
    @Override // defpackage.AbstractC5906pJ0
    @Nullable
    public final InterfaceC0671Bj1 n(int i) {
        C5651o52 c5651o52 = (C5651o52) ((a) this.g.getValue()).f.getValue();
        if (c5651o52 == null) {
            return null;
        }
        C8003zI0 c8003zI0 = (C8003zI0) c5651o52.d;
        C3218ck1 c3218ck1 = (C3218ck1) c5651o52.e;
        C7793yI0 c7793yI0 = (C7793yI0) c5651o52.g;
        AbstractC0673Bk0.e<C3218ck1, List<C3637ek1>> packageLocalVariable = FI0.n;
        Intrinsics.checkNotNullExpressionValue(packageLocalVariable, "packageLocalVariable");
        C3637ek1 c3637ek1 = (C3637ek1) C5998pk1.b(c3218ck1, packageLocalVariable, i);
        if (c3637ek1 == null) {
            return null;
        }
        C4945kk1 c4945kk1 = c3218ck1.k;
        Intrinsics.checkNotNullExpressionValue(c4945kk1, "getTypeTable(...)");
        return (InterfaceC0671Bj1) C7437wc2.f(this.e, c3637ek1, c8003zI0, new C2656a72(c4945kk1), c7793yI0, b.m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [fO0, java.lang.Object] */
    @Override // defpackage.AbstractC5906pJ0
    @NotNull
    public final Class<?> p() {
        Class<?> cls = (Class) ((a) this.g.getValue()).e.getValue();
        return cls == null ? this.e : cls;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fO0, java.lang.Object] */
    @Override // defpackage.AbstractC5906pJ0
    @NotNull
    public final Collection<InterfaceC0671Bj1> q(@NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(name, "name");
        a aVar = (a) this.g.getValue();
        aVar.getClass();
        IJ0<Object> ij0 = a.g[1];
        Object objInvoke = aVar.d.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return ((QY0) objInvoke).b(name, S41.e);
    }

    @NotNull
    public final String toString() {
        return "file class " + C4753jp1.a(this.e).a();
    }
}
