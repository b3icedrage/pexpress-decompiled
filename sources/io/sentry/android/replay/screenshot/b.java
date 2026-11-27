package io.sentry.android.replay.screenshot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C2688aH1;
import defpackage.C6690t30;
import defpackage.EnumC4403iP0;
import defpackage.I6;
import defpackage.NG1;
import defpackage.PF1;
import defpackage.RunnableC2136Ud0;
import defpackage.XO0;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.u;
import io.sentry.android.replay.x;
import io.sentry.util.C4527a;
import io.sentry.util.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"NewApi", "UseKtx"})
public final class b implements f {

    @NotNull
    public final x a;

    @Nullable
    public final ReplayIntegration b;

    @NotNull
    public final C2688aH1 c;

    @NotNull
    public final u d;

    @Nullable
    public volatile Bitmap e;

    @NotNull
    public final AtomicReference<Picture> f;

    @NotNull
    public final C4527a g;

    @NotNull
    public final Object h;

    @NotNull
    public final AtomicBoolean i;

    @NotNull
    public final i j;

    @NotNull
    public final AtomicBoolean k;

    @NotNull
    public final SurfaceTexture l;

    @NotNull
    public final Surface m;

    @SuppressLint({"NewApi"})
    @NotNull
    public final PF1 n;

    public b(@NotNull C2688aH1 options, @Nullable ReplayIntegration replayIntegration, @NotNull u config, @NotNull x executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = executor;
        this.b = replayIntegration;
        this.c = options;
        this.d = config;
        this.f = new AtomicReference<>(null);
        this.g = new C4527a();
        this.h = XO0.a(EnumC4403iP0.e, new I6(this, 7));
        this.i = new AtomicBoolean(false);
        this.j = new i();
        this.k = new AtomicBoolean(false);
        SurfaceTexture surfaceTextureB = C6690t30.b();
        surfaceTextureB.setDefaultBufferSize(config.a, config.b);
        this.l = surfaceTextureB;
        this.m = new Surface(surfaceTextureB);
        j.a("ReplayCanvasStrategy");
        this.n = new PF1(this, 2);
    }

    @Override // io.sentry.android.replay.screenshot.f
    public final boolean a() {
        return this.i.get();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [fO0, java.lang.Object] */
    @Override // io.sentry.android.replay.screenshot.f
    @SuppressLint({"NewApi"})
    public final void b(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        AtomicBoolean atomicBoolean = this.k;
        if (atomicBoolean.get()) {
            return;
        }
        Picture picture = new Picture();
        u uVar = this.d;
        Canvas canvasBeginRecording = picture.beginRecording(uVar.a, uVar.b);
        Intrinsics.checkNotNullExpressionValue(canvasBeginRecording, "beginRecording(...)");
        i iVar = this.j;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(canvasBeginRecording, "<set-?>");
        iVar.a = canvasBeginRecording;
        iVar.setMatrix((Matrix) this.h.getValue());
        root.draw(iVar);
        picture.endRecording();
        if (atomicBoolean.get()) {
            return;
        }
        this.f.set(picture);
        d(this.a.g(), new io.sentry.android.replay.util.i(this.n, "screenshot_recorder.canvas"));
    }

    @Override // io.sentry.android.replay.screenshot.f
    public final void c() {
        Bitmap bitmap;
        if (!this.i.get() || (bitmap = this.e) == null || bitmap.isRecycled()) {
            return;
        }
        this.b.A(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.f
    public final void close() {
        this.k.set(true);
        d(this.a.g(), new io.sentry.android.replay.util.i(new RunnableC2136Ud0(this, 5), "CanvasStrategy.close"));
        this.f.getAndSet(null);
    }

    public final void d(@NotNull Handler handler, @NotNull io.sentry.android.replay.util.i runnable) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        try {
            handler.post(runnable);
        } catch (Throwable th) {
            this.c.getLogger().d(NG1.ERROR, "Canvas Strategy: failed to post runnable " + runnable.d, th);
        }
    }

    @Override // io.sentry.android.replay.screenshot.f
    public final void onContentChanged() {
    }
}
