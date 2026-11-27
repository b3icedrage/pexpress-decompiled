package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3489e3 {
    public final int a;

    @NotNull
    public final C7606xQ b;

    public C3489e3(int i, @NotNull C7606xQ currencyAmount) {
        Intrinsics.checkNotNullParameter(currencyAmount, "currencyAmount");
        this.a = i;
        this.b = currencyAmount;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3489e3)) {
            return false;
        }
        C3489e3 c3489e3 = (C3489e3) obj;
        return this.a == c3489e3.a && Intrinsics.a(this.b, c3489e3.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        return "AccountInvestmentModel(titleResId=" + this.a + ", currencyAmount=" + this.b + ")";
    }

    public C3489e3() {
        this(0, new C7606xQ(null, 0.0d, 31));
    }
}
