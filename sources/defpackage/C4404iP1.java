package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: iP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4404iP1 extends O62 {

    @NotNull
    public final AbstractC5706oM1 a;

    public C4404iP1(@NotNull RK0 kotlinBuiltIns) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns, "kotlinBuiltIns");
        AbstractC5706oM1 abstractC5706oM1O = kotlinBuiltIns.o();
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1O, "getNullableAnyType(...)");
        this.a = abstractC5706oM1O;
    }

    @Override // defpackage.N62
    @NotNull
    public final N62 a(@NotNull AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // defpackage.N62
    @NotNull
    public final EnumC3610ed2 b() {
        return EnumC3610ed2.OUT_VARIANCE;
    }

    @Override // defpackage.N62
    public final boolean c() {
        return true;
    }

    @Override // defpackage.N62
    @NotNull
    public final AbstractC4649jL0 getType() {
        return this.a;
    }
}
