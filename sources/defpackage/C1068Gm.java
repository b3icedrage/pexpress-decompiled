package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase", f = "AuthorizationViewModelBase.kt", l = {457, 459, 458}, m = "onCaptchaError$suspendImpl")
public final class C1068Gm extends LM {
    public C6120qK1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1146Hm g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1068Gm(C1146Hm c1146Hm, LM lm) {
        super(lm);
        this.g = c1146Hm;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C1146Hm.A(this.g, null, null, null, this);
    }
}
