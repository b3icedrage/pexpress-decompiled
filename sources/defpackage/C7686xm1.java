package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7686xm1 extends P80 {

    @InterfaceC2691aI1("from")
    @NotNull
    public final String a;

    @InterfaceC2691aI1("rate")
    @Nullable
    public final Integer b;

    @InterfaceC2691aI1("next")
    @NotNull
    public final String c;

    public C7686xm1(@NotNull String from, @NotNull String next, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(next, "next");
        this.a = from;
        this.b = num;
        this.c = next;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7686xm1)) {
            return false;
        }
        C7686xm1 c7686xm1 = (C7686xm1) obj;
        return Intrinsics.a(this.a, c7686xm1.a) && Intrinsics.a(this.b, c7686xm1.b) && Intrinsics.a(this.c, c7686xm1.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RateWithNextActionProperty(from=");
        sb.append(this.a);
        sb.append(", starCount=");
        sb.append(this.b);
        sb.append(", next=");
        return C5807oq.b(sb, this.c, ")");
    }
}
