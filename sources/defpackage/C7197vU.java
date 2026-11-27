package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7197vU {

    @NotNull
    public final Drawable a;
    public final boolean b;

    public C7197vU(@NotNull Drawable drawable, boolean z) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.a = drawable;
        this.b = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7197vU)) {
            return false;
        }
        C7197vU c7197vU = (C7197vU) obj;
        return Intrinsics.a(this.a, c7197vU.a) && this.b == c7197vU.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        Drawable drawable = this.a;
        int iHashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DecodeResult(drawable=");
        sb.append(this.a);
        sb.append(", isSampled=");
        return C2983be.b(sb, this.b, ")");
    }
}
