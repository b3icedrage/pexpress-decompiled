package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.MakeDepositUpdater", f = "MakeDepositUpdater.kt", l = {77}, m = "getUsdAmount")
public final class XV0 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C3165cW0 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XV0(C3165cW0 c3165cW0, LM lm) {
        super(lm);
        this.e = c3165cW0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.f(null, null, this);
    }
}
