package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Zy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2618Zy implements InterfaceC2540Yy {

    @NotNull
    public final N62 a;

    @Nullable
    public C5436n41 b;

    public C2618Zy(@NotNull N62 projection) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.a = projection;
        projection.b();
        EnumC3610ed2 enumC3610ed2 = EnumC3610ed2.INVARIANT;
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final Collection<AbstractC4649jL0> a() {
        N62 n62 = this.a;
        AbstractC4649jL0 type = n62.b() == EnumC3610ed2.OUT_VARIANCE ? n62.getType() : t().o();
        Intrinsics.checkNotNull(type);
        return VE.c(type);
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final List<H62> b() {
        return C5653o60.d;
    }

    @Override // defpackage.InterfaceC6494s62
    public final /* bridge */ /* synthetic */ InterfaceC5044lD c() {
        return null;
    }

    @Override // defpackage.InterfaceC6494s62
    public final boolean e() {
        return false;
    }

    @Override // defpackage.InterfaceC2540Yy
    @NotNull
    public final N62 f() {
        return this.a;
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final RK0 t() {
        RK0 rk0T = this.a.getType().V0().t();
        Intrinsics.checkNotNullExpressionValue(rk0T, "getBuiltIns(...)");
        return rk0T;
    }

    @NotNull
    public final String toString() {
        return "CapturedTypeConstructor(" + this.a + ')';
    }
}
