package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7615xT extends ML0 implements Function1<LT.b, Unit> {
    public static final C7615xT d = new C7615xT(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LT.b bVar) {
        LT.b optional = bVar;
        Intrinsics.checkNotNullParameter(optional, "$this$optional");
        MT.b(optional, JwtParser.SEPARATOR_CHAR);
        optional.o();
        return Unit.a;
    }
}
