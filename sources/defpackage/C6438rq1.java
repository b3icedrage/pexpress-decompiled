package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6438rq1 extends P80 {

    @InterfaceC2691aI1("affiliate_id")
    @NotNull
    public final String a;

    @InterfaceC2691aI1("country")
    @NotNull
    public final String b;

    @InterfaceC2691aI1("device_id")
    @NotNull
    public final String c;

    @InterfaceC2691aI1("currency")
    @NotNull
    public final String d;

    @InterfaceC2691aI1("from")
    @NotNull
    public final String e;

    @InterfaceC2691aI1("method")
    @NotNull
    public final String f;

    public C6438rq1(@NotNull String affiliateID, @NotNull String country, @NotNull String deviceID, @NotNull String currency, @NotNull String from, @NotNull String method) {
        Intrinsics.checkNotNullParameter(affiliateID, "affiliateID");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(method, "method");
        this.a = affiliateID;
        this.b = country;
        this.c = deviceID;
        this.d = currency;
        this.e = from;
        this.f = method;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6438rq1)) {
            return false;
        }
        C6438rq1 c6438rq1 = (C6438rq1) obj;
        return Intrinsics.a(this.a, c6438rq1.a) && Intrinsics.a(this.b, c6438rq1.b) && Intrinsics.a(this.c, c6438rq1.c) && Intrinsics.a(this.d, c6438rq1.d) && Intrinsics.a(this.e, c6438rq1.e) && Intrinsics.a(this.f, c6438rq1.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RegisterProperty(affiliateID=");
        sb.append(this.a);
        sb.append(", country=");
        sb.append(this.b);
        sb.append(", deviceID=");
        sb.append(this.c);
        sb.append(", currency=");
        sb.append(this.d);
        sb.append(", from=");
        sb.append(this.e);
        sb.append(", method=");
        return C5807oq.b(sb, this.f, ")");
    }
}
