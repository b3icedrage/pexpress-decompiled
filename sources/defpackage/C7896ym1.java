package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ym1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7896ym1 extends RA {

    @NotNull
    public final C1774Pm1 a;

    public C7896ym1(@NotNull C1774Pm1 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.a = state;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7896ym1) && Intrinsics.a(this.a, ((C7896ym1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "RatingEntry(state=" + this.a + ')';
    }
}
