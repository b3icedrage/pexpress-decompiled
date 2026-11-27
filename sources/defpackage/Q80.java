package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Q80 {

    @NotNull
    public final C0612Aq a;

    public Q80(@NotNull C0612Aq event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a = event;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Q80) && Intrinsics.a(this.a, ((Q80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "EventQueueMessage(event=" + this.a + ')';
    }
}
