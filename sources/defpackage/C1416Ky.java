package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1416Ky extends P80 {

    @InterfaceC2691aI1("from")
    @NotNull
    public final String a;

    @InterfaceC2691aI1("reason")
    @Nullable
    public final String b;

    @InterfaceC2691aI1("code")
    @Nullable
    public final String c;

    @InterfaceC2691aI1("message")
    @Nullable
    public final String d;

    @InterfaceC2691aI1("auth_attempt_id")
    @Nullable
    public final String e;

    public C1416Ky(@NotNull String from, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.a = from;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1416Ky)) {
            return false;
        }
        C1416Ky c1416Ky = (C1416Ky) obj;
        return Intrinsics.a(this.a, c1416Ky.a) && Intrinsics.a(this.b, c1416Ky.b) && Intrinsics.a(this.c, c1416Ky.c) && Intrinsics.a(this.d, c1416Ky.d) && Intrinsics.a(this.e, c1416Ky.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CaptchaErrorProperty(from=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", code=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", authAttemptId=");
        return C5807oq.b(sb, this.e, ")");
    }
}
