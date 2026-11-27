package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Dy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.indicators.IndicatorParamsUseCaseBase$updateIndicatorParams$2", f = "IndicatorParamsUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class C0871Dy0 extends AW1 implements Function1<JM<? super String>, Object> {
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0871Dy0(String str, JM<? super C0871Dy0> jm) {
        super(1, jm);
        this.d = str;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C0871Dy0(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super String> jm) {
        return ((C0871Dy0) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return this.d;
    }
}
