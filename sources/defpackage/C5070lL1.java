package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5070lL1 extends W00 {

    @NotNull
    public final List<Object> a;

    @NotNull
    public final C7239vg b;

    public C5070lL1(@NotNull List newDemoBalance, @NotNull C7239vg activeBtnCallback) {
        Intrinsics.checkNotNullParameter(newDemoBalance, "newDemoBalance");
        Intrinsics.checkNotNullParameter(activeBtnCallback, "activeBtnCallback");
        this.a = newDemoBalance;
        this.b = activeBtnCallback;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5070lL1)) {
            return false;
        }
        C5070lL1 c5070lL1 = (C5070lL1) obj;
        return Intrinsics.a(this.a, c5070lL1.a) && Intrinsics.a(this.b, c5070lL1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ShowInsufficientFundsForDemoEvent(newDemoBalance=" + this.a + ", activeBtnCallback=" + this.b + ")";
    }
}
