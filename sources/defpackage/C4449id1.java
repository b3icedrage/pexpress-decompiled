package defpackage;

import com.jivosite.sdk.model.pojo.message.ClientMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: id1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4449id1 {

    @Nullable
    public final ClientMessage a;

    public C4449id1() {
        this(null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4449id1) && Intrinsics.a(this.a, ((C4449id1) obj).a);
    }

    public final int hashCode() {
        ClientMessage clientMessage = this.a;
        if (clientMessage == null) {
            return 0;
        }
        return clientMessage.hashCode();
    }

    @NotNull
    public final String toString() {
        return "PendingState(message=" + this.a + ')';
    }

    public C4449id1(@Nullable ClientMessage clientMessage) {
        this.a = clientMessage;
    }
}
