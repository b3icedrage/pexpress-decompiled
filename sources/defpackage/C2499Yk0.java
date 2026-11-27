package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.google.android.gms.common.ConnectionResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.GetCurrenciesUseCaseBase", f = "GetCurrenciesUseCaseBase.kt", l = {ConnectionResult.API_DISABLED_FOR_CONNECTION, 107}, m = "execute$suspendImpl")
public final class C2499Yk0 extends LM {
    public C2577Zk0 d;
    public CommonError e;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C2577Zk0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2499Yk0(C2577Zk0 c2577Zk0, LM lm) {
        super(lm);
        this.n = c2577Zk0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return C2577Zk0.b(this.n, this);
    }
}
