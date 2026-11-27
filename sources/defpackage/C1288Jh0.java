package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Jh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1288Jh0 implements InterfaceC5263mF {

    @NotNull
    public final AbstractC2307Wh a;
    public final boolean b;

    public C1288Jh0(@NotNull AbstractC2307Wh screen, boolean z) {
        Intrinsics.d(screen, "screen");
        this.a = screen;
        this.b = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1288Jh0)) {
            return false;
        }
        C1288Jh0 c1288Jh0 = (C1288Jh0) obj;
        return Intrinsics.a(this.a, c1288Jh0.a) && this.b == c1288Jh0.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        AbstractC2307Wh abstractC2307Wh = this.a;
        int iHashCode = (abstractC2307Wh != null ? abstractC2307Wh.hashCode() : 0) * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Forward(screen=");
        sb.append(this.a);
        sb.append(", clearContainer=");
        return C2983be.b(sb, this.b, ")");
    }
}
