package defpackage;

import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {859, 864, 865, 870, 873, 895, 899, 905, 921, 928, 952, 958}, m = "makeBet")
public final class C5002l12 extends LM {
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public GP1 l;
    public long m;
    public long n;
    public long o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ S02<H32> r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5002l12(S02 s02, LM lm) {
        super(lm);
        this.r = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        IntRange intRange = S02.u0;
        return this.r.v(null, null, this);
    }
}
