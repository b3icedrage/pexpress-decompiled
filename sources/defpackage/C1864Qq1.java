package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.RegistrationCurrenciesUseCaseBase", f = "RegistrationCurrenciesUseCaseBase.kt", l = {RequestError.NETWORK_FAILURE}, m = "selectCurrency")
public final class C1864Qq1 extends LM {
    public C2020Sq1 d;
    public C2098Tq1 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C2020Sq1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864Qq1(C2020Sq1 c2020Sq1, LM lm) {
        super(lm);
        this.h = c2020Sq1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
