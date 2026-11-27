package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AO0 implements Function1 {
    public final InterfaceC3765fM1 d;
    public final FO0 e;

    public AO0(InterfaceC3765fM1 interfaceC3765fM1, FO0 fo0) {
        this.d = interfaceC3765fM1;
        this.e = fo0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C5638o21 accessorName = (C5638o21) obj;
        Intrinsics.checkNotNullParameter(accessorName, "accessorName");
        InterfaceC3765fM1 interfaceC3765fM1 = this.d;
        if (Intrinsics.a(interfaceC3765fM1.getName(), accessorName)) {
            return VE.c(interfaceC3765fM1);
        }
        FO0 fo0 = this.e;
        return CollectionsKt.Q(fo0.N(accessorName), fo0.O(accessorName));
    }
}
