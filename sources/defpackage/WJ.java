package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class WJ extends ML0 implements Function1<LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.c>, Unit> {
    public final /* synthetic */ YJ d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WJ(YJ yj) {
        super(1);
        this.d = yj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.c> aVar) {
        LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.c> receiver = aVar;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        receiver.c(new VJ(this));
        return Unit.a;
    }
}
