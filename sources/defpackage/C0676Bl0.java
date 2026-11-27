package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Bl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.usecases.GetUserUseCaseBase", f = "GetUserUseCaseBase.kt", l = {97, 173}, m = "retryTransient")
public final class C0676Bl0<T> extends LM {
    public String d;
    public Function1 e;
    public Function1 g;
    public CommonError h;
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ C0754Cl0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0676Bl0(C0754Cl0 c0754Cl0, LM lm) {
        super(lm);
        this.p = c0754Cl0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        int i = C0754Cl0.h;
        return this.p.e(null, null, null, this);
    }
}
