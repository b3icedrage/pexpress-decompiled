package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6985uT0 extends P80 {

    @NotNull
    public final String a;

    public C6985uT0(@NotNull String account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.a = account;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6985uT0) && Intrinsics.a(this.a, ((C6985uT0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("LogoutShowProperty(account="), this.a, ")");
    }
}
