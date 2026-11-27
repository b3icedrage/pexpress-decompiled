package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3133cL1 extends W00 {

    @NotNull
    public final C2924bL1 a;

    public C3133cL1() {
        this(null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3133cL1) && Intrinsics.a(this.a, ((C3133cL1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ShowErrorConnectingToThePlatformAlertEvent(activeBtnCallback=" + this.a + ")";
    }

    public C3133cL1(Object obj) {
        C2924bL1 activeBtnCallback = new C2924bL1();
        Intrinsics.checkNotNullParameter(activeBtnCallback, "activeBtnCallback");
        this.a = activeBtnCallback;
    }
}
