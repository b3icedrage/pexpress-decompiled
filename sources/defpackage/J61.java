package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.NotificationPermissionAnalyticsApi33UseCaseBase$sendAnalyticsEvents$2", f = "NotificationPermissionAnalyticsApi33UseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class J61 extends AW1 implements Function1<JM<? super W61>, Object> {
    public J61() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new J61(1, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super W61> jm) {
        ((J61) create(jm)).invokeSuspend(Unit.a);
        return W61.g;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return W61.g;
    }
}
