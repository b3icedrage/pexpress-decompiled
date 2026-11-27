package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6962uL1 extends W00 {

    @NotNull
    public final String a;

    @Nullable
    public final Integer b;

    @NotNull
    public final Function0<Unit> c;

    public C6962uL1() {
        this(7);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6962uL1)) {
            return false;
        }
        C6962uL1 c6962uL1 = (C6962uL1) obj;
        return Intrinsics.a(this.a, c6962uL1.a) && Intrinsics.a(this.b, c6962uL1.b) && Intrinsics.a(this.c, c6962uL1.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "ShowRobotWasStoppedAlertEvent(reason=" + this.a + ", reasonResId=" + this.b + ", passiveBtnCallback=" + this.c + ")";
    }

    public C6962uL1(@Nullable Integer num, @NotNull String reason, @NotNull Function0 passiveBtnCallback) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(passiveBtnCallback, "passiveBtnCallback");
        this.a = reason;
        this.b = num;
        this.c = passiveBtnCallback;
    }

    public /* synthetic */ C6962uL1(int i) {
        this((i & 2) != 0 ? null : Integer.valueOf(R.string.dialogs_stop_current_active_label), "", new C6210ql(2));
    }
}
