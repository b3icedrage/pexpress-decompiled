package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.CurrentStartAmountProvider", f = "CurrentStartAmountProvider.kt", l = {44, 45, RequestError.RESPONSE_CODE_FAILURE, 53}, m = "getDefaultAmountValue")
public final class SQ extends LM {
    public VQ d;
    public EnumC4164hF1 e;
    public double g;
    public /* synthetic */ Object h;
    public final /* synthetic */ VQ i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SQ(VQ vq, LM lm) {
        super(lm);
        this.i = vq;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(this);
    }
}
