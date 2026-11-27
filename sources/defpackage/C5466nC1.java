package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.backend.helpers.SafeRequestsApi$DefaultImpls", f = "SafeRequestsApi.kt", l = {62, UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "tryOrNullWithErrorDefault")
public final class C5466nC1<T> extends LM {
    public InterfaceC4833kC1 d;
    public /* synthetic */ Object e;
    public int g;

    public C5466nC1() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return InterfaceC4833kC1.a.c(this, null, null);
    }
}
