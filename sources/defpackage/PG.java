package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PG {
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PG)) {
            return false;
        }
        ((PG) obj).getClass();
        return Intrinsics.a(null, null);
    }

    public final int hashCode() {
        Object obj = null;
        obj.getClass();
        throw null;
    }

    @NotNull
    public final String toString() {
        return K1.a(new StringBuilder("CompletedWithCancellation(result="), null, ", onCancellation=null)");
    }
}
