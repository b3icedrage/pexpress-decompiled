package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class IZ implements Function0 {
    public final FZ d;
    public final C2419Xj1 e;

    public IZ(FZ fz, C2419Xj1 c2419Xj1) {
        this.d = fz;
        this.e = c2419Xj1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FZ fz = this.d;
        return CollectionsKt.e0(fz.p.a.e.f(fz.A, this.e));
    }
}
