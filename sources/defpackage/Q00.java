package defpackage;

import io.sentry.ILogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Q00 implements ILogger {

    @NotNull
    public final C2688aH1 a;

    @Nullable
    public final ILogger b;

    public Q00(@NotNull C2688aH1 c2688aH1, @Nullable ILogger iLogger) {
        this.a = c2688aH1;
        this.b = iLogger;
    }

    @Override // io.sentry.ILogger
    public final void a(@NotNull NG1 ng1, @NotNull String str, @Nullable Object... objArr) {
        ILogger iLogger = this.b;
        if (iLogger == null || !b(ng1)) {
            return;
        }
        iLogger.a(ng1, str, objArr);
    }

    @Override // io.sentry.ILogger
    public final boolean b(@Nullable NG1 ng1) {
        C2688aH1 c2688aH1 = this.a;
        return ng1 != null && c2688aH1.isDebug() && ng1.ordinal() >= c2688aH1.getDiagnosticLevel().ordinal();
    }

    @Override // io.sentry.ILogger
    public final void c(@NotNull NG1 ng1, @Nullable Throwable th, @NotNull String str, @Nullable Object... objArr) {
        ILogger iLogger = this.b;
        if (iLogger == null || !b(ng1)) {
            return;
        }
        iLogger.c(ng1, th, str, objArr);
    }

    @Override // io.sentry.ILogger
    public final void d(@NotNull NG1 ng1, @NotNull String str, @Nullable Throwable th) {
        ILogger iLogger = this.b;
        if (iLogger == null || !b(ng1)) {
            return;
        }
        iLogger.d(ng1, str, th);
    }
}
