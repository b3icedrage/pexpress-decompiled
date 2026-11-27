package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.local_calculators.RsiDirectionCalculator", f = "RsiDirectionCalculator.kt", l = {45, 46, 48}, m = "calculateDirectionResult")
public final class C5883pB1 extends LM {
    public C6302rB1 d;
    public I10 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C6302rB1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5883pB1(C6302rB1 c6302rB1, LM lm) {
        super(lm);
        this.h = c6302rB1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
