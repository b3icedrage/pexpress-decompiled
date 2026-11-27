package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6631sl1 extends P80 {

    @InterfaceC2691aI1("from")
    @NotNull
    public final String a;

    @InterfaceC2691aI1("type")
    @NotNull
    public final String b;

    public C6631sl1(@NotNull String from, @NotNull String type) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = from;
        this.b = type;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6631sl1)) {
            return false;
        }
        C6631sl1 c6631sl1 = (C6631sl1) obj;
        return Intrinsics.a(this.a, c6631sl1.a) && Intrinsics.a(this.b, c6631sl1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PushesDeniedProperty(from=");
        sb.append(this.a);
        sb.append(", type=");
        return C5807oq.b(sb, this.b, ")");
    }
}
