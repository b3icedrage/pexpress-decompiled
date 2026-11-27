package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: m80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5241m80 extends RA {
    public final int a;

    @NotNull
    public final String b;

    public C5241m80(int i, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.a = i;
        this.b = reason;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5241m80)) {
            return false;
        }
        C5241m80 c5241m80 = (C5241m80) obj;
        return this.a == c5241m80.a && Intrinsics.a(this.b, c5241m80.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EventEntry(code=");
        sb.append(this.a);
        sb.append(", reason=");
        return C1039Gc0.e(sb, this.b, ')');
    }
}
