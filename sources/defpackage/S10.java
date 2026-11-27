package defpackage;

import io.sentry.ILogger;
import io.sentry.hints.e;
import io.sentry.hints.g;
import io.sentry.hints.i;
import io.sentry.hints.l;
import io.sentry.hints.q;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class S10 {

    @NotNull
    public final SD1 a;

    @NotNull
    public final ILogger b;
    public final long c;
    public final LW1 d;

    public static final class a implements e, l, q, i, g {
        public boolean a = false;
        public boolean b = false;
        public final CountDownLatch c = new CountDownLatch(1);
        public final long d;

        @NotNull
        public final ILogger e;

        @NotNull
        public final String f;

        @NotNull
        public final LW1 g;

        public a(long j, @NotNull ILogger iLogger, @NotNull String str, @NotNull LW1 lw1) {
            this.d = j;
            this.f = str;
            this.g = lw1;
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

        @Override // io.sentry.hints.g
        public final void d() {
            this.g.add(this.f);
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
    }

    public S10(@NotNull SD1 sd1, @NotNull ILogger iLogger, long j, int i) {
        this.a = sd1;
        this.b = iLogger;
        this.c = j;
        this.d = new LW1(new C5674oC(i));
    }

    public abstract boolean a(String str);

    public abstract void b(@NotNull File file, @NotNull C0841Do0 c0841Do0);
}
