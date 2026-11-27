package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HY implements Function2 {
    public final InterfaceC1335Jx d;
    public final InterfaceC1335Jx e;

    public HY(InterfaceC1335Jx interfaceC1335Jx, InterfaceC1335Jx interfaceC1335Jx2) {
        this.d = interfaceC1335Jx;
        this.e = interfaceC1335Jx2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.a((InterfaceC4675jU) obj, this.d) && Intrinsics.a((InterfaceC4675jU) obj2, this.e));
    }
}
