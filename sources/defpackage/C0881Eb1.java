package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Eb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0881Eb1 {
    public final boolean a;
    public final boolean b;

    public C0881Eb1() {
        this(false, false);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0881Eb1)) {
            return false;
        }
        C0881Eb1 c0881Eb1 = (C0881Eb1) obj;
        return this.a == c0881Eb1.a && this.b == c0881Eb1.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        boolean z2 = this.b;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PaginationState(loading=");
        sb.append(this.a);
        sb.append(", hasNextPage=");
        return C4564j.f(sb, this.b, ')');
    }

    public C0881Eb1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
