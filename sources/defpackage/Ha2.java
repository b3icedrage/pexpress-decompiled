package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Ha2 extends FZ0<C8059za2> {

    @NotNull
    public final EY0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ha2(@NotNull M8 agentRepository) {
        super(agentRepository);
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        EY0 ey0A = C7747y42.a(this.d, new C5244m9(7));
        Intrinsics.checkNotNullExpressionValue(ey0A, "map(_entry) { entry ->\n        entry.state\n    }");
        this.k = ey0A;
    }
}
