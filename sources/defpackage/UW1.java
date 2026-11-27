package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class UW1 {

    @NotNull
    public final String a;
    public final int b;
    public final int c;

    public UW1(@NotNull String workSpecId, int i, int i2) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.a = workSpecId;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UW1)) {
            return false;
        }
        UW1 uw1 = (UW1) obj;
        return Intrinsics.a(this.a, uw1.a) && this.b == uw1.b && this.c == uw1.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + EF0.a(this.b, this.a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}
