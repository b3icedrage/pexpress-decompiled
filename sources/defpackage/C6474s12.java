package defpackage;

import defpackage.H32;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: s12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {1334, 1335, 1336}, m = "onBetOpened$suspendImpl")
public final class C6474s12<T extends H32> extends LM {
    public S02 d;
    public C2337Wr e;
    public /* synthetic */ Object g;
    public final /* synthetic */ S02<T> h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6474s12(S02 s02, LM lm) {
        super(lm);
        this.h = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return S02.A(this.h, null, this);
    }
}
