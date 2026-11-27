package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.graphic.usecases.LoadChartHistoryUseCaseBase", f = "LoadChartHistoryUseCaseBase.kt", l = {68, 70, 72, 75, 161, 89}, m = "subscribeToUpdatesAndLoadChartHistory")
public final class C3569eR0 extends LM {
    public Object d;
    public String e;
    public C3027bp1 g;
    public CommonError h;
    public C3027bp1 i;
    public long j;
    public long k;
    public long l;
    public long m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ C3989gR0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3569eR0(C3989gR0 c3989gR0, LM lm) {
        super(lm);
        this.q = c3989gR0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(null, this);
    }
}
