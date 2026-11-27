package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Md1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1510Md1 extends P80 {

    @InterfaceC2691aI1("from")
    @NotNull
    public final String a;

    public C1510Md1(@NotNull String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.a = from;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1510Md1) && Intrinsics.a(this.a, ((C1510Md1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("PlaceCallProperty(from="), this.a, ")");
    }
}
