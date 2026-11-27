package io.sentry.android.core;

import android.os.FileObserver;
import defpackage.C0841Do0;
import defpackage.C1039Gc0;
import defpackage.C5807oq;
import defpackage.C7638xa1;
import defpackage.NG1;
import io.sentry.ILogger;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends FileObserver {
    public final String a;
    public final C7638xa1 b;

    @NotNull
    public final ILogger c;
    public final long d;

    public static final class a implements io.sentry.hints.e, io.sentry.hints.l, io.sentry.hints.q, io.sentry.hints.i, io.sentry.hints.b, io.sentry.hints.k {
        public boolean a;
        public boolean b;

        @NotNull
        public CountDownLatch c;
        public final long d;

        @NotNull
        public final ILogger e;

        public a(long j, @NotNull ILogger iLogger) {
            reset();
            this.d = j;
            io.sentry.util.p.b(iLogger, "ILogger is required.");
            this.e = iLogger;
        }

        @Override // io.sentry.hints.l
        public final boolean a() {
            return this.a;
        }

        @Override // io.sentry.hints.q
        public final void b(boolean z) {
            this.b = z;
            this.c.countDown();
        }

        @Override // io.sentry.hints.l
        public final void c(boolean z) {
            this.a = z;
        }

        @Override // io.sentry.hints.i
        public final boolean e() {
            try {
                return this.c.await(this.d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                this.e.d(NG1.ERROR, "Exception while awaiting on lock.", e);
                return false;
            }
        }

        @Override // io.sentry.hints.q
        public final boolean f() {
            return this.b;
        }

        @Override // io.sentry.hints.k
        public final void reset() {
            this.c = new CountDownLatch(1);
            this.a = false;
            this.b = false;
        }
    }

    public L(String str, C7638xa1 c7638xa1, @NotNull ILogger iLogger, long j) {
        super(str);
        this.a = str;
        this.b = c7638xa1;
        io.sentry.util.p.b(iLogger, "Logger is required.");
        this.c = iLogger;
        this.d = j;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, @Nullable String str) {
        if (str == null || i != 8) {
            return;
        }
        NG1 ng1 = NG1.DEBUG;
        Integer numValueOf = Integer.valueOf(i);
        String str2 = this.a;
        ILogger iLogger = this.c;
        iLogger.a(ng1, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", numValueOf, str2, str);
        C0841Do0 c0841Do0A = io.sentry.util.g.a(new a(this.d, iLogger));
        String strB = C5807oq.b(C1039Gc0.f(str2), File.separator, str);
        C7638xa1 c7638xa1 = this.b;
        c7638xa1.getClass();
        io.sentry.util.p.b(strB, "Path is required.");
        c7638xa1.b(new File(strB), c0841Do0A);
    }
}
