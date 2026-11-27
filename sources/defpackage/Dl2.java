package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Dl2 {

    @Nullable
    public final Integer a;

    @Nullable
    public final String b;

    @Nullable
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;

    public Dl2(@Nullable Integer num, @Nullable String str, @Nullable Long l, boolean z, boolean z2, int i, int i2) {
        this.a = num;
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dl2)) {
            return false;
        }
        Dl2 dl2 = (Dl2) obj;
        return this.a.equals(dl2.a) && Intrinsics.a(this.b, dl2.b) && Intrinsics.a(this.c, dl2.c) && this.d == dl2.d && this.e == dl2.e && this.f == dl2.f && this.g == dl2.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        return Integer.hashCode(this.g) + EF0.a(this.f, C2983be.a(C2983be.a((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31, this.d, 31), this.e, 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("WsClosedInfo(code=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", lifetimeMs=");
        sb.append(this.c);
        sb.append(", selfInitiated=");
        sb.append(this.d);
        sb.append(", isReal=");
        sb.append(this.e);
        sb.append(", remoteClosesSinceReport=");
        sb.append(this.f);
        sb.append(", loopStreak=");
        return SK.b(sb, this.g, ")");
    }
}
