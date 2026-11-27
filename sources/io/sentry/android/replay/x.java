package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C1589Ne;
import defpackage.C2688aH1;
import defpackage.C2904bF;
import defpackage.ML0;
import defpackage.NG1;
import defpackage.SK;
import io.sentry.ILogger;
import io.sentry.util.C4527a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public final class x implements g, f {

    @NotNull
    public final C2688aH1 d;

    @Nullable
    public final ReplayIntegration e;

    @NotNull
    public final ReplayIntegration g;

    @NotNull
    public final io.sentry.android.replay.util.e h;

    @NotNull
    public final io.sentry.android.replay.util.h i;

    @NotNull
    public final AtomicBoolean j;

    @NotNull
    public final ArrayList<WeakReference<View>> k;

    @NotNull
    public final Point l;

    @NotNull
    public final C4527a m;

    @NotNull
    public final C4527a n;

    @NotNull
    public final C4527a o;

    @Nullable
    public volatile a p;

    @Nullable
    public volatile HandlerThread q;

    @Nullable
    public volatile Handler r;

    public static final class a implements Runnable {

        @NotNull
        public final C2688aH1 d;

        @NotNull
        public final io.sentry.android.replay.util.e e;

        @Nullable
        public t g;

        @Nullable
        public u h;

        @NotNull
        public final AtomicBoolean i;

        public a(@NotNull C2688aH1 options, @NotNull io.sentry.android.replay.util.e mainLooperHandler) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
            this.d = options;
            this.e = mainLooperHandler;
            this.i = new AtomicBoolean(true);
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = this.i.get();
            C2688aH1 c2688aH1 = this.d;
            if (!z) {
                if (c2688aH1.getSessionReplay().m) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                    return;
                }
                return;
            }
            try {
                if (c2688aH1.getSessionReplay().m) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "Capturing a frame.", new Object[0]);
                }
                t tVar = this.g;
                if (tVar != null) {
                    tVar.b();
                }
            } catch (Throwable th) {
                c2688aH1.getLogger().d(NG1.ERROR, "Failed to capture a frame", th);
            }
            if (c2688aH1.getSessionReplay().m) {
                ILogger logger = c2688aH1.getLogger();
                NG1 ng1 = NG1.DEBUG;
                StringBuilder sb = new StringBuilder("Posting the capture runnable again, frame rate is ");
                u uVar = this.h;
                logger.a(ng1, SK.b(sb, uVar != null ? uVar.e : 1, " fps."), new Object[0]);
            }
            u uVar2 = this.h;
            if (this.e.a.postDelayed(this, 1000 / ((long) (uVar2 != null ? uVar2.e : 1)))) {
                return;
            }
            c2688aH1.getLogger().a(NG1.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    public static final class b implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View e;

        public b(View view) {
            this.e = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            x xVar = x.this;
            WeakReference weakReference = (WeakReference) CollectionsKt.N(xVar.k);
            View view = weakReference != null ? (View) weakReference.get() : null;
            View view2 = this.e;
            if (!Intrinsics.a(view2, view)) {
                io.sentry.android.replay.util.m.b(view2, this);
                return true;
            }
            Intrinsics.checkNotNullParameter(view2, "<this>");
            if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                io.sentry.android.replay.util.m.b(view2, this);
                if (view2.getWidth() != xVar.l.x) {
                    int height = view2.getHeight();
                    Point point = xVar.l;
                    if (height != point.y) {
                        point.set(view2.getWidth(), view2.getHeight());
                        xVar.g.C(view2.getWidth(), view2.getHeight());
                    }
                }
            }
            return true;
        }
    }

    public static final class c extends ML0 implements Function1<WeakReference<View>, Boolean> {
        public final /* synthetic */ View d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(1);
            this.d = view;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(WeakReference<View> weakReference) {
            WeakReference<View> it = weakReference;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.a(it.get(), this.d));
        }
    }

    public x(@NotNull C2688aH1 options, @Nullable ReplayIntegration replayIntegration, @NotNull ReplayIntegration windowCallback, @NotNull io.sentry.android.replay.util.e mainLooperHandler, @NotNull io.sentry.android.replay.util.h replayExecutor) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(windowCallback, "windowCallback");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.d = options;
        this.e = replayIntegration;
        this.g = windowCallback;
        this.h = mainLooperHandler;
        this.i = replayExecutor;
        this.j = new AtomicBoolean(false);
        this.k = new ArrayList<>();
        this.l = new Point();
        this.m = new C4527a();
        this.n = new C4527a();
        this.o = new C4527a();
    }

    @Override // io.sentry.android.replay.g
    public final void b() {
        a aVar = this.p;
        if (aVar != null) {
            t tVar = aVar.g;
            if (tVar != null) {
                tVar.g.set(false);
                WeakReference<View> weakReference = tVar.e;
                tVar.c(weakReference != null ? weakReference.get() : null);
            }
            aVar.i.getAndSet(false);
        }
    }

    @Override // io.sentry.android.replay.f
    public final void c(@NotNull View root, boolean z) {
        t tVar;
        t tVar2;
        t tVar3;
        Intrinsics.checkNotNullParameter(root, "root");
        C4527a.C0404a c0404aA = this.m.a();
        try {
            if (!z) {
                a aVar = this.p;
                if (aVar != null && (tVar2 = aVar.g) != null) {
                    tVar2.c(root);
                }
                C2904bF.r(this.k, new c(root));
                WeakReference weakReference = (WeakReference) CollectionsKt.N(this.k);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && !Intrinsics.a(root, view)) {
                    a aVar2 = this.p;
                    if (aVar2 != null && (tVar = aVar2.g) != null) {
                        tVar.a(view);
                    }
                    f(view);
                }
            } else {
                if (z.a(root) == null) {
                    this.d.getLogger().a(NG1.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    c0404aA.close();
                    return;
                }
                this.k.add(new WeakReference<>(root));
                a aVar3 = this.p;
                if (aVar3 != null && (tVar3 = aVar3.g) != null) {
                    tVar3.a(root);
                }
                f(root);
            }
            Unit unit = Unit.a;
            c0404aA.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        reset();
        io.sentry.android.replay.util.e eVar = this.h;
        a aVar = this.p;
        Handler handler = eVar.a;
        if (aVar != null) {
            handler.removeCallbacks(aVar);
        }
        C4527a.C0404a c0404aA = this.o.a();
        try {
            Handler handler2 = this.r;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.q;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            c0404aA.close();
            stop();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.android.replay.g
    public final void e() {
        View view;
        a runnable = this.p;
        if (runnable != null) {
            C2688aH1 c2688aH1 = runnable.d;
            if (c2688aH1.getSessionReplay().m) {
                c2688aH1.getLogger().a(NG1.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            t tVar = runnable.g;
            if (tVar != null) {
                WeakReference<View> weakReference = tVar.e;
                if (weakReference != null && (view = weakReference.get()) != null) {
                    io.sentry.android.replay.util.m.a(view, tVar);
                }
                tVar.g.set(true);
            }
            runnable.i.getAndSet(true);
            io.sentry.android.replay.util.e eVar = runnable.e;
            eVar.a.removeCallbacks(runnable);
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (eVar.a.post(runnable)) {
                return;
            }
            c2688aH1.getLogger().a(NG1.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }
    }

    public final void f(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(root, "<this>");
        if (root.getWidth() <= 0 || root.getHeight() <= 0) {
            b listener = new b(root);
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (root.getViewTreeObserver() == null || !root.getViewTreeObserver().isAlive()) {
                return;
            }
            try {
                root.getViewTreeObserver().addOnPreDrawListener(listener);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        int width = root.getWidth();
        Point point = this.l;
        if (width == point.x || root.getHeight() == point.y) {
            return;
        }
        point.set(root.getWidth(), root.getHeight());
        this.g.C(root.getWidth(), root.getHeight());
    }

    @NotNull
    public final Handler g() {
        if (this.r == null) {
            C4527a.C0404a c0404aA = this.o.a();
            try {
                if (this.r == null) {
                    this.q = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.q;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.q;
                    Intrinsics.checkNotNull(handlerThread2);
                    this.r = new Handler(handlerThread2.getLooper());
                }
                Unit unit = Unit.a;
                c0404aA.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C1589Ne.l(c0404aA, th);
                    throw th2;
                }
            }
        }
        Handler handler = this.r;
        Intrinsics.checkNotNull(handler);
        return handler;
    }

    @Override // io.sentry.android.replay.g
    public final void m(@NotNull u config) {
        a aVar;
        t tVar;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.j.get()) {
            if (this.p == null) {
                C4527a.C0404a c0404aA = this.n.a();
                try {
                    if (this.p == null) {
                        this.p = new a(this.d, this.h);
                    }
                    Unit unit = Unit.a;
                    c0404aA.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C1589Ne.l(c0404aA, th);
                        throw th2;
                    }
                }
            }
            a aVar2 = this.p;
            if (aVar2 != null) {
                aVar2.h = config;
            }
            a aVar3 = this.p;
            if (aVar3 != null) {
                aVar3.g = new t(this.d, this.e, config, this);
            }
            WeakReference weakReference = (WeakReference) CollectionsKt.N(this.k);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (aVar = this.p) != null && (tVar = aVar.g) != null) {
                tVar.a(view);
            }
            io.sentry.android.replay.util.e eVar = this.h;
            a aVar4 = this.p;
            Handler handler = eVar.a;
            if (aVar4 != null) {
                handler.removeCallbacks(aVar4);
            }
            io.sentry.android.replay.util.e eVar2 = this.h;
            a aVar5 = this.p;
            if (aVar5 == null ? false : eVar2.a.postDelayed(aVar5, 100L)) {
                return;
            }
            this.d.getLogger().a(NG1.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.g
    public final void reset() {
        t tVar;
        this.l.set(0, 0);
        C4527a.C0404a c0404aA = this.m.a();
        try {
            for (WeakReference<View> weakReference : this.k) {
                a aVar = this.p;
                if (aVar != null && (tVar = aVar.g) != null) {
                    tVar.c(weakReference.get());
                }
            }
            this.k.clear();
            Unit unit = Unit.a;
            c0404aA.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.android.replay.g
    public final void start() {
        this.j.getAndSet(true);
    }

    @Override // io.sentry.android.replay.g
    public final void stop() {
        a aVar = this.p;
        if (aVar != null) {
            t tVar = aVar.g;
            if (tVar != null) {
                tVar.g.set(false);
                WeakReference<View> weakReference = tVar.e;
                tVar.c(weakReference != null ? weakReference.get() : null);
                WeakReference<View> weakReference2 = tVar.e;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
                tVar.i.close();
            }
            aVar.g = null;
            aVar.i.getAndSet(false);
        }
        C4527a.C0404a c0404aA = this.n.a();
        try {
            this.p = null;
            Unit unit = Unit.a;
            c0404aA.close();
            this.j.set(false);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }
}
