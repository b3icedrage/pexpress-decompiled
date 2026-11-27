package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ts1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.trading.usecases.RequestCandlesHistoryUseCaseImpl", f = "RequestCandlesHistoryUseCaseImpl.kt", l = {26, 106}, m = "requestWithTimeFrame")
public final class C6864ts1 extends LM {
    public C7074us1 d;
    public String e;
    public CommonError g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ C7074us1 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6864ts1(C7074us1 c7074us1, LM lm) {
        super(lm);
        this.s = c7074us1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(null, 0L, 0L, 0, 0, this);
    }
}
