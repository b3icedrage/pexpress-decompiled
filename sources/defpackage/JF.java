package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class JF {
    public final long a;

    public JF(long j) {
        this.a = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JF) {
            return this.a == ((JF) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Long.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        return C0681Bn.c(new StringBuilder("CommonCryptoEnableRequest(userId="), this.a, ", cryptoEnable=true)");
    }
}
