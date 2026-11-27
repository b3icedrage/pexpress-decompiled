package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5893pF {
    public long a;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5893pF) && this.a == ((C5893pF) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    @NotNull
    public final String toString() {
        return "CommonAccountActivationRequest(userId=" + this.a + ")";
    }
}
