package io.sentry.android.core.util;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> {

    @Nullable
    public volatile T a = null;

    @NotNull
    public final InterfaceC0383a<T> b;

    /* JADX INFO: renamed from: io.sentry.android.core.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC0383a<T> {
        @Nullable
        T a(@NotNull Context context);
    }

    public a(@NotNull InterfaceC0383a<T> interfaceC0383a) {
        this.b = interfaceC0383a;
    }

    @Nullable
    public final T a(@NotNull Context context) {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = this.b.a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }
}
