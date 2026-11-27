package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ja2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4696ja2 extends ML0 implements Function1<OP1.a<C3179ca2>, Unit> {
    public final /* synthetic */ C1351Kc0 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4696ja2(C1351Kc0 c1351Kc0, long j) {
        super(1);
        this.d = c1351Kc0;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OP1.a<C3179ca2> aVar) {
        OP1.a<C3179ca2> updateStateInRepositoryThread = aVar;
        Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
        C4438ia2 call = new C4438ia2(this.d, this.e);
        updateStateInRepositoryThread.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        updateStateInRepositoryThread.c = call;
        return Unit.a;
    }
}
