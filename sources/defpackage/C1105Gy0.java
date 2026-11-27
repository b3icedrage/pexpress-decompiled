package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Gy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1105Gy0 extends P80 {

    @InterfaceC2691aI1("type")
    @NotNull
    public final String a;

    public C1105Gy0(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = type;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1105Gy0) && Intrinsics.a(this.a, ((C1105Gy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("IndicatorProperty(type="), this.a, ")");
    }
}
