package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class XF {

    @NotNull
    public final String a;

    public XF() {
        this("");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof XF) && Intrinsics.a(this.a, ((XF) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("CommonGetBalanceRequest(token="), this.a, ")");
    }

    public XF(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.a = token;
    }
}
