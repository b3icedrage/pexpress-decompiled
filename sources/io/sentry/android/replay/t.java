package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C2688aH1;
import defpackage.C6489s51;
import defpackage.EnumC4161hE1;
import defpackage.NG1;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"UseKtx", "UseRequiresApi"})
@TargetApi(26)
public final class t implements ViewTreeObserver.OnDrawListener {

    @NotNull
    public final C2688aH1 d;

    @Nullable
    public WeakReference<View> e;

    @NotNull
    public final AtomicBoolean g;

    @NotNull
    public final AtomicBoolean h;

    @NotNull
    public final io.sentry.android.replay.screenshot.f i;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4161hE1.values().length];
            try {
                iArr[EnumC4161hE1.CANVAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4161hE1.PIXEL_COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public t(@NotNull C2688aH1 options, @Nullable ReplayIntegration replayIntegration, @NotNull u config, @NotNull x executorProvider) {
        io.sentry.android.replay.screenshot.f bVar;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        this.d = options;
        this.g = new AtomicBoolean(true);
        io.sentry.android.replay.util.c cVar = new io.sentry.android.replay.util.c();
        this.h = new AtomicBoolean(false);
        int i = a.a[options.getSessionReplay().n.ordinal()];
        if (i == 1) {
            bVar = new io.sentry.android.replay.screenshot.b(options, replayIntegration, config, executorProvider);
        } else {
            if (i != 2) {
                throw new C6489s51();
            }
            bVar = new io.sentry.android.replay.screenshot.e(executorProvider, replayIntegration, options, config, cVar);
        }
        this.i = bVar;
    }

    public final void a(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        WeakReference<View> weakReference = this.e;
        c(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.e;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.e = new WeakReference<>(root);
        io.sentry.android.replay.util.m.a(root, this);
        this.h.set(true);
        this.i.onContentChanged();
    }

    public final void b() {
        C2688aH1 c2688aH1 = this.d;
        boolean z = c2688aH1.getSessionReplay().m;
        AtomicBoolean atomicBoolean = this.g;
        if (z) {
            c2688aH1.getLogger().a(NG1.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(atomicBoolean.get()));
        }
        if (!atomicBoolean.get()) {
            if (c2688aH1.getSessionReplay().m) {
                c2688aH1.getLogger().a(NG1.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        boolean z2 = c2688aH1.getSessionReplay().m;
        AtomicBoolean atomicBoolean2 = this.h;
        io.sentry.android.replay.screenshot.f fVar = this.i;
        if (z2) {
            c2688aH1.getLogger().a(NG1.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(atomicBoolean2.get()), Boolean.valueOf(fVar.a()));
        }
        if (!atomicBoolean2.get()) {
            fVar.c();
            return;
        }
        WeakReference<View> weakReference = this.e;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            c2688aH1.getLogger().a(NG1.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (z.a(view) == null) {
            c2688aH1.getLogger().a(NG1.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            atomicBoolean2.set(false);
            fVar.b(view);
        } catch (Throwable th) {
            c2688aH1.getLogger().d(NG1.WARNING, "Failed to capture replay recording", th);
        }
    }

    public final void c(@Nullable View view) {
        this.d.getReplayController().getClass();
        if (view != null) {
            Intrinsics.checkNotNullParameter(this, "listener");
            if (view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
                return;
            }
            try {
                view.getViewTreeObserver().removeOnDrawListener(this);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.g.get()) {
            WeakReference<View> weakReference = this.e;
            View view = weakReference != null ? weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.d.getLogger().a(NG1.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.h.set(true);
                this.i.onContentChanged();
            }
        }
    }
}
