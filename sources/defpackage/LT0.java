package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class LT0 extends P80 {

    @InterfaceC2691aI1("sum")
    public final long a;

    public LT0(long j) {
        this.a = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LT0) && this.a == ((LT0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    @NotNull
    public final String toString() {
        return "LossLimitProperty(sum=" + this.a + ")";
    }
}
