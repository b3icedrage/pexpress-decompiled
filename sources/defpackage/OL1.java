package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class OL1 implements Function1 {
    public static final OL1 d = new OL1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC5044lD interfaceC5044lDC = ((P92) obj).V0().c();
        if (interfaceC5044lDC == null) {
            return Boolean.FALSE;
        }
        C5638o21 name = interfaceC5044lDC.getName();
        C1758Ph0 c1758Ph0 = RE0.f;
        return Boolean.valueOf(Intrinsics.a(name, c1758Ph0.f()) && Intrinsics.a(C4900kZ.c(interfaceC5044lDC), c1758Ph0));
    }
}
