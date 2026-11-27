package io.sentry.android.replay.screenshot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C2688aH1;
import defpackage.C3121cH1;
import defpackage.EnumC4403iP0;
import defpackage.JX;
import defpackage.NG1;
import defpackage.RunnableC2411Xh;
import defpackage.XO0;
import io.sentry.ILogger;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.u;
import io.sentry.android.replay.util.m;
import io.sentry.android.replay.x;
import io.sentry.android.replay.z;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"UseKtx"})
public final class e implements f {

    @Nullable
    public final ReplayIntegration a;

    @NotNull
    public final C2688aH1 b;

    @NotNull
    public final u c;

    @NotNull
    public final ScheduledExecutorService d;

    @NotNull
    public final io.sentry.android.replay.util.e e;

    @NotNull
    public final Bitmap f;

    @NotNull
    public final Object g;

    @NotNull
    public final AtomicBoolean h;

    @NotNull
    public final io.sentry.android.replay.util.f i;

    @NotNull
    public final AtomicBoolean j;

    @NotNull
    public final AtomicBoolean k;

    public e(@NotNull x executorProvider, @Nullable ReplayIntegration replayIntegration, @NotNull C2688aH1 options, @NotNull u config, @NotNull io.sentry.android.replay.util.c debugOverlayDrawable) {
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(debugOverlayDrawable, "debugOverlayDrawable");
        this.a = replayIntegration;
        this.b = options;
        this.c = config;
        this.d = executorProvider.i;
        this.e = executorProvider.h;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(config.a, config.b, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.f = bitmapCreateBitmap;
        this.g = XO0.a(EnumC4403iP0.e, new JX(this, 5));
        this.h = new AtomicBoolean(false);
        this.i = new io.sentry.android.replay.util.f();
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
    }

    @Override // io.sentry.android.replay.screenshot.f
    public final boolean a() {
        return this.h.get();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [io.sentry.android.replay.screenshot.d] */
    @Override // io.sentry.android.replay.screenshot.f
    @SuppressLint({"NewApi"})
    public final void b(@NotNull final View root) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(root, "root");
        Window windowA = z.a(root);
        C2688aH1 c2688aH1 = this.b;
        if (windowA == null) {
            c2688aH1.getLogger().a(NG1.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (this.k.get()) {
            c2688aH1.getLogger().a(NG1.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.j.set(false);
            PixelCopy.request(windowA, this.f, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.d
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    e eVar = this.a;
                    boolean z = eVar.k.get();
                    C2688aH1 c2688aH2 = eVar.b;
                    if (z) {
                        c2688aH2.getLogger().a(NG1.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
                        return;
                    }
                    AtomicBoolean atomicBoolean = eVar.h;
                    if (i != 0) {
                        c2688aH2.getLogger().a(NG1.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i));
                        atomicBoolean.set(false);
                        return;
                    }
                    if (eVar.j.get()) {
                        c2688aH2.getLogger().a(NG1.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
                        atomicBoolean.set(false);
                        return;
                    }
                    C3121cH1 sessionReplay = c2688aH2.getSessionReplay();
                    Intrinsics.checkNotNullExpressionValue(sessionReplay, "getSessionReplay(...)");
                    View view = root;
                    io.sentry.android.replay.viewhierarchy.b bVarA = io.sentry.android.replay.viewhierarchy.b.a.a(view, null, sessionReplay);
                    C3121cH1 sessionReplay2 = c2688aH2.getSessionReplay();
                    Intrinsics.checkNotNullExpressionValue(sessionReplay2, "getSessionReplay(...)");
                    ILogger logger = c2688aH2.getLogger();
                    Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
                    m.c(view, bVarA, sessionReplay2, logger);
                    eVar.d.submit(new io.sentry.android.replay.util.i(new com.appsflyer.internal.m(eVar, bVarA, view), "screenshot_recorder.mask"));
                }
            }, this.e.a);
        } catch (Throwable th) {
            c2688aH1.getLogger().d(NG1.WARNING, "Failed to capture replay recording", th);
            this.h.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.f
    public final void c() {
        if (this.h.get()) {
            Bitmap bitmap = this.f;
            if (bitmap.isRecycled()) {
                return;
            }
            this.a.A(bitmap);
        }
    }

    @Override // io.sentry.android.replay.screenshot.f
    public final void close() {
        this.k.set(true);
        this.d.submit(new io.sentry.android.replay.util.i(new RunnableC2411Xh(this, 4), "PixelCopyStrategy.close"));
    }

    @Override // io.sentry.android.replay.screenshot.f
    public final void onContentChanged() {
        this.j.set(true);
    }
}
