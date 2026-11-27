package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6911u6 {
    public final int a;

    @NotNull
    public final List<Integer> b;

    @NotNull
    public final List<String> c;

    @NotNull
    public final String d;
    public final double e;

    @NotNull
    public final String f;

    @NotNull
    public final String g;
    public final int h;

    public C6911u6() {
        throw null;
    }

    public C6911u6(int i, List titleArgsRes, List titleArgsString, String index, double d, String durationString, String illustrationUrl, int i2) {
        Intrinsics.checkNotNullParameter(titleArgsRes, "titleArgsRes");
        Intrinsics.checkNotNullParameter(titleArgsString, "titleArgsString");
        Intrinsics.checkNotNullParameter(index, "index");
        Intrinsics.checkNotNullParameter(durationString, "durationString");
        Intrinsics.checkNotNullParameter(illustrationUrl, "illustrationUrl");
        this.a = i;
        this.b = titleArgsRes;
        this.c = titleArgsString;
        this.d = index;
        this.e = d;
        this.f = durationString;
        this.g = illustrationUrl;
        this.h = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6911u6)) {
            return false;
        }
        C6911u6 c6911u6 = (C6911u6) obj;
        return this.a == c6911u6.a && Intrinsics.a(this.b, c6911u6.b) && Intrinsics.a(this.c, c6911u6.c) && Intrinsics.a(this.d, c6911u6.d) && Double.compare(this.e, c6911u6.e) == 0 && Intrinsics.a(this.f, c6911u6.f) && Intrinsics.a(this.g, c6911u6.g) && this.h == c6911u6.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + C1039Gc0.b(C1039Gc0.b(ID.a(this.e, C1039Gc0.b(C5491nL.b(C5491nL.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g);
    }

    @NotNull
    public final String toString() {
        String strT = C3476e.t(this.e);
        StringBuilder sb = new StringBuilder("ActivationStep(titleRes=");
        sb.append(this.a);
        sb.append(", titleArgsRes=");
        sb.append(this.b);
        sb.append(", titleArgsString=");
        sb.append(this.c);
        sb.append(", index=");
        C5896pG.b(sb, this.d, ", percents=", strT, ", durationString=");
        sb.append(this.f);
        sb.append(", illustrationUrl=");
        sb.append(this.g);
        sb.append(", bannerTitleRes=");
        return SK.b(sb, this.h, ")");
    }

    public C6911u6(int i, List list, String str, double d, String str2, String str3, int i2, int i3) {
        this(i, (i3 & 2) != 0 ? C5653o60.d : list, C5653o60.d, str, d, str2, str3, i2);
    }
}
