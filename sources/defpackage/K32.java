package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class K32 {
    public final int a;
    public final int b;

    @NotNull
    public final String c;
    public final boolean d;
    public final long e;

    public K32(int i, int i2, String currentTimeText, boolean z, long j) {
        Intrinsics.checkNotNullParameter(currentTimeText, "currentTimeText");
        this.a = i;
        this.b = i2;
        this.c = currentTimeText;
        this.d = z;
        this.e = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K32)) {
            return false;
        }
        K32 k32 = (K32) obj;
        return this.a == k32.a && this.b == k32.b && Intrinsics.a(this.c, k32.c) && this.d == k32.d && b.k(this.e, k32.e);
    }

    public final int hashCode() {
        int iA = C2983be.a(C1039Gc0.b(EF0.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), this.d, 31);
        b.a aVar = b.e;
        return Long.hashCode(this.e) + iA;
    }

    @NotNull
    public final String toString() {
        return "TradingProgress(currentProgress=" + this.a + ", fullProgress=" + this.b + ", currentTimeText=" + this.c + ", nowLoading=" + this.d + ", animTime=" + b.s(this.e) + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K32() {
        this(100, 100, "", true, c.g(1, R40.SECONDS));
        b.a aVar = b.e;
    }
}
