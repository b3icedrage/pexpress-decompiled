package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.DirectionCalculatorProvider", f = "DirectionCalculatorProvider.kt", l = {26, 28}, m = "generateParams")
public final class J10 extends LM {
    public M10 d;
    public String e;
    public /* synthetic */ Object g;
    public final /* synthetic */ M10 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J10(M10 m10, LM lm) {
        super(lm);
        this.h = m10;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(this);
    }
}
