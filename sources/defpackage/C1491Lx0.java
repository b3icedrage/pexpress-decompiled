package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Lx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1491Lx0 {

    @NotNull
    public final EnumC2868b42 a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @Nullable
    public final String d;

    @NotNull
    public final String e;

    @NotNull
    public final String f;

    @Nullable
    public final Integer g;

    @Nullable
    public final Integer h;

    @NotNull
    public final List<EnumC2121Ty0> i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public /* synthetic */ C1491Lx0(EnumC2868b42 enumC2868b42, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, List list, boolean z, int i) {
        this(enumC2868b42, str, str2, str3, str4, (i & 32) != 0 ? str4 : str5, num, num2, list, z, false, false, false);
    }

    public static C1491Lx0 a(C1491Lx0 c1491Lx0, boolean z, boolean z2, int i) {
        EnumC2868b42 availability = c1491Lx0.a;
        String key = c1491Lx0.b;
        String iconUrl = c1491Lx0.c;
        String str = c1491Lx0.d;
        String title = c1491Lx0.e;
        String titleNotLocalized = c1491Lx0.f;
        c1491Lx0.getClass();
        Integer num = c1491Lx0.g;
        c1491Lx0.getClass();
        c1491Lx0.getClass();
        Integer num2 = c1491Lx0.h;
        List<EnumC2121Ty0> tags = c1491Lx0.i;
        boolean z3 = c1491Lx0.j;
        boolean z4 = (i & 8192) != 0 ? c1491Lx0.k : z;
        boolean z5 = (i & 16384) != 0 ? c1491Lx0.l : z2;
        boolean z6 = (i & 32768) != 0 ? c1491Lx0.m : true;
        c1491Lx0.getClass();
        Intrinsics.checkNotNullParameter(availability, "availability");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleNotLocalized, "titleNotLocalized");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new C1491Lx0(availability, key, iconUrl, str, title, titleNotLocalized, num, num2, tags, z3, z4, z5, z6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1491Lx0)) {
            return false;
        }
        C1491Lx0 c1491Lx0 = (C1491Lx0) obj;
        return this.a == c1491Lx0.a && Intrinsics.a(this.b, c1491Lx0.b) && Intrinsics.a(this.c, c1491Lx0.c) && Intrinsics.a(this.d, c1491Lx0.d) && Intrinsics.a(this.e, c1491Lx0.e) && Intrinsics.a(this.f, c1491Lx0.f) && Intrinsics.a(this.g, c1491Lx0.g) && Intrinsics.a(this.h, c1491Lx0.h) && Intrinsics.a(this.i, c1491Lx0.i) && this.j == c1491Lx0.j && this.k == c1491Lx0.k && this.l == c1491Lx0.l && this.m == c1491Lx0.m;
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iB2 = C1039Gc0.b(C1039Gc0.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 961, this.f);
        Integer num = this.g;
        int iHashCode = (iB2 + (num == null ? 0 : num.hashCode())) * 29791;
        Integer num2 = this.h;
        return Boolean.hashCode(this.m) + C2983be.a(C2983be.a(C2983be.a(C5491nL.b((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.i), this.j, 31), this.k, 31), this.l, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Indicator(availability=");
        sb.append(this.a);
        sb.append(", key=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        sb.append(this.c);
        sb.append(", illustrationUrl=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", titleNotLocalized=");
        sb.append(this.f);
        sb.append(", description=null, descriptionRes=");
        sb.append(this.g);
        sb.append(", priority=null, extendedDescription=null, extendedDescriptionRes=");
        sb.append(this.h);
        sb.append(", tags=");
        sb.append(this.i);
        sb.append(", needBackedSupport=");
        sb.append(this.j);
        sb.append(", isSelected=");
        sb.append(this.k);
        sb.append(", isBlocked=");
        sb.append(this.l);
        sb.append(", isNextIconMode=");
        return C2983be.b(sb, this.m, ")");
    }

    public C1491Lx0(@NotNull EnumC2868b42 availability, @NotNull String key, @NotNull String iconUrl, @Nullable String str, @NotNull String title, @NotNull String titleNotLocalized, @Nullable Integer num, @Nullable Integer num2, @NotNull List tags, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(availability, "availability");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleNotLocalized, "titleNotLocalized");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.a = availability;
        this.b = key;
        this.c = iconUrl;
        this.d = str;
        this.e = title;
        this.f = titleNotLocalized;
        this.g = num;
        this.h = num2;
        this.i = tags;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
    }
}
