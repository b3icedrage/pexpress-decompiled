package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class XJ extends ML0 implements Function1<LP1.e<? extends CP1, ? extends AbstractC2882b80, Object>, Unit> {
    public final /* synthetic */ YJ d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XJ(YJ yj) {
        super(1);
        this.d = yj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LP1.e<? extends CP1, ? extends AbstractC2882b80, Object> eVar) {
        LP1.e<? extends CP1, ? extends AbstractC2882b80, Object> transition = eVar;
        Intrinsics.checkNotNullParameter(transition, "transition");
        if ((transition instanceof LP1.e.b) && !Intrinsics.a((CP1) ((LP1.e.b) transition).a, ((LP1.e.b) transition).c)) {
            C2695aK.b bVar = this.d.d;
            C2158Uk1<AbstractC2882b80> c2158Uk1 = bVar.b;
            CP1 cp1 = bVar.c.a.get();
            Intrinsics.b(cp1, "stateRef.get()");
            c2158Uk1.d(new AbstractC2882b80.c(cp1));
        }
        return Unit.a;
    }
}
