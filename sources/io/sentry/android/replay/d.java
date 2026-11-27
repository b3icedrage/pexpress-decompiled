package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.EF0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class d {

    @NotNull
    public final File a;
    public final int b;
    public final long c;

    public d(@NotNull File video, int i, long j) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.a = video;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + EF0.a(this.b, this.a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "GeneratedVideo(video=" + this.a + ", frameCount=" + this.b + ", duration=" + this.c + ')';
    }
}
