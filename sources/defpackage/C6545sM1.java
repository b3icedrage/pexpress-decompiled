package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6545sM1 extends AbstractC4216hX implements InterfaceC3928g72 {

    @NotNull
    public final AbstractC5706oM1 e;

    @NotNull
    public final AbstractC4649jL0 g;

    public C6545sM1(@NotNull AbstractC5706oM1 delegate, @NotNull AbstractC4649jL0 enhancement) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.e = delegate;
        this.g = enhancement;
    }

    @Override // defpackage.InterfaceC3928g72
    @NotNull
    public final AbstractC4649jL0 N() {
        return this.g;
    }

    @Override // defpackage.InterfaceC3928g72
    public final P92 N0() {
        return this.e;
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: c1 */
    public final AbstractC5706oM1 Z0(boolean z) {
        P92 p92R = C6621sj.r(this.e.Z0(z), this.g.Y0().Z0(z));
        Intrinsics.c(p92R, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC5706oM1) p92R;
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5706oM1 b1(@NotNull C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        P92 p92R = C6621sj.r(this.e.b1(newAttributes), this.g);
        Intrinsics.c(p92R, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC5706oM1) p92R;
    }

    @Override // defpackage.AbstractC4216hX
    @NotNull
    public final AbstractC5706oM1 e1() {
        return this.e;
    }

    @Override // defpackage.AbstractC4216hX
    public final AbstractC4216hX g1(AbstractC5706oM1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new C6545sM1(delegate, this.g);
    }

    @Override // defpackage.AbstractC4216hX
    @NotNull
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C6545sM1 X0(@NotNull AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC4649jL0 abstractC4649jL0T = kotlinTypeRefiner.t(this.e);
        Intrinsics.c(abstractC4649jL0T, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C6545sM1((AbstractC5706oM1) abstractC4649jL0T, kotlinTypeRefiner.t(this.g));
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.g + ")] " + this.e;
    }
}
