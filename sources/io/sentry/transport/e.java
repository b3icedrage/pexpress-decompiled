package io.sentry.transport;

import defpackage.C0841Do0;
import defpackage.C3537eG1;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface e extends Closeable {
    void I0(@NotNull C3537eG1 c3537eG1, @NotNull C0841Do0 c0841Do0);

    void a(boolean z);

    void d(long j);

    @Nullable
    l h();

    default boolean i() {
        return true;
    }
}
