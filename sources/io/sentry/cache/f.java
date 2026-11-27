package io.sentry.cache;

import defpackage.C0841Do0;
import defpackage.C3537eG1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface f extends Iterable<C3537eG1> {
    default boolean W(@NotNull C3537eG1 c3537eG1, @NotNull C0841Do0 c0841Do0) {
        X(c3537eG1, c0841Do0);
        return true;
    }

    @Deprecated
    void X(@NotNull C3537eG1 c3537eG1, @NotNull C0841Do0 c0841Do0);

    void Y0(@NotNull C3537eG1 c3537eG1);
}
