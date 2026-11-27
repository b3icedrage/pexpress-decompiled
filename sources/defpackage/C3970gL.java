package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3970gL extends RA {

    @NotNull
    public final CL a;

    public C3970gL(@NotNull CL state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.a = state;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3970gL) && Intrinsics.a(this.a, ((C3970gL) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ContactFormEntry(state=" + this.a + ')';
    }
}
