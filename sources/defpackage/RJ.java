package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class RJ extends ML0 implements Function2<CP1.a, AbstractC2882b80.d.b, LP1.b.a.C0082a<? extends CP1, Object>> {
    public final /* synthetic */ SJ d;
    public final /* synthetic */ LP1.c.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RJ(SJ sj, LP1.c.a aVar) {
        super(2);
        this.d = sj;
        this.e = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LP1.b.a.C0082a<? extends CP1, Object> invoke(CP1.a aVar, AbstractC2882b80.d.b bVar) {
        CP1.a receiver = aVar;
        AbstractC2882b80.d.b it = bVar;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(it, "it");
        YJ yj = this.d.d;
        long jG = yj.d.f.g(0);
        return LP1.c.a.d(this.e, receiver, new CP1.f(C2695aK.b.e(yj.d, jG), 0, jG));
    }
}
