package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.local_calculators.StochasticDirectionCalculator", f = "StochasticDirectionCalculator.kt", l = {47, 48, RequestError.RESPONSE_CODE_FAILURE}, m = "calculateDirectionResult")
public final class C6347rQ1 extends LM {
    public C6767tQ1 d;
    public I10 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C6767tQ1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6347rQ1(C6767tQ1 c6767tQ1, LM lm) {
        super(lm);
        this.h = c6767tQ1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
