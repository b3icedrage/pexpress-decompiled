package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.updaters.CurrenciesUpdater", f = "CurrenciesUpdater.kt", l = {26}, m = "updateUserCurrencies")
public final class C5926pQ extends LM {
    public C6136qQ d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C6136qQ g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5926pQ(C6136qQ c6136qQ, LM lm) {
        super(lm);
        this.g = c6136qQ;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(this);
    }
}
