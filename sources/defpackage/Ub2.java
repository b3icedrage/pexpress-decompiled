package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Ub2 extends ML0 implements Function1<LT.d, Unit> {
    public static final Ub2 d = new Ub2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LT.d dVar) {
        LT.d build = dVar;
        Intrinsics.checkNotNullParameter(build, "$this$build");
        LT.d.a.a(build);
        LT.d.a.b(build);
        return Unit.a;
    }
}
