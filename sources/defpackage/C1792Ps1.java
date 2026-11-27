package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Ps1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.usecases.impl.RequestPermissionUseCaseBase$setPrefsFlag$2", f = "RequestPermissionUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class C1792Ps1 extends AW1 implements Function1<JM<? super Boolean>, Object> {
    public C1792Ps1() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C1792Ps1(1, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Boolean> jm) {
        ((C1792Ps1) create(jm)).invokeSuspend(Unit.a);
        return Boolean.TRUE;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.TRUE;
    }
}
