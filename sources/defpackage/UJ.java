package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class UJ extends ML0 implements Function1<LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.e>, Unit> {
    public static final UJ d = new UJ(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.e> aVar) {
        LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.e> receiver = aVar;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        receiver.b(new LP1.d<>(AbstractC2882b80.d.b.class), new TJ(receiver));
        return Unit.a;
    }
}
