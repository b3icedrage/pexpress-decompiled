package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5598nq0 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final NG1 d;

    public C5598nq0(@NotNull String host, @NotNull String status, @Nullable String str, @Nullable NG1 ng1) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(status, "status");
        this.a = host;
        this.b = status;
        this.c = str;
        this.d = ng1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5598nq0)) {
            return false;
        }
        C5598nq0 c5598nq0 = (C5598nq0) obj;
        return Intrinsics.a(this.a, c5598nq0.a) && Intrinsics.a(this.b, c5598nq0.b) && Intrinsics.a(this.c, c5598nq0.c) && this.d == c5598nq0.d;
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        NG1 ng1 = this.d;
        return iHashCode + (ng1 != null ? ng1.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "Group(host=" + this.a + ", status=" + this.b + ", path=" + this.c + ", level=" + this.d + ")";
    }
}
