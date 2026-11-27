package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {425, 426, 423, 432, 435, 433}, m = "onStopCheckSuccessful")
public final class C7525x12 extends LM {
    public S02 d;
    public Object e;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ S02<H32> i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7525x12(S02 s02, LM lm) {
        super(lm);
        this.i = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return S02.a(this.i, null, this);
    }
}
