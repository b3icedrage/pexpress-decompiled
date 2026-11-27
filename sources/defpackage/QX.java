package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.platform.screens.deposit.DepositNavigationListenerBase", f = "DepositNavigationListenerBase.kt", l = {10}, m = "listenForDeposit$suspendImpl")
public final class QX extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ UX e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QX(UX ux, LM lm) {
        super(lm);
        this.e = ux;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        SX.a(this.e, this);
        return MN.d;
    }
}
