package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Na1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1579Na1 implements Function1<InterfaceC1490Lx, Unit> {
    public final /* synthetic */ G1 d;
    public final /* synthetic */ InterfaceC1490Lx e;

    public C1579Na1(G1 g1, InterfaceC1490Lx interfaceC1490Lx) {
        this.d = g1;
        this.e = interfaceC1490Lx;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1490Lx interfaceC1490Lx) {
        InterfaceC1490Lx second = interfaceC1490Lx;
        G1 g1 = this.d;
        InterfaceC1490Lx first = this.e;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        g1.e(first, second);
        return Unit.a;
    }
}
