package io.sentry.android.core;

import android.util.Log;
import defpackage.NG1;
import io.sentry.ILogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.sentry.android.core.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4501l implements ILogger, M {
    public static final C4501l a = new C4501l();

    @Override // io.sentry.ILogger
    public void a(@NotNull NG1 ng1, @NotNull String str, @Nullable Object... objArr) {
        if (objArr.length == 0) {
            Log.println(7, "Sentry", str);
        } else {
            Log.println(7, "Sentry", String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean b(@Nullable NG1 ng1) {
        return true;
    }

    @Override // io.sentry.ILogger
    public void c(@NotNull NG1 ng1, @Nullable Throwable th, @NotNull String str, @Nullable Object... objArr) {
        if (objArr.length == 0) {
            d(ng1, str, th);
        } else {
            d(ng1, String.format(str, objArr), th);
        }
    }

    @Override // io.sentry.ILogger
    public void d(@NotNull NG1 ng1, @NotNull String str, @Nullable Throwable th) {
        Log.wtf("Sentry", str, th);
    }
}
