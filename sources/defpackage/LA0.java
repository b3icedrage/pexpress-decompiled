package defpackage;

import android.graphics.Insets;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class LA0 {

    @NonNull
    public static final LA0 e = new LA0(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public static class a {
        public static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public LA0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @NonNull
    public static LA0 a(@NonNull LA0 la0, @NonNull LA0 la1) {
        return b(Math.max(la0.a, la1.a), Math.max(la0.b, la1.b), Math.max(la0.c, la1.c), Math.max(la0.d, la1.d));
    }

    @NonNull
    public static LA0 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new LA0(i, i2, i3, i4);
    }

    @NonNull
    public static LA0 c(@NonNull Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    @NonNull
    public final Insets d() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LA0.class != obj.getClass()) {
            return false;
        }
        LA0 la0 = (LA0) obj;
        return this.d == la0.d && this.a == la0.a && this.c == la0.c && this.b == la0.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    @NonNull
    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
