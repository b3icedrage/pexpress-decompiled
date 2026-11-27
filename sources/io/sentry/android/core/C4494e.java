package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import defpackage.C1742Pc;
import defpackage.NG1;
import io.sentry.util.C4527a;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.android.core.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4494e {

    @NotNull
    public final io.sentry.util.l<FrameMetricsAggregator> a;

    @NotNull
    public final SentryAndroidOptions b;

    @NotNull
    public final ConcurrentHashMap c;

    @NotNull
    public final WeakHashMap d;

    @NotNull
    public final Q e;

    @NotNull
    public final C4527a f;

    @NotNull
    public final io.sentry.util.l<Boolean> g;

    /* JADX INFO: renamed from: io.sentry.android.core.e$a */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public C4494e(@NotNull io.sentry.util.m mVar, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        Q q = new Q();
        this.c = new ConcurrentHashMap();
        this.d = new WeakHashMap();
        this.f = new C4527a();
        this.g = new io.sentry.util.l<>(new io.sentry.android.replay.capture.u(mVar, sentryAndroidOptions.getLogger()));
        this.a = new io.sentry.util.l<>(new C1742Pc(6));
        this.b = sentryAndroidOptions;
        this.e = q;
    }

    public final void a(@NotNull Activity activity) {
        C4527a.C0404a c0404aA = this.f.a();
        try {
            if (!c()) {
                c0404aA.close();
                return;
            }
            d(new RunnableC4492c(0, this, activity), "FrameMetricsAggregator.add");
            a aVarB = b();
            if (aVarB != null) {
                this.d.put(activity, aVarB);
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

    @Nullable
    public final a b() {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!c() || !this.g.a().booleanValue()) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArr = this.a.a().a.b;
        int i3 = 0;
        if (sparseIntArrayArr.length <= 0 || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i = 0;
            i2 = 0;
        } else {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i3);
                int iValueAt = sparseIntArray.valueAt(i3);
                i4 += iValueAt;
                if (iKeyAt > 700) {
                    i2 += iValueAt;
                } else if (iKeyAt > 16) {
                    i += iValueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new a(i3, i, i2);
    }

    public final boolean c() {
        if (!this.g.a().booleanValue()) {
            return false;
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        return sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2();
    }

    public final void d(final Runnable runnable, final String str) {
        try {
            if (io.sentry.android.core.internal.util.e.a.c()) {
                runnable.run();
                return;
            }
            Q q = this.e;
            q.a.post(new Runnable() { // from class: io.sentry.android.core.d
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable2 = runnable;
                    C4494e c4494e = this.d;
                    c4494e.getClass();
                    try {
                        runnable2.run();
                    } catch (Throwable unused) {
                        String str2 = str;
                        if (str2 != null) {
                            c4494e.b.getLogger().a(NG1.WARNING, "Failed to execute ".concat(str2), new Object[0]);
                        }
                    }
                }
            });
        } catch (Throwable unused) {
            if (str != null) {
                this.b.getLogger().a(NG1.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }
}
