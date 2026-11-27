package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.base_calculators.AbstractLocalDirectionCalculator", f = "AbstractLocalDirectionCalculator.kt", l = {186}, m = "getCurrentTimeSeconds")
public final class C6887u0 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ AbstractC6048q0<E10.c, InterfaceC7722xy0<Object>> e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6887u0(AbstractC6048q0 abstractC6048q0, LM lm) {
        super(lm);
        this.e = abstractC6048q0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.h(this);
    }
}
