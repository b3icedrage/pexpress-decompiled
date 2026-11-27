package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.usecases.GetUserUseCaseBase", f = "GetUserUseCaseBase.kt", l = {UserVerificationMethods.USER_VERIFY_LOCATION, 34}, m = "getProfile")
public final class C8101zl0 extends LM {
    public C0754Cl0 d;
    public C3027bp1 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C0754Cl0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8101zl0(C0754Cl0 c0754Cl0, LM lm) {
        super(lm);
        this.h = c0754Cl0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(this);
    }
}
