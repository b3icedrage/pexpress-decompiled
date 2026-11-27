package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class RP {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @Nullable
    public final String c;

    public RP(@NotNull String email, @NotNull String password, @Nullable String str) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        this.a = email;
        this.b = password;
        this.c = str;
    }

    public static RP a(RP rp) {
        String email = rp.a;
        String password = rp.b;
        rp.getClass();
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        return new RP(email, password, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RP)) {
            return false;
        }
        RP rp = (RP) obj;
        return Intrinsics.a(this.a, rp.a) && Intrinsics.a(this.b, rp.b) && Intrinsics.a(this.c, rp.c);
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.d("CreatedAccount(token=", this.c == null ? "null" : "***", ")");
    }
}
