package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: af0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2764af0 extends AbstractC2299We0 implements InterfaceC3928g72 {

    @NotNull
    public final AbstractC2299We0 h;

    @NotNull
    public final AbstractC4649jL0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2764af0(@NotNull AbstractC2299We0 origin, @NotNull AbstractC4649jL0 enhancement) {
        super(origin.e, origin.g);
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.h = origin;
        this.i = enhancement;
    }

    @Override // defpackage.InterfaceC3928g72
    @NotNull
    public final AbstractC4649jL0 N() {
        return this.i;
    }

    @Override // defpackage.InterfaceC3928g72
    public final P92 N0() {
        return this.h;
    }

    @Override // defpackage.AbstractC4649jL0
    public final AbstractC4649jL0 X0(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC4649jL0 abstractC4649jL0T = kotlinTypeRefiner.t(this.h);
        Intrinsics.c(abstractC4649jL0T, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new C2764af0((AbstractC2299We0) abstractC4649jL0T, kotlinTypeRefiner.t(this.i));
    }

    @Override // defpackage.P92
    @NotNull
    public final P92 Z0(boolean z) {
        return C6621sj.r(this.h.Z0(z), this.i.Y0().Z0(z));
    }

    @Override // defpackage.P92
    /* JADX INFO: renamed from: a1 */
    public final P92 X0(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC4649jL0 abstractC4649jL0T = kotlinTypeRefiner.t(this.h);
        Intrinsics.c(abstractC4649jL0T, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new C2764af0((AbstractC2299We0) abstractC4649jL0T, kotlinTypeRefiner.t(this.i));
    }

    @Override // defpackage.P92
    @NotNull
    public final P92 b1(@NotNull C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return C6621sj.r(this.h.b1(newAttributes), this.i);
    }

    @Override // defpackage.AbstractC2299We0
    @NotNull
    public final AbstractC5706oM1 c1() {
        return this.h.c1();
    }

    @Override // defpackage.AbstractC2299We0
    @NotNull
    public final String d1(@NotNull C2964bZ renderer, @NotNull C2964bZ options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        C3802fZ c3802fZ = options.d;
        c3802fZ.getClass();
        return ((Boolean) c3802fZ.m.b(C3802fZ.Y[11], c3802fZ)).booleanValue() ? renderer.Z(this.i) : this.h.d1(renderer, options);
    }

    @Override // defpackage.AbstractC2299We0
    @NotNull
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.i + ")] " + this.h;
    }
}
