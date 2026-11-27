package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MJ extends ML0 implements Function1<LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.b>, Unit> {
    public final /* synthetic */ YJ d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MJ(YJ yj) {
        super(1);
        this.d = yj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.b> aVar) {
        LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.b> receiver = aVar;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        this.d.d.getClass();
        LP1.d<AbstractC2882b80, ? extends E> dVar = new LP1.d<>(AbstractC2882b80.d.a.class);
        dVar.b(ZJ.d);
        receiver.b(dVar, new KJ(receiver));
        receiver.b(new LP1.d<>(AbstractC2882b80.d.b.class), new LJ(this, receiver));
        return Unit.a;
    }
}
