package defpackage;

import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class HJ0 implements GJ0 {
    public static final /* synthetic */ IJ0<Object>[] e;

    @NotNull
    public final PI0<?> a;
    public final int b;

    @NotNull
    public final GJ0.a c;

    @NotNull
    public final C1939Rp1.a d;

    public static final class a implements Type {

        @NotNull
        public final Type[] d;
        public final int e;

        public a(@NotNull Type[] types) {
            Intrinsics.checkNotNullParameter(types, "types");
            this.d = types;
            this.e = Arrays.hashCode(types);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(this.d, ((a) obj).d);
            }
            return false;
        }

        @Override // java.lang.reflect.Type
        @NotNull
        public final String getTypeName() {
            return C1526Mj.x(this.d, ", ", "[", "]", null, 56);
        }

        public final int hashCode() {
            return this.e;
        }

        @NotNull
        public final String toString() {
            return getTypeName();
        }
    }

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        e = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(HJ0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(HJ0.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public HJ0(@NotNull PI0<?> callable, int i, @NotNull GJ0.a kind, @NotNull Function0<? extends InterfaceC1582Nb1> computeDescriptor) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(computeDescriptor, "computeDescriptor");
        this.a = callable;
        this.b = i;
        this.c = kind;
        this.d = C1939Rp1.a(null, computeDescriptor);
        C1939Rp1.a(null, new WI0(this, 1));
    }

    public final InterfaceC1582Nb1 a() {
        IJ0<Object> ij0 = e[0];
        Object objInvoke = this.d.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (InterfaceC1582Nb1) objInvoke;
    }

    @Override // defpackage.GJ0
    public final boolean e() {
        InterfaceC1582Nb1 interfaceC1582Nb1A = a();
        return (interfaceC1582Nb1A instanceof Xc2) && ((Xc2) interfaceC1582Nb1A).q0() != null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof HJ0)) {
            return false;
        }
        HJ0 hj0 = (HJ0) obj;
        if (Intrinsics.a(this.a, hj0.a)) {
            return this.b == hj0.b;
        }
        return false;
    }

    @Override // defpackage.GJ0
    @Nullable
    public final String getName() {
        InterfaceC1582Nb1 interfaceC1582Nb1A = a();
        Xc2 xc2 = interfaceC1582Nb1A instanceof Xc2 ? (Xc2) interfaceC1582Nb1A : null;
        if (xc2 != null && !xc2.e().L()) {
            C5638o21 name = xc2.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!name.e) {
                return name.e();
            }
        }
        return null;
    }

    @Override // defpackage.GJ0
    @NotNull
    public final WJ0 getType() {
        AbstractC4649jL0 type = a().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return new WJ0(type, new XI0(this, 1));
    }

    @Override // defpackage.GJ0
    @NotNull
    public final GJ0.a h() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.GJ0
    public final int l() {
        return this.b;
    }

    @Override // defpackage.GJ0
    public final boolean m() {
        InterfaceC1582Nb1 interfaceC1582Nb1A = a();
        Xc2 xc2 = interfaceC1582Nb1A instanceof Xc2 ? (Xc2) interfaceC1582Nb1A : null;
        if (xc2 != null) {
            return C4900kZ.a(xc2);
        }
        return false;
    }

    @NotNull
    public final String toString() {
        String strB;
        C2964bZ c2964bZ = C2593Zp1.a;
        Intrinsics.checkNotNullParameter(this, "parameter");
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("extension receiver parameter");
        } else {
            if (iOrdinal != 2) {
                throw new C6489s51();
            }
            sb.append("parameter #" + this.b + ' ' + getName());
        }
        sb.append(" of ");
        InterfaceC1490Lx interfaceC1490LxO = this.a.o();
        if (interfaceC1490LxO instanceof InterfaceC0671Bj1) {
            strB = C2593Zp1.c((InterfaceC0671Bj1) interfaceC1490LxO);
        } else {
            if (!(interfaceC1490LxO instanceof InterfaceC2076Tj0)) {
                throw new IllegalStateException(("Illegal callable: " + interfaceC1490LxO).toString());
            }
            strB = C2593Zp1.b((InterfaceC2076Tj0) interfaceC1490LxO);
        }
        sb.append(strB);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
