package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class EV1 {
    public final int a;

    @Nullable
    public final List<Integer> b;
    public final int c;

    @Nullable
    public final List<String> d;
    public final int e;

    @Nullable
    public final C7239vg f;

    public EV1(int i, @Nullable List list, int i2, @Nullable List list2, int i3, @Nullable C7239vg c7239vg) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = list2;
        this.e = i3;
        this.f = c7239vg;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EV1)) {
            return false;
        }
        EV1 ev1 = (EV1) obj;
        return this.a == ev1.a && Intrinsics.a(this.b, ev1.b) && this.c == ev1.c && Intrinsics.a(this.d, ev1.d) && this.e == ev1.e && Intrinsics.a(this.f, ev1.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        List<Integer> list = this.b;
        int iA = EF0.a(this.c, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        List<String> list2 = this.d;
        int iA2 = EF0.a(this.e, (iA + (list2 == null ? 0 : list2.hashCode())) * 31, 31);
        C7239vg c7239vg = this.f;
        return iA2 + (c7239vg != null ? c7239vg.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SupportItemData(titleResId=" + this.a + ", titleSpannable=" + this.b + ", descriptionRes=" + this.c + ", descriptionResStrings=" + this.d + ", imageResId=" + this.e + ", onActivateButtonClick=" + this.f + ")";
    }
}
