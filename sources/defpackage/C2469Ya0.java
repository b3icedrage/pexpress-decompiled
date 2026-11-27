package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ya0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2469Ya0 extends P80 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;
    public final int c;

    public C2469Ya0(int i, @NotNull String category, @NotNull String text) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(text, "text");
        this.a = category;
        this.b = text;
        this.c = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2469Ya0)) {
            return false;
        }
        C2469Ya0 c2469Ya0 = (C2469Ya0) obj;
        return Intrinsics.a(this.a, c2469Ya0.a) && Intrinsics.a(this.b, c2469Ya0.b) && this.c == c2469Ya0.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FAQQuestionExpandProperty(category=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", position=");
        return SK.b(sb, this.c, ")");
    }
}
