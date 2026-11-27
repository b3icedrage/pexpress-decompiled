package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6332rL1 extends W00 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final C2141Uf c;

    public C6332rL1() {
        throw null;
    }

    public C6332rL1(String earned, String profitLimit) {
        C2141Uf passiveBtnCallback = new C2141Uf(1);
        Intrinsics.checkNotNullParameter(earned, "earned");
        Intrinsics.checkNotNullParameter(profitLimit, "profitLimit");
        Intrinsics.checkNotNullParameter(passiveBtnCallback, "passiveBtnCallback");
        this.a = earned;
        this.b = profitLimit;
        this.c = passiveBtnCallback;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6332rL1)) {
            return false;
        }
        C6332rL1 c6332rL1 = (C6332rL1) obj;
        return Intrinsics.a(this.a, c6332rL1.a) && Intrinsics.a(this.b, c6332rL1.b) && Intrinsics.a(this.c, c6332rL1.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        return "ShowMaximumProfitWasReachedBottomSheetEvent(earned=" + this.a + ", profitLimit=" + this.b + ", passiveBtnCallback=" + this.c + ")";
    }
}
