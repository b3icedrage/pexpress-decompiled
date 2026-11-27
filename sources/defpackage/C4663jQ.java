package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.providers.CryptoEnablementProviderBase$shown$1", f = "CryptoEnablementProviderBase.kt", l = {}, m = "invokeSuspend")
public final class C4663jQ extends AW1 implements InterfaceC1138Hj0<FF, C6106qG, Boolean, JM<? super Boolean>, Object> {
    public /* synthetic */ FF d;
    public /* synthetic */ C6106qG e;
    public /* synthetic */ Boolean g;
    public final /* synthetic */ C4873kQ h;
    public final /* synthetic */ Function1<FF, Boolean> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4663jQ(C4873kQ c4873kQ, Function1<? super FF, Boolean> function1, JM<? super C4663jQ> jm) {
        super(4, jm);
        this.h = c4873kQ;
        this.i = function1;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        boolean z;
        MN mn = MN.d;
        C1795Pt1.b(obj);
        FF ff = this.d;
        C6106qG c6106qG = this.e;
        Boolean bool = this.g;
        Function1<FF, Boolean> function1 = this.i;
        this.h.getClass();
        if (function1.invoke(ff).booleanValue()) {
            z = true;
            if (ff.J && !Intrinsics.a(bool, Boolean.FALSE) && (c6106qG == null || !c6106qG.f)) {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.InterfaceC1138Hj0
    public final Object l(FF ff, C6106qG c6106qG, Boolean bool, JM<? super Boolean> jm) {
        Function1<FF, Boolean> function1 = this.i;
        C4663jQ c4663jQ = new C4663jQ(this.h, function1, jm);
        c4663jQ.d = ff;
        c4663jQ.e = c6106qG;
        c4663jQ.g = bool;
        return c4663jQ.invokeSuspend(Unit.a);
    }
}
