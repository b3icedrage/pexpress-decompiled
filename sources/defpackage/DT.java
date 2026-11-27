package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DT extends ML0 implements Function1<LT.b, Unit> {
    public static final DT d = new DT(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LT.b bVar) {
        LT.b alternativeParsing = bVar;
        Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
        alternativeParsing.d("UT");
        return Unit.a;
    }
}
