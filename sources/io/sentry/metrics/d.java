package io.sentry.metrics;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import defpackage.C2688aH1;
import defpackage.HG1;
import defpackage.NG1;
import defpackage.RunnableC2477Yd;
import defpackage.UG1;
import defpackage.VG1;
import defpackage.YF1;
import io.sentry.transport.m;
import io.sentry.util.C4527a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class d implements b {

    @NotNull
    public final C2688aH1 d;

    @NotNull
    public final YF1 e;

    @NotNull
    public final HG1 h;

    @NotNull
    public final C4527a i = new C4527a();

    @NotNull
    public final m j = new m();

    @NotNull
    public final ConcurrentLinkedQueue g = new ConcurrentLinkedQueue();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            do {
                dVar.b();
            } while (dVar.g.size() >= 1000);
            C4527a.C0404a c0404aA = dVar.i.a();
            try {
                if (!dVar.g.isEmpty()) {
                    dVar.e(false);
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
    }

    public d(@NotNull C2688aH1 c2688aH1, @NotNull YF1 yf1) {
        this.d = c2688aH1;
        this.e = yf1;
        this.h = new HG1(c2688aH1);
    }

    @Override // io.sentry.metrics.b
    public void a(boolean z) {
        HG1 hg1 = this.h;
        if (z) {
            e(true);
            hg1.submit(new RunnableC2477Yd(this, 4));
        } else {
            hg1.a(this.d.getShutdownTimeoutMillis());
            while (!this.g.isEmpty()) {
                b();
            }
        }
    }

    public final void b() {
        ArrayList arrayList = new ArrayList(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.g;
            UG1 ug1 = (UG1) concurrentLinkedQueue.poll();
            if (ug1 != null) {
                arrayList.add(ug1);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        VG1 vg1 = new VG1(arrayList);
        YF1 yf1 = this.e;
        yf1.getClass();
        try {
            yf1.v(yf1.o(vg1), null);
        } catch (IOException e) {
            yf1.b.getLogger().c(NG1.WARNING, e, "Capturing metrics failed.", new Object[0]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m mVar = this.j;
            mVar.getClass();
            int i2 = m.a.d;
            mVar.a.releaseShared(1);
        }
    }

    @Override // io.sentry.metrics.b
    public final void d(long j) {
        e(true);
        try {
            m mVar = this.j;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            mVar.getClass();
            mVar.a.tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e) {
            this.d.getLogger().d(NG1.ERROR, "Failed to flush metrics events", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void e(boolean z) {
        C4527a.C0404a c0404aA = this.i.a();
        try {
            try {
                this.h.c(new a(), z ? 0 : 5000);
            } catch (RejectedExecutionException e) {
                this.d.getLogger().d(NG1.WARNING, "Metrics batch processor flush task rejected", e);
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
}
