package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CJ extends ML0 implements Function2<CP1.d, AbstractC2882b80.a.b, LP1.b.a.C0082a<? extends CP1, Object>> {
    public final /* synthetic */ LP1.c.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJ(LP1.c.a aVar) {
        super(2);
        this.d = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LP1.b.a.C0082a<? extends CP1, Object> invoke(CP1.d dVar, AbstractC2882b80.a.b bVar) {
        CP1.d receiver = dVar;
        AbstractC2882b80.a.b it = bVar;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(it, "it");
        return LP1.c.a.d(this.d, receiver, CP1.c.a);
    }
}
