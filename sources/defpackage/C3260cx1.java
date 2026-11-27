package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: cx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.indicators.RobotIndicatorProvider$selectRsi$2", f = "RobotIndicatorProvider.kt", l = {}, m = "invokeSuspend")
public final class C3260cx1 extends AW1 implements Function1<JM<? super String>, Object> {
    public C3260cx1() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C3260cx1(1, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super String> jm) {
        ((C3260cx1) create(jm)).invokeSuspend(Unit.a);
        return "rsi";
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        CR0 cr0 = CR0.ADX;
        return "rsi";
    }
}
