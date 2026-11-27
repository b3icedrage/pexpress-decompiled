package defpackage;

import com.pexpress.tool.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3151cR1 {

    @Nullable
    public final Integer a;

    @Nullable
    public final List<Integer> b;

    @Nullable
    public final Integer c;

    @Nullable
    public final List<Integer> d;

    @Nullable
    public final String e;
    public final int f;

    public C3151cR1() {
        this(null, null, null, null, null, 511);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3151cR1)) {
            return false;
        }
        C3151cR1 c3151cR1 = (C3151cR1) obj;
        c3151cR1.getClass();
        return Intrinsics.a(this.a, c3151cR1.a) && Intrinsics.a(this.b, c3151cR1.b) && Intrinsics.a(this.c, c3151cR1.c) && Intrinsics.a(this.d, c3151cR1.d) && Intrinsics.a(this.e, c3151cR1.e) && this.f == c3151cR1.f;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<Integer> list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 961;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Integer> list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.e;
        return Integer.hashCode(this.f) + ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 961);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Story(titleStr=null, titleResId=");
        sb.append(this.a);
        sb.append(", titleSpannable=");
        sb.append(this.b);
        sb.append(", descriptionStr=null, descriptionRes=");
        sb.append(this.c);
        sb.append(", descriptionResFields=");
        sb.append(this.d);
        sb.append(", imageUrl=");
        sb.append(this.e);
        sb.append(", imageResId=null, imagePlaceholder=");
        return SK.b(sb, this.f, ")");
    }

    public C3151cR1(Integer num, List list, Integer num2, List list2, String str, int i) {
        num = (i & 2) != 0 ? null : num;
        list = (i & 4) != 0 ? null : list;
        num2 = (i & 16) != 0 ? null : num2;
        list2 = (i & 32) != 0 ? null : list2;
        str = (i & 64) != 0 ? null : str;
        this.a = num;
        this.b = list;
        this.c = num2;
        this.d = list2;
        this.e = str;
        this.f = R.drawable.ic_placeholder_for_stories;
    }
}
