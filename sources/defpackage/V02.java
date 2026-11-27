package defpackage;

import defpackage.H32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {778, 782, 783, 786, 787, 791, 794, 797, 799, 800, 805}, m = "calculateNewTradingParams$suspendImpl")
public final class V02<T extends H32> extends LM {
    public S02 d;
    public Object e;
    public Object g;
    public Object h;
    public H32.a i;
    public long j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ S02<T> p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V02(S02 s02, LM lm) {
        super(lm);
        this.p = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return S02.d(this.p, null, null, this);
    }
}
