package io.sentry.android.core;

import defpackage.C2688aH1;
import defpackage.YF1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.sentry.android.core.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4504o implements io.sentry.logger.d {
    @Override // io.sentry.logger.d
    @NotNull
    public final io.sentry.logger.c a(@NotNull C2688aH1 c2688aH1, @NotNull YF1 yf1) {
        C4503n c4503n = new C4503n(c2688aH1, yf1);
        AppState.i.c(c4503n);
        return c4503n;
    }
}
