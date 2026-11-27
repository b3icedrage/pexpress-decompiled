package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MP1 extends ML0 implements Function2<Object, Object, Unit> {
    public final /* synthetic */ ML0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MP1(Function2 function2) {
        super(2);
        this.d = (ML0) function2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ML0, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Object state, Object cause) {
        Intrinsics.d(state, "state");
        Intrinsics.d(cause, "cause");
        this.d.invoke(state, cause);
        return Unit.a;
    }
}
