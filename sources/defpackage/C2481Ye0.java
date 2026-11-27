package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ye0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2481Ye0 extends AbstractC2299We0 implements HR {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2481Ye0(@NotNull AbstractC5706oM1 lowerBound, @NotNull AbstractC5706oM1 upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }

    @Override // defpackage.HR
    @NotNull
    public final P92 G0(@NotNull AbstractC4649jL0 replacement) {
        P92 p92A;
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        P92 p92Y0 = replacement.Y0();
        if (p92Y0 instanceof AbstractC2299We0) {
            p92A = p92Y0;
        } else {
            if (!(p92Y0 instanceof AbstractC5706oM1)) {
                throw new C6489s51();
            }
            AbstractC5706oM1 abstractC5706oM1 = (AbstractC5706oM1) p92Y0;
            p92A = C5492nL0.a(abstractC5706oM1, abstractC5706oM1.Z0(true));
        }
        return C6621sj.h(p92A, p92Y0);
    }

    @Override // defpackage.HR
    public final boolean H0() {
        AbstractC5706oM1 abstractC5706oM1 = this.e;
        return (abstractC5706oM1.V0().c() instanceof H62) && Intrinsics.a(abstractC5706oM1.V0(), this.g.V0());
    }

    @Override // defpackage.P92
    @NotNull
    public final P92 Z0(boolean z) {
        return C5492nL0.a(this.e.Z0(z), this.g.Z0(z));
    }

    @Override // defpackage.P92
    @NotNull
    public final P92 b1(@NotNull C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return C5492nL0.a(this.e.b1(newAttributes), this.g.b1(newAttributes));
    }

    @Override // defpackage.AbstractC2299We0
    @NotNull
    public final AbstractC5706oM1 c1() {
        return this.e;
    }

    @Override // defpackage.AbstractC2299We0
    @NotNull
    public final String d1(@NotNull C2964bZ renderer, @NotNull C2964bZ options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        boolean zN = options.d.n();
        AbstractC5706oM1 abstractC5706oM1 = this.g;
        AbstractC5706oM1 abstractC5706oM2 = this.e;
        if (!zN) {
            return renderer.F(renderer.Z(abstractC5706oM2), renderer.Z(abstractC5706oM1), C0564Aa.l(this));
        }
        return "(" + renderer.Z(abstractC5706oM2) + ".." + renderer.Z(abstractC5706oM1) + ')';
    }

    @Override // defpackage.P92
    @NotNull
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public final AbstractC2299We0 X0(@NotNull AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC4649jL0 abstractC4649jL0T = kotlinTypeRefiner.t(this.e);
        Intrinsics.c(abstractC4649jL0T, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC4649jL0 abstractC4649jL0T2 = kotlinTypeRefiner.t(this.g);
        Intrinsics.c(abstractC4649jL0T2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C2481Ye0((AbstractC5706oM1) abstractC4649jL0T, (AbstractC5706oM1) abstractC4649jL0T2);
    }

    @Override // defpackage.AbstractC2299We0
    @NotNull
    public final String toString() {
        return "(" + this.e + ".." + this.g + ')';
    }
}
