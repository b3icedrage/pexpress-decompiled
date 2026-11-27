package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4053gj1 {

    @NotNull
    public final KN a;

    @NotNull
    public final String b;
    public final int c;

    @NotNull
    public final String d;
    public final int e;

    @NotNull
    public final C6210ql f;

    @NotNull
    public final C4797k3 g;

    public C4053gj1(@NotNull KN coroutineScope, @NotNull String progressBarAmount, int i, @NotNull String descriptionInterpolatedValue, int i2, @NotNull C6210ql onLaterClick, @NotNull C4797k3 onActivateClick) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(progressBarAmount, "progressBarAmount");
        Intrinsics.checkNotNullParameter(descriptionInterpolatedValue, "descriptionInterpolatedValue");
        Intrinsics.checkNotNullParameter(onLaterClick, "onLaterClick");
        Intrinsics.checkNotNullParameter(onActivateClick, "onActivateClick");
        this.a = coroutineScope;
        this.b = progressBarAmount;
        this.c = i;
        this.d = descriptionInterpolatedValue;
        this.e = i2;
        this.f = onLaterClick;
        this.g = onActivateClick;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4053gj1)) {
            return false;
        }
        C4053gj1 c4053gj1 = (C4053gj1) obj;
        return Intrinsics.a(this.a, c4053gj1.a) && Intrinsics.a(this.b, c4053gj1.b) && this.c == c4053gj1.c && Intrinsics.a(this.d, c4053gj1.d) && this.e == c4053gj1.e && this.f.equals(c4053gj1.f) && this.g.equals(c4053gj1.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + EF0.a(this.e, C1039Gc0.b(EF0.a(this.c, C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ProfitLimitWithActivationBottomSheetParams(coroutineScope=" + this.a + ", progressBarAmount=" + this.b + ", descriptionResId=" + this.c + ", descriptionInterpolatedValue=" + this.d + ", dialogsInRowCount=" + this.e + ", onLaterClick=" + this.f + ", onActivateClick=" + this.g + ")";
    }
}
