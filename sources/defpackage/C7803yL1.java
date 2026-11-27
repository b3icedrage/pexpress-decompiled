package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7803yL1 extends W00 {

    @NotNull
    public final Function0<Unit> a;

    public C7803yL1(@NotNull Function0<Unit> passiveBtnCallback) {
        Intrinsics.checkNotNullParameter(passiveBtnCallback, "passiveBtnCallback");
        this.a = passiveBtnCallback;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7803yL1) && Intrinsics.a(this.a, ((C7803yL1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ShowVerificationOfIdentityRequiredAlertEvent(passiveBtnCallback=" + this.a + ")";
    }

    public C7803yL1() {
        this(new C4657jO(1));
    }
}
