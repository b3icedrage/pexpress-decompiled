package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class K51 extends AbstractC4216hX implements HR {

    @NotNull
    public final AbstractC5706oM1 e;

    public K51(@NotNull AbstractC5706oM1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.e = delegate;
    }

    public static AbstractC5706oM1 h1(AbstractC5706oM1 abstractC5706oM1) {
        AbstractC5706oM1 abstractC5706oM1Z0 = abstractC5706oM1.Z0(false);
        Intrinsics.checkNotNullParameter(abstractC5706oM1, "<this>");
        return !C3089c72.f(abstractC5706oM1) ? abstractC5706oM1Z0 : new K51(abstractC5706oM1Z0);
    }

    @Override // defpackage.HR
    @NotNull
    public final P92 G0(@NotNull AbstractC4649jL0 replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        P92 p92Y0 = replacement.Y0();
        Intrinsics.checkNotNullParameter(p92Y0, "<this>");
        if (!C3089c72.f(p92Y0) && !C3089c72.e(p92Y0)) {
            return p92Y0;
        }
        if (p92Y0 instanceof AbstractC5706oM1) {
            return h1((AbstractC5706oM1) p92Y0);
        }
        if (p92Y0 instanceof AbstractC2299We0) {
            AbstractC2299We0 abstractC2299We0 = (AbstractC2299We0) p92Y0;
            return C6621sj.r(C5492nL0.a(h1(abstractC2299We0.e), h1(abstractC2299We0.g)), C6621sj.e(p92Y0));
        }
        throw new IllegalStateException(("Incorrect type: " + p92Y0).toString());
    }

    @Override // defpackage.HR
    public final boolean H0() {
        return true;
    }

    @Override // defpackage.AbstractC4216hX, defpackage.AbstractC4649jL0
    public final boolean W0() {
        return false;
    }

    @Override // defpackage.AbstractC5706oM1, defpackage.P92
    public final P92 b1(C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new K51(this.e.b1(newAttributes));
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: c1 */
    public final AbstractC5706oM1 Z0(boolean z) {
        return z ? this.e.Z0(true) : this;
    }

    @Override // defpackage.AbstractC5706oM1
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5706oM1 b1(C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new K51(this.e.b1(newAttributes));
    }

    @Override // defpackage.AbstractC4216hX
    @NotNull
    public final AbstractC5706oM1 e1() {
        return this.e;
    }

    @Override // defpackage.AbstractC4216hX
    public final AbstractC4216hX g1(AbstractC5706oM1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new K51(delegate);
    }
}
