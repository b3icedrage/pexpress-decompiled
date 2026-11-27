package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5282mL0 implements Function1 {
    public final InterfaceC6494s62 d;
    public final List e;
    public final QY0 g;

    public C5282mL0(QY0 qy0, C5655o62 c5655o62, InterfaceC6494s62 interfaceC6494s62, List list, boolean z) {
        this.d = interfaceC6494s62;
        this.e = list;
        this.g = qy0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC6331rL0 kotlinTypeRefiner = (AbstractC6331rL0) obj;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        InterfaceC5044lD interfaceC5044lDC = this.d.c();
        if (interfaceC5044lDC != null) {
            kotlinTypeRefiner.y(interfaceC5044lDC);
        }
        return null;
    }
}
