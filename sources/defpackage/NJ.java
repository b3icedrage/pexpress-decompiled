package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class NJ extends ML0 implements Function2<CP1.a, AbstractC2882b80, Unit> {
    public final /* synthetic */ SJ d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NJ(SJ sj) {
        super(2);
        this.d = sj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CP1.a aVar, AbstractC2882b80 abstractC2882b80) {
        CP1.a receiver = aVar;
        AbstractC2882b80 it = abstractC2882b80;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(it, "it");
        C2695aK.b.d(this.d.d.d);
        return Unit.a;
    }
}
