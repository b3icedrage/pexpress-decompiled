package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.account.callbacks.AccountCallbacksBase", f = "AccountCallbacksBase.kt", l = {82, 83}, m = "logout")
public final class N2 extends LM {
    public O2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ O2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N2(O2 o2, LM lm) {
        super(lm);
        this.g = o2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(this);
    }
}
