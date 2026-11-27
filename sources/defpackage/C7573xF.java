package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7573xF {
    public final double a;

    public C7573xF(double d) {
        this.a = d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7573xF) && Double.compare(this.a, ((C7573xF) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    @NotNull
    public final String toString() {
        return "CommonBalance(balance=" + this.a + ")";
    }
}
