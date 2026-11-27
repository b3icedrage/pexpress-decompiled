package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6289r8 {

    @NotNull
    public final String a;

    @NotNull
    public final List<String> b;

    @NotNull
    public final C5315mW0 c;

    @NotNull
    public final C5315mW0 d;

    public C6289r8(@NotNull String message, @NotNull List fingerprint, @NotNull C5315mW0 tags, @NotNull C5315mW0 extras) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.a = message;
        this.b = fingerprint;
        this.c = tags;
        this.d = extras;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6289r8)) {
            return false;
        }
        C6289r8 c6289r8 = (C6289r8) obj;
        return Intrinsics.a(this.a, c6289r8.a) && Intrinsics.a(this.b, c6289r8.b) && this.c.equals(c6289r8.c) && this.d.equals(c6289r8.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + C5491nL.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AfCapture(message=" + this.a + ", fingerprint=" + this.b + ", tags=" + this.c + ", extras=" + this.d + ")";
    }
}
