package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AJ extends ML0 implements Function2<CP1.d, AbstractC2882b80.a.C0249a<?>, LP1.b.a.C0082a<? extends CP1, Object>> {
    public final /* synthetic */ DJ d;
    public final /* synthetic */ LP1.c.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJ(DJ dj, LP1.c.a aVar) {
        super(2);
        this.d = dj;
        this.e = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LP1.b.a.C0082a<? extends CP1, Object> invoke(CP1.d dVar, AbstractC2882b80.a.C0249a<?> c0249a) {
        CP1.d receiver = dVar;
        AbstractC2882b80.a.C0249a<?> it = c0249a;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(it, "it");
        return LP1.c.a.d(this.e, receiver, new CP1.b(C2695aK.b.c(this.d.d.d), 0));
    }
}
