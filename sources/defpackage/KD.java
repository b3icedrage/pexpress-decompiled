package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KD extends C5108lY0<TD> {

    @NotNull
    public final EY0 m;

    @NotNull
    public final EY0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KD(@NotNull M8 agentRepository, @NotNull InterfaceC5321mY0 mediaRepository) {
        super(agentRepository, mediaRepository);
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        Intrinsics.checkNotNullParameter(mediaRepository, "mediaRepository");
        EY0 ey0A = C7747y42.a(this.d, new ID());
        Intrinsics.checkNotNullExpressionValue(ey0A, "map(_entry) {\n        it.type\n    }");
        this.m = ey0A;
        EY0 ey0A2 = C7747y42.a(this.d, new JD(0));
        Intrinsics.checkNotNullExpressionValue(ey0A2, "map(_entry) { entry ->\n …message\")\n        }\n    }");
        this.n = ey0A2;
    }
}
