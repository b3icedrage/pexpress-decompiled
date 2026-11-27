package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class W82 {

    @NotNull
    public final String a;
    public final int b;
    public final int c;

    @NotNull
    public final Function0<Unit> d;

    public W82(int i, int i2, @NotNull String imageUrl, @NotNull Function0 action) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(action, "action");
        this.a = imageUrl;
        this.b = i;
        this.c = i2;
        this.d = action;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W82)) {
            return false;
        }
        W82 w82 = (W82) obj;
        return Intrinsics.a(this.a, w82.a) && this.b == w82.b && this.c == w82.c && this.d.equals(w82.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + EF0.a(this.c, EF0.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "UnlockIndicatorsData(imageUrl=" + this.a + ", titleRes=" + this.b + ", descriptionRes=" + this.c + ", action=" + this.d + ")";
    }
}
