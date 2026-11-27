package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: cF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.usecases.SelectIndicatorUseCaseBase$selectIndicator$2", f = "SelectIndicatorUseCaseBase.kt", l = {}, m = "invokeSuspend")
public final class C3115cF1 extends AW1 implements Function1<JM<? super String>, Object> {
    public final /* synthetic */ C1491Lx0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3115cF1(C1491Lx0 c1491Lx0, JM<? super C3115cF1> jm) {
        super(1, jm);
        this.d = c1491Lx0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C3115cF1(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super String> jm) {
        return ((C3115cF1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return this.d.b;
    }
}
