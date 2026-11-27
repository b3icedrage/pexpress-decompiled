package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class El2 {

    @NotNull
    public final String a;

    @Nullable
    public final String b;

    @Nullable
    public final Integer c;

    @Nullable
    public final Long d;
    public final boolean e;

    public El2(@NotNull String errorClass, @Nullable String str, @Nullable Integer num, @Nullable Long l, boolean z) {
        Intrinsics.checkNotNullParameter(errorClass, "errorClass");
        this.a = errorClass;
        this.b = str;
        this.c = num;
        this.d = l;
        this.e = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof El2)) {
            return false;
        }
        El2 el2 = (El2) obj;
        return this.a.equals(el2.a) && Intrinsics.a(this.b, el2.b) && Intrinsics.a(this.c, el2.c) && Intrinsics.a(this.d, el2.d) && this.e == el2.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (l != null ? l.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("WsFailureInfo(errorClass=");
        sb.append(this.a);
        sb.append(", errorMessage=");
        sb.append(this.b);
        sb.append(", handshakeStatus=");
        sb.append(this.c);
        sb.append(", lifetimeMs=");
        sb.append(this.d);
        sb.append(", afterSelfClose=");
        return C2983be.b(sb, this.e, ")");
    }
}
