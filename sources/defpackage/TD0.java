package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TD0 implements Function0 {
    public final LO0 d;
    public final UD0 e;

    public TD0(LO0 lo0, UD0 ud0) {
        this.d = lo0;
        this.e = ud0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC5706oM1 abstractC5706oM1Y = this.d.a.o.h.i(this.e.a).y();
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Y, "getDefaultType(...)");
        return abstractC5706oM1Y;
    }
}
