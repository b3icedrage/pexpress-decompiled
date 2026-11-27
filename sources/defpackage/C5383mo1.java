package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {27}, m = "proceed")
public final class C5383mo1 extends LM {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ C5803oo1 g;
    public C5803oo1 h;
    public TB0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5383mo1(C5803oo1 c5803oo1, LM lm) {
        super(lm);
        this.g = c5803oo1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
