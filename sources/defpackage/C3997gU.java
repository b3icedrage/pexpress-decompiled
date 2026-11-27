package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3997gU implements Comparable<C3997gU> {
    public final int d;
    public final int e;

    public C3997gU(int i, int i2) {
        this.d = i;
        this.e = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(EK.e(i2, "Digits must be non-negative, but was ").toString());
        }
    }

    public final int b(int i) {
        int i2 = this.d;
        int i3 = this.e;
        if (i == i3) {
            return i2;
        }
        int[] iArr = C6621sj.b;
        return i > i3 ? i2 * iArr[i - i3] : i2 / iArr[i3 - i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(C3997gU c3997gU) {
        C3997gU other = c3997gU;
        Intrinsics.checkNotNullParameter(other, "other");
        int iMax = Math.max(this.e, other.e);
        return Intrinsics.e(b(iMax), other.b(iMax));
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C3997gU)) {
            return false;
        }
        C3997gU other = (C3997gU) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int iMax = Math.max(this.e, other.e);
        return Intrinsics.e(b(iMax), other.b(iMax)) == 0;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = C6621sj.b[this.e];
        int i2 = this.d;
        sb.append(i2 / i);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(StringsKt.M(String.valueOf((i2 % i) + i), "1"));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
