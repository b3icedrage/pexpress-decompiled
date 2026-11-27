package io.sentry.exception;

import io.sentry.protocol.l;
import io.sentry.util.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends RuntimeException {

    @NotNull
    public final l d;

    @NotNull
    public final Throwable e;

    @Nullable
    public final Thread g;
    public final boolean h;

    public a(@NotNull l lVar, @NotNull Throwable th, @Nullable Thread thread, boolean z) {
        this.d = lVar;
        p.b(th, "Throwable is required.");
        this.e = th;
        this.g = thread;
        this.h = z;
    }
}
