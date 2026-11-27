package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ZF {

    @Nullable
    public final Long a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    public ZF(@Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable String str3) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZF)) {
            return false;
        }
        ZF zf = (ZF) obj;
        return Intrinsics.a(this.a, zf.a) && Intrinsics.a(this.b, zf.b) && Intrinsics.a(this.c, zf.c) && Intrinsics.a(this.d, zf.d);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CommonGetUserDataRequest(userID=" + this.a + ", email=" + this.b + ", currency=" + this.c + ", country=" + this.d + ")";
    }
}
