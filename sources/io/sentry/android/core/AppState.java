package io.sentry.android.core;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleOwner;
import defpackage.C2647a51;
import defpackage.FP0;
import defpackage.NG1;
import defpackage.RunnableC4140h80;
import io.sentry.ILogger;
import io.sentry.util.C4527a;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppState implements Closeable {

    @NotNull
    public static final AppState i = new AppState();
    public volatile LifecycleObserver e;

    @NotNull
    public final C4527a d = new C4527a();
    public final Q g = new Q();

    @Nullable
    public volatile Boolean h = null;

    public final class LifecycleObserver implements DefaultLifecycleObserver {
        public final a d = new a();

        public class a extends CopyOnWriteArrayList<a> {
            public a() {
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            public final boolean add(Object obj) {
                a aVar = (a) obj;
                boolean zAdd = super.add(aVar);
                if (Boolean.FALSE.equals(AppState.this.h)) {
                    aVar.c();
                    return zAdd;
                }
                if (Boolean.TRUE.equals(AppState.this.h)) {
                    aVar.f();
                }
                return zAdd;
            }
        }

        public LifecycleObserver() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(@NonNull FP0 fp0) {
            AppState.this.h = Boolean.FALSE;
            Iterator<a> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStop(@NonNull FP0 fp0) {
            AppState.this.h = Boolean.TRUE;
            Iterator<a> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().f();
            }
        }
    }

    public interface a {
        void c();

        void f();
    }

    public final void c(@NotNull a aVar) {
        C4527a.C0404a c0404aA = this.d.a();
        try {
            g(C2647a51.a);
            if (this.e != null) {
                this.e.d.add(aVar);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        l();
    }

    public final void f(@NotNull ILogger iLogger) {
        LifecycleObserver lifecycleObserver = this.e;
        if (lifecycleObserver != null) {
            try {
                ProcessLifecycleOwner.m.j.a(lifecycleObserver);
            } catch (Throwable th) {
                this.e = null;
                iLogger.d(NG1.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th);
            }
        }
    }

    public final void g(@NotNull ILogger iLogger) {
        if (this.e != null) {
            return;
        }
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.m;
            this.e = new LifecycleObserver();
            if (io.sentry.android.core.internal.util.e.a.c()) {
                f(iLogger);
                return;
            }
            Q q = this.g;
            q.a.post(new B(0, this, iLogger));
        } catch (ClassNotFoundException unused) {
            iLogger.a(NG1.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th) {
            iLogger.d(NG1.ERROR, "AppState could not register lifecycle observer", th);
        }
    }

    public final void k(@NotNull a aVar) {
        C4527a.C0404a c0404aA = this.d.a();
        try {
            if (this.e != null) {
                this.e.d.remove(aVar);
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

    public final void l() {
        if (this.e == null) {
            return;
        }
        C4527a.C0404a c0404aA = this.d.a();
        try {
            LifecycleObserver lifecycleObserver = this.e;
            this.e.d.clear();
            this.e = null;
            c0404aA.close();
            if (io.sentry.android.core.internal.util.e.a.c()) {
                if (lifecycleObserver != null) {
                    ProcessLifecycleOwner.m.j.c(lifecycleObserver);
                }
            } else {
                Q q = this.g;
                q.a.post(new RunnableC4140h80(2, this, lifecycleObserver));
            }
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
