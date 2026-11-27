package io.sentry.android.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class ApplicationNotResponding extends RuntimeException {

    @Nullable
    public final Thread d;

    public ApplicationNotResponding(@Nullable String str) {
        super(str);
        this.d = null;
    }

    public ApplicationNotResponding(@Nullable String str, @NotNull Thread thread) {
        super(str);
        io.sentry.util.p.b(thread, "Thread must be provided.");
        this.d = thread;
        setStackTrace(thread.getStackTrace());
    }
}
