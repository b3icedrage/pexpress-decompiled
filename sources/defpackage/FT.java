package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FT extends ML0 implements Function1<LT.b, Unit> {
    public static final FT d = new FT(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LT.b bVar) {
        LT.b optional = bVar;
        Intrinsics.checkNotNullParameter(optional, "$this$optional");
        optional.f((Tb2) Vb2.c.getValue());
        return Unit.a;
    }
}
