package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class CN extends ML0 implements Function1<CoroutineContext.Element, DN> {
    public static final CN d = new CN(1);

    @Override // kotlin.jvm.functions.Function1
    public final DN invoke(CoroutineContext.Element element) {
        CoroutineContext.Element element2 = element;
        if (element2 instanceof DN) {
            return (DN) element2;
        }
        return null;
    }
}
