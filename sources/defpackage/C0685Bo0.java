package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Bo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0685Bo0 {

    @NotNull
    public final String a;
    public final int b;
    public final boolean c;

    @Nullable
    public final Integer d;

    @NotNull
    public final Function1<View, Unit> e;

    public C0685Bo0() {
        throw null;
    }

    public C0685Bo0(String highlightingText, int i, Function1 onClickAction, int i2) {
        Integer num = (i2 & 8) != 0 ? null : 1;
        onClickAction = (i2 & 16) != 0 ? new C4429iY(1) : onClickAction;
        Intrinsics.checkNotNullParameter(highlightingText, "highlightingText");
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        this.a = highlightingText;
        this.b = i;
        this.c = false;
        this.d = num;
        this.e = onClickAction;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0685Bo0)) {
            return false;
        }
        C0685Bo0 c0685Bo0 = (C0685Bo0) obj;
        return Intrinsics.a(this.a, c0685Bo0.a) && this.b == c0685Bo0.b && this.c == c0685Bo0.c && Intrinsics.a(this.d, c0685Bo0.d) && Intrinsics.a(this.e, c0685Bo0.e);
    }

    public final int hashCode() {
        int iA = C2983be.a(EF0.a(this.b, this.a.hashCode() * 31, 31), this.c, 31);
        Integer num = this.d;
        return this.e.hashCode() + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "HighlightedText(highlightingText=" + this.a + ", colorRes=" + this.b + ", needToUnderlineText=" + this.c + ", typefaceStyle=" + this.d + ", onClickAction=" + this.e + ")";
    }
}
