package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class F72 {

    @NotNull
    public final List<C7549x72> a;

    public F72() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F72) && Intrinsics.a(this.a, ((F72) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "TypingState(agents=" + this.a + ')';
    }

    public F72(@NotNull List<C7549x72> agents) {
        Intrinsics.checkNotNullParameter(agents, "agents");
        this.a = agents;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ F72(int i) {
        List list = Collections.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(list, "emptyList()");
        this((List<C7549x72>) list);
    }
}
