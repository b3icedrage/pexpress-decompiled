package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IR0 extends ML0 implements Function1<LT.c, Unit> {
    public static final IR0 d = new IR0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LT.c cVar) {
        LT.c optional = cVar;
        Intrinsics.checkNotNullParameter(optional, "$this$optional");
        MT.b(optional, JwtParser.SEPARATOR_CHAR);
        optional.o();
        return Unit.a;
    }
}
