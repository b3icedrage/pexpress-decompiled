package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SN {
    @NotNull
    public static final C2665aA a(@NotNull KN kn, @NotNull CoroutineContext coroutineContext, boolean z, @NotNull Function2 block) {
        Intrinsics.checkNotNullParameter(kn, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        C2836aw c2836aw = new C2836aw(z, P71.c, 8);
        C2936bP1 c2936bP1K = C5189lv.k(kn, coroutineContext, new RN(c2836aw, block, (DN) kn.getE().p(DN.e), null), 2);
        c2936bP1K.W(new QN(c2836aw, 0));
        return new C2665aA(c2936bP1K, c2836aw);
    }
}
