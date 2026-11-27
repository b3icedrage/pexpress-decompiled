package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: bY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC2962bY0<T> extends YX0<T> implements Callable {
    public final AbstractC2882b80 d;

    public CallableC2962bY0(AbstractC2882b80 abstractC2882b80) {
        this.d = abstractC2882b80;
    }

    @Override // defpackage.YX0
    public final void b(InterfaceC3381dY0<? super T> interfaceC3381dY0) {
        interfaceC3381dY0.c(EnumC4810k60.d);
        interfaceC3381dY0.onSuccess(this.d);
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return (T) this.d;
    }
}
