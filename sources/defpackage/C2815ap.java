package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.local_calculators.BBandsDirectionCalculator", f = "BBandsDirectionCalculator.kt", l = {51, 52, 53}, m = "calculateDirectionResult")
public final class C2815ap extends LM {
    public C3443dp d;
    public I10 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C3443dp h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2815ap(C3443dp c3443dp, LM lm) {
        super(lm);
        this.h = c3443dp;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
