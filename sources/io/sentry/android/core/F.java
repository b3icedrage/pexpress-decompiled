package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import defpackage.C2629a1;
import defpackage.C6133qP;
import defpackage.FK;
import defpackage.NG1;
import defpackage.SK;
import defpackage.Z0;
import io.sentry.ILogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class F {

    @SuppressLint({"NewApi"})
    @NotNull
    public static final io.sentry.android.core.util.a<PackageInfo> a = new io.sentry.android.core.util.a<>(new FK());

    @NotNull
    public static final io.sentry.android.core.util.a<PackageInfo> b = new io.sentry.android.core.util.a<>(new C6133qP());

    @NotNull
    public static final io.sentry.android.core.util.a<String> c = new io.sentry.android.core.util.a<>(new Z0());

    @SuppressLint({"NewApi"})
    @NotNull
    public static final io.sentry.android.core.util.a<ApplicationInfo> d = new io.sentry.android.core.util.a<>(new C2629a1());

    @NotNull
    public static final io.sentry.android.core.util.a<ApplicationInfo> e = new io.sentry.android.core.util.a<>(new SK());

    public static class a {
        public final boolean a;

        @Nullable
        public final String b;

        public a(boolean z, @Nullable String str) {
            this.a = z;
            this.b = str;
        }
    }

    public static class b {
        public final boolean a;
        public final String[] b;

        public b(boolean z, String[] strArr) {
            this.a = z;
            this.b = strArr;
        }
    }

    @Nullable
    public static String a(@NotNull ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th) {
            iLogger.d(NG1.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    @Nullable
    public static ActivityManager.MemoryInfo b(@NotNull Context context, @NotNull ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.a(NG1.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            iLogger.d(NG1.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    @Nullable
    public static PackageInfo c(@NotNull Context context, @NotNull E e2) {
        e2.getClass();
        return Build.VERSION.SDK_INT >= 33 ? a.a(context) : b.a(context);
    }

    @SuppressLint({"NewApi"})
    @NotNull
    public static String d(@NotNull PackageInfo packageInfo, @NotNull E e2) {
        e2.getClass();
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public static boolean e() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }
}
