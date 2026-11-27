package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class QK1 extends MB0 {
    public QK1(short s) {
        super(Short.valueOf(s));
    }

    @Override // defpackage.CK
    public final AbstractC4649jL0 a(S01 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        RK0 rk0T = module.t();
        rk0T.getClass();
        AbstractC5706oM1 abstractC5706oM1S = rk0T.s(EnumC6405rh1.SHORT);
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1S, "getShortType(...)");
        return abstractC5706oM1S;
    }

    @Override // defpackage.CK
    @NotNull
    public final String toString() {
        return ((Number) this.a).intValue() + ".toShort()";
    }
}
