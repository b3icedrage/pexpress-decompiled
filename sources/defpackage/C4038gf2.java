package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4038gf2 {
    public final int a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    public C4038gf2(int i, @NotNull String text, @NotNull String imageUrl, @NotNull String highlightedText) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(highlightedText, "highlightedText");
        this.a = i;
        this.b = text;
        this.c = imageUrl;
        this.d = highlightedText;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4038gf2)) {
            return false;
        }
        C4038gf2 c4038gf2 = (C4038gf2) obj;
        return this.a == c4038gf2.a && Intrinsics.a(this.b, c4038gf2.b) && Intrinsics.a(this.c, c4038gf2.c) && Intrinsics.a(this.d, c4038gf2.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + C1039Gc0.b(C1039Gc0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    @NotNull
    public final String toString() {
        return "VpnInstructionItem(number=" + this.a + ", text=" + this.b + ", imageUrl=" + this.c + ", highlightedText=" + this.d + ")";
    }
}
