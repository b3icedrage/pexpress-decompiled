package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OJ0<V> extends PI0<V> implements IJ0<V> {

    @NotNull
    public static final Object o = new Object();

    @NotNull
    public final AbstractC5906pJ0 i;

    @NotNull
    public final String j;

    @NotNull
    public final String k;

    @Nullable
    public final Object l;

    @NotNull
    public final Object m;

    @NotNull
    public final C1939Rp1.a<InterfaceC0671Bj1> n;

    public static abstract class a<PropertyType, ReturnType> extends PI0<ReturnType> implements InterfaceC6325rJ0<ReturnType>, IJ0.a<PropertyType> {
        @Override // defpackage.PI0
        @NotNull
        public final AbstractC5906pJ0 j() {
            return v().i;
        }

        @Override // defpackage.PI0
        @Nullable
        public final InterfaceC2355Wx<?> m() {
            return null;
        }

        @Override // defpackage.PI0
        public final boolean t() {
            return v().t();
        }

        @NotNull
        public abstract InterfaceC7043uj1 u();

        @NotNull
        public abstract OJ0<PropertyType> v();

        @Override // defpackage.JI0
        public final boolean z() {
            return u().z();
        }
    }

    public static abstract class b<V> extends a<V, V> implements IJ0.b<V> {
        public static final /* synthetic */ IJ0<Object>[] k;

        @NotNull
        public final C1939Rp1.a i = C1939Rp1.a(null, new BZ(this, 2));

        @NotNull
        public final Object j = XO0.a(EnumC4403iP0.d, new PJ0(this, 0));

        static {
            C2251Vp1 c2251Vp1 = C2017Sp1.a;
            k = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(b.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};
        }

        public final boolean equals(@Nullable Object obj) {
            return (obj instanceof b) && Intrinsics.a(v(), ((b) obj).v());
        }

        @Override // defpackage.JI0
        @NotNull
        public final String getName() {
            return C1039Gc0.e(new StringBuilder("<get-"), v().j, '>');
        }

        public final int hashCode() {
            return v().hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
        @Override // defpackage.PI0
        @NotNull
        public final InterfaceC2355Wx<?> i() {
            return (InterfaceC2355Wx) this.j.getValue();
        }

        @Override // defpackage.PI0
        public final InterfaceC1490Lx o() {
            IJ0<Object> ij0 = k[0];
            Object objInvoke = this.i.invoke();
            Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
            return (InterfaceC0905Ej1) objInvoke;
        }

        @NotNull
        public final String toString() {
            return "getter of " + v();
        }

        @Override // OJ0.a
        public final InterfaceC7043uj1 u() {
            IJ0<Object> ij0 = k[0];
            Object objInvoke = this.i.invoke();
            Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
            return (InterfaceC0905Ej1) objInvoke;
        }
    }

    public static abstract class c<V> extends a<V, Unit> implements InterfaceC7586xJ0.a<V> {
        public static final /* synthetic */ IJ0<Object>[] k;

        @NotNull
        public final C1939Rp1.a i = C1939Rp1.a(null, new C7522x1(this, 2));

        @NotNull
        public final Object j = XO0.a(EnumC4403iP0.d, new DZ(this, 1));

        static {
            C2251Vp1 c2251Vp1 = C2017Sp1.a;
            k = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
        }

        public final boolean equals(@Nullable Object obj) {
            return (obj instanceof c) && Intrinsics.a(v(), ((c) obj).v());
        }

        @Override // defpackage.JI0
        @NotNull
        public final String getName() {
            return C1039Gc0.e(new StringBuilder("<set-"), v().j, '>');
        }

        public final int hashCode() {
            return v().hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
        @Override // defpackage.PI0
        @NotNull
        public final InterfaceC2355Wx<?> i() {
            return (InterfaceC2355Wx) this.j.getValue();
        }

        @Override // defpackage.PI0
        public final InterfaceC1490Lx o() {
            IJ0<Object> ij0 = k[0];
            Object objInvoke = this.i.invoke();
            Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
            return (InterfaceC1609Nj1) objInvoke;
        }

        @NotNull
        public final String toString() {
            return "setter of " + v();
        }

        @Override // OJ0.a
        public final InterfaceC7043uj1 u() {
            IJ0<Object> ij0 = k[0];
            Object objInvoke = this.i.invoke();
            Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
            return (InterfaceC1609Nj1) objInvoke;
        }
    }

    public OJ0(AbstractC5906pJ0 abstractC5906pJ0, String str, String str2, C0749Cj1 c0749Cj1, Object obj) {
        this.i = abstractC5906pJ0;
        this.j = str;
        this.k = str2;
        this.l = obj;
        this.m = XO0.a(EnumC4403iP0.d, new C8053zZ(this, 4));
        C1939Rp1.a<InterfaceC0671Bj1> aVarA = C1939Rp1.a(c0749Cj1, new AZ(this, 2));
        Intrinsics.checkNotNullExpressionValue(aVarA, "lazySoft(...)");
        this.n = aVarA;
    }

    public final boolean equals(@Nullable Object obj) {
        OJ0<?> oj0C = C7437wc2.c(obj);
        return oj0C != null && Intrinsics.a(this.i, oj0C.i) && Intrinsics.a(this.j, oj0C.j) && Intrinsics.a(this.k, oj0C.k) && Intrinsics.a(this.l, oj0C.l);
    }

    @Override // defpackage.JI0
    @NotNull
    public final String getName() {
        return this.j;
    }

    public final int hashCode() {
        return this.k.hashCode() + C1039Gc0.b(this.i.hashCode() * 31, 31, this.j);
    }

    @Override // defpackage.PI0
    @NotNull
    public final InterfaceC2355Wx<?> i() {
        return w().i();
    }

    @Override // defpackage.PI0
    @NotNull
    public final AbstractC5906pJ0 j() {
        return this.i;
    }

    @Override // defpackage.PI0
    @Nullable
    public final InterfaceC2355Wx<?> m() {
        w().getClass();
        return null;
    }

    @Override // defpackage.PI0
    public final boolean t() {
        return this.l != AbstractC1568Mx.a.d;
    }

    @NotNull
    public final String toString() {
        C2964bZ c2964bZ = C2593Zp1.a;
        return C2593Zp1.c(o());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fO0, java.lang.Object] */
    @Nullable
    public final Member u() {
        if (!o().U()) {
            return null;
        }
        QC qc = DB1.a;
        EI0 ei0B = DB1.b(o());
        if (ei0B instanceof EI0.c) {
            EI0.c cVar = (EI0.c) ei0B;
            FI0.c cVar2 = cVar.c;
            if ((cVar2.e & 16) == 16) {
                FI0.b bVar = cVar2.k;
                int i = bVar.e;
                if ((i & 1) != 1 || (i & 2) != 2) {
                    return null;
                }
                int i2 = bVar.g;
                InterfaceC5848p21 interfaceC5848p21 = cVar.d;
                return this.i.k(interfaceC5848p21.getString(i2), interfaceC5848p21.getString(bVar.h));
            }
        }
        return (Field) this.m.getValue();
    }

    @Override // defpackage.PI0
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0671Bj1 o() {
        InterfaceC0671Bj1 interfaceC0671Bj1Invoke = this.n.invoke();
        Intrinsics.checkNotNullExpressionValue(interfaceC0671Bj1Invoke, "invoke(...)");
        return interfaceC0671Bj1Invoke;
    }

    @NotNull
    public abstract b<V> w();

    @Override // defpackage.JI0
    public final boolean z() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OJ0(@NotNull AbstractC5906pJ0 container, @NotNull String name, @NotNull String signature, @Nullable Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OJ0(@NotNull AbstractC5906pJ0 container, @NotNull C0749Cj1 descriptor) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String strE = descriptor.getName().e();
        Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
        this(container, strE, DB1.b(descriptor).a(), descriptor, AbstractC1568Mx.a.d);
    }
}
