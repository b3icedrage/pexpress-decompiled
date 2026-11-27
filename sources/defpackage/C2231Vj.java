package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2231Vj {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    public C2231Vj(@NotNull String iconResUrl, @NotNull String title, @NotNull String percentText) {
        Intrinsics.checkNotNullParameter(iconResUrl, "iconResUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(percentText, "percentText");
        this.a = iconResUrl;
        this.b = title;
        this.c = percentText;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2231Vj)) {
            return false;
        }
        C2231Vj c2231Vj = (C2231Vj) obj;
        return Intrinsics.a(this.a, c2231Vj.a) && Intrinsics.a(this.b, c2231Vj.b) && Intrinsics.a(this.c, c2231Vj.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetOption(iconResUrl=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", percentText=");
        return C5807oq.b(sb, this.c, ")");
    }
}
