package defpackage;

import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {1291, 1294, 1299, 1301, 1303, 1304}, m = "sendDealDoneEvent")
public final class B12 extends LM {
    public S02 d;
    public Object e;
    public Object g;
    public Object h;
    public String i;
    public String j;
    public String k;
    public Object l;
    public Object m;
    public Double n;
    public Double o;
    public Double p;
    public double q;
    public double r;
    public /* synthetic */ Object s;
    public final /* synthetic */ S02<H32> t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B12(S02 s02, LM lm) {
        super(lm);
        this.t = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        IntRange intRange = S02.u0;
        return this.t.J(null, this);
    }
}
