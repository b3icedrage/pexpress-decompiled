package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.providers.InvestmentProfitProviderBase", f = "InvestmentProfitProviderBase.kt", l = {RequestError.RESPONSE_CODE_FAILURE, 51, 53}, m = "currentBalanceDouble")
public final class NC0 extends LM {
    public OC0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ OC0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NC0(OC0 oc0, LM lm) {
        super(lm);
        this.g = oc0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return OC0.b(this.g, this);
    }
}
