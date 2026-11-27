package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6886u extends AbstractC4216hX {

    @NotNull
    public final AbstractC5706oM1 e;

    @NotNull
    public final AbstractC5706oM1 g;

    public C6886u(@NotNull AbstractC5706oM1 delegate, @NotNull AbstractC5706oM1 abbreviation) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(abbreviation, "abbreviation");
        this.e = delegate;
        this.g = abbreviation;
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5706oM1 b1(@NotNull C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new C6886u(this.e.b1(newAttributes), this.g);
    }

    @Override // defpackage.AbstractC4216hX
    @NotNull
    public final AbstractC5706oM1 e1() {
        return this.e;
    }

    @Override // defpackage.AbstractC4216hX
    public final AbstractC4216hX g1(AbstractC5706oM1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new C6886u(delegate, this.g);
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public final C6886u Z0(boolean z) {
        return new C6886u(this.e.Z0(z), this.g.Z0(z));
    }

    @Override // defpackage.AbstractC4216hX
    @NotNull
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public final C6886u X0(@NotNull AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC4649jL0 abstractC4649jL0T = kotlinTypeRefiner.t(this.e);
        Intrinsics.c(abstractC4649jL0T, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC4649jL0 abstractC4649jL0T2 = kotlinTypeRefiner.t(this.g);
        Intrinsics.c(abstractC4649jL0T2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C6886u((AbstractC5706oM1) abstractC4649jL0T, (AbstractC5706oM1) abstractC4649jL0T2);
    }
}
