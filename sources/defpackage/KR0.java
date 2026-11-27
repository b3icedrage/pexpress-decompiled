package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class KR0 extends ML0 implements Function1<LT.c, Unit> {
    public static final KR0 d = new KR0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LT.c cVar) {
        LT.c build = cVar;
        Intrinsics.checkNotNullParameter(build, "$this$build");
        LT.c.a.a(build);
        MT.b(build, ':');
        LT.c.a.b(build);
        MT.a(build, new Function1[]{HR0.d}, JR0.d);
        return Unit.a;
    }
}
