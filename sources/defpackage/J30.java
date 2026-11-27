package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class J30 extends AbstractC4912kc0 {

    @NotNull
    public final Drawable a;
    public final boolean b;

    @NotNull
    public final DS c;

    public J30(@NotNull Drawable drawable, boolean z, @NotNull DS dataSource) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.a = drawable;
        this.b = z;
        this.c = dataSource;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J30)) {
            return false;
        }
        J30 j30 = (J30) obj;
        return Intrinsics.a(this.a, j30.a) && this.b == j30.b && Intrinsics.a(this.c, j30.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        Drawable drawable = this.a;
        int iHashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        boolean z = this.b;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        DS ds = this.c;
        return i + (ds != null ? ds.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "DrawableResult(drawable=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ")";
    }
}
