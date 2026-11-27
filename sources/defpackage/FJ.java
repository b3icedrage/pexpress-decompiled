package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FJ extends ML0 implements Function2<CP1.f, AbstractC2882b80.b, LP1.b.a.C0082a<? extends CP1, Object>> {
    public final /* synthetic */ JJ d;
    public final /* synthetic */ LP1.c.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FJ(JJ jj, LP1.c.a aVar) {
        super(2);
        this.d = jj;
        this.e = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LP1.b.a.C0082a<? extends CP1, Object> invoke(CP1.f fVar, AbstractC2882b80.b bVar) {
        CP1.f receiver = fVar;
        AbstractC2882b80.b it = bVar;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(it, "it");
        return LP1.c.a.d(this.e, receiver, new CP1.b(C2695aK.b.c(this.d.d.d), receiver.b + 1));
    }
}
