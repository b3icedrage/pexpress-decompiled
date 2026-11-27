package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5283mL1 extends W00 {

    @NotNull
    public final C2405Xf a;

    @NotNull
    public final NR b;

    public C5283mL1() {
        throw null;
    }

    public C5283mL1(C2405Xf activeBtnCallback) {
        NR passiveBtnCallback = new NR(1);
        Intrinsics.checkNotNullParameter(activeBtnCallback, "activeBtnCallback");
        Intrinsics.checkNotNullParameter(passiveBtnCallback, "passiveBtnCallback");
        this.a = activeBtnCallback;
        this.b = passiveBtnCallback;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5283mL1)) {
            return false;
        }
        C5283mL1 c5283mL1 = (C5283mL1) obj;
        return Intrinsics.a(this.a, c5283mL1.a) && Intrinsics.a(this.b, c5283mL1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ShowInsufficientFundsForRealEvent(activeBtnCallback=" + this.a + ", passiveBtnCallback=" + this.b + ")";
    }
}
