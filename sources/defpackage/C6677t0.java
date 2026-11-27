package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.base_calculators.AbstractLocalDirectionCalculator", f = "AbstractLocalDirectionCalculator.kt", l = {199}, m = "defineStartTimeStamp")
public final class C6677t0 extends LM {
    public I10 d;
    public InterfaceC7722xy0 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AbstractC6048q0<E10.c, InterfaceC7722xy0<Object>> h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6677t0(AbstractC6048q0 abstractC6048q0, LM lm) {
        super(lm);
        this.h = abstractC6048q0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.f(null, null, this);
    }
}
