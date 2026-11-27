package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.navigation.screen_starters.DepositScreenStarterImpl", f = "DepositScreenStarterImpl.kt", l = {31, UserVerificationMethods.USER_VERIFY_LOCATION, 38}, m = "openDeposit")
public final class ZX extends LM {
    public C2737aY d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C2737aY g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZX(C2737aY c2737aY, LM lm) {
        super(lm);
        this.g = c2737aY;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(this);
    }
}
