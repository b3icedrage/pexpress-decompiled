package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class LJ extends ML0 implements Function2<CP1.b, AbstractC2882b80.d.b, LP1.b.a.C0082a<? extends CP1, Object>> {
    public final /* synthetic */ MJ d;
    public final /* synthetic */ LP1.c.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LJ(MJ mj, LP1.c.a aVar) {
        super(2);
        this.d = mj;
        this.e = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LP1.b.a.C0082a<? extends CP1, Object> invoke(CP1.b bVar, AbstractC2882b80.d.b bVar2) {
        CP1.b receiver = bVar;
        AbstractC2882b80.d.b it = bVar2;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(it, "it");
        YJ yj = this.d.d;
        long jG = yj.d.f.g(receiver.b);
        return LP1.c.a.d(this.e, receiver, new CP1.f(C2695aK.b.e(yj.d, jG), receiver.b, jG));
    }
}
