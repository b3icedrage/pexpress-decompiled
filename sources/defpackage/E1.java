package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class E1 implements Function0<AbstractC5706oM1> {
    public final /* synthetic */ C5638o21 d;
    public final /* synthetic */ F1 e;

    public E1(F1 f1, C5638o21 c5638o21) {
        this.e = f1;
        this.d = c5638o21;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC5706oM1 invoke() {
        C5655o62.e.getClass();
        C5655o62 c5655o62 = C5655o62.g;
        InterfaceC6494s62 interfaceC6494s62P = this.e.p();
        List list = Collections.EMPTY_LIST;
        D1 getScope = new D1(this, 0);
        Intrinsics.checkNotNullParameter(getScope, "getScope");
        return C5492nL0.d(new ZO0(C2720aS0.e, getScope), c5655o62, interfaceC6494s62P, list, false);
    }
}
