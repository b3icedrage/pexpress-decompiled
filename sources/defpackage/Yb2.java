package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Yb2 extends ML0 implements Function1<LT.d, Unit> {
    public static final Yb2 d = new Yb2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LT.d dVar) {
        LT.d optional = dVar;
        Intrinsics.checkNotNullParameter(optional, "$this$optional");
        LT.d.a.a(optional);
        MT.b(optional, ':');
        LT.d.a.b(optional);
        MT.c(optional, "", Xb2.d);
        return Unit.a;
    }
}
