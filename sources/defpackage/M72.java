package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class M72 implements Comparable<M72> {

    @NotNull
    public static final a e = new a(null);
    public final int d;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(M72 m72) {
        return Intrinsics.e(this.d ^ Integer.MIN_VALUE, m72.d ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof M72) {
            return this.d == ((M72) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }

    @NotNull
    public final String toString() {
        return String.valueOf(((long) this.d) & 4294967295L);
    }
}
