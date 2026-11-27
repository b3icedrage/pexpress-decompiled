package defpackage;

import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: n12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {614, 615, 619, 633, 635, 662, 678, 680}, m = "notifyAmplitudeAboutProfit")
public final class C5425n12 extends LM {
    public S02 d;
    public String e;
    public Double g;
    public Object h;
    public Object i;
    public Double j;
    public Double k;
    public Double l;
    public /* synthetic */ Object m;
    public final /* synthetic */ S02<H32> n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5425n12(S02 s02, LM lm) {
        super(lm);
        this.n = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        IntRange intRange = S02.u0;
        return this.n.x(this);
    }
}
