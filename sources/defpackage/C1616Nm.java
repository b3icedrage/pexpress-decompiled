package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase", f = "AuthorizationViewModelBase.kt", l = {264}, m = "registerUser$suspendImpl")
public final class C1616Nm extends LM {
    public C1146Hm d;
    public String e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C1146Hm h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1616Nm(C1146Hm c1146Hm, LM lm) {
        super(lm);
        this.h = c1146Hm;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return C1146Hm.D(this.h, null, null, null, this);
    }
}
