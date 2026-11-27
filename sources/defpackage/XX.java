package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class XX extends P80 {

    @InterfaceC2691aI1(AppMeasurementSdk.ConditionalUserProperty.VALUE)
    @NotNull
    public final String a;

    @InterfaceC2691aI1("currency")
    @NotNull
    public final String b;

    @InterfaceC2691aI1("value_usd")
    @Nullable
    public final String c;

    @InterfaceC2691aI1("code")
    @Nullable
    public final String d;

    @InterfaceC2691aI1("in_app")
    @Nullable
    public final Boolean e;

    public /* synthetic */ XX(String str, String str2, String str3, String str4, Boolean bool, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XX)) {
            return false;
        }
        XX xx = (XX) obj;
        return Intrinsics.a(this.a, xx.a) && Intrinsics.a(this.b, xx.b) && Intrinsics.a(this.c, xx.c) && Intrinsics.a(this.d, xx.d) && Intrinsics.a(this.e, xx.e);
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "DepositProperty(value=" + this.a + ", currency=" + this.b + ", valueUSD=" + this.c + ", code=" + this.d + ", inApp=" + this.e + ")";
    }

    public XX(@NotNull String value, @NotNull String currency, @Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.a = value;
        this.b = currency;
        this.c = str;
        this.d = str2;
        this.e = bool;
    }
}
