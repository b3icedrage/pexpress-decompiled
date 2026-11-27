package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6123qL1 extends W00 {

    @NotNull
    public final C6693t4 a;

    @NotNull
    public final C6819tg b;

    public C6123qL1(@NotNull C6693t4 activeBtnCallback, @NotNull C6819tg closingAction) {
        Intrinsics.checkNotNullParameter(activeBtnCallback, "activeBtnCallback");
        Intrinsics.checkNotNullParameter(closingAction, "closingAction");
        this.a = activeBtnCallback;
        this.b = closingAction;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6123qL1)) {
            return false;
        }
        C6123qL1 c6123qL1 = (C6123qL1) obj;
        return Intrinsics.a(this.a, c6123qL1.a) && Intrinsics.a(this.b, c6123qL1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ShowMaxProfitSettingLockedEvent(activeBtnCallback=" + this.a + ", closingAction=" + this.b + ")";
    }
}
