package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Nq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.RegistrationCurrenciesUseCaseBase", f = "RegistrationCurrenciesUseCaseBase.kt", l = {UserVerificationMethods.USER_VERIFY_LOCATION}, m = "getCurrencies")
public final class C1630Nq1 extends LM {
    public C2020Sq1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C2020Sq1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1630Nq1(C2020Sq1 c2020Sq1, LM lm) {
        super(lm);
        this.g = c2020Sq1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}
