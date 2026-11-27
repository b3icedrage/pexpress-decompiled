package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class KJ extends ML0 implements Function2<CP1.b, AbstractC2882b80.d.a<?>, LP1.b.a.C0082a<? extends CP1, Object>> {
    public final /* synthetic */ LP1.c.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KJ(LP1.c.a aVar) {
        super(2);
        this.d = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LP1.b.a.C0082a<? extends CP1, Object> invoke(CP1.b bVar, AbstractC2882b80.d.a<?> aVar) {
        CP1.b receiver = bVar;
        AbstractC2882b80.d.a<?> it = aVar;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(it, "it");
        return LP1.c.a.d(this.d, receiver, new CP1.a(receiver.a));
    }
}
