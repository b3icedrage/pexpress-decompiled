package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: y60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7753y60 {
    public final boolean a;

    @NotNull
    public final String b;
    public final double c;

    public C7753y60() {
        this(0);
    }

    public static C7753y60 a(C7753y60 c7753y60, boolean z, String currencyCode, double d, int i) {
        if ((i & 1) != 0) {
            z = c7753y60.a;
        }
        if ((i & 2) != 0) {
            currencyCode = c7753y60.b;
        }
        if ((i & 4) != 0) {
            d = c7753y60.c;
        }
        c7753y60.getClass();
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return new C7753y60(z, currencyCode, d);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7753y60)) {
            return false;
        }
        C7753y60 c7753y60 = (C7753y60) obj;
        return this.a == c7753y60.a && Intrinsics.a(this.b, c7753y60.b) && Double.compare(this.c, c7753y60.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + C1039Gc0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        return "EnabledCurrencyNumber(isEnabled=" + this.a + ", currencyCode=" + this.b + ", value=" + this.c + ")";
    }

    public /* synthetic */ C7753y60(int i) {
        this(true, "", 0.0d);
    }

    public C7753y60(boolean z, @NotNull String currencyCode, double d) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.a = z;
        this.b = currencyCode;
        this.c = d;
    }
}
