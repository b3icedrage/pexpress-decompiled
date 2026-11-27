package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.usecases.ConvertCurrencyUseCaseBase", f = "ConvertCurrencyUseCaseBase.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "convertMinBetCurrency")
public final class RM extends LM {
    public String d;
    public String e;
    public double g;
    public /* synthetic */ Object h;
    public final /* synthetic */ UM i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RM(UM um, LM lm) {
        super(lm);
        this.i = um;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, 0.0d, null, this);
    }
}
