package defpackage;

import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {1030, 1035, 1040}, m = "tryHandleStartEvent")
public final class N12 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ S02<H32> e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N12(S02 s02, LM lm) {
        super(lm);
        this.e = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        IntRange intRange = S02.u0;
        return this.e.W(null, null, null, this);
    }
}
