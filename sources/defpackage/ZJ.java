package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ZJ extends ML0 implements Function1<AbstractC2882b80.d.a<?>, Boolean> {
    public static final ZJ d = new ZJ(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AbstractC2882b80.d.a<?> aVar) {
        AbstractC2882b80.d.a<?> receiver = aVar;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return Boolean.valueOf(receiver.a instanceof Pf2.a.d);
    }
}
