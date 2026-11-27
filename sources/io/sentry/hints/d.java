package io.sentry.hints;

import defpackage.NG1;
import io.sentry.ILogger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements f, i {
    public final CountDownLatch a = new CountDownLatch(1);
    public final long b;

    @NotNull
    public final ILogger c;

    public d(long j, @NotNull ILogger iLogger) {
        this.b = j;
        this.c = iLogger;
    }

    @Override // io.sentry.hints.f
    public final void c() {
        this.a.countDown();
    }

    @Override // io.sentry.hints.i
    public final boolean e() {
        try {
            return this.a.await(this.b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.c.d(NG1.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e);
            return false;
        }
    }
}
