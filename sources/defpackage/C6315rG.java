package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6315rG {

    @NotNull
    public final String a;

    public C6315rG(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.a = token;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6315rG) && Intrinsics.a(this.a, ((C6315rG) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C5807oq.b(new StringBuilder("CommonToken(token="), this.a, ")");
    }
}
