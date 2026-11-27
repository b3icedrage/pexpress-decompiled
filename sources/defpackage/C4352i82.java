package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: i82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4352i82 implements Comparable<C4352i82> {

    @NotNull
    public static final a e = new a(null);
    public final short d;

    /* JADX INFO: renamed from: i82$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C4352i82 c4352i82) {
        return Intrinsics.e(this.d & 65535, c4352i82.d & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4352i82) {
            return this.d == ((C4352i82) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.d);
    }

    @NotNull
    public final String toString() {
        return String.valueOf(65535 & this.d);
    }
}
