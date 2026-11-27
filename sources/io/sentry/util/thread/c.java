package io.sentry.util.thread;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {
    public static final long a = Thread.currentThread().getId();
    public static final c b = new c();

    @Override // io.sentry.util.thread.a
    @NotNull
    public final String a() {
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public final long b() {
        return Thread.currentThread().getId();
    }

    @Override // io.sentry.util.thread.a
    public final boolean c() {
        return a == Thread.currentThread().getId();
    }
}
