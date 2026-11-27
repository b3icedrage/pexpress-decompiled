package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class VI0 implements Function0 {
    public final C3545eJ0 d;

    public VI0(C3545eJ0 c3545eJ0) {
        this.d = c3545eJ0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C3545eJ0 c3545eJ0 = this.d;
        QY0 qy0Y = c3545eJ0.c().Y();
        Intrinsics.checkNotNullExpressionValue(qy0Y, "getStaticScope(...)");
        return c3545eJ0.o(qy0Y, AbstractC5906pJ0.c.e);
    }
}
