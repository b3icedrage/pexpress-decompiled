package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.base_calculators.AbstractLocalDirectionCalculator", f = "AbstractLocalDirectionCalculator.kt", l = {95, 98, 109, 115}, m = "calculateDirection")
public final class C6257r0 extends LM {
    public AbstractC6048q0 d;
    public Object e;
    public Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ AbstractC6048q0<E10.c, InterfaceC7722xy0<Object>> i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6257r0(AbstractC6048q0 abstractC6048q0, LM lm) {
        super(lm);
        this.i = abstractC6048q0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.d(null, null, this);
    }
}
