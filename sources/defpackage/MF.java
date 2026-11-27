package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class MF {
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MF)) {
            return false;
        }
        ((MF) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + (Long.hashCode(0L) * 31);
    }

    @NotNull
    public final String toString() {
        return "CommonCurrencyInfo(minDealAmount=0, maxDealAmount=0)";
    }
}
