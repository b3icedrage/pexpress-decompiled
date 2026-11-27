package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C1039Gc0;
import defpackage.C5491nL;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class l {

    @NotNull
    public final File a;
    public final long b;

    @Nullable
    public final String c;

    public l(@NotNull File screenshot, long j, @Nullable String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        this.a = screenshot;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.a(this.a, lVar.a) && this.b == lVar.b && Intrinsics.a(this.c, lVar.c);
    }

    public final int hashCode() {
        int iA = C5491nL.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplayFrame(screenshot=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", screen=");
        return C1039Gc0.e(sb, this.c, ')');
    }
}
