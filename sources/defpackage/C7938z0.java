package defpackage;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.base_calculators.AbstractLocalDirectionCalculator", f = "AbstractLocalDirectionCalculator.kt", l = {126, 141, 141}, m = "waitIndicatorWithPrevious")
public final class C7938z0<R> extends LM {
    public AbstractC6048q0 d;
    public I10 e;
    public InterfaceC7722xy0 g;
    public E10.c h;
    public Function1 i;
    public InterfaceC1138Hj0 j;
    public C3027bp1 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ AbstractC6048q0<E10.c, InterfaceC7722xy0<Object>> m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7938z0(AbstractC6048q0 abstractC6048q0, LM lm) {
        super(lm);
        this.m = abstractC6048q0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.o(null, null, null, null, null, this);
    }
}
