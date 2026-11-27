package defpackage;

import com.jivosite.sdk.model.pojo.message.ClientMessage;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class HF1 {

    @NotNull
    public final List<ClientMessage> a;

    public HF1() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HF1) && Intrinsics.a(this.a, ((HF1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "SendMessageState(messages=" + this.a + ')';
    }

    public HF1(@NotNull List<ClientMessage> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.a = messages;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HF1(int i) {
        List list = Collections.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(list, "emptyList()");
        this((List<ClientMessage>) list);
    }
}
