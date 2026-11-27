package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {415, 419}, m = "onSubscription")
public final class C5940pU1 extends LM {
    public C6150qU1 d;
    public C2897bC1 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C6150qU1<Object> h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5940pU1(C6150qU1 c6150qU1, LM lm) {
        super(lm);
        this.h = c6150qU1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
