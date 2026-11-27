package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3287d42 {
    public final boolean a;
    public final int b;
    public final int c;

    @NotNull
    public final List<String> d;

    public C3287d42(boolean z, int i, int i2, @NotNull List<String> descriptionArgs) {
        Intrinsics.checkNotNullParameter(descriptionArgs, "descriptionArgs");
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = descriptionArgs;
    }

    public static C3287d42 a(C3287d42 c3287d42, List descriptionArgs) {
        boolean z = c3287d42.a;
        int i = c3287d42.b;
        int i2 = c3287d42.c;
        c3287d42.getClass();
        Intrinsics.checkNotNullParameter(descriptionArgs, "descriptionArgs");
        return new C3287d42(z, i, i2, descriptionArgs);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3287d42)) {
            return false;
        }
        C3287d42 c3287d42 = (C3287d42) obj;
        return this.a == c3287d42.a && this.b == c3287d42.b && this.c == c3287d42.c && Intrinsics.a(this.d, c3287d42.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + EF0.a(this.c, EF0.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "TradingStrategyModel(isSelected=" + this.a + ", titleResId=" + this.b + ", descriptionResId=" + this.c + ", descriptionArgs=" + this.d + ")";
    }
}
