package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7396wQ {

    @NotNull
    public final String a;
    public final double b;

    public C7396wQ() {
        this(0);
    }

    @NotNull
    public static C7396wQ a(double d, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return new C7396wQ(d, currencyCode);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7396wQ)) {
            return false;
        }
        C7396wQ c7396wQ = (C7396wQ) obj;
        return Intrinsics.a(this.a, c7396wQ.a) && Double.compare(this.b, c7396wQ.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "CurrencyNumber(currencyCode=" + this.a + ", value=" + this.b + ")";
    }

    public C7396wQ(double d, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.a = currencyCode;
        this.b = d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C7396wQ(int i) {
        String upperCase = "usd".toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        this(0.0d, upperCase);
    }
}
