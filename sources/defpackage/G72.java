package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class G72 implements Comparable<G72> {

    @NotNull
    public static final a e = new a(null);
    public final byte d;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(G72 g72) {
        return Intrinsics.e(this.d & 255, g72.d & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof G72) {
            return this.d == ((G72) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.d);
    }

    @NotNull
    public final String toString() {
        return String.valueOf(this.d & 255);
    }
}
