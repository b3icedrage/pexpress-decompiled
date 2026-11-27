package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class A81 extends ML0 implements Function0<InterfaceC0942Ew> {
    public final /* synthetic */ AbstractC1112Ha1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A81(AbstractC1112Ha1 abstractC1112Ha1) {
        super(0);
        this.d = abstractC1112Ha1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC0942Ew invoke() {
        return ((AbstractC1112Ha1.c) this.d).d();
    }
}
