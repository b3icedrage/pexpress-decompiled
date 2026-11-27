package defpackage;

import defpackage.H32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {835, 837}, m = "waitIfNeeded$suspendImpl")
public final class R12<T extends H32> extends LM {
    public S02 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ S02<T> g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R12(S02 s02, LM lm) {
        super(lm);
        this.g = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return S02.b0(this.g, this);
    }
}
