package io.sentry.util;

import defpackage.NG1;
import io.sentry.ILogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public static void a(@NotNull Class<?> cls, @Nullable Object obj, @NotNull ILogger iLogger) {
        iLogger.a(NG1.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }
}
