package defpackage;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class P00 extends RuntimeException {

    @NotNull
    public final transient CoroutineContext d;

    public P00(@NotNull CoroutineContext coroutineContext) {
        this.d = coroutineContext;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getLocalizedMessage() {
        return this.d.toString();
    }
}
