package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.stop_triggers.MaxProfitStopChecker", f = "MaxProfitStopChecker.kt", l = {20, CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "getMaximumProfit")
public final class VX0 extends LM {
    public XX0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ XX0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VX0(XX0 xx0, LM lm) {
        super(lm);
        this.g = xx0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(this);
    }
}
