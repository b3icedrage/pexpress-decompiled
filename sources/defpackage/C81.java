package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class C81 extends ML0 implements Function0<InterfaceC0942Ew> {
    public final /* synthetic */ CoroutineContext d;
    public final /* synthetic */ AbstractC1112Ha1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81(CoroutineContext coroutineContext, AbstractC1112Ha1 abstractC1112Ha1) {
        super(0);
        this.d = coroutineContext;
        this.e = abstractC1112Ha1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC0942Ew invoke() {
        return SN.a(C6215qm0.d, this.d, false, new B81(this.e, null)).e;
    }
}
