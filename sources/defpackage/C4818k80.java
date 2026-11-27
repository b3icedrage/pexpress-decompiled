package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: k80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4818k80 {

    @NotNull
    public final String a;
    public final boolean b;

    public C4818k80(@NotNull String eventName, boolean z) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.a = eventName;
        this.b = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4818k80)) {
            return false;
        }
        C4818k80 c4818k80 = (C4818k80) obj;
        return Intrinsics.a(this.a, c4818k80.a) && this.b == c4818k80.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "EventConfig(eventName=" + this.a + ", isActive=" + this.b + ")";
    }
}
