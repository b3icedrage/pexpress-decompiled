package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3087}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
public final class C2264Vu extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C2030Su<Object> e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2264Vu(C2030Su c2030Su, LM lm) {
        super(lm);
        this.e = c2030Su;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C2030Su.e;
        Object objG = this.e.G(null, 0, 0L, this);
        return objG == MN.d ? objG : new C3308dA(objG);
    }
}
