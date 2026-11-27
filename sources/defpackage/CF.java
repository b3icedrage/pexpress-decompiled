package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class CF {

    @NotNull
    public final String a;
    public final long b;
    public final float c;
    public final long d;

    public CF(@NotNull String activeId, long j, float f, long j2) {
        Intrinsics.checkNotNullParameter(activeId, "activeId");
        this.a = activeId;
        this.b = j;
        this.c = f;
        this.d = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CF)) {
            return false;
        }
        CF cf = (CF) obj;
        return Intrinsics.a(this.a, cf.a) && this.b == cf.b && Float.compare(this.c, cf.c) == 0 && this.d == cf.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((Float.hashCode(this.c) + C5491nL.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonChartEntryPoint(activeId=");
        sb.append(this.a);
        sb.append(", timeMillis=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(", candleId=");
        return C0681Bn.c(sb, this.d, ")");
    }
}
