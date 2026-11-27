package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class N92 {

    @NotNull
    public final List<SocketMessage> a;

    public N92() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N92) && Intrinsics.a(this.a, ((N92) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "UnsupportedState(messages=" + this.a + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ N92(int i) {
        List list = Collections.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(list, "emptyList()");
        this((List<SocketMessage>) list);
    }

    public N92(@NotNull List<SocketMessage> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.a = messages;
    }
}
