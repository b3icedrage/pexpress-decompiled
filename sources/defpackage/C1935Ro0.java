package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ro0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1935Ro0 extends ML0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        OP1.a updateStateInRepositoryThread = (OP1.a) obj;
        Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
        RH1 call = new RH1(1, 1);
        updateStateInRepositoryThread.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        updateStateInRepositoryThread.b = call;
        C1857Qo0 call2 = new C1857Qo0(1);
        Intrinsics.checkNotNullParameter(call2, "call");
        updateStateInRepositoryThread.c = call2;
        return Unit.a;
    }
}
