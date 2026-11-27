package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Sk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.GetConfigUseCaseBase", f = "GetConfigUseCaseBase.kt", l = {35, RequestError.NETWORK_FAILURE, 43, 46}, m = "fetch")
public final class C2001Sk0 extends LM {
    public Object d;
    public CommonResult e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C2317Wk0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2001Sk0(C2317Wk0 c2317Wk0, LM lm) {
        super(lm);
        this.h = c2317Wk0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.c(null, this);
    }
}
