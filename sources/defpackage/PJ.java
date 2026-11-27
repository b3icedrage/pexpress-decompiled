package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PJ extends ML0 implements Function2<CP1.a, AbstractC2882b80.a.C0249a<?>, LP1.b.a.C0082a<? extends CP1, Object>> {
    public final /* synthetic */ SJ d;
    public final /* synthetic */ LP1.c.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PJ(SJ sj, LP1.c.a aVar) {
        super(2);
        this.d = sj;
        this.e = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LP1.b.a.C0082a<? extends CP1, Object> invoke(CP1.a aVar, AbstractC2882b80.a.C0249a<?> c0249a) {
        CP1.a receiver = aVar;
        AbstractC2882b80.a.C0249a<?> it = c0249a;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(it, "it");
        YJ yj = this.d.d;
        Object obj = it.a;
        yj.d.getClass();
        if (obj instanceof InterfaceC7394wP0.a.c.b) {
            receiver.a.a.b(((InterfaceC7394wP0.a.c.b) obj).a);
        } else if (Intrinsics.a(obj, InterfaceC7394wP0.a.c.C0528a.a)) {
            receiver.a.a.cancel();
        }
        return LP1.c.a.d(this.e, receiver, CP1.e.a);
    }
}
