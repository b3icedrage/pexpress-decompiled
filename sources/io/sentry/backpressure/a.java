package io.sentry.backpressure;

import com.onesignal.core.activities.PermissionsActivity;
import defpackage.C2688aH1;
import defpackage.InterfaceC1405Ku0;
import defpackage.NG1;
import defpackage.SD1;
import io.sentry.util.C4527a;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b, Runnable {

    @NotNull
    public final C2688aH1 d;

    @NotNull
    public final SD1 e;
    public int g;

    @Nullable
    public volatile Future<?> h;

    @NotNull
    public final C4527a i;

    public a(@NotNull C2688aH1 c2688aH1) {
        SD1 sd1 = SD1.a;
        this.g = 0;
        this.h = null;
        this.i = new C4527a();
        this.d = c2688aH1;
        this.e = sd1;
    }

    @Override // io.sentry.backpressure.b
    public final int a() {
        return this.g;
    }

    public final void b(int i) {
        InterfaceC1405Ku0 executorService = this.d.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        C4527a.C0404a c0404aA = this.i.a();
        try {
            try {
                this.h = executorService.c(this, i);
            } catch (RejectedExecutionException e) {
                this.d.getLogger().d(NG1.WARNING, "Backpressure monitor reschedule task rejected", e);
            }
            c0404aA.close();
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.backpressure.b
    public final void close() {
        Future<?> future = this.h;
        if (future != null) {
            C4527a.C0404a c0404aA = this.i.a();
            try {
                future.cancel(true);
                c0404aA.close();
            } catch (Throwable th) {
                try {
                    c0404aA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zI = this.e.i();
        C2688aH1 c2688aH1 = this.d;
        if (zI) {
            if (this.g > 0) {
                c2688aH1.getLogger().a(NG1.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.g = 0;
        } else {
            int i = this.g;
            if (i < 10) {
                this.g = i + 1;
                c2688aH1.getLogger().a(NG1.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.g));
            }
        }
        b(10000);
    }

    @Override // io.sentry.backpressure.b
    public final void start() {
        b(PermissionsActivity.DELAY_TIME_CALLBACK_CALL);
    }
}
