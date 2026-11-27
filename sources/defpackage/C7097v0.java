package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.base_calculators.AbstractLocalDirectionCalculator", f = "AbstractLocalDirectionCalculator.kt", l = {172, 173, 170}, m = "getPointsHistory")
public final class C7097v0 extends LM {
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public String i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ AbstractC6048q0<E10.c, InterfaceC7722xy0<Object>> l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7097v0(AbstractC6048q0 abstractC6048q0, LM lm) {
        super(lm);
        this.l = abstractC6048q0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.j(null, null, this);
    }
}
