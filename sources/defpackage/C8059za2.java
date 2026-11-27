package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: za2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8059za2 extends AbstractC7844yZ0 {

    @NotNull
    public final C2980bd0 a;

    @NotNull
    public final AbstractC3926g70 b;

    public C8059za2(@NotNull C2980bd0 state, @NotNull AbstractC3926g70 position) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(position, "position");
        this.a = state;
        this.b = position;
    }

    @Override // defpackage.AbstractC7844yZ0
    @NotNull
    public final AbstractC3926g70 c() {
        return this.b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8059za2)) {
            return false;
        }
        C8059za2 c8059za2 = (C8059za2) obj;
        return Intrinsics.a(this.a, c8059za2.a) && Intrinsics.a(this.b, c8059za2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "UploadingFileEntry(state=" + this.a + ", position=" + this.b + ')';
    }
}
