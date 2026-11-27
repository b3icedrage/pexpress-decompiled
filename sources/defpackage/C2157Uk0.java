package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Uk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.GetConfigUseCaseBase$fetch$3", f = "GetConfigUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class C2157Uk0 extends AW1 implements Function1<JM<? super Boolean>, Object> {
    public C2157Uk0() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C2157Uk0(1, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Boolean> jm) {
        ((C2157Uk0) create(jm)).invokeSuspend(Unit.a);
        return Boolean.FALSE;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.FALSE;
    }
}
