package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.CompletePendingRegistrationUseCaseBase", f = "CompletePendingRegistrationUseCaseBase.kt", l = {51}, m = "abandon")
public final class HG extends LM {
    public String d;
    public CommonError e;
    public /* synthetic */ Object g;
    public final /* synthetic */ KG h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HG(KG kg, LM lm) {
        super(lm);
        this.h = kg;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, null, this);
    }
}
