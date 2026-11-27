package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5402mv {

    @NotNull
    public final String a;

    @NotNull
    public final AbstractC4743jm1 b;
    public final boolean c;

    @NotNull
    public final K10 d;

    public C5402mv(@NotNull String indicatorKey, @NotNull AbstractC4743jm1 random, boolean z, @NotNull K10 getLocalDirectionCalculator) {
        Intrinsics.checkNotNullParameter(indicatorKey, "indicatorKey");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(getLocalDirectionCalculator, "getLocalDirectionCalculator");
        this.a = indicatorKey;
        this.b = random;
        this.c = z;
        this.d = getLocalDirectionCalculator;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5402mv)) {
            return false;
        }
        C5402mv c5402mv = (C5402mv) obj;
        return Intrinsics.a(this.a, c5402mv.a) && Intrinsics.a(this.b, c5402mv.b) && this.c == c5402mv.c && this.d.equals(c5402mv.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + C2983be.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    @NotNull
    public final String toString() {
        return "BuildingDirectionCalculatorParams(indicatorKey=" + this.a + ", random=" + this.b + ", useSelectingDirectionCalculator=" + this.c + ", getLocalDirectionCalculator=" + this.d + ")";
    }
}
