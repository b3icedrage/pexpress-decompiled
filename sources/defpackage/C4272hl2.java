package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4272hl2 {

    @NotNull
    public final EnumC4481il2 a;

    @Nullable
    public final C0612Aq b;

    public C4272hl2(@NotNull EnumC4481il2 type, @Nullable C0612Aq c0612Aq) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = type;
        this.b = c0612Aq;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4272hl2)) {
            return false;
        }
        C4272hl2 c4272hl2 = (C4272hl2) obj;
        return this.a == c4272hl2.a && Intrinsics.a(this.b, c4272hl2.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        C0612Aq c0612Aq = this.b;
        return iHashCode + (c0612Aq == null ? 0 : c0612Aq.hashCode());
    }

    @NotNull
    public final String toString() {
        return "WriteQueueMessage(type=" + this.a + ", event=" + this.b + ')';
    }
}
