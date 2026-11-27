package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3730fB {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3730fB() {
        boolean z = false;
        this(7, z, z);
    }

    public static C3730fB a(C3730fB c3730fB, boolean z, int i) {
        if ((i & 1) != 0) {
            z = c3730fB.a;
        }
        boolean z2 = (i & 2) != 0 ? c3730fB.b : true;
        boolean z3 = c3730fB.c;
        c3730fB.getClass();
        return new C3730fB(z, z2, z3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3730fB)) {
            return false;
        }
        C3730fB c3730fB = (C3730fB) obj;
        return this.a == c3730fB.a && this.b == c3730fB.b && this.c == c3730fB.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        boolean z2 = this.b;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.c;
        return i2 + (z3 ? 1 : z3);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatState(visible=");
        sb.append(this.a);
        sb.append(", blacklisted=");
        sb.append(this.b);
        sb.append(", sanctioned=");
        return C4564j.f(sb, this.c, ')');
    }

    public /* synthetic */ C3730fB(int i, boolean z, boolean z2) {
        this(false, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public C3730fB(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
