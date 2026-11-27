package io.sentry.util;

import defpackage.C2688aH1;
import defpackage.NG1;
import io.sentry.ILogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class m {
    public static boolean a(@Nullable C2688aH1 c2688aH1, @NotNull String str) {
        return b(str, c2688aH1 != null ? c2688aH1.getLogger() : null);
    }

    public static boolean b(@NotNull String str, @Nullable ILogger iLogger) {
        return c(str, iLogger) != null;
    }

    @Nullable
    public static Class c(@NotNull String str, @Nullable ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.a(NG1.INFO, "Class not available: ".concat(str), new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e) {
            if (iLogger == null) {
                return null;
            }
            iLogger.d(NG1.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e);
            return null;
        } catch (Throwable th) {
            if (iLogger == null) {
                return null;
            }
            iLogger.d(NG1.ERROR, "Failed to initialize ".concat(str), th);
            return null;
        }
    }
}
