package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5476nG {

    @NotNull
    public String a;

    @NotNull
    public String b;

    @NotNull
    public String c;

    @NotNull
    public String d;

    @NotNull
    public String e;

    @Nullable
    public String f;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5476nG)) {
            return false;
        }
        C5476nG c5476nG = (C5476nG) obj;
        return Intrinsics.a(this.a, c5476nG.a) && Intrinsics.a(this.b, c5476nG.b) && Intrinsics.a(this.c, c5476nG.c) && Intrinsics.a(this.d, c5476nG.d) && Intrinsics.a(this.e, c5476nG.e) && Intrinsics.a(this.f, c5476nG.f);
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(C1039Gc0.b((((this.c.hashCode() + C1039Gc0.b(this.a.hashCode() * 31, 31, this.b)) * 31) + 117588) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        return (iB + (str == null ? 0 : str.hashCode())) * 961;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonRegisterRequest(login=");
        sb.append(this.a);
        sb.append(", password=");
        sb.append(this.b);
        sb.append(", lang=");
        sb.append(this.c);
        sb.append(", clientType=web, referId=");
        sb.append(this.d);
        sb.append(", subId=");
        sb.append(this.e);
        sb.append(", captcha=");
        return C5807oq.b(sb, this.f, ", currency=null, subId1=null)");
    }
}
