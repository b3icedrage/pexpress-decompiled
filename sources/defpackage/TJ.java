package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TJ extends ML0 implements Function2<CP1.e, AbstractC2882b80.d.b, LP1.b.a.C0082a<? extends CP1, Object>> {
    public final /* synthetic */ LP1.c.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TJ(LP1.c.a aVar) {
        super(2);
        this.d = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LP1.b.a.C0082a<? extends CP1, Object> invoke(CP1.e eVar, AbstractC2882b80.d.b bVar) {
        CP1.e receiver = eVar;
        AbstractC2882b80.d.b it = bVar;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(it, "it");
        return LP1.c.a.d(this.d, receiver, CP1.d.a);
    }
}
