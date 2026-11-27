package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class J32 {
    public final boolean a;
    public final int b;

    @NotNull
    public final C7396wQ c;
    public final int d;

    public J32(boolean z, int i, @NotNull C7396wQ currencyNumber, int i2) {
        Intrinsics.checkNotNullParameter(currencyNumber, "currencyNumber");
        this.a = z;
        this.b = i;
        this.c = currencyNumber;
        this.d = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J32)) {
            return false;
        }
        J32 j32 = (J32) obj;
        return this.a == j32.a && this.b == j32.b && Intrinsics.a(this.c, j32.c) && this.d == j32.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + EF0.a(this.b, Boolean.hashCode(this.a) * 31, 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "TradingProfitLimit(isEnable=" + this.a + ", headerTextResId=" + this.b + ", currencyNumber=" + this.c + ", iconResId=" + this.d + ")";
    }

    public J32() {
        this(false, 0, new C7396wQ(0), 0);
    }
}
