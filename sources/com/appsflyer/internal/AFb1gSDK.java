package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.C1717Ot1;
import defpackage.C1795Pt1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class AFb1gSDK implements Application.ActivityLifecycleCallbacks {

    @Nullable
    private ScheduledFuture<?> AFKeystoreWrapper;

    @NotNull
    final AFb1bSDK.AFa1zSDK AFLogger;

    @NotNull
    private final AFa1qSDK d;

    @NotNull
    private final ScheduledExecutorService registerClient;
    private volatile boolean unregisterClient;

    @NotNull
    private final Runnable v;

    public AFb1gSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFb1bSDK.AFa1zSDK aFa1zSDK, @NotNull AFa1qSDK aFa1qSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        this.registerClient = scheduledExecutorService;
        this.AFLogger = aFa1zSDK;
        this.d = aFa1qSDK;
        this.v = new Runnable() { // from class: com.appsflyer.internal.f
            @Override // java.lang.Runnable
            public final void run() {
                AFb1gSDK.registerClient(this.d);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i_(AFb1gSDK aFb1gSDK, Intent intent) {
        Object objA;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            AFb1bSDK.AFa1zSDK aFa1zSDK = aFb1gSDK.AFLogger;
            Intrinsics.checkNotNull(intent);
            aFa1zSDK.m_(intent);
            objA = Unit.a;
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DDL, "onActivityCreatedWithDeeplink failed with a throwable", thA, false, false, false, false, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j_(AFb1gSDK aFb1gSDK, Intent intent) {
        Object objA;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            AFb1bSDK.AFa1zSDK aFa1zSDK = aFb1gSDK.AFLogger;
            Intrinsics.checkNotNull(intent);
            aFa1zSDK.n_(intent);
            objA = Unit.a;
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Listener threw an exception", thA, false, false, false, false, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerClient(AFb1gSDK aFb1gSDK) {
        Object objA;
        aFb1gSDK.unregisterClient = false;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            aFb1gSDK.AFLogger.registerClient();
            objA = Unit.a;
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Background task failed with a throwable", thA, false, false, false, false, 120, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.unregisterClient) {
            return;
        }
        final Intent intent = activity.getIntent();
        if (this.d.e_(intent)) {
            this.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.g
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1gSDK.i_(this.d, intent);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.unregisterClient) {
            ScheduledExecutorService scheduledExecutorService = this.registerClient;
            Runnable runnable = this.v;
            AFb1bSDK.Companion companion = AFb1bSDK.INSTANCE;
            this.AFKeystoreWrapper = scheduledExecutorService.schedule(runnable, AFb1bSDK.Companion.unregisterClient(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (!this.unregisterClient) {
            this.unregisterClient = true;
            final Intent intent = activity.getIntent();
            this.registerClient.execute(new Runnable() { // from class: com.appsflyer.internal.h
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1gSDK.j_(this.d, intent);
                }
            });
        } else {
            ScheduledFuture<?> scheduledFuture = this.AFKeystoreWrapper;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}
