package defpackage;

import E10.c;
import defpackage.InterfaceC7722xy0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.base_calculators.AbstractLocalDirectionCalculator", f = "AbstractLocalDirectionCalculator.kt", l = {78, 79, 82, 85}, m = "calculateDirectionResult$suspendImpl")
public final class C6467s0<T extends E10.c, P extends InterfaceC7722xy0<T>> extends LM {
    public AbstractC6048q0 d;
    public I10 e;
    public InterfaceC7722xy0 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ AbstractC6048q0<T, P> i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6467s0(AbstractC6048q0 abstractC6048q0, LM lm) {
        super(lm);
        this.i = abstractC6048q0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return AbstractC6048q0.e(this.i, null, this);
    }
}
