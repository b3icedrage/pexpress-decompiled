package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Da2 extends FZ0<C8059za2> {

    @NotNull
    public final EY0 k;

    @NotNull
    public final EY0 l;

    @NotNull
    public final EY0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Da2(@NotNull M8 agentRepository) {
        super(agentRepository);
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        EY0 ey0A = C7747y42.a(this.d, new C0741Ch());
        Intrinsics.checkNotNullExpressionValue(ey0A, "map(_entry) { entry ->\n        entry.state\n    }");
        this.k = ey0A;
        EY0 ey0A2 = C7747y42.a(ey0A, new C5807oq());
        Intrinsics.checkNotNullExpressionValue(ey0A2, "map(state) {\n        it.name\n    }");
        this.l = ey0A2;
        Intrinsics.checkNotNullExpressionValue(C7747y42.a(ey0A, new K1()), "map(state) {\n        it.size\n    }");
        Intrinsics.checkNotNullExpressionValue(C7747y42.a(ey0A, new BX()), "map(state) {\n        it.mimeType\n    }");
        EY0 ey0A3 = C7747y42.a(ey0A, new C1039Gc0(9));
        Intrinsics.checkNotNullExpressionValue(ey0A3, "map(state) {\n        it.…s UploadState.Error\n    }");
        this.m = ey0A3;
    }
}
