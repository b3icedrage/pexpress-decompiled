package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5493nL1 extends W00 {

    @NotNull
    public final C6425rm1 a;

    public C5493nL1() {
        this(null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5493nL1) && Intrinsics.a(this.a, ((C5493nL1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ShowLimitOpenTradesEvent(passiveBtnCallback=" + this.a + ")";
    }

    public C5493nL1(Object obj) {
        C6425rm1 passiveBtnCallback = new C6425rm1(1);
        Intrinsics.checkNotNullParameter(passiveBtnCallback, "passiveBtnCallback");
        this.a = passiveBtnCallback;
    }
}
