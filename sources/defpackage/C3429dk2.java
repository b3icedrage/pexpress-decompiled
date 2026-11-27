package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3429dk2 {

    @NotNull
    public final String a;
    public final int b;

    public C3429dk2(@NotNull String workSpecId, int i) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.a = workSpecId;
        this.b = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3429dk2)) {
            return false;
        }
        C3429dk2 c3429dk2 = (C3429dk2) obj;
        return Intrinsics.a(this.a, c3429dk2.a) && this.b == c3429dk2.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}
