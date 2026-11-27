package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3552eL1 extends W00 {

    @NotNull
    public final String a;

    @Nullable
    public final Integer b;

    @NotNull
    public final C3343dL1 c;

    public C3552eL1() {
        this(7, null, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3552eL1)) {
            return false;
        }
        C3552eL1 c3552eL1 = (C3552eL1) obj;
        return Intrinsics.a(this.a, c3552eL1.a) && Intrinsics.a(this.b, c3552eL1.b) && Intrinsics.a(this.c, c3552eL1.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "ShowErrorStartingRobotAlertEvent(reason=" + this.a + ", reasonResId=" + this.b + ", passiveBtnCallback=" + this.c + ")";
    }

    public C3552eL1(int i, String reason, Integer num) {
        reason = (i & 1) != 0 ? "" : reason;
        num = (i & 2) != 0 ? null : num;
        C3343dL1 passiveBtnCallback = new C3343dL1();
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(passiveBtnCallback, "passiveBtnCallback");
        this.a = reason;
        this.b = num;
        this.c = passiveBtnCallback;
    }
}
