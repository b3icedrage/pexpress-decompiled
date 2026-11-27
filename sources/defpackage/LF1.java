package defpackage;

import com.jivosite.sdk.model.pojo.message.ClientMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class LF1 extends AbstractC7844yZ0 {

    @NotNull
    public final ClientMessage a;

    @NotNull
    public final AbstractC3926g70 b;

    public LF1(@NotNull ClientMessage message, @NotNull AbstractC3926g70 position) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(position, "position");
        this.a = message;
        this.b = position;
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
        if (!(obj instanceof LF1)) {
            return false;
        }
        LF1 lf1 = (LF1) obj;
        return Intrinsics.a(this.a, lf1.a) && Intrinsics.a(this.b, lf1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "SendingMessageEntry(message=" + this.a + ", position=" + this.b + ')';
    }
}
