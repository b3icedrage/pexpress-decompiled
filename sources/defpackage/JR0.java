package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class JR0 extends ML0 implements Function1<LT.c, Unit> {
    public static final JR0 d = new JR0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LT.c cVar) {
        LT.c alternativeParsing = cVar;
        Intrinsics.checkNotNullParameter(alternativeParsing, "$this$alternativeParsing");
        MT.b(alternativeParsing, ':');
        LT.c.a.c(alternativeParsing);
        MT.c(alternativeParsing, "", IR0.d);
        return Unit.a;
    }
}
