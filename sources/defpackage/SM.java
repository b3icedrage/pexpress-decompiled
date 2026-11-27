package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.usecases.ConvertCurrencyUseCaseBase", f = "ConvertCurrencyUseCaseBase.kt", l = {72, 73}, m = "convertToUsd")
public final class SM extends LM {
    public UM d;
    public Double e;
    public /* synthetic */ Object g;
    public final /* synthetic */ UM h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SM(UM um, LM lm) {
        super(lm);
        this.h = um;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
