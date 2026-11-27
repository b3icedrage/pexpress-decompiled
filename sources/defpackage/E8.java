package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class E8 extends C5108lY0<L8> {

    @NotNull
    public final EY0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E8(@NotNull M8 agentRepository, @NotNull InterfaceC5321mY0 mediaRepository) {
        super(agentRepository, mediaRepository);
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        Intrinsics.checkNotNullParameter(mediaRepository, "mediaRepository");
        EY0 ey0A = C7747y42.a(this.d, new D8(0));
        Intrinsics.checkNotNullExpressionValue(ey0A, "map(_entry) {\n        it.type\n    }");
        this.m = ey0A;
    }
}
