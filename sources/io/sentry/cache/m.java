package io.sentry.cache;

import defpackage.C0702Bu;
import defpackage.C2688aH1;
import defpackage.C3561eO1;
import defpackage.C5364mj1;
import defpackage.KD1;
import defpackage.NG1;
import defpackage.OD1;
import defpackage.P;
import defpackage.RunnableC4584j20;
import defpackage.RunnableC7918yt1;
import defpackage.VI1;
import defpackage.W10;
import io.sentry.android.core.B;
import io.sentry.android.core.RunnableC4490a;
import io.sentry.android.core.RunnableC4492c;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.C4521c;
import io.sentry.protocol.F;
import io.sentry.protocol.u;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends OD1 {
    public static final Charset c = Charset.forName("UTF-8");

    @NotNull
    public final SentryAndroidOptions a;

    @NotNull
    public final io.sentry.util.l<io.sentry.cache.tape.c<C0702Bu>> b = new io.sentry.util.l<>(new VI1(this));

    public m(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    public final void a(@NotNull String str) {
        c.a(this.a, ".scope-cache", str);
    }

    @Override // defpackage.InterfaceC1093Gu0
    public final void c(@Nullable F f) {
        e(new W10(5, this, f));
    }

    @Nullable
    public final <T> T d(@NotNull C2688aH1 c2688aH1, @NotNull String str, @NotNull Class<T> cls) {
        if (!str.equals("breadcrumbs.json")) {
            return (T) c.c(c2688aH1, ".scope-cache", str, cls);
        }
        try {
            return cls.cast(this.b.a().f());
        } catch (IOException unused) {
            c2688aH1.getLogger().a(NG1.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public final void e(@NotNull final Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        if (sentryAndroidOptions.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().d(NG1.ERROR, "Serialization task failed", th);
                    return;
                }
            }
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable2 = runnable;
                        m mVar = this.d;
                        mVar.getClass();
                        try {
                            runnable2.run();
                        } catch (Throwable th2) {
                            mVar.a.getLogger().d(NG1.ERROR, "Serialization task failed", th2);
                        }
                    }
                });
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().d(NG1.ERROR, "Serialization task could not be scheduled", th2);
            }
        }
    }

    public final <T> void f(@NotNull T t, @NotNull String str) {
        c.d(this.a, t, ".scope-cache", str);
    }

    @Override // defpackage.InterfaceC1093Gu0
    public final void g(@NotNull final C0702Bu c0702Bu) {
        e(new Runnable() { // from class: io.sentry.cache.j
            @Override // java.lang.Runnable
            public final void run() {
                C0702Bu c0702Bu2 = c0702Bu;
                m mVar = this.d;
                mVar.getClass();
                try {
                    mVar.b.a().c(c0702Bu2);
                } catch (IOException e) {
                    mVar.a.getLogger().d(NG1.ERROR, "Failed to add breadcrumb to file queue", e);
                }
            }
        });
    }

    @Override // defpackage.OD1, defpackage.InterfaceC1093Gu0
    public final void h(@Nullable NG1 ng1) {
        e(new RunnableC7918yt1(1, this, ng1));
    }

    @Override // defpackage.OD1, defpackage.InterfaceC1093Gu0
    public final void i(@NotNull Collection<C0702Bu> collection) {
        if (collection.isEmpty()) {
            e(new RunnableC4490a(this));
        }
    }

    @Override // defpackage.OD1, defpackage.InterfaceC1093Gu0
    public final void k(@NotNull ConcurrentHashMap concurrentHashMap) {
        e(new com.appsflyer.internal.m(3, this, concurrentHashMap));
    }

    @Override // defpackage.OD1, defpackage.InterfaceC1093Gu0
    public final void l(@NotNull final C4521c c4521c) {
        e(new Runnable() { // from class: io.sentry.cache.k
            @Override // java.lang.Runnable
            public final void run() {
                this.d.f(c4521c, "contexts.json");
            }
        });
    }

    @Override // defpackage.OD1, defpackage.InterfaceC1093Gu0
    public final void m(@NotNull List list) {
        e(new P(5, this, list));
    }

    @Override // defpackage.OD1, defpackage.InterfaceC1093Gu0
    public final void o(@NotNull u uVar) {
        e(new RunnableC4584j20(2, this, uVar));
    }

    @Override // defpackage.OD1, defpackage.InterfaceC1093Gu0
    public final void p(@NotNull ConcurrentHashMap concurrentHashMap) {
        e(new B(1, this, concurrentHashMap));
    }

    @Override // defpackage.OD1, defpackage.InterfaceC1093Gu0
    public final void q(@Nullable String str) {
        e(new RunnableC4492c(1, this, str));
    }

    @Override // defpackage.InterfaceC1093Gu0
    public final void r(@Nullable final C3561eO1 c3561eO1, @NotNull final KD1 kd1) {
        e(new Runnable() { // from class: io.sentry.cache.i
            @Override // java.lang.Runnable
            public final void run() {
                m mVar = this.d;
                C3561eO1 c3561eO2 = c3561eO1;
                if (c3561eO2 != null) {
                    mVar.f(c3561eO2, "trace.json");
                    return;
                }
                mVar.getClass();
                C5364mj1 c5364mj1 = kd1.t;
                C3561eO1 c3561eO3 = new C3561eO1(c5364mj1.a, c5364mj1.b, "default", null);
                c3561eO3.m = "auto";
                mVar.f(c3561eO3, "trace.json");
            }
        });
    }
}
