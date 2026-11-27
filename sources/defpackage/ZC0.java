package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ZC0 extends ZF0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(ZC0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    @NotNull
    public final InterfaceC2672aC0 i;

    public ZC0(@NotNull InterfaceC2672aC0 interfaceC2672aC0) {
        this.i = interfaceC2672aC0;
    }

    @Override // defpackage.InterfaceC2672aC0
    public final void a(@Nullable Throwable th) {
        if (j.compareAndSet(this, 0, 1)) {
            this.i.a(th);
        }
    }
}
