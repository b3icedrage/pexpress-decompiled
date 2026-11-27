package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.navigation.DepositNavigationManager", f = "DepositNavigationManager.kt", l = {38, 39}, m = "listenForDeposit")
public final class TX extends LM {
    public UX d;
    public UX e;
    public /* synthetic */ Object g;
    public final /* synthetic */ UX h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TX(UX ux, LM lm) {
        super(lm);
        this.h = ux;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
