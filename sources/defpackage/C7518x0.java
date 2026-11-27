package defpackage;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.base_calculators.AbstractLocalDirectionCalculator", f = "AbstractLocalDirectionCalculator.kt", l = {151, 163, 163}, m = "waitIndicator")
public final class C7518x0<R> extends LM {
    public AbstractC6048q0 d;
    public I10 e;
    public InterfaceC7722xy0 g;
    public E10.c h;
    public Function1 i;
    public InterfaceC1060Gj0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ AbstractC6048q0<E10.c, InterfaceC7722xy0<Object>> l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7518x0(AbstractC6048q0 abstractC6048q0, LM lm) {
        super(lm);
        this.l = abstractC6048q0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.n(null, null, null, null, null, this);
    }
}
