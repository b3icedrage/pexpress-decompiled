package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.CurrentStrategyProvider", f = "CurrentStrategyProvider.kt", l = {34, 35, 36, 33}, m = "getStrategyCalculator")
public final class C2940bR extends LM {
    public Object d;
    public Object e;
    public Object g;
    public EnumC2644a42 h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C3149cR k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2940bR(C3149cR c3149cR, LM lm) {
        super(lm);
        this.k = c3149cR;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
