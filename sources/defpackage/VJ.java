package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class VJ extends ML0 implements Function2<CP1.c, AbstractC2882b80, Unit> {
    public final /* synthetic */ WJ d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VJ(WJ wj) {
        super(2);
        this.d = wj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CP1.c cVar, AbstractC2882b80 abstractC2882b80) {
        CP1.c receiver = cVar;
        AbstractC2882b80 it = abstractC2882b80;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(it, "it");
        this.d.d.d.a.b();
        return Unit.a;
    }
}
