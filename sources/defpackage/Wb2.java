package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Wb2 extends ML0 implements Function1<LT.d, Unit> {
    public static final Wb2 d = new Wb2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LT.d dVar) {
        LT.d alternativeParsing = dVar;
        Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
        alternativeParsing.d("z");
        return Unit.a;
    }
}
