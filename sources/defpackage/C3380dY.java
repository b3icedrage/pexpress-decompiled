package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.providers.impl.DepositValuesProviderBase", f = "DepositValuesProviderBase.kt", l = {43, 44}, m = "getHigherRecommendedBalanceText")
public final class C3380dY extends LM {
    public C4009gY d;
    public String e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C4009gY h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3380dY(C4009gY c4009gY, LM lm) {
        super(lm);
        this.h = c4009gY;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.f(this);
    }
}
