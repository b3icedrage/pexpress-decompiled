package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Or, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1709Or {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public C1709Or(int i, boolean z, long j, boolean z2) {
        boolean z3 = (i & 4) == 0;
        Intrinsics.checkNotNullParameter("", "percent");
        this.a = j;
        this.b = z;
        this.c = z3;
        this.d = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1709Or)) {
            return false;
        }
        C1709Or c1709Or = (C1709Or) obj;
        return b.k(this.a, c1709Or.a) && this.b == c1709Or.b && this.c == c1709Or.c && this.d == c1709Or.d;
    }

    public final int hashCode() {
        b.a aVar = b.e;
        return C2983be.a(C2983be.a(C2983be.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbB = C6495s7.b("BetDurationSelection(duration=", b.s(this.a), ", isSelected=");
        sbB.append(this.b);
        sbB.append(", isBinary=");
        sbB.append(this.c);
        sbB.append(", isLocked=");
        return C2983be.b(sbB, this.d, ", percent=)");
    }
}
