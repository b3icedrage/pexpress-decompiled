package defpackage;

import io.sentry.util.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SI0 implements InterfaceC1608Nj0, l.a {
    public static C5638o21 a(C1758Ph0 c1758Ph0, String str, C1758Ph0 c1758Ph1, String str2) {
        Intrinsics.checkNotNullExpressionValue(c1758Ph0, str);
        C5638o21 c5638o21F = c1758Ph1.f();
        Intrinsics.checkNotNullExpressionValue(c5638o21F, str2);
        return c5638o21F;
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        AbstractC3926g70 abstractC3926g70C = ((AbstractC7844yZ0) obj).c();
        return Boolean.valueOf(abstractC3926g70C instanceof AbstractC3926g70.b ? true : Intrinsics.a(abstractC3926g70C, AbstractC3926g70.d.a));
    }

    @Override // io.sentry.util.l.a
    public Object b() {
        return C2688aH1.lambda$new$3();
    }
}
