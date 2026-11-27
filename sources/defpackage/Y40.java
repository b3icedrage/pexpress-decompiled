package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Y40 extends AbstractC2299We0 {

    @NotNull
    public final C5655o62 h;

    /* JADX WARN: Illegal instructions before constructor call */
    public Y40(@NotNull RK0 builtIns, @NotNull C5655o62 attributes) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        AbstractC5706oM1 abstractC5706oM1N = builtIns.n();
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1N, "getNothingType(...)");
        AbstractC5706oM1 abstractC5706oM1O = builtIns.o();
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1O, "getNullableAnyType(...)");
        super(abstractC5706oM1N, abstractC5706oM1O);
        this.h = attributes;
    }

    @Override // defpackage.AbstractC2299We0, defpackage.AbstractC4649jL0
    @NotNull
    public final C5655o62 U0() {
        return this.h;
    }

    @Override // defpackage.AbstractC2299We0, defpackage.AbstractC4649jL0
    public final boolean W0() {
        return false;
    }

    @Override // defpackage.AbstractC4649jL0
    public final AbstractC4649jL0 X0(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // defpackage.P92
    public final P92 a1(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // defpackage.P92
    public final P92 b1(C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new Y40(C0564Aa.l(this.g), newAttributes);
    }

    @Override // defpackage.AbstractC2299We0
    @NotNull
    public final AbstractC5706oM1 c1() {
        return this.g;
    }

    @Override // defpackage.AbstractC2299We0
    @NotNull
    public final String d1(@NotNull C2964bZ renderer, @NotNull C2964bZ options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        return "dynamic";
    }

    @Override // defpackage.P92
    public final P92 Z0(boolean z) {
        return this;
    }
}
