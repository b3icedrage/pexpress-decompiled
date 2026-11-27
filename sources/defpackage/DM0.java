package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppFirstStepUseCaseBase", f = "LaunchAppFirstStepUseCaseBase.kt", l = {63, UserVerificationMethods.USER_VERIFY_EYEPRINT, 66, 80, 81}, m = "checkInternet")
public final class DM0 extends LM {
    public IM0 d;
    public Object e;
    public /* synthetic */ Object g;
    public final /* synthetic */ IM0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DM0(IM0 im0, LM lm) {
        super(lm);
        this.h = im0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return IM0.a(this.h, this);
    }
}
