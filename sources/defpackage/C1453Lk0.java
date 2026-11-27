package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonMinMaxBet;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Lk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.usecases.GetBetMinMaxValuesUseCaseImpl", f = "GetBetMinMaxValuesUseCaseImpl.kt", l = {35, 43, 45}, m = "cacheData")
public final class C1453Lk0 extends LM {
    public C1611Nk0 d;
    public CommonMinMaxBet e;
    public Map g;
    public Iterator h;
    public String i;
    public Map j;
    public double k;
    public /* synthetic */ Object l;
    public final /* synthetic */ C1611Nk0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1453Lk0(C1611Nk0 c1611Nk0, JM<? super C1453Lk0> jm) {
        super(jm);
        this.m = c1611Nk0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return C1611Nk0.a(this.m, null, this);
    }
}
