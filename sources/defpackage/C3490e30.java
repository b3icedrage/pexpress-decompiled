package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: e30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3490e30 extends CK<Double> {
    public C3490e30(double d) {
        super(Double.valueOf(d));
    }

    @Override // defpackage.CK
    public final AbstractC4649jL0 a(S01 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        RK0 rk0T = module.t();
        rk0T.getClass();
        AbstractC5706oM1 abstractC5706oM1S = rk0T.s(EnumC6405rh1.DOUBLE);
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1S, "getDoubleType(...)");
        return abstractC5706oM1S;
    }

    @Override // defpackage.CK
    @NotNull
    public final String toString() {
        return ((Number) this.a).doubleValue() + ".toDouble()";
    }
}
