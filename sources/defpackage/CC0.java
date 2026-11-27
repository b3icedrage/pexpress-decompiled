package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.providers.InvestmentAccountModelProviderBase", f = "InvestmentAccountModelProviderBase.kt", l = {RequestError.NETWORK_FAILURE, RequestError.NO_DEV_KEY, 43}, m = "currentBalanceDouble")
public final class CC0 extends LM {
    public DC0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ DC0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CC0(DC0 dc0, LM lm) {
        super(lm);
        this.g = dc0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return DC0.b(this.g, this);
    }
}
