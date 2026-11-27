package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class SS0 extends P80 {

    @InterfaceC2691aI1("account")
    @NotNull
    public final String a;

    @InterfaceC2691aI1("currency")
    @NotNull
    public final String b;

    @InterfaceC2691aI1("method")
    @NotNull
    public final String c;

    public SS0(@NotNull String account, @NotNull String currency, @NotNull String method) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        this.a = account;
        this.b = currency;
        this.c = method;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SS0)) {
            return false;
        }
        SS0 ss0 = (SS0) obj;
        return Intrinsics.a(this.a, ss0.a) && Intrinsics.a(this.b, ss0.b) && Intrinsics.a(this.c, ss0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginProperty(account=");
        sb.append(this.a);
        sb.append(", currency=");
        sb.append(this.b);
        sb.append(", method=");
        return C5807oq.b(sb, this.c, ")");
    }
}
