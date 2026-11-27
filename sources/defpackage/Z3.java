package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Z3 extends P80 {

    @InterfaceC2691aI1("account")
    @NotNull
    public final String a;

    public Z3(@NotNull String account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.a = account;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Z3) && Intrinsics.a(this.a, ((Z3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("AccountProperty(account="), this.a, ")");
    }
}
