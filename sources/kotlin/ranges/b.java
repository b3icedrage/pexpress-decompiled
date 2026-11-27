package kotlin.ranges;

import defpackage.InterfaceC6519sE;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends kotlin.ranges.a implements InterfaceC6519sE<Character> {

    @NotNull
    public static final a i = new a(null);

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new b((char) 1, (char) 0);
    }

    @Override // defpackage.InterfaceC6519sE
    public final Comparable b() {
        return Character.valueOf(this.d);
    }

    @Override // defpackage.InterfaceC6519sE
    public final Comparable d() {
        return Character.valueOf(this.e);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.d == bVar.d && this.e == bVar.e;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.d * 31) + this.e;
    }

    @Override // defpackage.InterfaceC6519sE
    public final boolean isEmpty() {
        return Intrinsics.e(this.d, this.e) > 0;
    }

    @NotNull
    public final String toString() {
        return this.d + ".." + this.e;
    }
}
