package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Nr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1631Nr {

    @Nullable
    public final Integer a;

    @Nullable
    public final String b;

    @Nullable
    public final Integer c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    @NotNull
    public final String f;
    public final long g;

    @Nullable
    public final C3496e42 h;

    @NotNull
    public final C1491Lx0 i;

    @NotNull
    public final EnumC5275mJ j;
    public final boolean k;

    @NotNull
    public final CP l;

    @NotNull
    public final DP m;

    public C1631Nr() {
        throw null;
    }

    public C1631Nr(Integer num, String str, Integer num2, String str2, String str3, String amount, long j, C3496e42 c3496e42, C1491Lx0 indicator, EnumC5275mJ mode, boolean z, CP onConfirmClick, DP onSwitchCheckedChangeListener) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        Intrinsics.checkNotNullParameter(onSwitchCheckedChangeListener, "onSwitchCheckedChangeListener");
        this.a = num;
        this.b = str;
        this.c = num2;
        this.d = str2;
        this.e = str3;
        this.f = amount;
        this.g = j;
        this.h = c3496e42;
        this.i = indicator;
        this.j = mode;
        this.k = z;
        this.l = onConfirmClick;
        this.m = onSwitchCheckedChangeListener;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1631Nr)) {
            return false;
        }
        C1631Nr c1631Nr = (C1631Nr) obj;
        return Intrinsics.a(this.a, c1631Nr.a) && Intrinsics.a(this.b, c1631Nr.b) && Intrinsics.a(this.c, c1631Nr.c) && Intrinsics.a(this.d, c1631Nr.d) && Intrinsics.a(this.e, c1631Nr.e) && Intrinsics.a(this.f, c1631Nr.f) && b.k(this.g, c1631Nr.g) && Intrinsics.a(this.h, c1631Nr.h) && Intrinsics.a(this.i, c1631Nr.i) && this.j == c1631Nr.j && this.k == c1631Nr.k && Intrinsics.a(this.l, c1631Nr.l) && Intrinsics.a(this.m, c1631Nr.m);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iB = C1039Gc0.b((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
        b.a aVar = b.e;
        int iA = C5491nL.a(iB, 31, this.g);
        C3496e42 c3496e42 = this.h;
        return this.m.hashCode() + ((this.l.hashCode() + C2983be.a((this.j.hashCode() + ((this.i.hashCode() + ((iA + (c3496e42 != null ? c3496e42.hashCode() : 0)) * 31)) * 31)) * 31, this.k, 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String strS = b.s(this.g);
        StringBuilder sb = new StringBuilder("BetConfirmParams(titleIconId=");
        sb.append(this.a);
        sb.append(", titleIconUrl=");
        sb.append(this.b);
        sb.append(", titleTextId=");
        sb.append(this.c);
        sb.append(", titleTextStr=");
        sb.append(this.d);
        sb.append(", titleTextPercent=");
        sb.append(this.e);
        sb.append(", amount=");
        C5896pG.b(sb, this.f, ", betDuration=", strS, ", strategy=");
        sb.append(this.h);
        sb.append(", indicator=");
        sb.append(this.i);
        sb.append(", mode=");
        sb.append(this.j);
        sb.append(", oneClickDealsEnabled=");
        sb.append(this.k);
        sb.append(", onConfirmClick=");
        sb.append(this.l);
        sb.append(", onSwitchCheckedChangeListener=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
