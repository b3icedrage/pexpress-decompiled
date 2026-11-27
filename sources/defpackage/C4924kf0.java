package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4924kf0 extends CK<Float> {
    public C4924kf0(float f) {
        super(Float.valueOf(f));
    }

    @Override // defpackage.CK
    public final AbstractC4649jL0 a(S01 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        RK0 rk0T = module.t();
        rk0T.getClass();
        AbstractC5706oM1 abstractC5706oM1S = rk0T.s(EnumC6405rh1.FLOAT);
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1S, "getFloatType(...)");
        return abstractC5706oM1S;
    }

    @Override // defpackage.CK
    @NotNull
    public final String toString() {
        return ((Number) this.a).floatValue() + ".toFloat()";
    }
}
