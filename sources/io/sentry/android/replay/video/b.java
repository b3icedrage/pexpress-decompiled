package io.sentry.android.replay.video;

import android.media.MediaMuxer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class b {
    public final long a;

    @NotNull
    public final MediaMuxer b;
    public boolean c;
    public int d;
    public int e;
    public long f;

    public b(@NotNull String path, float f) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.a = (long) (TimeUnit.SECONDS.toMicros(1L) / f);
        this.b = new MediaMuxer(path, 0);
    }
}
