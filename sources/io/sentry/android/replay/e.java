package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C2912bH1;
import defpackage.C5491nL;
import defpackage.EF0;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class e {

    @NotNull
    public final u a;

    @NotNull
    public final k b;

    @NotNull
    public final Date c;
    public final int d;
    public final long e;

    @NotNull
    public final C2912bH1.b f;

    @Nullable
    public final String g;

    @NotNull
    public final List<io.sentry.rrweb.b> h;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull u recorderConfig, @NotNull k cache, @NotNull Date timestamp, int i, long j, @NotNull C2912bH1.b replayType, @Nullable String str, @NotNull List<? extends io.sentry.rrweb.b> events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        this.a = recorderConfig;
        this.b = cache;
        this.c = timestamp;
        this.d = i;
        this.e = j;
        this.f = replayType;
        this.g = str;
        this.h = events;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.a(this.a, eVar.a) && Intrinsics.a(this.b, eVar.b) && Intrinsics.a(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && Intrinsics.a(this.g, eVar.g) && Intrinsics.a(this.h, eVar.h);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + C5491nL.a(EF0.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31, this.e)) * 31;
        String str = this.g;
        return this.h.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "LastSegmentData(recorderConfig=" + this.a + ", cache=" + this.b + ", timestamp=" + this.c + ", id=" + this.d + ", duration=" + this.e + ", replayType=" + this.f + ", screenAtStart=" + this.g + ", events=" + this.h + ')';
    }
}
