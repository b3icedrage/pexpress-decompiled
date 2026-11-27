package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.options.screens.RobotOptionsViewModelBase$onAmountClick$1", f = "RobotOptionsViewModelBase.kt", l = {118}, m = "invokeSuspend")
public final class C4780jy1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C5623ny1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4780jy1(C5623ny1 c5623ny1, JM<? super C4780jy1> jm) {
        super(1, jm);
        this.e = c5623ny1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C4780jy1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C4780jy1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C6120qK1 c6120qK1 = this.e.q;
            E32 e32 = E32.d;
            this.d = 1;
            if (c6120qK1.a(e32, this) == mn) {
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
