package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.navigation.callbacks.registration.AuthorizationCallbacksImpl", f = "AuthorizationCallbacksImpl.kt", l = {29}, m = "navigateToFirstScreen")
public final class C1769Pl extends LM {
    public C1847Ql d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1847Ql g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1769Pl(C1847Ql c1847Ql, LM lm) {
        super(lm);
        this.g = c1847Ql;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.k(this);
    }
}
