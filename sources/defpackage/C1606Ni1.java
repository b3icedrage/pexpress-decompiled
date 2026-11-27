package defpackage;

import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ni1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1606Ni1 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final C2141Uf c;

    public C1606Ni1(@NotNull String titleInterpolatedValue, @NotNull String descriptionInterpolatedValue, @NotNull C2141Uf onCompleteClick) {
        Intrinsics.checkNotNullParameter(titleInterpolatedValue, "titleInterpolatedValue");
        Intrinsics.checkNotNullParameter(descriptionInterpolatedValue, "descriptionInterpolatedValue");
        Intrinsics.checkNotNullParameter(onCompleteClick, "onCompleteClick");
        this.a = titleInterpolatedValue;
        this.b = descriptionInterpolatedValue;
        this.c = onCompleteClick;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1606Ni1)) {
            return false;
        }
        C1606Ni1 c1606Ni1 = (C1606Ni1) obj;
        c1606Ni1.getClass();
        return Intrinsics.a(this.a, c1606Ni1.a) && Intrinsics.a(this.b, c1606Ni1.b) && Intrinsics.a(this.c, c1606Ni1.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + C1039Gc0.b(EF0.a(R.string.you_have_earned_description, C1039Gc0.b(Integer.hashCode(R.string.you_have_earned_text) * 31, 31, this.a), 31), 31, this.b);
    }

    @NotNull
    public final String toString() {
        return "ProfitLimitBottomSheetParams(titleResId=2131952779, titleInterpolatedValue=" + this.a + ", descriptionResId=2131952778, descriptionInterpolatedValue=" + this.b + ", onCompleteClick=" + this.c + ")";
    }
}
