package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.registration.usecase.DefaultShowErrorUseCase", f = "DefaultShowErrorUseCase.kt", l = {UserVerificationMethods.USER_VERIFY_LOCATION}, m = "emailAlreadyRegistered")
public final class WV extends LM {
    public XV d;
    public String e;
    public /* synthetic */ Object g;
    public final /* synthetic */ XV h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WV(XV xv, LM lm) {
        super(lm);
        this.h = xv;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
