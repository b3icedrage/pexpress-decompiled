package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EZ extends G1 {
    public final /* synthetic */ ArrayList e;

    public EZ(ArrayList arrayList) {
        this.e = arrayList;
    }

    @Override // defpackage.G1
    public final void a(InterfaceC1490Lx fakeOverride) {
        Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
        C1346Ka1.r(fakeOverride, null);
        this.e.add(fakeOverride);
    }

    @Override // defpackage.G1
    public final void e(InterfaceC1490Lx fromSuper, InterfaceC1490Lx fromCurrent) {
        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
        if (fromCurrent instanceof AbstractC2314Wj0) {
            ((AbstractC2314Wj0) fromCurrent).a1(NZ.a, fromSuper);
        }
    }
}
