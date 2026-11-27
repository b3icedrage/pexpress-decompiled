package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class IT0 extends MB0 {
    public IT0(long j) {
        super(Long.valueOf(j));
    }

    @Override // defpackage.CK
    public final AbstractC4649jL0 a(S01 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        RK0 rk0T = module.t();
        rk0T.getClass();
        AbstractC5706oM1 abstractC5706oM1S = rk0T.s(EnumC6405rh1.LONG);
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1S, "getLongType(...)");
        return abstractC5706oM1S;
    }

    @Override // defpackage.CK
    @NotNull
    public final String toString() {
        return ((Number) this.a).longValue() + ".toLong()";
    }
}
