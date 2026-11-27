package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class DR1 extends P80 {

    @InterfaceC2691aI1("type")
    @NotNull
    public final String a;

    public DR1(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = type;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DR1) && Intrinsics.a(this.a, ((DR1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("StrategyProperty(type="), this.a, ")");
    }
}
