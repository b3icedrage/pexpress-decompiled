package io.sentry.android.replay.util;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class i implements Runnable {

    @NotNull
    public final String d;
    public final /* synthetic */ Runnable e;

    public i(@NotNull Runnable delegate, @NotNull String taskName) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.d = taskName;
        this.e = delegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.run();
    }
}
