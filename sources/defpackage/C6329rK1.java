package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {382, 389, 392}, m = "collect$suspendImpl")
public final class C6329rK1<T> extends LM {
    public C6120qK1 d;
    public InterfaceC6606sf0 e;
    public C6539sK1 g;
    public XF0 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C6120qK1<T> j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6329rK1(C6120qK1<T> c6120qK1, JM<? super C6329rK1> jm) {
        super(jm);
        this.j = c6120qK1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        C6120qK1.o(this.j, null, this);
        return MN.d;
    }
}
