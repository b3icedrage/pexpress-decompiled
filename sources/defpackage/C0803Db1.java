package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Db1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0803Db1 extends ML0 implements Function1<OP1.a<C0881Eb1>, Unit> {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C8062zb1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0803Db1(boolean z, C8062zb1 c8062zb1) {
        super(1);
        this.d = z;
        this.e = c8062zb1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OP1.a<C0881Eb1> aVar) {
        OP1.a<C0881Eb1> updateStateInDispatchingThread = aVar;
        Intrinsics.checkNotNullParameter(updateStateInDispatchingThread, "$this$updateStateInDispatchingThread");
        C0725Cb1 call = new C0725Cb1(this.d);
        updateStateInDispatchingThread.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        updateStateInDispatchingThread.c = call;
        C4080gr0 call2 = new C4080gr0(this.e, 1);
        Intrinsics.checkNotNullParameter(call2, "call");
        updateStateInDispatchingThread.d = call2;
        return Unit.a;
    }
}
