package defpackage;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: pI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC5904pI1<V> implements Callable<InterfaceC2236Vk1<? extends AbstractC2882b80>> {
    public final /* synthetic */ AbstractC5694oI1.b d;

    public CallableC5904pI1(AbstractC5694oI1.b bVar) {
        this.d = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final InterfaceC2236Vk1<? extends AbstractC2882b80> call() {
        C1207Ig0 c1207Ig0E = this.d.b.a.b.e();
        Intrinsics.checkNotNullExpressionValue(c1207Ig0E, "eventProcessor.onBackpressureBuffer()");
        return c1207Ig0E;
    }
}
