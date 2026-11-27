package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class GF {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    @NotNull
    public final String e;

    @NotNull
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    @NotNull
    public final String j;

    @NotNull
    public final String k;

    @NotNull
    public final String l;

    @NotNull
    public final String m;

    @NotNull
    public final String n;

    @Nullable
    public final String o;

    public GF(@NotNull String packageName, @NotNull String appVersion, @NotNull String phoneBrand, @NotNull String phoneModel, @NotNull String localeCountryCode, @NotNull String localeLanguageCode, boolean z, boolean z2, boolean z3, @NotNull String simOperatorName, @NotNull String simCountryIso, @NotNull String networkCountryIso, @NotNull String androidId, @NotNull String advertisingId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(phoneBrand, "phoneBrand");
        Intrinsics.checkNotNullParameter(phoneModel, "phoneModel");
        Intrinsics.checkNotNullParameter(localeCountryCode, "localeCountryCode");
        Intrinsics.checkNotNullParameter(localeLanguageCode, "localeLanguageCode");
        Intrinsics.checkNotNullParameter(simOperatorName, "simOperatorName");
        Intrinsics.checkNotNullParameter(simCountryIso, "simCountryIso");
        Intrinsics.checkNotNullParameter(networkCountryIso, "networkCountryIso");
        Intrinsics.checkNotNullParameter(androidId, "androidId");
        Intrinsics.checkNotNullParameter(advertisingId, "advertisingId");
        this.a = packageName;
        this.b = appVersion;
        this.c = phoneBrand;
        this.d = phoneModel;
        this.e = localeCountryCode;
        this.f = localeLanguageCode;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = simOperatorName;
        this.k = simCountryIso;
        this.l = networkCountryIso;
        this.m = androidId;
        this.n = advertisingId;
        this.o = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GF)) {
            return false;
        }
        GF gf = (GF) obj;
        return Intrinsics.a(this.a, gf.a) && Intrinsics.a(this.b, gf.b) && Intrinsics.a(this.c, gf.c) && Intrinsics.a(this.d, gf.d) && Intrinsics.a(this.e, gf.e) && Intrinsics.a(this.f, gf.f) && this.g == gf.g && this.h == gf.h && this.i == gf.i && Intrinsics.a(this.j, gf.j) && Intrinsics.a(this.k, gf.k) && Intrinsics.a(this.l, gf.l) && Intrinsics.a(this.m, gf.m) && Intrinsics.a(this.n, gf.n) && Intrinsics.a(this.o, gf.o);
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C2983be.a(C2983be.a(C2983be.a(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), this.g, 31), this.h, 31), this.i, 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        String str = this.o;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonConfigRequest(packageName=");
        sb.append(this.a);
        sb.append(", appVersion=");
        sb.append(this.b);
        sb.append(", phoneBrand=");
        sb.append(this.c);
        sb.append(", phoneModel=");
        sb.append(this.d);
        sb.append(", localeCountryCode=");
        sb.append(this.e);
        sb.append(", localeLanguageCode=");
        sb.append(this.f);
        sb.append(", isVpnActivate=");
        sb.append(this.g);
        sb.append(", isRooted=");
        sb.append(this.h);
        sb.append(", isWifi=");
        sb.append(this.i);
        sb.append(", simOperatorName=");
        sb.append(this.j);
        sb.append(", simCountryIso=");
        sb.append(this.k);
        sb.append(", networkCountryIso=");
        sb.append(this.l);
        sb.append(", androidId=");
        sb.append(this.m);
        sb.append(", advertisingId=");
        sb.append(this.n);
        sb.append(", email=");
        return C5807oq.b(sb, this.o, ")");
    }
}
