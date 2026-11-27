package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6106qG {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public C6106qG(@NotNull String email, @NotNull String nickname, @NotNull String country, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(country, "country");
        this.a = email;
        this.b = nickname;
        this.c = country;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static C6106qG a(C6106qG c6106qG, String str, int i) {
        String email = c6106qG.a;
        if ((i & 2) != 0) {
            str = c6106qG.b;
        }
        String nickname = str;
        String country = c6106qG.c;
        boolean z = (i & 8) != 0 ? c6106qG.d : true;
        boolean z2 = c6106qG.e;
        boolean z3 = (i & 32) != 0 ? c6106qG.f : true;
        c6106qG.getClass();
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(country, "country");
        return new C6106qG(email, nickname, country, z, z2, z3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6106qG)) {
            return false;
        }
        C6106qG c6106qG = (C6106qG) obj;
        return Intrinsics.a(this.a, c6106qG.a) && Intrinsics.a(this.b, c6106qG.b) && Intrinsics.a(this.c, c6106qG.c) && this.d == c6106qG.d && this.e == c6106qG.e && this.f == c6106qG.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + C2983be.a(C2983be.a(C1039Gc0.b(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonShortUser(email=");
        sb.append(this.a);
        sb.append(", nickname=");
        sb.append(this.b);
        sb.append(", country=");
        sb.append(this.c);
        sb.append(", activated=");
        sb.append(this.d);
        sb.append(", isVerified=");
        sb.append(this.e);
        sb.append(", cryptoEnable=");
        return C2983be.b(sb, this.f, ")");
    }
}
