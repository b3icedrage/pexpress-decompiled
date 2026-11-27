package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ow1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesViewModelBase$onOptimalStrategyClick$1", f = "RobotDoubleStrategiesViewModelBase.kt", l = {90}, m = "invokeSuspend")
public final class C5827ow1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4984kw1 e;

    /* JADX INFO: renamed from: ow1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesViewModelBase$onOptimalStrategyClick$1$1", f = "RobotDoubleStrategiesViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super EnumC2644a42>, Object> {
        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(1, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super EnumC2644a42> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return EnumC2644a42.i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5827ow1(C4984kw1 c4984kw1, JM<? super C5827ow1> jm) {
        super(1, jm);
        this.e = c4984kw1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C5827ow1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C5827ow1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            MR1 mr1 = this.e.i;
            a aVar = new a(1, null);
            this.d = 1;
            if (((NR1) mr1).l(aVar, this) == mn) {
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
