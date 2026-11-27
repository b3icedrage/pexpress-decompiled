package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class QB implements Function1 {
    public static final QB e = new QB(0);
    public static final QB g = new QB(1);
    public static final QB h = new QB(2);
    public final /* synthetic */ int d;

    public /* synthetic */ QB(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Intrinsics.checkNotNullParameter((InterfaceC2076Tj0) obj, "<this>");
                return null;
            case 1:
                QC it = (QC) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return 0;
            case 2:
                String simpleName = ((Class) obj).getSimpleName();
                if (!C5638o21.l(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return C5638o21.k(simpleName);
                }
                return null;
            default:
                InterfaceC1490Lx interfaceC1490Lx = (InterfaceC1490Lx) obj;
                Intrinsics.checkNotNull(interfaceC1490Lx);
                return C4900kZ.l(interfaceC1490Lx);
        }
    }
}
