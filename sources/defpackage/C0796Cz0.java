package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Cz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.shared.IndicatorsViewModelBase$onNewSelect$1", f = "IndicatorsViewModelBase.kt", l = {125}, m = "invokeSuspend")
public final class C0796Cz0 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C0718Bz0 e;
    public final /* synthetic */ C1491Lx0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0796Cz0(C0718Bz0 c0718Bz0, C1491Lx0 c1491Lx0, JM<? super C0796Cz0> jm) {
        super(1, jm);
        this.e = c0718Bz0;
        this.g = c1491Lx0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C0796Cz0(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C0796Cz0) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            XE1 xe1 = this.e.m;
            this.d = 1;
            if (xe1.a(this.g, false, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
