package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class T9 extends P80 {

    @InterfaceC2691aI1("sum")
    public final double a;

    public T9(double d) {
        this.a = d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T9) && Double.compare(this.a, ((T9) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    @NotNull
    public final String toString() {
        return "AmountProperty(sum=" + this.a + ")";
    }
}
