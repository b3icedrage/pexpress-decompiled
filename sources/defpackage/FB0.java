package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FB0 extends MB0 {
    public FB0(int i) {
        super(Integer.valueOf(i));
    }

    @Override // defpackage.CK
    public final AbstractC4649jL0 a(S01 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        RK0 rk0T = module.t();
        rk0T.getClass();
        AbstractC5706oM1 abstractC5706oM1S = rk0T.s(EnumC6405rh1.INT);
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1S, "getIntType(...)");
        return abstractC5706oM1S;
    }
}
