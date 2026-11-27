package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: gp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.experiments.remote.custom_indicators.ReferralLinkUseCaseBase$setPlayReferrerValue$2", f = "ReferralLinkUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class C4075gp1 extends AW1 implements Function1<JM<? super String>, Object> {
    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C4075gp1(1, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super String> jm) {
        ((C4075gp1) create(jm)).invokeSuspend(Unit.a);
        return "custom_indicators";
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return "custom_indicators";
    }
}
