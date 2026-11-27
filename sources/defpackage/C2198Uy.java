package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Uy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2198Uy extends AbstractC5706oM1 implements InterfaceC3054bz {

    @NotNull
    public final N62 e;

    @NotNull
    public final C2618Zy g;
    public final boolean h;

    @NotNull
    public final C5655o62 i;

    public C2198Uy(@NotNull N62 typeProjection, @NotNull C2618Zy constructor, boolean z, @NotNull C5655o62 attributes) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.e = typeProjection;
        this.g = constructor;
        this.h = z;
        this.i = attributes;
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final List<N62> T0() {
        return C5653o60.d;
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final C5655o62 U0() {
        return this.i;
    }

    @Override // defpackage.AbstractC4649jL0
    public final InterfaceC6494s62 V0() {
        return this.g;
    }

    @Override // defpackage.AbstractC4649jL0
    public final boolean W0() {
        return this.h;
    }

    @Override // defpackage.AbstractC4649jL0
    public final AbstractC4649jL0 X0(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        N62 n62A = this.e.a(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(n62A, "refine(...)");
        return new C2198Uy(n62A, this.g, this.h, this.i);
    }

    @Override // defpackage.AbstractC5706oM1, defpackage.P92
    public final P92 Z0(boolean z) {
        if (z == this.h) {
            return this;
        }
        return new C2198Uy(this.e, this.g, z, this.i);
    }

    @Override // defpackage.P92
    /* JADX INFO: renamed from: a1 */
    public final P92 X0(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        N62 n62A = this.e.a(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(n62A, "refine(...)");
        return new C2198Uy(n62A, this.g, this.h, this.i);
    }

    @Override // defpackage.AbstractC5706oM1
    /* JADX INFO: renamed from: c1 */
    public final AbstractC5706oM1 Z0(boolean z) {
        if (z == this.h) {
            return this;
        }
        return new C2198Uy(this.e, this.g, z, this.i);
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5706oM1 b1(@NotNull C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new C2198Uy(this.e, this.g, this.h, newAttributes);
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.e);
        sb.append(')');
        sb.append(this.h ? "?" : "");
        return sb.toString();
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final QY0 v() {
        return R70.a(K70.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }
}
