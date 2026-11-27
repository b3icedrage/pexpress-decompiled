package io.sentry.android.core;

import defpackage.C2688aH1;
import defpackage.YF1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements io.sentry.metrics.c {
    @Override // io.sentry.metrics.c
    @NotNull
    public final io.sentry.metrics.b a(@NotNull C2688aH1 c2688aH1, @NotNull YF1 yf1) {
        C4506q c4506q = new C4506q(c2688aH1, yf1);
        AppState.i.c(c4506q);
        return c4506q;
    }
}
