package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class S72 implements Comparable<S72> {

    @NotNull
    public static final a e = new a(null);
    public final long d;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(S72 s72) {
        return Intrinsics.f(this.d ^ Long.MIN_VALUE, s72.d ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof S72) {
            return this.d == ((S72) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d);
    }

    @NotNull
    public final String toString() {
        long j = this.d;
        if (j >= 0) {
            String string = Long.toString(j, CharsKt.checkRadix(10));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j3, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb.append(string2);
        String string3 = Long.toString(j4, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}
