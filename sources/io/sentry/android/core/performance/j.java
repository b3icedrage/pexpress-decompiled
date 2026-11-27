package io.sentry.android.core.performance;

import android.view.Window;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends io.sentry.android.core.internal.gestures.i {

    @NotNull
    public final io.sentry.android.core.internal.util.j e;

    public j(@NotNull Window.Callback callback, @NotNull io.sentry.android.core.internal.util.j jVar) {
        super(callback);
        this.e = jVar;
    }

    @Override // io.sentry.android.core.internal.gestures.i, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.e.run();
    }
}
