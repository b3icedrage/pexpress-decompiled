package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.trading.usecases.TraderImpl", f = "TraderImpl.kt", l = {148}, m = "getCurrentTime")
public final class X12 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ Y12 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X12(Y12 y12, LM lm) {
        super(lm);
        this.e = y12;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.m(this);
    }
}
