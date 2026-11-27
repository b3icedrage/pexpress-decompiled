package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.RegisterUseCaseBase", f = "RegisterUseCaseBase.kt", l = {232, 233, 233}, m = "reportRegistration")
public final class C1004Fq1 extends LM {
    public Object d;
    public CommonResult e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AbstractC7909yq1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004Fq1(AbstractC7909yq1 abstractC7909yq1, JM<? super C1004Fq1> jm) {
        super(jm);
        this.h = abstractC7909yq1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return AbstractC7909yq1.f(this.h, this);
    }
}
