package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {108}, m = "intercept")
public final class R60 extends LM {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ T60 g;
    public T60 h;
    public C5803oo1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R60(T60 t60, LM lm) {
        super(lm);
        this.g = t60;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
