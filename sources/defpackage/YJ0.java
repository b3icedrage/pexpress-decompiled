package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class YJ0 implements XJ0, InterfaceC5063lJ0 {
    public static final /* synthetic */ IJ0<Object>[] h;

    @NotNull
    public final H62 d;

    @NotNull
    public final C1939Rp1.a e;

    @NotNull
    public final ZJ0 g;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        h = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(YJ0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public YJ0(@Nullable ZJ0 zj0, @NotNull H62 descriptor) {
        Class<?> cls;
        C3545eJ0 c3545eJ0H;
        Object objE0;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.d = descriptor;
        this.e = C1939Rp1.a(null, new LI0(this, 1));
        if (zj0 == null) {
            InterfaceC4675jU interfaceC4675jUE = descriptor.e();
            Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
            if (interfaceC4675jUE instanceof FC) {
                objE0 = h((FC) interfaceC4675jUE);
            } else {
                if (!(interfaceC4675jUE instanceof InterfaceC1490Lx)) {
                    throw new C3761fL0("Unknown type parameter container: " + interfaceC4675jUE);
                }
                InterfaceC4675jU interfaceC4675jUE2 = ((InterfaceC1490Lx) interfaceC4675jUE).e();
                Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE2, "getContainingDeclaration(...)");
                if (interfaceC4675jUE2 instanceof FC) {
                    c3545eJ0H = h((FC) interfaceC4675jUE2);
                } else {
                    QZ qz = interfaceC4675jUE instanceof QZ ? (QZ) interfaceC4675jUE : null;
                    if (qz == null) {
                        throw new C3761fL0("Non-class callable descriptor must be deserialized: " + interfaceC4675jUE);
                    }
                    MZ mzK0 = qz.k0();
                    BI0 bi0 = mzK0 instanceof BI0 ? (BI0) mzK0 : null;
                    InterfaceC2699aL0 interfaceC2699aL0 = bi0 != null ? bi0.d : null;
                    C1627Np1 c1627Np1 = interfaceC2699aL0 instanceof C1627Np1 ? (C1627Np1) interfaceC2699aL0 : null;
                    if (c1627Np1 == null || (cls = c1627Np1.a) == null) {
                        throw new C3761fL0("Container of deserialized member is not resolved: " + qz);
                    }
                    c3545eJ0H = (C3545eJ0) C7279vr.j(cls);
                }
                objE0 = interfaceC4675jUE.e0(new LP(c3545eJ0H), Unit.a);
            }
            zj0 = (ZJ0) objE0;
        }
        this.g = zj0;
    }

    public static C3545eJ0 h(FC fc) {
        Class<?> clsK = C7437wc2.k(fc);
        C3545eJ0 c3545eJ0 = (C3545eJ0) (clsK != null ? C7279vr.j(clsK) : null);
        if (c3545eJ0 != null) {
            return c3545eJ0;
        }
        throw new C3761fL0("Type parameter container is not resolved: " + fc.e());
    }

    @Override // defpackage.InterfaceC5063lJ0
    public final InterfaceC5044lD c() {
        return this.d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof YJ0)) {
            return false;
        }
        YJ0 yj0 = (YJ0) obj;
        return Intrinsics.a(this.g, yj0.g) && Intrinsics.a(getName(), yj0.getName());
    }

    @Override // defpackage.XJ0
    @NotNull
    public final String getName() {
        String strE = this.d.getName().e();
        Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
        return strE;
    }

    @Override // defpackage.XJ0
    @NotNull
    public final List<SJ0> getUpperBounds() {
        IJ0<Object> ij0 = h[0];
        Object objInvoke = this.e.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    public final int hashCode() {
        return getName().hashCode() + (this.g.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        EnumC2920bK0 enumC2920bK0;
        K62.d.getClass();
        Intrinsics.checkNotNullParameter(this, "typeParameter");
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.d.S().ordinal();
        if (iOrdinal == 0) {
            enumC2920bK0 = EnumC2920bK0.d;
        } else if (iOrdinal == 1) {
            enumC2920bK0 = EnumC2920bK0.e;
        } else {
            if (iOrdinal != 2) {
                throw new C6489s51();
            }
            enumC2920bK0 = EnumC2920bK0.g;
        }
        int iOrdinal2 = enumC2920bK0.ordinal();
        if (iOrdinal2 == 0) {
            Unit unit = Unit.a;
        } else if (iOrdinal2 == 1) {
            sb.append("in ");
        } else {
            if (iOrdinal2 != 2) {
                throw new C6489s51();
            }
            sb.append("out ");
        }
        sb.append(getName());
        return sb.toString();
    }
}
