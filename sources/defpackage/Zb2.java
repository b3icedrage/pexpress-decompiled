package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Zb2 extends ML0 implements Function1<LT.d, Unit> {
    public static final Zb2 d = new Zb2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LT.d dVar) {
        LT.d alternativeParsing = dVar;
        Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
        MT.c(alternativeParsing, "Z", Yb2.d);
        return Unit.a;
    }
}
