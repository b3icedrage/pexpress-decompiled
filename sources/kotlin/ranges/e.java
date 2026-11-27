package kotlin.ranges;

import defpackage.InterfaceC6519sE;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d implements InterfaceC6519sE<Long> {

    @NotNull
    public static final a i = new a(null);

    @NotNull
    public static final e j = new e(1, 0);

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public e(long j2, long j3) {
        super(j2, j3, 1L);
    }

    @Override // defpackage.InterfaceC6519sE
    public final Comparable b() {
        return Long.valueOf(this.d);
    }

    @Override // defpackage.InterfaceC6519sE
    public final Comparable d() {
        return Long.valueOf(this.e);
    }

    @Override // kotlin.ranges.d
    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        if (this.d == eVar.d) {
            return this.e == eVar.e;
        }
        return false;
    }

    @Override // kotlin.ranges.d
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j2 = this.d;
        long j3 = ((long) 31) * (j2 ^ (j2 >>> 32));
        long j4 = this.e;
        return (int) (j3 + (j4 ^ (j4 >>> 32)));
    }

    @Override // kotlin.ranges.d, defpackage.InterfaceC6519sE
    public final boolean isEmpty() {
        return this.d > this.e;
    }

    @Override // kotlin.ranges.d
    @NotNull
    public final String toString() {
        return this.d + ".." + this.e;
    }
}
