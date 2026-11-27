package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC7200vV extends X90 implements Executor {

    @NotNull
    public static final ExecutorC7200vV g = new ExecutorC7200vV();

    @NotNull
    public static final DN h;

    static {
        S82 s82 = S82.g;
        int i = C3379dX1.a;
        if (64 >= i) {
            i = 64;
        }
        int iV = C8056za.v(i, 12, "kotlinx.coroutines.io.parallelism");
        s82.getClass();
        if (iV < 1) {
            throw new IllegalArgumentException(EK.e(iV, "Expected positive parallelism level, but got ").toString());
        }
        DN sp0 = s82;
        if (iV < BX1.d) {
            if (iV < 1) {
                throw new IllegalArgumentException(EK.e(iV, "Expected positive parallelism level, but got ").toString());
            }
            sp0 = new SP0(s82, iV);
        }
        h = sp0;
    }

    @Override // defpackage.DN
    public final void c1(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        h.c1(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NotNull Runnable runnable) {
        c1(e.d, runnable);
    }

    @Override // defpackage.DN
    public final void j1(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        h.j1(coroutineContext, runnable);
    }

    @Override // defpackage.DN
    @NotNull
    public final String toString() {
        return "Dispatchers.IO";
    }
}
