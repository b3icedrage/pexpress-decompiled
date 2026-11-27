package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.pexpress.tool.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5819ou {

    @Nullable
    public final Integer a;

    @Nullable
    public final Integer b;

    @Nullable
    public final List<String> c;

    @Nullable
    public final String d;
    public final int e;

    public C5819ou() {
        this(null, null, null, null, 1023);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5819ou)) {
            return false;
        }
        C5819ou c5819ou = (C5819ou) obj;
        c5819ou.getClass();
        return Intrinsics.a(this.a, c5819ou.a) && Intrinsics.a(this.b, c5819ou.b) && Intrinsics.a(this.c, c5819ou.c) && Intrinsics.a(this.d, c5819ou.d) && this.e == c5819ou.e;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 29791;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 961;
        List<String> list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        return Integer.hashCode(this.e) + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 961);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomSheetItem(titleStr=null, titleResId=");
        sb.append(this.a);
        sb.append(", titleSpannable=null, descriptionStr=null, descriptionRes=");
        sb.append(this.b);
        sb.append(", descriptionResFields=null, descriptionResStrings=");
        sb.append(this.c);
        sb.append(", imageUrl=");
        sb.append(this.d);
        sb.append(", imageResId=null, imagePlaceholder=");
        return SK.b(sb, this.e, ")");
    }

    public C5819ou(Integer num, Integer num2, List list, String str, int i) {
        num = (i & 2) != 0 ? null : num;
        num2 = (i & 16) != 0 ? null : num2;
        list = (i & 64) != 0 ? null : list;
        str = (i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str;
        this.a = num;
        this.b = num2;
        this.c = list;
        this.d = str;
        this.e = R.drawable.big_picture_placeholder;
    }
}
