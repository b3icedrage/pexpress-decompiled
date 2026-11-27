package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class G52 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;

    @NotNull
    public final String e;

    public G52(int i, int i2, @NotNull String title, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter("", "subtitle");
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = title;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G52)) {
            return false;
        }
        G52 g52 = (G52) obj;
        return this.a == g52.a && this.b == g52.b && this.c == g52.c && this.d == g52.d && Intrinsics.a(this.e, g52.e);
    }

    public final int hashCode() {
        return C1039Gc0.b(EF0.a(this.d, C2983be.a(C2983be.a(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31), 31), 31, this.e);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TutorialPageData(index=");
        sb.append(this.a);
        sb.append(", isLoopingAnimation=");
        sb.append(this.b);
        sb.append(", isArrowShown=");
        sb.append(this.c);
        sb.append(", iconRes=");
        sb.append(this.d);
        sb.append(", title=");
        return C5807oq.b(sb, this.e, ", subtitle=)");
    }
}
