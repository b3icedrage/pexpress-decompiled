package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8001zH1 {

    @Nullable
    public final String a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;
    public final boolean d;

    @Nullable
    public final Boolean e;
    public final boolean f;

    public C8001zH1(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable Boolean bool, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = bool;
        this.f = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8001zH1)) {
            return false;
        }
        C8001zH1 c8001zH1 = (C8001zH1) obj;
        return Intrinsics.a(this.a, c8001zH1.a) && Intrinsics.a(this.b, c8001zH1.b) && Intrinsics.a(this.c, c8001zH1.c) && this.d == c8001zH1.d && Intrinsics.a(this.e, c8001zH1.e) && this.f == c8001zH1.f;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iA = C2983be.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, this.d, 31);
        Boolean bool = this.e;
        return Boolean.hashCode(this.f) + ((iA + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SentryUserSnapshot(id=");
        sb.append(this.a);
        sb.append(", email=");
        sb.append(this.b);
        sb.append(", country=");
        sb.append(this.c);
        sb.append(", signedIn=");
        sb.append(this.d);
        sb.append(", isAccountOurs=");
        sb.append(this.e);
        sb.append(", activated=");
        return C2983be.b(sb, this.f, ")");
    }
}
