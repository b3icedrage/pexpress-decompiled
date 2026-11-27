package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import defpackage.C0841Do0;
import defpackage.N80;
import defpackage.NG1;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenshotEventProcessor implements N80 {

    @NotNull
    public final SentryAndroidOptions d;

    @NotNull
    public final E e;

    @NotNull
    public final io.sentry.android.core.internal.util.i g;
    public final boolean h;
    public final AtomicBoolean i = new AtomicBoolean(false);

    public ScreenshotEventProcessor(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull E e, boolean z) {
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.d = sentryAndroidOptions;
        this.e = e;
        this.g = new io.sentry.android.core.internal.util.i(3, 2000L);
        this.h = z;
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.util.j.a("Screenshot");
        }
    }

    @Nullable
    public final io.sentry.android.replay.viewhierarchy.b a(@NotNull Activity activity) {
        SentryAndroidOptions sentryAndroidOptions = this.d;
        try {
            View rootView = (activity.getWindow() == null || activity.getWindow().peekDecorView() == null || activity.getWindow().peekDecorView().getRootView() == null) ? null : activity.getWindow().peekDecorView().getRootView();
            if (rootView == null) {
                return null;
            }
            io.sentry.android.replay.viewhierarchy.b bVarA = io.sentry.android.replay.viewhierarchy.b.a.a(rootView, null, sentryAndroidOptions.getScreenshot());
            io.sentry.android.replay.util.m.c(rootView, bVarA, sentryAndroidOptions.getScreenshot(), sentryAndroidOptions.getLogger());
            return bVarA;
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(NG1.ERROR, "Failed to build view hierarchy", th);
            return null;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x023c */
    /* JADX WARN: Code duplicated, block: B:100:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:116:0x020b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0213  */
    /* JADX WARN: Code duplicated, block: B:151:0x025f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0265  */
    /* JADX WARN: Code duplicated, block: B:155:0x0266 A[PHI: r13
      0x0266: PHI (r13v1 android.graphics.Bitmap) = (r13v0 android.graphics.Bitmap), (r13v2 android.graphics.Bitmap) binds: [B:86:0x018c, B:154:0x0265] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:157:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0179  */
    /* JADX WARN: Code duplicated, block: B:85:0x018b  */
    /* JADX WARN: Code duplicated, block: B:87:0x018e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0198  */
    /* JADX WARN: Code duplicated, block: B:90:0x019d  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bb A[Catch: all -> 0x01ca, TRY_LEAVE, TryCatch #4 {all -> 0x01ca, blocks: (B:91:0x01a9, B:93:0x01bb), top: B:165:0x01a9 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01cc  */
    /* JADX WARN: Type inference failed for: r15v2, types: [io.sentry.android.core.internal.util.p] */
    @Override // defpackage.N80
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.EG1 f(@org.jetbrains.annotations.NotNull defpackage.EG1 r17, @org.jetbrains.annotations.NotNull defpackage.C0841Do0 r18) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.ScreenshotEventProcessor.f(EG1, Do0):EG1");
    }

    @Override // defpackage.N80
    @NotNull
    public final io.sentry.protocol.B g(@NotNull io.sentry.protocol.B b, @NotNull C0841Do0 c0841Do0) {
        return b;
    }
}
