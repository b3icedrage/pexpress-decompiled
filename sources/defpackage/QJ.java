package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class QJ extends ML0 implements Function2<CP1.a, AbstractC2882b80.a.b, LP1.b.a.C0082a<? extends CP1, Object>> {
    public final /* synthetic */ LP1.c.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QJ(LP1.c.a aVar) {
        super(2);
        this.d = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LP1.b.a.C0082a<? extends CP1, Object> invoke(CP1.a aVar, AbstractC2882b80.a.b bVar) {
        CP1.a receiver = aVar;
        AbstractC2882b80.a.b it = bVar;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(it, "it");
        receiver.a.a.cancel();
        return LP1.c.a.d(this.d, receiver, CP1.c.a);
    }
}
