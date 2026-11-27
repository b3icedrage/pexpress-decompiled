package defpackage;

import java.util.Map;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: q12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {1209, 1214, 1250, 1251, 1252, 1253, 1261, 1262, 1263, 1276, 1279}, m = "onBetClosed")
public final class C6055q12 extends LM {
    public Object d;
    public C0849Dr e;
    public H32 g;
    public Double h;
    public InterfaceC3907g21 i;
    public Object j;
    public Map k;
    public JQ l;
    public double m;
    public /* synthetic */ Object n;
    public final /* synthetic */ S02<H32> o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6055q12(S02 s02, LM lm) {
        super(lm);
        this.o = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        IntRange intRange = S02.u0;
        return this.o.y(null, null, this);
    }
}
