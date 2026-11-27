package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class D92 extends RA {

    @NotNull
    public final SocketMessage a;

    public D92(@NotNull SocketMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a = message;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D92) && Intrinsics.a(this.a, ((D92) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "UnsupportedEntry(message=" + this.a + ')';
    }
}
