package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4025gc1 {

    @NotNull
    public final String a;
    public final int b;

    public C4025gc1(String type, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = type;
        this.b = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4025gc1)) {
            return false;
        }
        C4025gc1 c4025gc1 = (C4025gc1) obj;
        c4025gc1.getClass();
        return Intrinsics.a(this.a, c4025gc1.a) && this.b == c4025gc1.b;
    }

    public final int hashCode() {
        return EF0.a(this.b, this.a.hashCode() * 31, 29791);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ParseContext(method=null, url=null, type=");
        sb.append(this.a);
        sb.append(", rawSize=");
        return SK.b(sb, this.b, ", callsite=null, wsMessageName=null, requestId=null)");
    }
}
