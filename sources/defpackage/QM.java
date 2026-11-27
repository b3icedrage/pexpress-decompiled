package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.usecases.ConvertCurrencyUseCaseBase", f = "ConvertCurrencyUseCaseBase.kt", l = {53}, m = "convertCurrency")
public final class QM extends LM {
    public String d;
    public String e;
    public double g;
    public /* synthetic */ Object h;
    public final /* synthetic */ UM i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QM(UM um, LM lm) {
        super(lm);
        this.i = um;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.c(null, 0.0d, null, this);
    }
}
