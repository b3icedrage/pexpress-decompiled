package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.trading.usecases.TraderImpl", f = "TraderImpl.kt", l = {133, 134, 135, 139, 137}, m = "createStartingTradingParams")
public final class V12 extends LM {
    public Y12 d;
    public C3279d22 e;
    public int g;
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Y12 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V12(Y12 y12, LM lm) {
        super(lm);
        this.j = y12;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.h(0, this);
    }
}
