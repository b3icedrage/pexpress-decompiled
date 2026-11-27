package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: fD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3736fD implements Function1 {
    public static final C3736fD e = new C3736fD(0);
    public static final C3736fD g = new C3736fD(1);
    public final /* synthetic */ int d;

    public /* synthetic */ C3736fD(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                InterfaceC1490Lx it = (InterfaceC1490Lx) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(C0648Bc.d(it));
            default:
                InterfaceC2076Tj0 descriptor = (InterfaceC2076Tj0) obj;
                Regex regex = AbstractC5906pJ0.d;
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return XY.c.w(descriptor) + " | " + DB1.c(descriptor).a();
        }
    }
}
