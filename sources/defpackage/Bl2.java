package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Bl2 {

    @Nullable
    public final Integer a;

    @Nullable
    public final String b;

    @Nullable
    public final Long c;
    public final int d;
    public final int e;

    @NotNull
    public final String f;

    @Nullable
    public final Long g;

    @Nullable
    public final Long h;

    @Nullable
    public final Long i;
    public final long j;
    public final boolean k;

    @NotNull
    public final String l;

    public Bl2(@Nullable Integer num, @Nullable String str, @Nullable Long l, int i, int i2, @NotNull String codes, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, long j, boolean z, @NotNull String trigger) {
        Intrinsics.checkNotNullParameter(codes, "codes");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        this.a = num;
        this.b = str;
        this.c = l;
        this.d = i;
        this.e = i2;
        this.f = codes;
        this.g = l2;
        this.h = l3;
        this.i = l4;
        this.j = j;
        this.k = z;
        this.l = trigger;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bl2)) {
            return false;
        }
        Bl2 bl2 = (Bl2) obj;
        return Intrinsics.a(this.a, bl2.a) && Intrinsics.a(this.b, bl2.b) && Intrinsics.a(this.c, bl2.c) && this.d == bl2.d && this.e == bl2.e && Intrinsics.a(this.f, bl2.f) && Intrinsics.a(this.g, bl2.g) && Intrinsics.a(this.h, bl2.h) && Intrinsics.a(this.i, bl2.i) && this.j == bl2.j && this.k == bl2.k && Intrinsics.a(this.l, bl2.l);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iB = C1039Gc0.b(EF0.a(this.e, EF0.a(this.d, (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31, 31), 31), 31, this.f);
        Long l2 = this.g;
        int iHashCode3 = (iB + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.h;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.i;
        return this.l.hashCode() + C2983be.a(C5491nL.a((iHashCode4 + (l4 != null ? l4.hashCode() : 0)) * 31, 31, this.j), this.k, 31);
    }

    @NotNull
    public final String toString() {
        return "WsCloseSummary(code=" + this.a + ", reason=" + this.b + ", lifetimeMs=" + this.c + ", closes=" + this.d + ", shortLived=" + this.e + ", codes=" + this.f + ", lifetimeP50Ms=" + this.g + ", lifetimeP90Ms=" + this.h + ", lifetimeMaxMs=" + this.i + ", windowMs=" + this.j + ", loop=" + this.k + ", trigger=" + this.l + ")";
    }
}
