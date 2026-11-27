package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class YJ extends ML0 implements Function1<LP1.c<CP1, AbstractC2882b80, Object>, Unit> {
    public final /* synthetic */ C2695aK.b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YJ(C2695aK.b bVar) {
        super(1);
        this.d = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [CP1$d, STATE, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LP1.c<CP1, AbstractC2882b80, Object> cVar) {
        LP1.c<CP1, AbstractC2882b80, Object> receiver = cVar;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        receiver.a(new LP1.d<>(CP1.d.class), new DJ(this));
        receiver.a(new LP1.d<>(CP1.f.class), new JJ(this));
        receiver.a(new LP1.d<>(CP1.b.class), new MJ(this));
        receiver.a(new LP1.d<>(CP1.a.class), new SJ(this));
        receiver.a(new LP1.d<>(CP1.e.class), UJ.d);
        receiver.a(new LP1.d<>(CP1.c.class), new WJ(this));
        ?? initialState = CP1.d.a;
        Intrinsics.d(initialState, "initialState");
        receiver.a = initialState;
        receiver.c.add(new XJ(this));
        return Unit.a;
    }
}
