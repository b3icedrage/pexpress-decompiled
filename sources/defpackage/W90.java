package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class W90 extends ML0 implements Function1<CoroutineContext.Element, X90> {
    public static final W90 d = new W90(1);

    @Override // kotlin.jvm.functions.Function1
    public final X90 invoke(CoroutineContext.Element element) {
        CoroutineContext.Element element2 = element;
        if (element2 instanceof X90) {
            return (X90) element2;
        }
        return null;
    }
}
