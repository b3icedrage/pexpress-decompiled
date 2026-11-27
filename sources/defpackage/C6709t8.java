package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6709t8 {

    @NotNull
    public final C6080q8 a;

    @Nullable
    public final C6289r8 b;

    public C6709t8(@NotNull C6080q8 breadcrumb, @Nullable C6289r8 c6289r8) {
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        this.a = breadcrumb;
        this.b = c6289r8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6709t8)) {
            return false;
        }
        C6709t8 c6709t8 = (C6709t8) obj;
        return Intrinsics.a(this.a, c6709t8.a) && Intrinsics.a(this.b, c6709t8.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        C6289r8 c6289r8 = this.b;
        return iHashCode + (c6289r8 == null ? 0 : c6289r8.hashCode());
    }

    @NotNull
    public final String toString() {
        return "AfOutcome(breadcrumb=" + this.a + ", capture=" + this.b + ")";
    }
}
