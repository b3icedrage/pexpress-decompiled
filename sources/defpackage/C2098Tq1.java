package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Tq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2098Tq1 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;
    public final boolean c;

    @NotNull
    public final String d;

    public C2098Tq1(@NotNull String symbol, @NotNull String code, @NotNull String visibleName, boolean z) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(visibleName, "visibleName");
        this.a = symbol;
        this.b = code;
        this.c = z;
        this.d = visibleName;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2098Tq1)) {
            return false;
        }
        C2098Tq1 c2098Tq1 = (C2098Tq1) obj;
        return Intrinsics.a(this.a, c2098Tq1.a) && Intrinsics.a(this.b, c2098Tq1.b) && this.c == c2098Tq1.c && Intrinsics.a(this.d, c2098Tq1.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + C2983be.a(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationCurrency(symbol=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", isSelected=");
        sb.append(this.c);
        sb.append(", visibleName=");
        return C5807oq.b(sb, this.d, ")");
    }
}
