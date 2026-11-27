package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ky1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.options.screens.RobotOptionsViewModelBase$onAmountEdit$1", f = "RobotOptionsViewModelBase.kt", l = {125}, m = "invokeSuspend")
public final class C4990ky1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C5623ny1 e;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4990ky1(C5623ny1 c5623ny1, String str, JM<? super C4990ky1> jm) {
        super(1, jm);
        this.e = c5623ny1;
        this.g = str;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C4990ky1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C4990ky1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        Object objB;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            C5623ny1 c5623ny1 = this.e;
            if (((Boolean) c5623ny1.f.d.getValue()).booleanValue() || (objB = c5623ny1.j.b(this.g, this)) != mn) {
                objB = Unit.a;
            }
            if (objB == mn) {
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
