package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.updaters.ProfileUpdater", f = "ProfileUpdater.kt", l = {UserVerificationMethods.USER_VERIFY_LOCATION, UserVerificationMethods.USER_VERIFY_LOCATION}, m = "subscribeForBalancesChanges")
public final class C7460wi1 extends LM {
    public C7039ui1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C7039ui1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7460wi1(C7039ui1 c7039ui1, LM lm) {
        super(lm);
        this.g = c7039ui1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(this);
    }
}
