package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Hb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1114Hb0 {

    @NotNull
    public final EnumC1036Gb0 a;
    public final int b;
    public final int c;
    public final int d;

    @Nullable
    public final List<String> e;

    @Nullable
    public final List<Integer> f;

    public /* synthetic */ C1114Hb0(EnumC1036Gb0 enumC1036Gb0, int i, int i2, int i3, List list, int i4) {
        this(enumC1036Gb0, i, i2, i3, (List<String>) ((i4 & 16) != 0 ? null : list), (List<Integer>) null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1114Hb0)) {
            return false;
        }
        C1114Hb0 c1114Hb0 = (C1114Hb0) obj;
        return this.a == c1114Hb0.a && this.b == c1114Hb0.b && this.c == c1114Hb0.c && this.d == c1114Hb0.d && Intrinsics.a(this.e, c1114Hb0.e) && Intrinsics.a(this.f, c1114Hb0.f);
    }

    public final int hashCode() {
        int iA = EF0.a(this.d, EF0.a(this.c, EF0.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        List<String> list = this.e;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.f;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "FaqItemUI(itemType=" + this.a + ", questionTextRes=" + this.b + ", answerTextRes=" + this.c + ", iconRes=" + this.d + ", argsAnswer=" + this.e + ", argsQuestion=" + this.f + ")";
    }

    public C1114Hb0(@NotNull EnumC1036Gb0 itemType, int i, int i2, int i3, @Nullable List<String> list, @Nullable List<Integer> list2) {
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        this.a = itemType;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = list;
        this.f = list2;
    }
}
