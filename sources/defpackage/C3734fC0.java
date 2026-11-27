package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3734fC0 extends AbstractC1521Mh0 implements Function1<Throwable, Unit> {
    public final AtomicInteger e;
    public final Thread g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3734fC0(@NotNull C6251qy continuation, @NotNull InterfaceC2833av delegate) {
        int i;
        super(delegate);
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        AtomicInteger atomicInteger = new AtomicInteger(1);
        this.e = atomicInteger;
        this.g = Thread.currentThread();
        continuation.u(this);
        do {
            i = atomicInteger.get();
            if (i != 1) {
                if (i == 3 || i == 4 || i == 5) {
                    return;
                }
                u(i);
                throw null;
            }
        } while (!this.e.compareAndSet(i, 1));
    }

    public static void u(int i) {
        throw new IllegalStateException(EK.e(i, "Illegal state: ").toString());
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        AtomicInteger atomicInteger = this.e;
        while (true) {
            int i = atomicInteger.get();
            if (i != 0) {
                if (i != 1) {
                    if (i != 2 && i != 3 && i != 4 && i != 5) {
                        u(i);
                        throw null;
                    }
                    break;
                    break;
                    break;
                    break;
                }
                if (atomicInteger.compareAndSet(i, 3)) {
                    break;
                }
            } else if (atomicInteger.compareAndSet(i, 4)) {
                this.g.interrupt();
                atomicInteger.set(5);
                break;
            }
        }
        return Unit.a;
    }

    @Override // defpackage.AbstractC1521Mh0, defpackage.UN1
    public final long s0(@NotNull C1481Lu sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            v(false);
            return super.s0(sink, j);
        } finally {
            v(true);
        }
    }

    public final void t() {
        AtomicInteger atomicInteger = this.e;
        while (true) {
            int i = atomicInteger.get();
            if (i == 0 || i == 3) {
                if (atomicInteger.compareAndSet(i, 2)) {
                    return;
                }
            } else if (i != 4) {
                if (i == 5) {
                    Thread.interrupted();
                    return;
                } else {
                    u(i);
                    throw null;
                }
            }
        }
    }

    public final void v(boolean z) {
        while (true) {
            AtomicInteger atomicInteger = this.e;
            int i = atomicInteger.get();
            if (i == 0 || i == 1) {
                if (atomicInteger.compareAndSet(i, 1 ^ (z ? 1 : 0))) {
                    return;
                }
            } else if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        Thread.interrupted();
                        return;
                    } else {
                        u(i);
                        throw null;
                    }
                }
            } else if (atomicInteger.compareAndSet(i, 4)) {
                this.g.interrupt();
                atomicInteger.set(5);
                return;
            }
        }
    }
}
