package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6735tG {

    @NotNull
    public final String a;
    public final int b;

    public C6735tG() {
        this(null, 3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6735tG)) {
            return false;
        }
        C6735tG c6735tG = (C6735tG) obj;
        return Intrinsics.a(this.a, c6735tG.a) && this.b == c6735tG.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonUpdateDemoBalanceRequest(token=");
        sb.append(this.a);
        sb.append(", balance=");
        return SK.b(sb, this.b, ")");
    }

    public C6735tG(String token, int i) {
        token = (i & 1) != 0 ? "" : token;
        Intrinsics.checkNotNullParameter(token, "token");
        this.a = token;
        this.b = 10000;
    }
}
