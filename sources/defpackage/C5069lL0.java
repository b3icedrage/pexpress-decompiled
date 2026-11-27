package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5069lL0 implements Function1 {
    public final InterfaceC6494s62 d;
    public final List e;

    public C5069lL0(InterfaceC6494s62 interfaceC6494s62, List list, C5655o62 c5655o62, boolean z) {
        this.d = interfaceC6494s62;
        this.e = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC6331rL0 refiner = (AbstractC6331rL0) obj;
        Intrinsics.checkNotNullParameter(refiner, "refiner");
        InterfaceC5044lD interfaceC5044lDC = this.d.c();
        if (interfaceC5044lDC != null) {
            refiner.y(interfaceC5044lDC);
        }
        return null;
    }
}
