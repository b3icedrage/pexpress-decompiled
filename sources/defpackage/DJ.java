package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DJ extends ML0 implements Function1<LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.d>, Unit> {
    public final /* synthetic */ YJ d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DJ(YJ yj) {
        super(1);
        this.d = yj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.d> aVar) {
        LP1.c<CP1, AbstractC2882b80, Object>.a<CP1.d> receiver = aVar;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        receiver.c(new C8005zJ(this));
        C2695aK.b bVar = this.d.d;
        receiver.b(C2695aK.b.a(bVar), new AJ(this, receiver));
        receiver.b(C2695aK.b.b(bVar), new BJ(this, receiver));
        receiver.b(new LP1.d<>(AbstractC2882b80.a.b.class), new CJ(receiver));
        return Unit.a;
    }
}
