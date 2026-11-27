package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class JJ extends ML0 implements Function1<LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.f>, Unit> {
    public final /* synthetic */ YJ d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JJ(YJ yj) {
        super(1);
        this.d = yj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.f> aVar) {
        LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.f> receiver = aVar;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        receiver.c(new EJ(this));
        receiver.b(new LP1.d<>(AbstractC2882b80.b.class), new FJ(this, receiver));
        C2695aK.b bVar = this.d.d;
        receiver.b(C2695aK.b.a(bVar), new GJ(this, receiver));
        receiver.b(C2695aK.b.b(bVar), new HJ(this, receiver));
        receiver.b(new LP1.d<>(AbstractC2882b80.a.b.class), new IJ(this, receiver));
        return Unit.a;
    }
}
