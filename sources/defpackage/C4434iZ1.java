package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4434iZ1 extends P80 {

    @InterfaceC2691aI1("play_time")
    public final int a;

    public C4434iZ1(int i) {
        this.a = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4434iZ1) && this.a == ((C4434iZ1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @NotNull
    public final String toString() {
        return SK.b(new StringBuilder("TimeProperty(time="), this.a, ")");
    }
}
