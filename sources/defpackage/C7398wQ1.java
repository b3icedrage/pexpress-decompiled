package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7398wQ1 {
    public final double a;
    public final int b;

    public C7398wQ1(int i, double d) {
        this.a = d;
        this.b = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7398wQ1)) {
            return false;
        }
        C7398wQ1 c7398wQ1 = (C7398wQ1) obj;
        return Double.compare(this.a, c7398wQ1.a) == 0 && this.b == c7398wQ1.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        return "StopCheckerParams(currentProfit=" + this.a + ", winsInRow=" + this.b + ")";
    }
}
