package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stub.usecases.StubMakeBetUseCaseBase", f = "StubMakeBetUseCaseBase.kt", l = {31, UserVerificationMethods.USER_VERIFY_LOCATION}, m = "makeCall")
public final class C6147qT1 extends LM {
    public C6356rT1 d;
    public JQ e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C6356rT1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6147qT1(C6356rT1 c6356rT1, LM lm) {
        super(lm);
        this.h = c6356rT1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, 0.0d, this);
    }
}
