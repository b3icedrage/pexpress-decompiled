package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class OI0 implements Function0 {
    public final InterfaceC1490Lx d;
    public final int e;

    public OI0(InterfaceC1490Lx interfaceC1490Lx, int i) {
        this.d = interfaceC1490Lx;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Xc2 xc2 = this.d.j().get(this.e);
        Intrinsics.checkNotNullExpressionValue(xc2, "get(...)");
        return xc2;
    }
}
