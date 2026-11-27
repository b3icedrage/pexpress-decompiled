package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3849fl {

    @NotNull
    public final NG1 a;

    @NotNull
    public final List<String> b;

    public C3849fl(@NotNull NG1 level, @NotNull List<String> fingerprint) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        this.a = level;
        this.b = fingerprint;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3849fl)) {
            return false;
        }
        C3849fl c3849fl = (C3849fl) obj;
        return this.a == c3849fl.a && Intrinsics.a(this.b, c3849fl.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "Event(level=" + this.a + ", fingerprint=" + this.b + ")";
    }
}
