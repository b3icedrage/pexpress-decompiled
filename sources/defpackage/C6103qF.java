package defpackage;

import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6103qF {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    @Nullable
    public final Integer d;

    @Nullable
    public final Integer e;

    public C6103qF() {
        this(31);
    }

    public static C6103qF a(C6103qF c6103qF, boolean z, boolean z2, boolean z3, Integer num, Integer num2, int i) {
        if ((i & 1) != 0) {
            z = c6103qF.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = c6103qF.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = c6103qF.c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            num = c6103qF.d;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = c6103qF.e;
        }
        c6103qF.getClass();
        return new C6103qF(z4, z5, z6, num3, num2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6103qF)) {
            return false;
        }
        C6103qF c6103qF = (C6103qF) obj;
        return this.a == c6103qF.a && this.b == c6103qF.b && this.c == c6103qF.c && Intrinsics.a(this.d, c6103qF.d) && Intrinsics.a(this.e, c6103qF.e);
    }

    public final int hashCode() {
        int iA = C2983be.a(C2983be.a(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31);
        Integer num = this.d;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CommonActionBtnModel(clickable=" + this.a + ", enabled=" + this.b + ", activated=" + this.c + ", textResId=" + this.d + ", color=" + this.e + ")";
    }

    public /* synthetic */ C6103qF(int i) {
        this(true, (i & 2) != 0, true, (i & 8) != 0 ? null : Integer.valueOf(R.string.start_trading), (i & 16) != 0 ? null : Integer.valueOf(R.color.primary));
    }

    public C6103qF(boolean z, boolean z2, boolean z3, @Nullable Integer num, @Nullable Integer num2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = num;
        this.e = num2;
    }
}
