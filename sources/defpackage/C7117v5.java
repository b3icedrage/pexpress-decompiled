package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7117v5 extends P80 {

    @InterfaceC2691aI1("action")
    @NotNull
    public final String a;

    public C7117v5(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.a = action;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7117v5) && Intrinsics.a(this.a, ((C7117v5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("ActionProperty(action="), this.a, ")");
    }
}
