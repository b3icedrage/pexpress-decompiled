package defpackage;

import com.api.core.backend.domain.models.resultModels.ResultOk;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Dq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.RegisterUseCaseBase", f = "RegisterUseCaseBase.kt", l = {198, 204, 205}, m = "loginToPendingAccount")
public final class C0848Dq1 extends LM {
    public Object d;
    public Object e;
    public Object g;
    public ResultOk h;
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ AbstractC7909yq1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0848Dq1(AbstractC7909yq1 abstractC7909yq1, LM lm) {
        super(lm);
        this.k = abstractC7909yq1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Set<EnumC7489wq1> set = AbstractC7909yq1.t;
        return this.k.k(null, false, this);
    }
}
