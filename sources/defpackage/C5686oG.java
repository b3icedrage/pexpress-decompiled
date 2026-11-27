package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5686oG {

    @NotNull
    public final String a;
    public long b;

    @Nullable
    public Boolean c;

    public C5686oG(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.a = address;
        this.b = Long.MAX_VALUE;
        this.c = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5686oG)) {
            return false;
        }
        C5686oG c5686oG = (C5686oG) obj;
        return Intrinsics.a(this.a, c5686oG.a) && this.b == c5686oG.b && Intrinsics.a(this.c, c5686oG.c);
    }

    public final int hashCode() {
        int iA = C5491nL.a(this.a.hashCode() * 31, 31, this.b);
        Boolean bool = this.c;
        return iA + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public final String toString() {
        return "CommonServer(address=" + this.a + ", connectionTime=" + this.b + ", success=" + this.c + ")";
    }
}
