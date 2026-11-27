package io.sentry;

import defpackage.NG1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface ILogger {
    void a(@NotNull NG1 ng1, @NotNull String str, @Nullable Object... objArr);

    boolean b(@Nullable NG1 ng1);

    void c(@NotNull NG1 ng1, @Nullable Throwable th, @NotNull String str, @Nullable Object... objArr);

    void d(@NotNull NG1 ng1, @NotNull String str, @Nullable Throwable th);
}
