package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class L8 extends AbstractC1075Go0 {

    @NotNull
    public final C0997Fo0 a;

    @NotNull
    public final AbstractC3926g70 b;
    public final boolean c;

    public L8(@NotNull C0997Fo0 message, @NotNull AbstractC3926g70 position, boolean z) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(position, "position");
        this.a = message;
        this.b = position;
        this.c = z;
    }

    @Override // defpackage.AbstractC7844yZ0
    @NotNull
    public final AbstractC3926g70 c() {
        return this.b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L8)) {
            return false;
        }
        L8 l8 = (L8) obj;
        return Intrinsics.a(this.a, l8.a) && Intrinsics.a(this.b, l8.b) && this.c == l8.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode + r0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AgentMessageEntry(message=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", isLastMessage=");
        return C4564j.f(sb, this.c, ')');
    }
}
