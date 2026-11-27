package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ZK1 extends W00 {

    @NotNull
    public final String a;

    @NotNull
    public final C4 b;

    @NotNull
    public final C5668oA c;

    public ZK1() {
        throw null;
    }

    public ZK1(String email, C4 activeBtnCallback) {
        C5668oA passiveBtnCallback = new C5668oA(2);
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(activeBtnCallback, "activeBtnCallback");
        Intrinsics.checkNotNullParameter(passiveBtnCallback, "passiveBtnCallback");
        this.a = email;
        this.b = activeBtnCallback;
        this.c = passiveBtnCallback;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZK1)) {
            return false;
        }
        ZK1 zk1 = (ZK1) obj;
        return Intrinsics.a(this.a, zk1.a) && Intrinsics.a(this.b, zk1.b) && Intrinsics.a(this.c, zk1.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ShowBetOnOptionsAppEvent(email=" + this.a + ", activeBtnCallback=" + this.b + ", passiveBtnCallback=" + this.c + ")";
    }
}
