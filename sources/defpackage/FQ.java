package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonAccount;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.CurrencySignProviderBase", f = "CurrencySignProviderBase.kt", l = {46, 53, 59}, m = "getCurrencyCode")
public final class FQ extends LM {
    public HQ d;
    public Object e;
    public Object g;
    public EnumC4164hF1 h;
    public CommonAccount i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ HQ l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FQ(HQ hq, LM lm) {
        super(lm);
        this.l = hq;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(false, this);
    }
}
