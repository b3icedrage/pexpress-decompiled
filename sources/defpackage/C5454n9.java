package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5454n9 extends FZ0<L8> {

    @NotNull
    public final EY0 k;

    @Nullable
    public SF0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5454n9(@NotNull M8 agentRepository) {
        super(agentRepository);
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        EY0 ey0A = C7747y42.a(this.d, new C5244m9(0));
        Intrinsics.checkNotNullExpressionValue(ey0A, "map(_entry) { it }");
        this.k = ey0A;
    }
}
