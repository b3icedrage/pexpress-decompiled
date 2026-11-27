package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4662jP1 extends O62 {

    @NotNull
    public final H62 a;

    @NotNull
    public final Object b;

    public C4662jP1(@NotNull H62 typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.a = typeParameter;
        this.b = XO0.a(EnumC4403iP0.d, new YZ(this, 4));
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

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // defpackage.N62
    @NotNull
    public final AbstractC4649jL0 getType() {
        return (AbstractC4649jL0) this.b.getValue();
    }
}
