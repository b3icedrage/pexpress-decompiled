package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MV extends ML0 implements Function1<C1390Kp0.b, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1390Kp0.b bVar) {
        C1390Kp0.b HttpResponseValidator = bVar;
        Intrinsics.checkNotNullParameter(HttpResponseValidator, "$this$HttpResponseValidator");
        HttpResponseValidator.c = false;
        LV block = new LV(2, null);
        Intrinsics.checkNotNullParameter(block, "block");
        HttpResponseValidator.a.add(block);
        return Unit.a;
    }
}
