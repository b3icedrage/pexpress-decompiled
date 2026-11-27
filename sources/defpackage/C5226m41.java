package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: m41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5226m41 extends AbstractC5706oM1 implements InterfaceC3054bz {

    @NotNull
    public final EnumC2120Ty e;

    @NotNull
    public final C5436n41 g;

    @Nullable
    public final P92 h;

    @NotNull
    public final C5655o62 i;
    public final boolean j;
    public final boolean k;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5226m41(EnumC2120Ty enumC2120Ty, C5436n41 c5436n41, P92 p92, C5655o62 c5655o62, boolean z, int i) {
        if ((i & 8) != 0) {
            C5655o62.e.getClass();
            c5655o62 = C5655o62.g;
        }
        this(enumC2120Ty, c5436n41, p92, c5655o62, (i & 16) != 0 ? false : z, false);
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
        return this.j;
    }

    @Override // defpackage.AbstractC5706oM1, defpackage.P92
    public final P92 Z0(boolean z) {
        return new C5226m41(this.e, this.g, this.h, this.i, z, 32);
    }

    @Override // defpackage.AbstractC5706oM1
    /* JADX INFO: renamed from: c1 */
    public final AbstractC5706oM1 Z0(boolean z) {
        return new C5226m41(this.e, this.g, this.h, this.i, z, 32);
    }

    @Override // defpackage.AbstractC5706oM1
    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5706oM1 b1(@NotNull C5655o62 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new C5226m41(this.e, this.g, this.h, newAttributes, this.j, this.k);
    }

    @Override // defpackage.P92
    @NotNull
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public final C5226m41 X0(@NotNull AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        C5436n41 c5436n41 = this.g;
        c5436n41.getClass();
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        N62 n62A = c5436n41.a.a(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(n62A, "refine(...)");
        C3126cJ0 c3126cJ0 = c5436n41.b != null ? new C3126cJ0(1, c5436n41, kotlinTypeRefiner) : null;
        C5436n41 c5436n42 = c5436n41.c;
        if (c5436n42 == null) {
            c5436n42 = c5436n41;
        }
        C5436n41 c5436n43 = new C5436n41(n62A, c3126cJ0, c5436n42, c5436n41.d);
        P92 p92 = this.h;
        return new C5226m41(this.e, c5436n43, p92 != null ? kotlinTypeRefiner.t(p92).Y0() : null, this.i, this.j, 32);
    }

    @Override // defpackage.AbstractC4649jL0
    @NotNull
    public final QY0 v() {
        return R70.a(K70.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public C5226m41(@NotNull EnumC2120Ty captureStatus, @NotNull C5436n41 constructor, @Nullable P92 p92, @NotNull C5655o62 attributes, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.e = captureStatus;
        this.g = constructor;
        this.h = p92;
        this.i = attributes;
        this.j = z;
        this.k = z2;
    }
}
