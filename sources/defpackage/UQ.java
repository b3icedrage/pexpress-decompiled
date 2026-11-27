package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.CurrentStartAmountProvider", f = "CurrentStartAmountProvider.kt", l = {28, 30, UserVerificationMethods.USER_VERIFY_LOCATION}, m = "getStartAmount")
public final class UQ extends LM {
    public VQ d;
    public EnumC4164hF1 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ VQ h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UQ(VQ vq, LM lm) {
        super(lm);
        this.h = vq;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.c(null, this);
    }
}
