package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class BW extends AbstractC4216hX implements HR, CW {

    @NotNull
    public final AbstractC5706oM1 e;
    public final boolean g;

    public static final class a {
        public static BW a(P92 type, boolean z) {
            boolean zE;
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof BW) {
                return (BW) type;
            }
            if (!(type.V0() instanceof C41) && !(type.V0().c() instanceof H62) && !(type instanceof C5226m41) && !(type instanceof XT1)) {
                zE = false;
            } else if (type instanceof XT1) {
                zE = C3089c72.e(type);
            } else {
                InterfaceC5044lD interfaceC5044lDC = type.V0().c();
                I62 i62 = interfaceC5044lDC instanceof I62 ? (I62) interfaceC5044lDC : null;
                if (i62 != null && !i62.p) {
                    zE = true;
                } else if (z && (type.V0().c() instanceof H62)) {
                    zE = C3089c72.e(type);
                } else {
                    Intrinsics.checkNotNullParameter(type, "type");
                    zE = !O0.a(C4156hD.a(false, null, null, 24), C6621sj.m(type), C6075q62.c.b.a);
                }
            }
            if (!zE) {
                return null;
            }
            if (type instanceof AbstractC2299We0) {
                AbstractC2299We0 abstractC2299We0 = (AbstractC2299We0) type;
                Intrinsics.a(abstractC2299We0.e.V0(), abstractC2299We0.g.V0());
            }
            return new BW(C6621sj.m(type).Z0(false), z);
        }
    }

    public BW(AbstractC5706oM1 abstractC5706oM1, boolean z) {
        this.e = abstractC5706oM1;
        this.g = z;
    }

    @Override // defpackage.HR
    @NotNull
    public final P92 G0(@NotNull AbstractC4649jL0 replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return C6971uO1.a(replacement.Y0(), this.g);
    }

    @Override // defpackage.HR
    public final boolean H0() {
        AbstractC5706oM1 abstractC5706oM1 = this.e;
        return (abstractC5706oM1.V0() instanceof C41) || (abstractC5706oM1.V0().c() instanceof H62);
    }

    @Override // defpackage.AbstractC4216hX, defpackage.AbstractC4649jL0
    public final boolean W0() {
        return false;
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: c1 */
    public final AbstractC5706oM1 Z0(boolean z) {
        return z ? this.e.Z0(z) : this;
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5706oM1 b1(@NotNull C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new BW(this.e.b1(newAttributes), this.g);
    }

    @Override // defpackage.AbstractC4216hX
    @NotNull
    public final AbstractC5706oM1 e1() {
        return this.e;
    }

    @Override // defpackage.AbstractC4216hX
    public final AbstractC4216hX g1(AbstractC5706oM1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new BW(delegate, this.g);
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    public final String toString() {
        return this.e + " & Any";
    }
}
