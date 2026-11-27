package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5651o52<A, B, C> implements Serializable {
    public final A d;
    public final B e;
    public final C g;

    public C5651o52(A a, B b, C c) {
        this.d = a;
        this.e = b;
        this.g = c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5651o52)) {
            return false;
        }
        C5651o52 c5651o52 = (C5651o52) obj;
        return Intrinsics.a(this.d, c5651o52.d) && Intrinsics.a(this.e, c5651o52.e) && Intrinsics.a(this.g, c5651o52.g);
    }

    public final int hashCode() {
        A a = this.d;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.e;
        int iHashCode2 = (iHashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.g;
        return iHashCode2 + (c != null ? c.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "(" + this.d + ", " + this.e + ", " + this.g + ')';
    }
}
