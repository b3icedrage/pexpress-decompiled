package defpackage;

import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class R3 {
    public final int a;

    @NotNull
    public final C7396wQ b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public R3(int i, @NotNull C7396wQ currencyAmount, boolean z, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(currencyAmount, "currencyAmount");
        this.a = i;
        this.b = currencyAmount;
        this.c = z;
        this.d = z2;
        this.e = i2;
    }

    public static R3 a(R3 r3, int i, C7396wQ c7396wQ, boolean z, boolean z2, int i2, int i3) {
        r3.getClass();
        if ((i3 & 2) != 0) {
            i = r3.a;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            c7396wQ = r3.b;
        }
        C7396wQ currencyAmount = c7396wQ;
        if ((i3 & 8) != 0) {
            z = r3.c;
        }
        boolean z3 = z;
        if ((i3 & 16) != 0) {
            z2 = r3.d;
        }
        boolean z4 = z2;
        if ((i3 & 32) != 0) {
            i2 = r3.e;
        }
        r3.getClass();
        Intrinsics.checkNotNullParameter(currencyAmount, "currencyAmount");
        return new R3(i4, currencyAmount, z3, z4, i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R3)) {
            return false;
        }
        R3 r3 = (R3) obj;
        r3.getClass();
        return this.a == r3.a && Intrinsics.a(this.b, r3.b) && this.c == r3.c && this.d == r3.d && this.e == r3.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + C2983be.a(C2983be.a((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, this.c, 31), this.d, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountModel(title=null, titleResId=");
        sb.append(this.a);
        sb.append(", currencyAmount=");
        sb.append(this.b);
        sb.append(", isSelected=");
        sb.append(this.c);
        sb.append(", isRealGroup=");
        sb.append(this.d);
        sb.append(", iconResId=");
        return SK.b(sb, this.e, ")");
    }

    public /* synthetic */ R3(int i, int i2, int i3) {
        C7396wQ c7396wQ = new C7396wQ(0);
        boolean z = true;
        if ((i3 & 8) != 0) {
            z = false;
        }
        this(i, c7396wQ, z, (i3 & 16) == 0, (i3 & 32) != 0 ? R.drawable.ic_robot_account_demo : i2);
    }
}
