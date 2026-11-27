package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class BN extends ML0 implements Function2<Boolean, CoroutineContext.Element, Boolean> {
    public static final BN d = new BN(2);

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(Boolean bool, CoroutineContext.Element element) {
        return Boolean.valueOf(bool.booleanValue() || (element instanceof InterfaceC3137cN));
    }
}
