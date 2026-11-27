package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class E72 extends ML0 implements Function1<OP1.a<F72>, Unit> {
    public final /* synthetic */ B72 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E72(B72 b72, long j) {
        super(1);
        this.d = b72;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OP1.a<F72> aVar) {
        OP1.a<F72> updateStateInRepositoryThread = aVar;
        Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
        D72 call = new D72(this.d, this.e);
        updateStateInRepositoryThread.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        updateStateInRepositoryThread.c = call;
        return Unit.a;
    }
}
